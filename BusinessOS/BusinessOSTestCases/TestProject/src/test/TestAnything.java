package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestAnything {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Asdfsd54df89dfd7";

		String p = str.replaceAll("[^a-zA-Z]","");
	    System.out.println(p);
	    
	    System.out.println("Test");
	}

}
