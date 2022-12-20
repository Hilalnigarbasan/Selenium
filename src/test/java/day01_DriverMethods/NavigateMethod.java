package day01_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("web driver.chrome.driver","/Users/macmac/Documents/Selenium Libraries/Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        //Amazon sayfasına gidelim
        driver.navigate().to("https://amazon.com");
        driver.get("https://amazon.com");

        //techproeducation sayfasına gidelim
        Thread.sleep(3000);
        driver.navigate().to("https://techproeducation.com");
        //driver.get("https://techproeducation.com");

        //Tekrar amazon sayfasına dönelim
        Thread.sleep(3000);
        driver.navigate().back(); // Amazon sayfasına geri döner

        //Tekrar techproeducation sayfasına gidelim
        Thread.sleep(3000);
        driver.navigate().forward(); //  ileri giderek Techproya gider

        //Son sayfada sayfayı yenileyelim(refresh)
        Thread.sleep(3000);
        driver.navigate().refresh();

        //Ve sayfayı kapatalım
        driver.close();
    }
}






