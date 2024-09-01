package com.mouseMove;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;

public class EaseMyTrip {
	
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./ChromeDriverJars/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/");
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"divSignInPnl\"]/a/span"))).build().perform();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"shwlogn\"]/span[1]")).click();
		Thread.sleep(5000);
		driver.quit();
		
		
		
		
	}

}
