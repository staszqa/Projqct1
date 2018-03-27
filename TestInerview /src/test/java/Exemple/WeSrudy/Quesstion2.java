package Exemple.WeSrudy;

import static org.junit.Assert.*;

import java.awt.geom.GeneralPath;
import java.util.concurrent.TimeUnit;

import javax.swing.SpringLayout.Constraints;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class Quesstion2 {
	private WebDriver driver;
		

	@Before
	public void setUp() throws Exception {
	System.setProperty("webdriver.gecko.driver","/Users/stanislavzinchenko/Desktop/browser/geckodriver");
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.weightwatchers.com/us/");

	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void Question2() {
			
//		verify title on the main page 
		
		String vtitle = driver.getTitle();
		
		Assert.assertEquals(vtitle, "Weight Loss Program, Recipes & Help | Weight Watchers");
		
		System.out.println("title = "+ vtitle);
		
		 //#1 go to "Find a Meeting"
		driver.findElement(By.className("find-a-meeting")).click();
	
//		verify title on tre "find a meeting " page 
		driver.getPageSource().contains("Get Schedules & Times Near You");
		{
			System.out.println("Text present ");
		}
		// search zip code "10011' 
		driver.findElement(By.id("meetingSearch")).sendKeys("10011");
		driver.findElement(By.xpath("//button[@class='btn btn-default form-blue-pill__btn']")).click();
//		Verify  name and distance on the page 
		String name = driver.findElement(By.xpath("//span[text()='WEIGHT WATCHERS STORE 23RD ST-5TH AVE']")).getText();
		String distance  = driver.findElement(By.xpath("//div[text()='0.49 mi.']")).getText();
		
		System.out.println(name + distance );
		
		
		
//		click on the first result on the page 
		driver.findElement(By.xpath("//span[text()='WEIGHT WATCHERS STORE 23RD ST-5TH AVE']")).click();
		
//	verify title on the page 
		
		WebElement title1 = driver.findElement(By.xpath("//span[text()='WEIGHT WATCHERS STORE 23RD ST-5TH AVE']"));
		assertTrue(title1.getText().contains("WEIGHT WATCHERS STORE 23RD ST-5TH AVE"));
//		Verify time and data on the page 
		String time = driver.findElement(By.xpath("//div[text()='8:00 AM – 1:00 PM']")).getText();
		
		String data = driver.findElement(By.xpath("//div[text()='Saturday']")).getText();
		

		System.out.println( data  + time );
		
		
		}

			
		}
		
		
		
		
		
		
	
		
			
