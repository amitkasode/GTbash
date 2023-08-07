package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// --------------Obj repo ---------------------

	@FindBy(xpath = "//button[@id='gh-shop-a']")
	private WebElement categoryDropdown;

	@FindBy(xpath = "//span[contains(text(),'4.0 - 4.4 in')]")
	private WebElement screenSizeFilterTag;

	@FindBy(xpath = "//li[@class='brm__item brm__item--applied']//li[1]//a[1]")
	private WebElement priceFilterTag;

	@FindBy(xpath = "//span[text()='Item Location: US Only']")
	private WebElement itemLocationFilterTag;
	
	
	
	@FindBy(xpath = "//span[contains(text(),'4.0 - 4.4 Inch Cell Phones & Smartphones between U')]")
	private WebElement graptext;
	
	// ------------ Action methods ----------------

	public void selectCategoryDropdown() {
		categoryDropdown.click();
	}

	
	public boolean verifyFilterTagsAreApplied() {
	    return screenSizeFilterTag.isDisplayed() && priceFilterTag.isDisplayed() && itemLocationFilterTag.isDisplayed();
	}
	
	public String getText() {
	return 	graptext.getText();
	}

}
