package pom;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



import java.util.List;


public class HomePage extends BasePage {


    private String titleHomePage = "PHPTRAVELS | Travel Technology Partner";

    @FindBy(xpath = "//a[contains(text(),'Flights')]")
    private WebElement fligthBtnLocator;

    @FindBy(xpath = "//div[@class='form-icon-left flightclass']//a[@class='chosen-single']")
    private WebElement economyInputLocator;

    @FindBy(id = "s2id_location_from")
    private WebElement fromInputLocator;

    @FindBy(id = "s2id_location_to")
    private WebElement toInputLocator;

    @FindBy(xpath = "//div[@class='row no-gutters row-reverse align-items-end']//div[4]")
    private WebElement searchBtnLocator;

    @FindBy(className = "select2-result-label")
    private List<WebElement> option;

    @FindBy(className = "select2-result-label")
    private List<WebElement> options;

    @FindBy(id = "FlightsDateStart")
    private WebElement BirthDate;


    public HomePage(WebDriver driver) {
        super(driver);

    }

    public boolean homePageIsDisplayed() throws Exception {

        return this.getTitle().equals(titleHomePage);
    }

    public void clickOnfligth() throws Exception {

        this.click(fligthBtnLocator);
    }

    public boolean economyIsDisplayed() throws Exception {

        return this.isDisplayed(economyInputLocator);
    }



    public void selectFrom(String depart, String contains) throws Exception {
        moveTo(depart, fromInputLocator);
        for (int i = 0; i < option.size(); i++) {
            String text = option.get(i).getText();
            if (text.contains(contains)) {
                click(option.get(i));
                break;
            }
        }
    }

    public void selectTo(String arrive, String contains) throws Exception {
        moveTo(arrive, toInputLocator);
            for (int i = 0; i < options.size(); i++) {
                String text = options.get(i).getText();
                if (text.contains(contains)) {
                    this.click(options.get(i));
                    break;

            }
        }
    }

    public void selectDepart(String date) throws Exception {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("return document.getElementById(\"FlightsDateStart\").removeAttribute('readonly',0);");
        sendKeys(date, BirthDate);
    }

    public void clickSeach() throws Exception {
        this.click(searchBtnLocator);
    }

}
