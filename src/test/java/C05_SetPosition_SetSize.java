import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_SetPosition_SetSize {

    /**
 Go to the Amazon URL : https://www.amazon.com/
 Print the position and size of the page.
 Adjust the position and size of the page as desired.
 Test that the page is in the position and size you want.
 Close the page.
*/

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","reources/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://amazon.com/");

        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());

        driver.manage().window().setPosition(new Point(80,50));
        driver.manage().window().setSize(new Dimension(300,500));

        System.out.println("driver.manage().window().getPosition() = " + driver.manage().window().getPosition());
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());

        int xCoordinate = driver.manage().window().getPosition().getX();
        int yCoordinate = driver.manage().window().getPosition().getY();

        System.out.println("xCoordinate = " + xCoordinate);
        System.out.println("yCoordinate = " + yCoordinate);

        int width = driver.manage().window().getSize().getWidth();
        int height = driver.manage().window().getSize().getHeight();

        System.out.println("width = " + width);
        System.out.println("height = " + height);

        if (xCoordinate==80 && yCoordinate==50 && width==300 && height==500){

            System.out.println("Ölçeklendirme testi PASSED");

        }System.out.println("Ölçeklendirme testi FAILED");

        String result = xCoordinate==80 && yCoordinate==50 && width==300 && height==500?
                "Ölçeklendirme testi PASSED":"Ölçeklendirme testi FAILED";
        System.out.println("result = " + result);

        driver.close();


    }
}
