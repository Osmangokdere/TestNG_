package tests.day14_testNGFramework;

import org.testng.annotations.Test;

public class C01_TestNGIlkTest {

    /* TestNG test methodlari isim sirasina gore calisir (JUnit kafasina göre :)))
    Priorty degeri verilen methodlar priority degeri kucukten buyuge dogru calisir
    esit olan priority degerinde harf sirasina gore calisir
    eger priority degeri yazmazzsk =0 kabul eder
    */



    @Test(priority = 6)
    public void ilkTest() {
        System.out.println("İlk Test Calisti");
    }

    @Test (priority = 9)
    public void ikinciTest() {
        System.out.println("İkinci Test Calisti");
    }

    @Test(priority = 44)
    public void ucuncuTest() {
        System.out.println("Ucuncu Test Calisti");

    }
}