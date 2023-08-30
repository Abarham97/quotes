/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import java.util.List;

public class App {

    public static void main (String [] arg)
    {

//        RandomQuote quoteFetcher = new RandomQuote();
//
//            Quote randomQuote = quoteFetcher.getRandomQuote();
//
//        System.out.println("Random Quote: " + randomQuote);
//        RandomQuoteFile quoteFile = new RandomQuoteFile();
//        List<Quote> save= quoteFile.fetchQuotes();
//
//         save.add(randomQuote);
//            quoteFile.writeQuotesToLocalFile(save);
//
//
//        Quote randomQuote1=quoteFile.getRandomQuote();
//
//
//
//
//
//        System.out.println("Random Quote1:" + randomQuote1);

        RandomQuoteFile quoteFile = new RandomQuoteFile();
        List<Quote> save = quoteFile.fetchQuotes();

        RandomQuote quoteFetcher = new RandomQuote();
        Quote randomQuote = null;

        try {
            randomQuote = quoteFetcher.getRandomQuote();
            System.out.println("Random Quote from URL: " + randomQuote);
            save.add(randomQuote);
            quoteFile.writeQuotesToLocalFile(save);
        } catch (Exception e) {
            System.out.println("Fetching from URL failed. Reading from local file...");
        }

        Quote randomQuote1 = quoteFile.getRandomQuote();
        System.out.println("Random Quote from Local File: " + randomQuote1);
    }



}
