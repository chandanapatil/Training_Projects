package com.simplilearn.webapp.login;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class LogInFormTestcases {
	

     final  String siteURL = "file:///C:/Users/nayak/Desktop/simplilearn/Phase_5_FSD/FSD-5%20WorkSpace-Practice-Projects/AutomateWebApp/static/loginForm.html";
     final String driverPath ="driver\\msedgedriver.exe"; 
     WebDriver driver;
    
	@BeforeEach
	void setUp() throws Exception {
		//Set Up
        System.setProperty("webdriver.edge.driver",driverPath);
        driver = new EdgeDriver();
        driver.get(siteURL);
        //Add maximize size for snapshot
        driver.manage().window().maximize();
		
	}

	@AfterEach
	void tearDown() throws Exception {
       driver.close();
	}
	
	@Test
	@DisplayName("Test :: Verify User Input")
	void testUserInput() throws InterruptedException, IOException {
		//Find Input Field
				WebElement input = driver.findElement(By.cssSelector("body > form > fieldset > div:nth-child(1) > input[type=text]:nth-child(2)"));
				assertTrue(input.isDisplayed());
				assertTrue(input.isEnabled());
				
					
				
				//Enter yourEmail
				input.sendKeys("nayaksofia");
				takeScreenShot("UserInput.png");
				Thread.sleep(2000);
				
	    }
			 private void takeScreenShot(String filename) throws IOException {
					 //Instantiate Driver Object and Type-cast
					 TakesScreenshot tsc = (TakesScreenshot) driver;
					 
					 //Generate Screenshot as file
					 File rsc = tsc.getScreenshotAs(OutputType.FILE);
					 
					 FileHandler.copy(rsc, new File("C:\\Users\\nayak\\Desktop\\simplilearn\\Phase_5_FSD\\FSD-5 WorkSpace-Practice-Projects\\AutomateWebApp\\screenshot" + filename));
			}

	
	@Test
	@DisplayName("Test :: Verify User Password")
	void testUserPassword() throws InterruptedException, IOException {
		//Find Input Field
				WebElement input = driver.findElement(By.cssSelector("body > form > fieldset > div:nth-child(1) > input[type=password]:nth-child(6)"));
				assertTrue(input.isDisplayed());
				assertTrue(input.isEnabled());
				
				//Enter yourEmail
				input.sendKeys("1234qwe");
				Thread.sleep(2000);
				

				Dimension d = new Dimension(480, 620);
				
				driver.manage().window().setSize(d);
				
				
			 //Step-1 :: type cast driver object into takeScreenshot instance 
				TakesScreenshot tsc = (TakesScreenshot) driver;
					
		      //Step-2 :: Generate a screenshot as file 
				File rsc = tsc.getScreenshotAs(OutputType.FILE);
				FileHandler.copy(rsc,new File("C:\\Users\\nayak\\Desktop\\simplilearn\\Phase_5_FSD\\FSD-5 WorkSpace-Practice-Projects\\AutomateWebApp\\screenshot\\pasword.png"));
						
				
	}

	@Test
	@DisplayName("Test :: Verify Login Button")
	void testLogInButton() throws InterruptedException, IOException {
		//Find Input Field
				WebElement button = driver.findElement(By.cssSelector("body > form > fieldset > div:nth-child(1) > button"));
				assertTrue(button.isDisplayed());
				assertTrue(button.isEnabled());
				
                Dimension d = new Dimension(480, 620);
				
				driver.manage().window().setSize(d);
				
				button.submit();
				Thread.sleep(2000);
				
				//Step-1 :: type cast driver object into takeScreenshot instance 
				TakesScreenshot tsc = (TakesScreenshot) driver;
					
		      //Step-2 :: Generate a screenshot as file 
				File rsc = tsc.getScreenshotAs(OutputType.FILE);
				FileHandler.copy(rsc,new File("C:\\Users\\nayak\\Desktop\\simplilearn\\Phase_5_FSD\\FSD-5 WorkSpace-Practice-Projects\\AutomateWebApp\\screenshot\\pasword-repet.png"));
						
				
	}
	
	@Test
	@DisplayName("Test :: Verify and de-select Check Box")
	void testCheckBox() throws InterruptedException, IOException {
		//Find Input Field
				WebElement checkbox = driver.findElement(By.cssSelector("body > form > fieldset > div:nth-child(1) > label:nth-child(11) > input[type=checkbox]"));
				assertEquals(true, checkbox.isDisplayed());
				assertEquals(true, checkbox.isEnabled());
				
                Dimension d = new Dimension(480, 620);
				
				driver.manage().window().setSize(d);
				
				checkbox.click();
				assertEquals(false, checkbox.isSelected());
				Thread.sleep(2000);
				
				//Step-1 :: type cast driver object into takeScreenshot instance 
				TakesScreenshot tsc = (TakesScreenshot) driver;
					
		      //Step-2 :: Generate a screenshot as file 
				File rsc = tsc.getScreenshotAs(OutputType.FILE);
				FileHandler.copy(rsc,new File("C:\\Users\\nayak\\Desktop\\simplilearn\\Phase_5_FSD\\FSD-5 WorkSpace-Practice-Projects\\AutomateWebApp\\screenshot\\checkBox.png"));
						
				
	}
	
	@Test
	@DisplayName("Test :: Verify Cancel Button")
	void testCancelButton() throws InterruptedException, IOException {
		//Find Input Field
				WebElement cnc = driver.findElement(By.className("cancelbtn"));
				assertTrue(cnc.isDisplayed());
				assertTrue(cnc.isEnabled());
				
                Dimension d = new Dimension(480, 620);
				
				driver.manage().window().setSize(d);
				
				
				cnc.submit();
				
				Thread.sleep(2000);
				
				//Step-1 :: type cast driver object into takeScreenshot instance 
				TakesScreenshot tsc = (TakesScreenshot) driver;
					
		      //Step-2 :: Generate a screenshot as file 
				File rsc = tsc.getScreenshotAs(OutputType.FILE);
				FileHandler.copy(rsc,new File("C:\\Users\\nayak\\Desktop\\simplilearn\\Phase_5_FSD\\FSD-5 WorkSpace-Practice-Projects\\AutomateWebApp\\screenshot\\cancel.png"));
						
	}
	
	@Test
	@DisplayName("Test :: Verify Link")
	void testLink() throws InterruptedException, IOException {
		//Find Input Field
				WebElement link = driver.findElement(By.cssSelector("body > form > fieldset > div:nth-child(3) > span > a"));
				assertTrue(link.isDisplayed());
				assertTrue(link.isEnabled());
				

                Dimension d = new Dimension(480, 620);
				
				driver.manage().window().setSize(d);
				
				link.click();
				
				Thread.sleep(2000);
				
				//Step-1 :: type cast driver object into takeScreenshot instance 
				TakesScreenshot tsc = (TakesScreenshot) driver;
					
		      //Step-2 :: Generate a screenshot as file 
				File rsc = tsc.getScreenshotAs(OutputType.FILE);
				FileHandler.copy(rsc,new File("C:\\Users\\nayak\\Desktop\\simplilearn\\Phase_5_FSD\\FSD-5 WorkSpace-Practice-Projects\\AutomateWebApp\\screenshot\\link-verification.png"));
						
	}

}
