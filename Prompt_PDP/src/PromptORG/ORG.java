package PromptORG;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ORG {

	
	 WebDriver driver;
	public void client() throws InterruptedException
	{
		Actions a = new Actions(driver);
		WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Clients')]")));
		a.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Clients')]"))).build().perform();
		driver.findElement(By.linkText("Client")).click();
		
		driver.quit();
	}
	
	public void User() throws InterruptedException
	{
//		WebDriver driver = new ChromeDriver();
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		driver = new ChromeDriver(chromeOptions);
		driver.get("https://qamilkpro.orbitron.in/");
		
		WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='Username']")));
		
		
		driver.findElement(By.xpath("//input[@id='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Qa@123");
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		WebElement Master = new WebDriverWait(driver, Duration.ofSeconds(10))
		        .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Masters')]")));
			Actions a = new Actions(driver);
	      a.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Masters')]"))).
	      build().perform();
	      driver.findElement(By.xpath("//a[contains(text(),'User')]")).click();
		Thread.sleep(5000);
		return;
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ORG object = new ORG();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\raindra.rajput\\Selenium\\Chromedriver\\chromedriver.exe");
		
		object.User();
		object.client();

			}

}
