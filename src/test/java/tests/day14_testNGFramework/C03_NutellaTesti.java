package tests.day14_testNGFramework;

import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

import java.util.List;

public class C03_NutellaTesti {

    @Test(groups = {"minireg1","minireg2","smoke"})
    public void test01(){
        /*
        * Amazon sayfasına gidin
        * Nutella aratın
        * sonuclari test edin
      */
        Driver.getDriver().get("https://www.amazon.com");
        Driver.getDriver().navigate().refresh();
        Driver.getDriver().navigate().refresh();

        WebElement aramaKutusu =Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        WebElement aramaSonucElementi=Driver.getDriver().findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        String expectedKelime="Nutella";
        String actualAramaSonucu=aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));


       Driver.closeDriver();
    }
}
