package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search {

	
		WebDriver driver;
			
			//Constructor that will be automatically called as soon as the object of the class is created
				public Search(WebDriver driver) 
				{
					this.driver = driver;
				}				
										


				//Mehtod for Search 
				public void enterRequirement(String Req)
				{
					WebElement Prod = driver.findElement(By.xpath("//header/div[4]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/form[1]/div[1]/input[1]"));
					Prod.sendKeys(Req);
				}
				
				//Method for click on sign in button
				
				public void clickSearchBtn()
				{
					WebElement Searchbtn = driver.findElement(By.xpath("//header/div[4]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[1]/div[1]/form[1]/div[1]/button[1]/i[1]"));
					Searchbtn.click();
				}

	
	
	
}
