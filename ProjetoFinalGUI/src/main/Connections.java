package main;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class Connections {

    public static Twitter main() {
    	// Fazer a conexao
    	ConfigurationBuilder cb = new ConfigurationBuilder();
	    cb.setDebugEnabled(true)
	      .setOAuthConsumerKey("gLouypIJg3NtI6EDgtUQROKPY")
	      .setOAuthConsumerSecret("lEyUxLnSQsi8xWdAjVJvSHa1xbzFE9WxhYhLxNsjjh3NFdJORw")
	      .setOAuthAccessToken("56293343-2Wmz9J22bQ8oyUIVgKOr5QXikOPS94y72jwUvLvbW")
	      .setOAuthAccessTokenSecret("gW6qmtD2y4KIobCU7aSzptZTiGO0Rg17Mexxsq930etx3");
	    Twitter twitter = new TwitterFactory(cb.build()).getInstance();  
	    return twitter;
        }
	
}
