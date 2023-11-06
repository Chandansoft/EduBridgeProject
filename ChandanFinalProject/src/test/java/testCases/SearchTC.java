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



import pages.Search;

public class SearchTC 
{
	WebDriver driver;
	Search search;

	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.stationerybazaar.com/index.php?main_page=index");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		search= new Search(driver);
	}

	@Test
	public void SearchforProduct() throws IOException
	{
		search.enterRequirement("Acrylic Pen Stand");
		search.clickSearchBtn();

		System.out.println("search button clicked");


		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Chandan Project/img3.jpg");
		FileUtils.copyFile(source, dest);
		System.out.println("Screenshot Captured");
		
		String actualurl = "https://www.stationerybazaar.com/index.php?main_page=advanced_search_result&search_in_description=1&keyword=acrylic+pen+stand " ;
		String expectedurl = driver.getCurrentUrl();
		
		System.out.println("Expected url is : "+expectedurl);
		
		if(actualurl==expectedurl)
		{
			System.out.println("Desired search success");
		}
		else
		{
			System.out.println("Again check for search ");
		}




	}

	@AfterTest
	public void teardown()
	{
		driver.close();
	}







}
