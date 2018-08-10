package main;

public class StringArrange {

	public static String getName (String input) {		
		String info[]= input.split(" - ");
		String name = info[0];
		return name;
	}
	
	public static String getMsg (String input) {
		String info[]= input.split(" - ");
		String msg = info[1];
		return msg;
	}
}
