package com.ficusrealtime.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.*;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class beforeafter {
	 public static  WebDriver driver;

		@Before
		public void setUp()  {
		    WebDriverManager.chromedriver().setup();
		   
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
		@After
		public void tearDown() {
			driver.close();
		}
		

		@AfterStep
		public void afterStep(Scenario scenario) throws Throwable {
			if(scenario.isFailed()) {
			byte[] srcBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(srcBytes, "image/png", "SC1");
			}
		}


}
