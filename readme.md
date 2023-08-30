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
