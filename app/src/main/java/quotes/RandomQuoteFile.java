package quotes;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomQuoteFile {

    private List<Quote> quotes;
    private static  final String path="app/src/main/resources/Quote.txt";

    public RandomQuoteFile() {
        try {
            quotes = fetchQuotes();
        } catch (Exception e) {
            // Handle the exception here (you might want to log it)
            e.printStackTrace();
            quotes = new ArrayList<>(); // Initialize with an empty list
        }
    }

    public List<Quote> fetchQuotes() {
        List<Quote> quoteList = new ArrayList<>();
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("app/src/main/resources/Quote.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Gson gson = new Gson();
        Quote[] quoteArray = gson.fromJson(reader, Quote[].class);

        for (Quote quote : quoteArray) {
            quoteList.add(quote);
        }

        return quoteList;
    }



    public Quote getRandomQuote() {
        if (quotes.isEmpty()) {
            return null;
        }
        Random random = new Random();
        int randomIndex = random.nextInt(quotes.size());
        return quotes.get(randomIndex);
    }
    public void writeQuotesToLocalFile(List<Quote> x) {
        try (Writer writer = new FileWriter(path)) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create(); // To Make the JSON File look Nice


            gson.toJson(x, writer);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
