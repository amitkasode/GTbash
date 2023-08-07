 package stepDefinitions;

import org.openqa.selenium.WebDriver;

import pageLayer.AllFiltersPage;
import pageLayer.CellPhoneSmartphonesPage;
import pageLayer.CellPhonesPage;
import pageLayer.ElectronicsPage;
import pageLayer.HomePage;
import pageLayer.SearchPage;

public class PageObjectManger {

	private WebDriver driver;
	private HomePage homePage_obj;
	private SearchPage searchpage_obj;
	private AllFiltersPage allFiltersPage_obj;
	private CellPhoneSmartphonesPage cellPhoneSmartphonesPage_obj;
	private CellPhonesPage cellPhonesPage_obj;
	private ElectronicsPage electronicsPage_obj;

	public PageObjectManger(WebDriver driver) {

		this.driver = driver;

	}

	public HomePage getHomePage() {

		if (homePage_obj == null) {

			homePage_obj = new HomePage(driver);
		}

		return homePage_obj;

	}

	
	
	public SearchPage getSearchPage() {

		if (searchpage_obj == null) {

			searchpage_obj = new SearchPage(driver);
		}

		return searchpage_obj;

	}
	public AllFiltersPage getAllFiltersPage() {

		if (allFiltersPage_obj == null) {

			allFiltersPage_obj = new AllFiltersPage(driver);
		}

		return allFiltersPage_obj;

	}

	public CellPhoneSmartphonesPage getCellPhoneSmartphonesPage() {

		if (cellPhoneSmartphonesPage_obj == null) {

			cellPhoneSmartphonesPage_obj = new CellPhoneSmartphonesPage(driver);
		}

		return cellPhoneSmartphonesPage_obj;

	}

	public CellPhonesPage getCellPhonesPage() {

		if (cellPhonesPage_obj == null) {

			cellPhonesPage_obj = new CellPhonesPage(driver);
		}

		return cellPhonesPage_obj;

	}

	public ElectronicsPage getElectronicsPage() {

		if (electronicsPage_obj == null) {

			electronicsPage_obj = new ElectronicsPage(driver);
		}

		return electronicsPage_obj;

	}

}
