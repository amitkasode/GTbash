package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhoneSmartphonesPage {

	public CellPhoneSmartphonesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// --------------Obj repo ---------------------



	@FindBy(xpath = "//span[contains(text(),'Cell Phones & Accessories')]")
	private WebElement cellPhonesSubcategory;

	// --------------------------------------------------------------------
	@FindBy(xpath = "//a[contains(text(),'See all in Cell Phones & Accessories')]")
	private WebElement seeAllLink;

	@FindBy(xpath = "//a[contains(text(),'Cell Phones & Smartphones')]")
	private WebElement cellPhonesSmartphonesFilter;




	// ------------ Action methods ----------------



	public void clickOnCellPhonesSubcategory() {
		cellPhonesSubcategory.click();
	}

	// --------------------------------------------------------------------

	public void clickOnSeeAllLink() {
		seeAllLink.click();
	}

	public void clickOncellPhonesSmartphone() {
		cellPhonesSmartphonesFilter.click();
	}

	


}
