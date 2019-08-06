package pageobjects;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class ContactUs 
{

	WebDriver driver;

	String firstNameRandom = RandomStringUtils.randomAlphabetic(10);
	String lastNameRandom = RandomStringUtils.randomAlphabetic(10);
	String phoneRandom = RandomStringUtils.randomNumeric(9);
	String companyRandom = RandomStringUtils.randomAlphanumeric(10);
	String emailRandom = RandomStringUtils.random(4, "testingisbeingdone") + "@" + "abc.com";
	String urlRandom = RandomStringUtils.random(8, "http://www." + "testingisbeingdone") + "." + "com";
	String contactUsTitle = "Contact us";


	
	By firstname = By.name("first-name");
	By email = By.name("email-address");
	By lastname = By.name("last-name");
	By phone = By.name("phone-number");
	By websiteurl = By.name("website-url");
	By company = By.name("business-name");
	By enquiry = By.name("reason-for-enquiry");
	By iscontactustitle = By.xpath("/html/body/section[1]/div/h1");
	
	/*
	 * This function returns driver
	*/
	public ContactUs(WebDriver driver)	
	{

        this.driver = driver;

	}
	
	/*
	 * adds first name in text box
	 */
	public void firstName()
	{
		driver.findElement(firstname).sendKeys(firstNameRandom);

	}
	/*
	 * adds last name in text box
	 */
	public void lastName()
	{
		driver.findElement(lastname).sendKeys(lastNameRandom);

	}
	/*
	 * adds phone number in text box
	 */
	public void phone()
	{
		driver.findElement(phone).sendKeys(phoneRandom);

	}
	
	/*
	 * adds company name in text box
	 */
	public void company()
	{
		driver.findElement(company).sendKeys(companyRandom);

	}
	
	/*
	 * adds random email in text box
	 */
	public void emailRandom()
	{
		driver.findElement(email).sendKeys(emailRandom);

	}
	
	/*
	 * adds random website url in text box
	 */
	public void urlRandom()
	{
		driver.findElement(websiteurl).sendKeys(urlRandom);

	}
	
	/*
	 * selects value from dropdown
	 */
		public void enquiryDropdown()
	{
		Select drp = new Select(driver.findElement(enquiry));
		drp.selectByVisibleText("Support");

	}
		
	/*
	* finds contact us title on page
	*/
	public void contactusTitle()
	{
		driver.findElement(iscontactustitle);

	}
}