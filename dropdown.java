package MavSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text() = 'Create new account']")).click();

		WebElement drpdwn = driver.findElement(By.xpath("//select[@id='day']"));
		Select s = new Select(drpdwn);
		s.selectByIndex(5);

		WebElement drpdwn1 = driver.findElement(By.xpath("Select[@id='month']"));
		Select s1 = new Select(drpdwn1);
		s1.selectByVisibleText("may");

		WebElement drpdwn2 = driver.findElement(By.xpath("Select[@id='year']"));
		Select s2 = new Select(drpdwn2);
		s2.selectByValue("2000");

	}

}
