import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C06_FirefoxTest {
    /*
     Invoke FireFox Driver
     Go to https://www.youtube.com/
     Verify the page title contains the word video.
     Close the driver.
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","reources/driver/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("https://www.youtube.com/");

        String pageTitle = driver.getTitle();
        System.out.println("pageTitle = " + pageTitle);

        if (pageTitle.contains("video")){
            System.out.println("Passed");
        }else System.out.println("Failed");

        driver.close();


    }
}
