package main;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class Connections {

    public static Twitter main() {
    	// Fazer a conexao
    	ConfigurationBuilder cb = new ConfigurationBuilder();
	    cb.setDebugEnabled(true)
	      .setOAuthConsumerKey("xxxxxx") 
	      .setOAuthConsumerSecret("xxxxx")
	      .setOAuthAccessToken("xxxxxx")
	      .setOAuthAccessTokenSecret("xxxxxxx");
	    Twitter twitter = new TwitterFactory(cb.build()).getInstance();  
	    return twitter;
        }
	
}
