package com.webdriver.methods;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebDriverFn {
	
	WebDriver driver ;
	
	@BeforeClass
	public void beforeFn() {
	 
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(2));
		System.out.println(driver.manage().window().getSize());
		
	}
	
	@Test(enabled=false)
	public void test() {
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Assert.assertEquals(driver.getTitle(), "Sign up for Facebook","Title is not match");
		
		WebElement ele = driver.findElement(By.id("day"));
		Select sc = new Select(ele);
		sc.selectByVisibleText("10");
		
		driver.findElement(By.id("month")).click();
		List<WebElement> ele2 = driver.findElements(By.xpath("//select[@id='month']//option"));
		for(WebElement ele3 : ele2) {
			if(ele3.getText().equals("Sep") || ele3.getText() == "Sep" ) {
				ele3.click();
			}	
		}	
	}
	
	@Test(enabled=true)
	public void test1() {
		List<WebElement> eles =driver.findElements(By.xpath("//a[text()='Create new at']"));
		System.out.println(eles.size());
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	
	
	public WebDriverFn assertTitleText(WebDriver driver,String txt) {
		Assert.assertEquals(driver.getTitle(), txt,"Title of page is not match");
		return this;
	}
	
	public void printMessage() {
		System.out.println("Ok !!");
	}
	
	
	

}
