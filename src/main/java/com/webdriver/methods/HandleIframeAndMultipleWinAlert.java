package com.webdriver.methods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HandleIframeAndMultipleWinAlert {

	String URL = "https://demoqa.com/alertsWindows";


	WebDriver driver ;

	String browserWinBtn ="//span[text()='Browser Windows']";



	@BeforeClass
	public void beforeFn() {

		driver = new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(2));
		System.out.println(driver.manage().window().getSize());

	}

	@Test
	public void test02() {
		driver.findElement(By.xpath(getSpanTextXpath("Browser Windows"))).click();
		driver.findElement(By.xpath(getButtonTextXpath("New Tab"))).click();

		Set<String>	ids =driver.getWindowHandles();
		ArrayList<String> id = new ArrayList<>(ids); // bcz we want to retrive it using index 

		driver.switchTo().window(id.get(1));
		System.out.println(driver.findElement(By.xpath(getXpathByID("sampleHeading"))).getText());
		driver.switchTo().window(id.get(0));
		WebDriverFn obj = new WebDriverFn();
		obj.assertTitleText(driver, "DEMOQA").printMessage();
	}

	@Test
	public void test03() {
		driver.findElement(By.xpath(getSpanTextXpath("Browser Windows"))).click();
		driver.findElement(By.xpath(getButtonTextXpath("New Tab"))).click();

		Set<String>	ids =driver.getWindowHandles();

		for(String id: ids) {
			driver.switchTo().window(id);
			if(driver.getTitle().equals("demoqa.com/sample")) {
				break;
			}
		}
		System.out.println(driver.findElement(By.xpath(getXpathByID("sampleHeading"))).getText());
	}


	public void switchWinBtTitle(String title) {
		Set<String>	ids =driver.getWindowHandles();

		for(String id: ids) {
			driver.switchTo().window(id);
			if(driver.getTitle().equals(title)) {
				break;
			}
		}
	}




	public String getButtonTextXpath(String replaceText) {
		System.out.println("\n "+"//button[text()='"+replaceText+"']"+"\n");
		return "//button[text()='"+replaceText+"']";
	}

	public String getSpanTextXpath(String replaceText) {
		return "//span[text()='"+replaceText+"']";
	}

	public String getLabelTextXpath(String replaceText) {
		return "//label[text()='"+replaceText+"']";
	}

	public String getDivTextXpath(String replaceText) {
		return "//div[text()='"+replaceText+"']";
	}

	public String getXpathByText(String replaceText) {
		return "//*[text()='"+replaceText+"']";
	}


	public String getXpathByID(String id) {
		return "//*[@id='"+id+"']";
	}





	@AfterClass
	public void tearDown() {
		driver.quit();
	}



}
