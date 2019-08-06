package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePayHomePage 
{
	WebDriver driver;
	
	By contactus = By.linkText("Contact Us");
	
	/*
	 * This function returns driver
	*/
	public SecurePayHomePage(WebDriver driver)	
	{

        this.driver = driver;

	}
	/*
	 * clicks on contact us button
	 */
	public void contactusBtn()
    {
    	driver.findElement(contactus).click();

    }


}
