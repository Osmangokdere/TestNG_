package tests.day19_crossBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.*;

import static utilities.CrossDriver.*;

public class C01_AmazonSearch extends TestBaseCross {
    @Test
    public void test01(){
        driver.get(ConfigReader.getProperty("amazonUrl"));
        driver.navigate().refresh();
        driver.navigate().refresh();
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        ReusablaMethod.bekle(2);
        WebElement aramaSonucElementi= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        String expectedKelime="Nutella";
        String actualAramaSonucu=aramaSonucElementi.getText();
        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));
    }
}
