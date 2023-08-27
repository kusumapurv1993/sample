package MavSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class doubleClick {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();

		WebElement rytclk = driver.findElement(By.xpath("//*[text() = 'right click me']"));
		Actions a = new Actions(driver);
		a.contextClick(rytclk).perform();
		Thread.sleep(2000);


		WebElement dubclk = driver.findElement(By.xpath("//*[text() = 'Double-Click Me To See Alert']"));
		Actions acc = new Actions(driver);
		acc.doubleClick(dubclk).perform();
		Thread.sleep(2000);

	}

}
