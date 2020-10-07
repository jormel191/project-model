package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ResultPage extends BasePage {

    private String nMenor;

    private String TitleFlightsListPage = "Flights List";

    @FindBy(xpath = "//div[@class='theme-search-results-item-price']//p[@class='theme-search-results-item-price-tag']")
    private List<WebElement> priceLocator;

    public ResultPage(WebDriver driver) {
        super(driver);

    }

    public boolean FlightsListDisplayed() throws Exception {

        return this.getTitle().equals(TitleFlightsListPage);
    }

    public void getPrice() {


        String[] beforeSort = new String[priceLocator.size()];
        for (int i = 0; i < priceLocator.size(); i++) {
            beforeSort[i] = priceLocator.get(i).getText().trim();


        }
        System.out.println("****************Before sort****************");
        System.out.println(Arrays.toString(beforeSort));

        Arrays.sort(beforeSort);
        System.out.println("****************After sort****************");
        System.out.println(Arrays.toString(beforeSort));
        System.out.println("****************After of after sort****************");
           System.out.println(Arrays.toString(new String[]{beforeSort[0]}));

      


/*
        int prueba= Integer.parseInt(String.valueOf(priceLocator.size())) ;
      //  for (int i = 0; i < prueba.size(); i++)
        for (int i = 0; i < prueba; i++){

            if (nMenor>prueba){
                nMenor=prueba;
            }
        }
        System.out.println("El numero menor es:" + nMenor);
*/

            }
        }

