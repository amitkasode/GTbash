package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageLayer.AllFiltersPage;
import pageLayer.CellPhoneSmartphonesPage;
import pageLayer.CellPhonesPage;
import pageLayer.ElectronicsPage;
import pageLayer.HomePage;
import pageLayer.SearchPage;


public class Stepsfile {

	WebDriver driver;
	HomePage homepage_obj;
	SearchPage searchpage_obj;
	AllFiltersPage allFiltersPage_obj;
	CellPhoneSmartphonesPage cellPhoneSmartphonesPage_obj;
	CellPhonesPage cellPhonesPage_obj;
	ElectronicsPage electronicsPage_obj;
	
	PageObjectManger pageObjectManger; 

	@Given("the user is on the eBay homepage")
	public void the_user_is_on_the_e_bay_homepage() {

		driver = new EdgeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();

		pageObjectManger= new PageObjectManger(driver);
		
		homepage_obj=pageObjectManger.getHomePage();
	
		allFiltersPage_obj=pageObjectManger.getAllFiltersPage();
		
		cellPhoneSmartphonesPage_obj=pageObjectManger.getCellPhoneSmartphonesPage();
		
		electronicsPage_obj=pageObjectManger.getElectronicsPage();
		
		cellPhonesPage_obj=pageObjectManger.getCellPhonesPage();
		
		searchpage_obj=pageObjectManger.getSearchPage();
	}

	@When("the user clicks on Shop by category")
	public void the_user_clicks_on_shop_by_category() {

		homepage_obj.selectCategoryDropdown();

	}

	@When("the user clicks on Electronics")
	public void the_user_clicks_on_electronics() {

		electronicsPage_obj.clickOnElectronicsCategory();
	}

	@When("the user clicks on Cell Phones & Accessories")
	public void the_user_clicks_on_cell_phones_accessories() {

		cellPhoneSmartphonesPage_obj.clickOnCellPhonesSubcategory();

	}

	@When("the user clicks on See all in Cell Phones & Acces")
	public void the_user_clicks_on_see_all_in_cell_phones_acces() {

		cellPhoneSmartphonesPage_obj.clickOnSeeAllLink();
	}

	@When("the user clicks on Cell Phones & Smartphones")
	public void the_user_clicks_on_cell_phones_smartphones() {

		cellPhoneSmartphonesPage_obj.clickOncellPhonesSmartphone();
	}

	@When("the user clicks on All Filters")
	public void the_user_clicks_on_all_filters() {

		allFiltersPage_obj.clickOnAllfilter();
	}

	@When("the user clicks on Screen Size")
	public void the_user_clicks_on_screen_size() {

		allFiltersPage_obj.selectscreenSizeFilter();
	}

	@When("the user clicks on SetScreensize")
	public void the_user_clicks_on_set_screensize() {

		allFiltersPage_obj.selectScreenSizeValue();

	}

	@When("the user clicks on Item Location")
	public void the_user_clicks_on_item_location() {

		allFiltersPage_obj.selectItemLocationFilter();

	}

	@When("the user clicks on US Only")
	public void the_user_clicks_on_us_only() {

		allFiltersPage_obj.selectItemLocationValue();
	}

	@When("the user clicks on Price")
	public void the_user_clicks_on_price() {

		allFiltersPage_obj.selectPriceFilter();

	}

	@When("the user enters {string} into Minimum Value")
	public void the_user_enters_into_minimum_value(String string) {
		allFiltersPage_obj.setMinPriceInput("20");
	}

	@When("the user enters {string} into Maximum Value")
	public void the_user_enters_into_maximum_value(String string) {
		allFiltersPage_obj.setMaxPriceInput("40");
	}

	@When("the user clicks on Apply")
	public void the_user_clicks_on_apply() throws InterruptedException {
		allFiltersPage_obj.clickOnApplyButton();

	}

	@Then("I should see the filter tags applied")
	public void i_should_see_the_filter_tags_applied() throws InterruptedException {

		String expected_result = "4.0 - 4.4 Inch Cell Phones & Smartphones between US $20.00 and US $40.00";
		String actual_result = homepage_obj.getText();

	boolean result = homepage_obj.verifyFilterTagsAreApplied();
		
	Assert.assertEquals(actual_result,expected_result );
		
	Thread.sleep(3000);
	driver.close();
		
	}

	@When("I type {string} in the search bar")
	public void i_type_in_the_search_bar(String string) {

		// Make sure the searchpage_obj variable is not null
		if (searchpage_obj == null) {
			searchpage_obj = new SearchPage(driver);
		}
		// Call the enterSearchString method on the searchpage_obj
		searchpage_obj.enterSearchString("MacBook");

	}

	@When("I change the search category to {string}")
	public void i_change_the_search_category_to(String string) {

		searchpage_obj.selectSearchCategory("Computers/Tablets & Networking");

	}

	@When("I click on the search button")
	public void i_click_on_the_search_button() {
		
		searchpage_obj.clickSearchButton();
	}

	@Then("the page should load completely")
	public void the_page_should_load_completely() {

	}

	@Then("the first result name should match with the search string")
	public void the_first_result_name_should_match_with_the_search_string() {

		
		
	   Assert.assertTrue(searchpage_obj.verifyFirstResultMatchesSearchString("MacBook"));
	
	   
	   System.out.println(searchpage_obj.verifyFirstResultMatchesSearchString("MacBook"));
	   driver.close();
	}

}