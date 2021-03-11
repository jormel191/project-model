package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pom.HomeAction;
import pom.HomePage;

public class TestBase {

    protected WebDriver driver =Hooks.getDriver();
    protected HomeAction homePage= PageFactory.initElements(driver,HomeAction.class);


}
