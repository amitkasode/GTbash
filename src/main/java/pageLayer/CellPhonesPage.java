package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonesPage {

	public CellPhonesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// --------------Obj repo ---------------------

	

	@FindBy(xpath = "//a[contains(text(),'Cell Phones & Smartphones')]")
	private WebElement cellPhonesSmartphonesFilter;



	// ------------ Action methods ----------------


	public void clickOncellPhonesSmartphone() {
		cellPhonesSmartphonesFilter.click();
	}


}
