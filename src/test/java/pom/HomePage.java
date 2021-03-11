package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;


public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@class='dy-modal-contents']/div[1]")
    private List<WebElement> PopUpSizeBtn;

    @FindBy(xpath = "//div[@class='dy-modal-contents']/div[1]")
    private WebElement PopUpBtn;

    @FindBy(xpath = "//input[@id='testId-SearchBar-Input']")
    private WebElement searchInput;

    @FindBy(className = "pod-subTitle")
    private List<WebElement> productList;

    @FindBy(xpath = "//div[@class='jsx-3342506598 cmr-icon-container']")
    private List<WebElement> priceList;

    @FindBy(className = "SearchBar-module_searchBtnIcon__VR3f5")
    private WebElement searchBtn;


    public HomePage(WebDriver driver) {
        super(driver);

    }

    public List<WebElement> getPopUpSizeBtn() {
        return PopUpSizeBtn;
    }

    public WebElement getPopUpBtn() {
        return PopUpBtn;
    }

    public WebElement getSearchInput() {
        return searchInput;
    }

    public List<WebElement> getProductList() {
        return productList;
    }

    public List<WebElement> getPriceList() {
        return priceList;
    }

    public WebElement getSearchBtn() {
        return searchBtn;
    }



}
