package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	
WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
		public Login(WebDriver driver) 
		{
			this.driver = driver;
		}
		
		
		
		


		//Mehtod for Enter Email Id
		public void enterMail(String Mail)
		{
			WebElement mail = driver.findElement(By.id("login-email-address"));
			mail.sendKeys(Mail);
		}
		
		
		//Method for Enter password tab
		
		public void enterPassword(String pass)
		{
			WebElement passwrd = driver.findElement(By.id("login-password"));
			passwrd.sendKeys(pass);
		}

		//Method for click on sign in button
		
		public void clickSignInBtn()
		{
			WebElement signbtn = driver.findElement(By.xpath("//body/div[@id='mainWrapper']/div[@id='contentMainWrapper']/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]"));
			signbtn.click();
		}

}
