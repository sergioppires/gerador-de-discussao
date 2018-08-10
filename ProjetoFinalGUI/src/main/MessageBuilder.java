package main;

import twitter4j.Twitter;

public class MessageBuilder {

	public static String userBuilder (Twitter twitter, String objeto, Integer i) {	
		String fullmsg = SearchTweets.GetMessages(twitter,objeto,i);
		String output = StringArrange.getName(fullmsg);
		return output;
	}
	
	public static String messageBuilder (Twitter twitter, String objeto, Integer i) {	
		String fullmsg = SearchTweets.GetMessages(twitter,objeto,i);
		String output = StringArrange.getMsg(fullmsg);	
		return output;
	}
	
}
