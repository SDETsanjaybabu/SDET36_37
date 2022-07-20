package sampleProject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyClass1Test {
@Test
public void sample()
{
	System.out.println("hi all");
}
@Test
public void simple()
{

	String BROWSER = System.getProperty("browser");
	String URL = System.getProperty("url");
	
	System.out.println("----->browser is"+BROWSER+"------>url is"+URL);
	
	System.out.println("Hello all");
	
	System.out.println("bye");
	
	System.out.println("Good bye");
	
	System.out.println("good");
	
	System.out.println("bye");

	System.out.println("All good");
}
}
