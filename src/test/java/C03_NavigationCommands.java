import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_NavigationCommands {
     /**
Invoke Chrome Browser
Navigate to URL: https://clarusway.com/
Navigate to URL: http://amazon.com/
Come back to the Clarusway using the back command.
Again go back to the amazon website using forward command
Refresh the Browser using refresh command.
Close the Browser.
 */

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","reources/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


      //  driver.get("http://clarusway.com/");
       // driver.get("http://www.amazon.com/");

        driver.navigate().to("http://clarusway.com/");//clarusway sayfasına git

        Thread.sleep(3000);

        driver.navigate().to("http://www.amazon.com");// amazon sayfasına git

        //navigate().to();  get() methodu ile tamamen aynı işlevi yapar.
        //come back to the Clarusway using the back command.
        driver.navigate().back();// onve claruswaya sonra amazona gittikten sonra claruswaye geri dönecek

        Thread.sleep(3000);

        //Again go back to the amazon website using forward command
        driver.navigate().forward();// tekrar amazon sayfasına gider (ileri)

        Thread.sleep(2000);

        //Refresh the Browser using refresh command
        driver.navigate().refresh();// olduğu sayfayı yeniler.

        Thread.sleep(2000);

        driver.close();













    }
}
