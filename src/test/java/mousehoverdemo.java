import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mousehoverdemo {
   WebDriver driver;
    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();

   }

   @Test
   public void dragAnddrop(){
        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
       Actions actions=new Actions(driver);
       actions.clickAndHold(driver.findElement(By.xpath("//div[@id='column-a']")))
               .moveToElement(driver.findElement(By.xpath("//div[@id='column-b']"))).release().build().perform();

    }

}
