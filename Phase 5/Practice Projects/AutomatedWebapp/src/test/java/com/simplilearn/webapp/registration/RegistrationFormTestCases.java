package com.simplilearn.webapp.registration;

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

public class RegistrationFormTestCases {


    final  String siteURL = "file:///C:/Users/nayak/Desktop/simplilearn/Phase_5_FSD/FSD-5%20WorkSpace-Practice-Projects/AutomateWebApp/static/registrationForm.html";
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
	@DisplayName("Registration Form :: Email Verification")
	void testEmail() throws InterruptedException {
		//Find Input Field
		WebElement input = driver.findElement(By.id("email"));
		assertTrue(input.isDisplayed());
		assertTrue(input.isEnabled());
		
		//Enter yourEmail
		input.sendKeys("nayaksofia@gmail.com");
		Thread.sleep(2000);
		
	}
	
	@Test
	@DisplayName("Registration Form :: Password Verification")
	void testPassword() throws InterruptedException, IOException {
		//Find Input Field
		WebElement input = driver.findElement(By.id("psw"));
		assertTrue(input.isDisplayed());
		assertTrue(input.isEnabled());
		
		//Enter yourEmail
		input.sendKeys("abcd1234");
		Thread.sleep(2000);
		

		Dimension d = new Dimension(480, 800);
		
		driver.manage().window().setSize(d);
		
		
	 //Step-1 :: type cast driver object into takeScreenshot instance 
		TakesScreenshot tsc = (TakesScreenshot) driver;
			
      //Step-2 :: Generate a screenshot as file 
		File rsc = tsc.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(rsc,new File("C:\\Users\\nayak\\Desktop\\simplilearn\\Phase_5_FSD\\FSD-5 WorkSpace-Practice-Projects\\AutomateWebApp\\screenshot\\reg-pasword.png"));
				
		
		
	}
	
	@Test
	@DisplayName("Registration Form :: Repeat Password Verification")
	void testRepeatPassword() throws InterruptedException, IOException {
		//Find Input Field
		WebElement input = driver.findElement(By.id("psw-repeat"));
		assertTrue(input.isDisplayed());
		assertTrue(input.isEnabled());
		
		//Enter yourEmail
		input.sendKeys("abcd1234");
		Thread.sleep(2000);
		

		Dimension d = new Dimension(480, 800);
		
		driver.manage().window().setSize(d);
		
		
	 //Step-1 :: type cast driver object into takeScreenshot instance 
		TakesScreenshot tsc = (TakesScreenshot) driver;
			
      //Step-2 :: Generate a screenshot as file 
		File rsc = tsc.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(rsc,new File("C:\\Users\\nayak\\Desktop\\simplilearn\\Phase_5_FSD\\FSD-5 WorkSpace-Practice-Projects\\AutomateWebApp\\screenshot\\reg-repet-password.png"));
				
		
		
	}
	
	@Test
	@DisplayName("RegistrationTest :: To verify radio button exist.")
    void testToVerifyRadioButtonExist() throws InterruptedException, IOException {
		WebElement radio1 = driver.findElement(By.id("admin"));
		assertEquals(true, radio1.isDisplayed());
		assertEquals(true, radio1.isEnabled());
		assertEquals(false, radio1.isSelected());
		
		WebElement radio2 = driver.findElement(By.id("user"));
		assertEquals(true, radio2.isDisplayed());
		assertEquals(true, radio2.isEnabled());
		assertEquals(false, radio2.isSelected());
		
		WebElement radio3 = driver.findElement(By.id("vendor"));
		assertEquals(true, radio3.isDisplayed());
		assertEquals(true, radio3.isEnabled());
		assertEquals(false, radio3.isSelected());
		
		Thread.sleep(2000);
		

		Dimension d = new Dimension(480, 800);
		
		driver.manage().window().setSize(d);
		
		
	 //Step-1 :: type cast driver object into takeScreenshot instance 
		TakesScreenshot tsc = (TakesScreenshot) driver;
			
      //Step-2 :: Generate a screenshot as file 
		File rsc = tsc.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(rsc,new File("C:\\Users\\nayak\\Desktop\\simplilearn\\Phase_5_FSD\\FSD-5 WorkSpace-Practice-Projects\\AutomateWebApp\\screenshot\\reg-radio-buttons.png"));
				
		
	}
	
