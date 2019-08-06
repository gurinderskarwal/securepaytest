package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**/
public class googlehome 
{

WebDriver driver;
	
	By searchbox = By.name("q");
	By searchbtn = By.cssSelector("input[name=btnK]");
	By searchresults = By.xpath("//h3[contains(.,'SecurePay online payment and eCommerce solutions for businesses')]");
	String searchtxt = "securepay";

	/*
	 * This function returns driver
	*/
	public googlehome(WebDriver driver)	
	{

        this.driver = driver;

	}
	/*
	 * This function adds text in search box
	 */
	public void searchText()
	{
		driver.findElement(searchbox).sendKeys(searchtxt);

	}
	/*
	 * clicks on search button
	 */
	public void submitSearch()
    {
    	driver.findElement(searchbox).submit();

    }
	/*
	 * clicks on google search results
	 */
	public void searchResults()
    {
    	driver.findElement(searchresults).click();

    }
}
