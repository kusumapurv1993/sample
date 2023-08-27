package MavSel;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sample {
	public static void main(String[] args) throws IOException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
		WebElement user = driver.findElement(By.id("username"));
		WebElement pass = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("login"));
		
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setattribute('value', 'abinesh12345')",user);
		object userText = js.executeScript("returnargument[0].getattribute('value)",user);
		System.out.println(userText);
		js.script


			
		
	    
	   
	   
	}
			   
	   
		
	

}
