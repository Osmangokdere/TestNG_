package tests.day18_htmlReports;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_HTMLReports extends TestBaseRapor {
    @Test
    public void test01(){
        extentTest=extentReports.createTest("Nutella testi","Kullanici amazonda Nutella arayabilmeli");
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        extentTest.info("Amazon anasayfaya gidildi");

        Driver.getDriver().navigate().refresh();
        Driver.getDriver().navigate().refresh();
        extentTest.info("Ropot dogrulamasının gecilmesi icin 2 kez refresh yapıldı");
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        extentTest.info("Arama kutusuna Nutella yazıp, arama yapildi");

        String actualSonuc=amazonPage.aramaSonucuElementi.getText();
        String exceptedKelime="Nutella";
        extentTest.info("Arama sonucları kaydedildi");

        Assert.assertTrue(actualSonuc.contains(exceptedKelime));
        extentTest.pass("Arama sonuclarinin Nutella icerdigi test edildi");
    }

}
