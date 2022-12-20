package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstseleniumclass {
    public static void main(String[] args) {
    System.setProperty("web driver.chrome.driver","/Users/macmac/Documents/Selenium Libraries/Drivers/chromedriver");
    /*
    En temel haliyle otomasyon yapmak için class'ımıza otomasyon için gerekli olan
    webdriver'ın yerini göstermemiz gerekir. Bunun için Java kütüphanesinden System.setProperty
    methodunu içine ilk olarak driver'ı yazarız. İkinci olarak driver'ın fiziki yolunu kopyalarız.
     */

        WebDriver driver = (WebDriver) new ChromeDriver();
        driver.get("https://www.google.com/");



    }
}
