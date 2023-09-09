# Random Quote Generator

This Java application fetches and displays random quotes and their authors using JSON data.

## Quote Class

The `Quote` class defines the structure of a quote and its author.

## Random Quote Class 

The RandomQuote class fetches and manages a list of quotes from a JSON data source

by open new connection with the URL using HttpURLConnection and fetch the data by
using BufferedReader to read the JSOn data then by using the random function it will fetch 
random quote each time then it will store it in a list.

## Random Quot File

The RandomQuote file fetch the quotes from local fiel by read from the local file 
that already exist using BufferedReader to read the JSOn data then by using the random function it will fetch
random quote each time then it will store it in a list. and it will save any
quote comes from the url


## classes 

The application has two main classes:
- RandomQuote: Fetches random quotes from a remote JSON source. You can change the JSON_URL in the code to use a different source.

- RandomQuoteFile: Reads and writes quotes to a local file (app/src/main/resources/Quote.txt). It can fetch quotes from the local file and write new quotes to it.

- In the App class, you can see an example of how to use both classes to fetch and manage random quotes.

# Files 

- To change the source of remote quotes, modify the JSON_URL in the RandomQuote class.

- The local file path is set to app/src/main/resources/Quote.txt in both classes. Make sure this path exists or update it according to your project structure.
