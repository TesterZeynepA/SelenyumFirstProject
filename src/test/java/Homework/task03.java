package Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task03 {

    /*
Invoke Chrome Driver
Navigate to Facebook homepage URL: https://www.facebook.com/
Verify expected equals actual URL.
Verify expected contains Facebook Word.
     */
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","reources/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        String url = driver.getCurrentUrl();

        System.out.println("url = " + url);

        String pageTitle = driver.getTitle();
        System.out.println("pageTitle = " + pageTitle);

        if (pageTitle.contains("Facebook Word")){

            System.out.println("test passed");

        }else System.out.println("test failed");

        driver.close();

    }
}
