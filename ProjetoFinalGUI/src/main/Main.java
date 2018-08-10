package main;

import java.util.concurrent.TimeUnit;

import twitter4j.Twitter;

public class Main {
	
	public static String returnUser (String objeto, int count) throws InterruptedException {		
		Twitter twitter = Connections.main();			
		TimeUnit.SECONDS.sleep(1);		
		return MessageBuilder.userBuilder(twitter, objeto, count);		
		
	}
	
	public static String returnMessage (String objeto, int count) throws InterruptedException {		
		Twitter twitter = Connections.main();		
		TimeUnit.SECONDS.sleep(1);		
		return MessageBuilder.messageBuilder(twitter, objeto, count);		
		}	
	
}