package org.test.r;


import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;


public class BrowserLaunch {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		
			driver.manage().window().maximize();
		
			WebElement ser = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		ser.sendKeys("iphone");
		
		WebElement btnlogin = driver.findElement(By.xpath("//button[@type='submit']"));
		btnlogin.click();
		
		  //
	       List<WebElement>crt = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	       
	       for(int i=0;i<crt.size() ;i++) {
	    	   for (int j = 0; j <24; j++) {
				
			}
	    	   WebElement se = crt.get(i);
	         String tex = se.getText();
	                System.out.println(tex);
	        
	       }
	       
List<WebElement>crtt = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	    
	       for(int i=0;i<crtt.size() ;i++) {
	    	   WebElement see = crt.get(i);
	         String texx = see.getText();
	         System.out.println(texx);
	         
	         
	         
	        
		
	         
	         
	         
	         
	         
	         
	         
	         System.out.println("Done");
	}

	
		
	}

}
