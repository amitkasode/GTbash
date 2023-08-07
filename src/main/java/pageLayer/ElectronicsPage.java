package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage {

	public ElectronicsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// --------------Obj repo ---------------------



	@FindBy(xpath = "//tbody/tr[1]/td[1]/h3[2]/a[1]")
	private WebElement electronicsCategoryk;

	

	// ------------ Action methods ----------------


	public void clickOnElectronicsCategory() {
		electronicsCategoryk.click();
	}


}
