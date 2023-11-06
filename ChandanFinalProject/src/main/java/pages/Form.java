package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Form {
	
		WebDriver driver;
			
			//Constructor that will be automatically called as soon as the object of the class is created
				public Form(WebDriver driver) 
				{
					this.driver = driver;
				}
			
					

				//Mehtod for Enter first name
				public void enterFirstName(String name)
				{
					WebElement Fname = driver.findElement(By.id("contactname"));
				   Fname.sendKeys(name);
				}
				
				
				//Method for Enter email 
				
				public void enterMail(String Mail)
				{
					WebElement mail = driver.findElement(By.id("email-address"));
					mail.sendKeys(Mail);
				}
				
				//Method for Enter message
				
				public void enterMessage(String Message)
				{
					WebElement mes = driver.findElement(By.id("enquiry"));
					mes.sendKeys(Message);
				}
				
				
				
				
				//Method for click on sign in button
				
				public void clicksSendBtn()
				{
					WebElement sendbt = driver.findElement(By.xpath("//body/div[@id='mainWrapper']/div[@id='contentMainWrapper']/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[4]/div[1]/div[1]/input[1]"));
					sendbt.click();
				}


}
