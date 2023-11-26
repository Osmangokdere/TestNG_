package tests.day18_htmlReports;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_DataProvider {
    @DataProvider
    public static Object[][] AmazonAranacakKelimeler() {
        /*
        sadece bir sarti vardır.
        iki katli bir object Arrayi dondurmelidir.
        */

        Object[][] amazonAranacakKelimelerArayi =
                {{"Nutella"}, {"Java"}, {"Apple"}, {"Samsung"}, {"Armut"}};

        return amazonAranacakKelimelerArayi;
        }


        //amazona gidelim
        //Nutella, java, apple, samsung, armut kelimeleri icin arama yapalim

        @Test(dataProvider = "AmazonAranacakKelimeler")
        public void aramaTesti(String aranacakKelime){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys(aranacakKelime+ Keys.ENTER);
        String actualSonucYazisi=amazonPage.aramaSonucuElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(aranacakKelime));
        
        
    }
    
    
}
