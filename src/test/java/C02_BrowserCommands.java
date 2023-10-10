import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_BrowserCommands {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","reources/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://www.amazon.com/");
        driver.get("http://www.trendyol.com/");
        driver.get("http://www.ebay.com/");

        String amazonTitle = driver.getTitle();
        System.out.println("amazonTitle = " + amazonTitle);//amazonTitle = Amazon.com. Spend less. Smile more.

        String amazonUrl = driver.getCurrentUrl();
        System.out.println("amazonUrl = " + amazonUrl);//amazonUrl = https://www.amazon.com/
        //amazonUrl = https://www.trendyol.com/ en son trendyol yazıldığı için onun url si geliyor.

        driver.close();


    }



}
