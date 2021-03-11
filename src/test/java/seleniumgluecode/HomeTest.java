package seleniumgluecode;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;



public class HomeTest extends TestBase {

    @Then("enters a {string}")
    public void enters_a_product(String prod) throws Exception {
        homePage.searchProduct(prod);

    }

    @Then("get the price of five first product")
    public void get_the_price_of_first_product() {
        homePage.getPrice();

    }

    @Given("user is on the {string} page")
    public void userIsOnThePage(String title) throws Exception {
        homePage.getTitle(title);
    }
}




