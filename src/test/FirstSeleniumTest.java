package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class FirstSeleniumTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\selenium_webdrivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		System.out.println(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))+"LLLLLLL");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Laptop");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
		driver.findElement(By.id("#nav-logo-sprites")).click();

		//WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		//searchBox.click();
		//searchBox.sendKeys("Laptop");
		System.out.println("launched google");
		driver.close();
	}

}
