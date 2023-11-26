package tests.day16_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusablaMethod;

public class C01_PozitifLoginTest {
    @Test
    public void PozitifLoginTest(){
        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        qualitydemyPage.ilkLoginLinki.click();
        qualitydemyPage.kullaniciEmailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
        qualitydemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerliPassword"));
        qualitydemyPage.loginButonu.click();
        Assert.assertTrue(qualitydemyPage.basariliGirisCoursesLinki.isDisplayed());
        ReusablaMethod.bekle(2);
        Driver.closeDriver();
    }
}
