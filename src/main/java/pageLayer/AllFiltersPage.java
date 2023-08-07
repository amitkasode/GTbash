package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllFiltersPage {

	public AllFiltersPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// --------------Obj repo ---------------------



	@FindBy(xpath = "//button[contains(text(),'All Filters')]")
	private WebElement clickOnAllfilter;

	// --------------------------------------------------------------------

	@FindBy(xpath = "//span[text()='Screen Size']")
	private WebElement screenSizeFilter;

	@FindBy(xpath = "(//input[@class='checkbox__control'])[1]")
	private WebElement SelectscreenSize;

	@FindBy(xpath = "//div[@id='c3-mainPanel-location']//span[1]")
	private WebElement itemLocationFilter;

	// --------------------------------------------------------------------

	@FindBy(xpath = "//input[@value='US Only']")
	private WebElement itemLocationValue;

	@FindBy(xpath = "//form[1]//div[1]//div[1]//div[1]//div[23]//span[1]")
	private WebElement priceFilter;

	// --------------------------------------------------------------------

	@FindBy(xpath = "//input[@aria-label='Minimum Value, US Dollar']")
	private WebElement minPriceInput;

	@FindBy(xpath = "//input[@aria-label='Maximum Value, US Dollar']")
	private WebElement maxPriceInput;

	@FindBy(xpath = "//button[text()='Apply']")
	private WebElement applyButton;

	// ------------ Action methods ----------------


	public void clickOnAllfilter() {
		clickOnAllfilter.click();
	}

	public void selectscreenSizeFilter() {
		screenSizeFilter.click();
	}

	public void selectScreenSizeValue() {
		SelectscreenSize.click();
	}

	public void selectItemLocationFilter() {
		itemLocationFilter.click();
	}

	// --------------------------------------------------------------------
	public void selectItemLocationValue() {
		itemLocationValue.click();
	}

	public void selectPriceFilter() {
		priceFilter.click();
	}

	// --------------------------------------------------------------------

	public void setMinPriceInput(String value) {
		minPriceInput.sendKeys(value);
	}

	public void setMaxPriceInput(String value) {
		maxPriceInput.sendKeys(value);
	}

	public void clickOnApplyButton() {
		applyButton.click();
	}

}
