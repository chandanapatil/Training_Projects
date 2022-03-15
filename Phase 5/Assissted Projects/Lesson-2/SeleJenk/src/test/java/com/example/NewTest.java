package com.example;


import java.sql.Driver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class NewTest {
	private ChromeDriver driver;   
    SoftAssert soft=new SoftAssert();
    @Test               
    public void testEasy() {    
        System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.facebook.com");  
        String title = driver.getTitle();                               
        soft.assertEquals("FB Login",title);        
    }   
    @BeforeTest
    public void beforeTest() {  
        driver = new FirefoxDriver();  
    }       
    @AfterTest
    public void afterTest() {
        driver.quit();          
    }       

}