	@Test
	@DisplayName("Test : To verify radio button-1 select.")
    void testToVerifyRadioButtonOneSelected() throws InterruptedException, IOException {
		WebElement radio = driver.findElement(By.id("admin"));
		assertEquals(true, radio.isDisplayed());
		assertEquals(true, radio.isEnabled());
		//select radio button 
		radio.click();
		Thread.sleep(2000);
		assertEquals(true, radio.isSelected());

	//Snapshot:: size
		Dimension d = new Dimension(480, 800);
		
		driver.manage().window().setSize(d);
		
		
	 //Step-1 :: type cast driver object into takeScreenshot instance 
		TakesScreenshot tsc = (TakesScreenshot) driver;
			
      //Step-2 :: Generate a screenshot as file 
		File rsc = tsc.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(rsc,new File("C:\\Users\\nayak\\Desktop\\simplilearn\\Phase_5_FSD\\FSD-5 WorkSpace-Practice-Projects\\AutomateWebApp\\screenshot\\radio-button-1.png"));
				
		
		
	}
	
	@Test
	@DisplayName("Test : To verify radio button-2 select.")
    void testToVerifyRadioButtonTwoSelected() throws InterruptedException, IOException {
		WebElement radio = driver.findElement(By.id("user"));
		assertEquals(true, radio.isDisplayed());
		assertEquals(true, radio.isEnabled());
		//select radio button 
		radio.click();
		Thread.sleep(2000);
		assertEquals(true, radio.isSelected());
		
	 //Snapshot:: size
		Dimension d = new Dimension(480, 800);
		
		driver.manage().window().setSize(d);
		
		
	 //Step-1 :: type cast driver object into takeScreenshot instance 
		TakesScreenshot tsc = (TakesScreenshot) driver;
			
      //Step-2 :: Generate a screenshot as file 
		File rsc = tsc.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(rsc,new File("C:\\Users\\nayak\\Desktop\\simplilearn\\Phase_5_FSD\\FSD-5 WorkSpace-Practice-Projects\\AutomateWebApp\\screenshot\\radio-button-2.png"));
				
		
		
	}
	
	@Test
	@DisplayName("Test : To verify radio button-3 select.")
    void testToVerifyRadioButtonSelected() throws InterruptedException, IOException {
		WebElement radio = driver.findElement(By.id("vendor"));
		assertEquals(true, radio.isDisplayed());
		assertEquals(true, radio.isEnabled());
		//select radio button 
		radio.click();
		Thread.sleep(2000);
		assertEquals(true, radio.isSelected());
		
		//Snapshot:: size
				Dimension d = new Dimension(480, 800);
				
				driver.manage().window().setSize(d);
				
				
			 //Step-1 :: type cast driver object into takeScreenshot instance 
				TakesScreenshot tsc = (TakesScreenshot) driver;
					
		      //Step-2 :: Generate a screenshot as file 
				File rsc = tsc.getScreenshotAs(OutputType.FILE);
				FileHandler.copy(rsc,new File("C:\\Users\\nayak\\Desktop\\simplilearn\\Phase_5_FSD\\FSD-5 WorkSpace-Practice-Projects\\AutomateWebApp\\screenshot\\radio-button-3.png"));
						
				
		
	}
	
	@Test
	@DisplayName("Test : To verify checkbox exist.")
	void testToVerifyCheckboxExist() throws IOException {
		WebElement checkBox1 = driver.findElement(By.id("skill1"));
		assertEquals(true,checkBox1.isDisplayed());
		assertEquals(true,checkBox1.isEnabled());
		assertEquals(false,checkBox1.isSelected());
		
		WebElement checkBox2 = driver.findElement(By.id("skill2"));
		assertEquals(true,checkBox2.isDisplayed());
		assertEquals(true,checkBox2.isEnabled());
		assertEquals(false,checkBox2.isSelected());
		
		WebElement checkBox3 = driver.findElement(By.id("skill3"));
		assertEquals(true,checkBox3.isDisplayed());
		assertEquals(true,checkBox3.isEnabled());
		assertEquals(false,checkBox3.isSelected());
		
		//Snapshot:: size
				Dimension d = new Dimension(480, 800);
				
				driver.manage().window().setSize(d);
				
				
			 //Step-1 :: type cast driver object into takeScreenshot instance 
				TakesScreenshot tsc = (TakesScreenshot) driver;
					
		      //Step-2 :: Generate a screenshot as file 
				File rsc = tsc.getScreenshotAs(OutputType.FILE);
				FileHandler.copy(rsc,new File("C:\\Users\\nayak\\Desktop\\simplilearn\\Phase_5_FSD\\FSD-5 WorkSpace-Practice-Projects\\AutomateWebApp\\screenshot\\reg-check-box.png"));
						
				
	}
	
