/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

public class App {

    public static void main (String [] arg)
    {

        RandomQuote quoteFetcher = new RandomQuote();


            Quote randomQuote = quoteFetcher.getRandomQuote();
            System.out.println("Random Quote: " + randomQuote);

    }


}
