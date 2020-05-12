package com.vulcan.selassment;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Registration {


		 public static void main(String[] args) throws InterruptedException {
		        
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\DESALIN NATH\\Desktop\\selenium jar\\New folder\\chromedriver_win32\\chromedriver.exe");
		        WebDriver driver = new ChromeDriver();// Launching the browser
		        driver.manage().window().maximize();// Maximize the window
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		        driver.get("http://demo.guru99.com/test/newtours/register.php");
		        // to select Australia from List box
		        Select country = new Select(driver.findElement(By.name("country")));
		        country.selectByVisibleText("AUSTRALIA");
		        List <WebElement> list = country.getOptions();
		        for(int i=0; i<list.size(); i++)        
		            {
		                    System.out.println(list.get(i).getText());
		            }
		 }
		        public static void CaptureScreenshot() throws IOException {
		    		try {
		    			String date = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
		    			TakesScreenshot driver = null;
						File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		    			String path="C:\\Users\\DESALIN NATH\\Documents\\MyProjec\\desisy\\Snap"+date+".png";
		    			File f = new File(path);
		    			//System.out.println(f);
		    			Files.copy(screenshot, f);
		    		} catch (WebDriverException e) {
		    			System.err.println(e.getMessage());
		    		}


	}

}
