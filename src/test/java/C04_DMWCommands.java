import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DMWCommands {

    /*
    Invoke Chrome Browser
    Open URL: https://www.google.com/
    Maximize the window.
    Print the position and size of the page.
    Minimize the page.
    Wait 5 seconds in the icon state and maximize the page.
    Print the position and dimensions of the page in maximized state.
    Make the page fullscreen.
    Close the Browser.
     */

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","reources/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://google.com/");

        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());

        Thread.sleep(3000);

        driver.manage().window().minimize();

        Thread.sleep(5000);

        driver.manage().window().maximize();
        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());

        Thread.sleep(3000);

        driver.manage().window().fullscreen();

        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());

        Thread.sleep(3000);

        driver.close();




    }
}
