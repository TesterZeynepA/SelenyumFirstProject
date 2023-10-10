package Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task01 {
    /**
     Create main method
     Set Path
     Create chrome driver
     Open google home page: https://www.google.com
     Get Title on page
     Get Current URL on page
     Close/Quit the browser
     */

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","reources/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com/");

        String title = driver.getTitle();
        System.out.println("title = " + title);//title = Google

        String url = driver.getCurrentUrl();
        System.out.println("url = " + url);//https://www.google.com/?gws_rd=ssl

        driver.close();


    }

}
