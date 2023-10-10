import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_PageSource {

  /**   Go to the Amazon URL: https://www.amazon.com/
             Verify that it writes "Performance Metrics" and "Gateway" from the Source code.
   */
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","reources/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");

        //getPageSource() : sayfa kaynak kodlarini String olarak return eder..
        String pageSourceCode = driver.getPageSource();
        //System.out.println("pageSourceCode = " + pageSourceCode);

        if(pageSourceCode.toLowerCase().contains("performance metrics") || pageSourceCode.toLowerCase().contains("gateway")){
            System.out.println("Source code test Passed");
        }else {
            System.out.println("Source code test Failed because " + "Performance Metrics" + " not exist");
            System.out.println("Source code test Failed because " + "Gateway" + " not exist");        }

        driver.close();
        driver.close();


    }
}
