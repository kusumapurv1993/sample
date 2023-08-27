package MavSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragNdDrop {
	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		WebElement drag = driver.findElement(By.xpath("//*[text() = 'Drag me']"));
		
		WebElement drop = driver.findElement(By.xpath("//*[text() = 'Drop here']"));
		
		Actions acc = new Actions(driver);
		
		acc.dragAndDrop(drag, drop).perform();
		Thread.sleep(5000);
		
		
	}

}
