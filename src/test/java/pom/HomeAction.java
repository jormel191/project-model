package pom;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;

public class HomeAction  extends BasePage{

    private HomePage home;

    public HomeAction(WebDriver driver) {
        super(driver);
        home=  new HomePage(driver);
    }

    public int getPopUpsize() throws Exception {
        try{
            return home.getPopUpSizeBtn().size();
        }catch (Exception  e){
            throw new Exception("element no find");
        }
    }

    public void closePopUp() throws Exception {
        this.click(home.getPopUpBtn());
    }

    public void getTitle(String title) throws Exception {
        if (home.getPopUpBtn().isDisplayed()){
            closePopUp();
        }
        Assert.assertEquals(this.getTitle(),title);
    }

    public  void clickSeacrch() throws Exception {
        this.click(home.getSearchBtn());
    }

    public void searchProduct(String product) throws Exception {
        if (this.isDisplayed(home.getSearchInput())){
            this.moveTo(product, home.getSearchInput());
            this.clickSeacrch();
        }
    }

    public void getPrice(){
        for (int i = 0; i < 5; i++) {
            String prodcut= home.getProductList().get(i).getText();
            String price =  home.getPriceList().get(i).getText();
            System.out.println("El producto " + prodcut + "cuesta" + price);

        }

    }

}
