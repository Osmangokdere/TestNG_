package tests.day18_htmlReports;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_DataProviderIleNegatifLoginTesti {


    @DataProvider
    public static Object[][] kullaniciBilgileri() {
        Object[][] kullaniciBilgileriArr=
                {{"A11","A12345"}, {"B1","B12345"},{"C13","C12345"},{"D11","D12345"},{"E15","E12345"}};
        return kullaniciBilgileriArr;
    }

    @Test(dataProvider ="kullaniciBilgileri")
    public void negativeLoginTest(String username, String password){

        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        QualitydemyPage qualitydemyPage=new QualitydemyPage();
        qualitydemyPage.ilkLoginLinki.click();

        qualitydemyPage.kullaniciEmailKutusu.sendKeys(username);
        qualitydemyPage.passwordKutusu.sendKeys(password);
        qualitydemyPage.ilkLoginLinki.click();
        Assert.assertTrue(qualitydemyPage.passwordKutusu.isDisplayed());

    }
}
