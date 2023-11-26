package tests.day14_testNGFramework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C02_DependsOnMethods {

    @Test
    public void ilkTest() {
        System.out.println("İlk Test Calisti");
        Assert.assertTrue(9>5);
    }

    @Test (dependsOnMethods ="ilkTest")
    public void ikinciTest() {
        System.out.println("İkinci Test Calisti");
    }

    @Test(dependsOnMethods = "ikinciTest")
    public void ucuncuTest() {
        System.out.println("Ucuncu Test Calisti");
}}
