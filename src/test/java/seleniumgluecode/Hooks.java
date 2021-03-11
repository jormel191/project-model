package seleniumgluecode;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class Hooks {

    private static WebDriver driver;
    private DriverManager driverManager;

    @Before
    public void setup() throws IOException {
        Properties prop= new Properties();
        prop.load(new FileReader("config/config.properties"));
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.getDriver();
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            byte[]screenshot = ((TakesScreenshot)driverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png", "imagen");
        }
        driverManager.quitDriver();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
