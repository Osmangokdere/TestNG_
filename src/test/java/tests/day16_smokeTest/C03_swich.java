package tests.day16_smokeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusablaMethod;

import java.util.List;

public class C03_swich {
    @Test
    public void test01() {

        // https://the-internet.herokuapp.com/iframe adresine gidin
        Driver.getDriver().get("https://the-internet.herokuapp.com/iframe");
        // elemental selenium linlkine tiklayin
        Driver.getDriver().findElement(By.linkText("Elemental Selenium")).click();
        // title'i "Elemental Selenium | Elemental Selenium"
        // olan yeni window'a gecis yapin

        Driver.getDriver().get("https://elementalselenium.com/");
       System.out.println(Driver.getDriver().getTitle());
        ReusablaMethod.switchToWindow("Elemental Selenium | Elemental Selenium");
        // ve sayfa uzerinde  "Elemental Selenium" yazisi oldugunu test edin
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//div[@class='navbar__logo'])[1]")).isDisplayed());
        Driver.quitDriver();


    }
        @Test
        //LOCATORI VERİP TEXT ALMA VE DORULAMA TESTİ
        public void getElementTest() {
        Driver.getDriver().get("https://amazon.com");
        List ext=ReusablaMethod.getElementsText(By.id("swm-link"));
        String act="Black";
           // Assert.assertTrue(ext.contains(act));
            System.out.println(ext);
        Driver.quitDriver();

        }
}

