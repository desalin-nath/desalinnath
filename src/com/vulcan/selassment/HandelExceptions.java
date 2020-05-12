package com.vulcan.selassment;

import java.sql.Driver;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandelExceptions {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DESALIN NATH\\Desktop\\selenium jar\\New folder\\chromedriver_win32\\chromedriver.exe");

			 WebDriver driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("http://demo.guru99.com/test/newtours/register.php");
			 
			  try {
				    driver.findElement(By.id("submit")).click();
				   }catch (NoSuchElementException e) {
				   
				 System.out.println("NoSuchElementException");
				   
				    driver.switchTo().frame("frame_11");
				    } catch (NoSuchFrameException e) {
				    System.out.println("NoSuchFrameException");
				    }


	}
}
				
//			 WebDriverWait wait = new WebDriverWait(driver, 10);
//			 wait.until(ExpectedConditions.presenceOfElementLocated(By.id("submit")));
//			 try {
//			 By driver;
//			driver.findElement(By.id("submit")).click();
//			 } catch (WebDriverException e) {
//			 char[] exceptional;
//			System.out.println("An exceptional case");
//			 }
//	}catch(TimeoutException e) {
//		System.out.println("could not locate the element");
//	
//			
//			try {
//				WebDriver driver1 = null;
//				driver1.switchTo().alert().accept();
//			}
//			catch(NoAlertPresentException E) {
//				E.printStackTrace();
//				
//				
//			}
//			try {
//			driver.findElement(By.xpath("//*[@id='register']"));
//	}catch(Exception e) {
//		System.out.println("Register element is not found");
//	}
//	}
//
//			
//			
	
	

	



