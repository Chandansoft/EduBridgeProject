package testCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Form;



public class FormTC {
	
	

		WebDriver driver;
		Form form ;

		@BeforeTest
		public void setup()
		{
			driver = new ChromeDriver();
			driver.get("https://www.stationerybazaar.com/index.php?main_page=contact_us");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			form = new Form(driver);
		}

		@Test
		public void FillContactForm() throws IOException
		{
			form.enterFirstName("Chandan");
			form.enterMail("abc@gmail.com");
			form.enterMessage("I am looking for office stationary in wholesale rates 300+ quantity each");
			form .clicksSendBtn();
			
			System.out.println("send now btn is clicked");


			File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest = new File("D:\\Chandan Project/img2.jpg");
			FileUtils.copyFile(source, dest);
			System.out.println("Screenshot Captured");



			

		}

		@AfterTest
		public void teardown()
		{
			driver.close();
		}




}
