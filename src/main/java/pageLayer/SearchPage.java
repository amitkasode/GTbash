package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchPage {

    public SearchPage(WebDriver driver) {
     
    	PageFactory.initElements(driver, this);
    }

    // --------------Obj repo ---------------------

    @FindBy(xpath = "//input[@id='gh-ac']")
    private WebElement searchInput;

    @FindBy(id = "gh-cat")
    private WebElement categoryDropdown;

    @FindBy(id = "gh-btn")
    private WebElement searchButton;

    @FindBy(xpath = "(//span[@role='heading'])[2]")
    private WebElement firstResultName;
    
    //------------------s

    // ------------ Action methods ----------------

    public void enterSearchString(String searchString) {
       
    	searchInput.sendKeys(searchString);
    }

    public void selectSearchCategory(String category) {
        Select select = new Select(categoryDropdown);
        select.selectByVisibleText(category);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public boolean verifyFirstResultMatchesSearchString(String searchString) {
        String firstResultNameText = firstResultName.getText();
        return firstResultNameText.contains(searchString);
    
    
    
    }
}
