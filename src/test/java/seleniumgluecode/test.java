package seleniumgluecode;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class test extends TestBase {

    @Given("user is on the phptravel page")
    public void cuando_el_usuario_esta_en_la_pagina_phptravel() throws Exception {
        Assert.assertTrue(homePage.homePageIsDisplayed());
    }

    @When("clicks flight")
    public void hace_clic_a_fligth() throws Exception {
        homePage.clickOnfligth();
    }

    @Then("From and to option appears to select the flight")
    public void se_despliega_opcion_from_y_to_para_seleccionar_el_vuelo() throws Exception {

        Assert.assertTrue(homePage.economyIsDisplayed());
    }

    @Then("user select from")
    public void el_usuario_selecciona_from() throws Exception {
        homePage.selectFrom("lah", "(LHE)");

    }

    @Then("user select to")
    public void el_usuario_selecciona_to() throws Exception {
        homePage.selectTo("dub", "(DXB)");

    }

    @Then("user select depart")
    public void el_usuario_selecciona_depart() throws Exception {
        homePage.selectDepart("2020-09-25");

    }

    @Then("user clicks search")
    public void usuario_hace_clic_en_search() throws Exception {
        homePage.clickSeach();
    }

    @Then("user is redirected to the page")
    public void se_redirecciona_a_la_pagina() throws Exception {
        Assert.assertTrue(resultPage.FlightsListDisplayed());

    }

    @And("You get the cheapest ticket price")
    public void Se_obtiene_el_precio() throws InterruptedException {

        resultPage.getPrice();
    }
}




