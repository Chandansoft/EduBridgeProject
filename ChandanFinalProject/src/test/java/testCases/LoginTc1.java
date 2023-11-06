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

import pages.Login;

public class LoginTc1 {

	WebDriver driver;
	Login login ;

	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.stationerybazaar.com/index.php?main_page=login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		login = new Login(driver);
	}

	@Test
	public void voidcheckLogin() throws IOException
	{
		login.enterMail("chandan");
		login.enterPassword("iamchandan");
		login.clickSignInBtn();
		System.out.println("sign in btn is clicked");


		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Chandan Project/img1.jpg");
		FileUtils.copyFile(source, dest);
		System.out.println("Screenshot Captured");



		String actualPasswrd = "iamchandan";
		String expectedPasswrd = "IamChandan123#";
		if(actualPasswrd==expectedPasswrd)
		{
			System.out.println("User able to login");
		}
		else
		{
			System.out.println("Check your password");
		}

	}

	@AfterTest
	public void teardown()
	{
		driver.close();
	}


}
