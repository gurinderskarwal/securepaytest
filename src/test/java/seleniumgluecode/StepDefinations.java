package seleniumgluecode;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobjects.ContactUs;
import pageobjects.GoogleHome;
import pageobjects.SecurePayHomePage;

public class StepDefinations {
	
    public static WebDriver driver;

	@Given("^User is on google home page$")
	public void user_is_on_google_home_page() throws Throwable {
    	driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
	}

	@Given("^User types securepage in search box$")
	public void user_types_securepage_in_search_box() throws Throwable {
		GoogleHome gh = new GoogleHome(driver);
    	gh.searchText();
	}

	@When("^user clicks on search button$")
	public void user_clicks_on_search_button() throws Throwable {
		GoogleHome gh = new GoogleHome(driver);
    	gh.submitSearch();
	}

	@When("^user clicks on securepage website$")
	public void user_clicks_on_securepage_website() throws Throwable {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        GoogleHome gh = new GoogleHome(driver);
		gh.searchResults();
	}

	@Then("^user redirects to securepage home page$")
	public void user_redirects_to_securepage_home_page() throws Throwable {
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL, "https://www.securepay.com.au/" );
	}

	@Then("^user clicks on contact us page$")
	public void user_clicks_on_contact_us_page() throws Throwable {
		SecurePayHomePage hp = new SecurePayHomePage(driver);
		hp.contactusBtn();
	}

	@Then("^user see contact us page is loaded$")
	public void user_see_contact_us_page_is_loaded() throws Throwable {
		
    	String contact_us_title = "Contact us";
    	String actual = driver.findElement(By.xpath("/html/body/section[1]/div/h1")).getText();
        Assert.assertEquals(contact_us_title, actual);
	}

	@Then("^user fill data in contact us form$")
	public void user_fill_data_in_contact_us_form() throws Throwable {
		ContactUs cu = new ContactUs(driver);
		cu.firstName();
		cu.lastName();
		cu.emailRandom();
		cu.phone();
		cu.urlRandom();
		cu.company();
		cu.enquiryDropdown();
	}
	
	@Then("^user close the browser$")
	public void user_close_the_browser() throws Throwable {
		driver.quit();
	}

}
