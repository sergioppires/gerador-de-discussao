package main;

import twitter4j.*;
import java.util.List;


public class SearchTweets {
	
	
    public static String GetMessages(Twitter key,String argument, Integer inter) {    	
    	Twitter twitter = key;
        try {
        	 Query query = new Query(argument);
            QueryResult result;        
            result = twitter.search(query);
            List<Status> tweets = result.getTweets();
            Status tweet = tweets.get(inter);                           	   
             return ("@" + tweet.getUser().getScreenName() + " - " + tweet.getText());
           } catch (TwitterException te) {
            te.printStackTrace();
            return ("Erro em processar os tweets " + te.getMessage());            
        }
    }
}