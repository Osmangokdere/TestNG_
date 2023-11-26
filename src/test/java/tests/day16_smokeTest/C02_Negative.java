package tests.day16_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusablaMethod;

public class C02_Negative {

    QualitydemyPage qualitydemyPage=new QualitydemyPage();
    @Test
    public void yanlisEmailTest(){
      QualitydemyPage qualitydemyPage=new QualitydemyPage();
      Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
      qualitydemyPage.ilkLoginLinki.click();
      qualitydemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
      qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
      qualitydemyPage.loginButonu.click();
      Assert.assertTrue(qualitydemyPage.ilkLoginLinki.isDisplayed());
      //ReusablaMethod.bekle(3);
        Driver.quitDriver();
    }

    @Test
    public void yanlisPasswordTesti(){
        qualitydemyPage=new QualitydemyPage();
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));
        qualitydemyPage.loginButonu.click();
        Assert.assertTrue(qualitydemyPage.ilkLoginLinki.isDisplayed());
        //ReusablaMethod.bekle(3);
        Driver.quitDriver();

    }

    @Test
    public void yanlısUsernameYanlısPasswordTesti(){
        qualitydemyPage=new QualitydemyPage();
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPassword"));
        qualitydemyPage.loginButonu.click();
        Assert.assertTrue(qualitydemyPage.ilkLoginLinki.isDisplayed());
        //ReusablaMethod.bekle(3);
        Driver.quitDriver();
    }

}
