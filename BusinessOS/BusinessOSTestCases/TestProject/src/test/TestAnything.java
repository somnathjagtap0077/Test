package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestAnything {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/home/tester/Documents/chromedriver");
		
		ChromeDriver d=new ChromeDriver();
		
		d.get("https://learn.letskodeit.com/p/practice");
	    
	
	}

}