	@Test
	@DisplayName("Test :: To verify checkbox1 select")
	void testToVerifyCheckBoxOneSelected() throws InterruptedException, IOException {
		WebElement checkBox1 = driver.findElement(By.id("skill1"));
		assertEquals(true,checkBox1.isDisplayed());
		assertEquals(true,checkBox1.isEnabled());
		
		//Select Check Box One
		checkBox1.click();
		Thread.sleep(2000);
		assertEquals(true,checkBox1.isSelected());
		
		//Snapshot:: size
				Dimension d = new Dimension(480, 800);
				
				driver.manage().window().setSize(d);
				
				
			 //Step-1 :: type cast driver object into takeScreenshot instance 
				TakesScreenshot tsc = (TakesScreenshot) driver;
					
		      //Step-2 :: Generate a screenshot as file 
				File rsc = tsc.getScreenshotAs(OutputType.FILE);
				FileHandler.copy(rsc,new File("C:\\Users\\nayak\\Desktop\\simplilearn\\Phase_5_FSD\\FSD-5 WorkSpace-Practice-Projects\\AutomateWebApp\\screenshot\\reg-check-box-1.png"));
						
				
		
	}
	
	@Test
	@DisplayName("Test :: To verify checkbox2 select")
	void testToVerifyCheckBoxTwoSelected() throws InterruptedException, IOException {
		WebElement checkBox2 = driver.findElement(By.id("skill2"));
		assertEquals(true,checkBox2.isDisplayed());
		assertEquals(true,checkBox2.isEnabled());
		
		//Select Check Box One
		checkBox2.click();
		Thread.sleep(2000);
		assertEquals(true,checkBox2.isSelected());
		
		//Snapshot:: size
				Dimension d = new Dimension(480, 800);
				
				driver.manage().window().setSize(d);
				
				
			 //Step-1 :: type cast driver object into takeScreenshot instance 
				TakesScreenshot tsc = (TakesScreenshot) driver;
					
		      //Step-2 :: Generate a screenshot as file 
				File rsc = tsc.getScreenshotAs(OutputType.FILE);
				FileHandler.copy(rsc,new File("C:\\Users\\nayak\\Desktop\\simplilearn\\Phase_5_FSD\\FSD-5 WorkSpace-Practice-Projects\\AutomateWebApp\\screenshot\\reg-check-box-2.png"));
						
				
		
	}
	
	@Test
	@DisplayName("Test :: To verify checkbox3 select")
	void testToVerifyCheckBoxThreeSelected() throws InterruptedException, IOException {
		WebElement checkBox3 = driver.findElement(By.id("skill3"));
		assertEquals(true,checkBox3.isDisplayed());
		assertEquals(true,checkBox3.isEnabled());
		
		//Select Check Box One
		checkBox3.click();
		Thread.sleep(2000);
		assertEquals(true,checkBox3.isSelected());
		
		//Snapshot:: size
		Dimension d = new Dimension(480, 800);
		
		driver.manage().window().setSize(d);
		
		
	 //Step-1 :: type cast driver object into takeScreenshot instance 
		TakesScreenshot tsc = (TakesScreenshot) driver;
			
      //Step-2 :: Generate a screenshot as file 
		File rsc = tsc.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(rsc,new File("C:\\Users\\nayak\\Desktop\\simplilearn\\Phase_5_FSD\\FSD-5 WorkSpace-Practice-Projects\\AutomateWebApp\\screenshot\\reg-check-box-3.png"));
				
		
		
	}
	
	@Test
	@DisplayName("Test :: To Verify Registration Button")
	void testToVerifyRegistrationButton() throws InterruptedException, IOException {
		WebElement button = driver.findElement(By.className("registerbtn"));
		assertEquals(true,button.isDisplayed());
		assertEquals(true,button.isEnabled());
		
		//Select Check Box One
		button.submit();
		Thread.sleep(2000);
		
		//Snapshot:: size
		Dimension d = new Dimension(480, 800);
		
		driver.manage().window().setSize(d);
		
		
	 //Step-1 :: type cast driver object into takeScreenshot instance 
		TakesScreenshot tsc = (TakesScreenshot) driver;
			
      //Step-2 :: Generate a screenshot as file 
		File rsc = tsc.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(rsc,new File("C:\\Users\\nayak\\Desktop\\simplilearn\\Phase_5_FSD\\FSD-5 WorkSpace-Practice-Projects\\AutomateWebApp\\screenshot\\reg-button.png"));
				
		
	}
	
}
