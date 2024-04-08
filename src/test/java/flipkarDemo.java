import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class flipkarDemo {
    WebDriver driver;

    @BeforeTest
    public void setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
       // driver.get("https://www.amcharts.com/svg-maps/?map=india");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        Thread.sleep(3000);

    }

    @Test
    public void svgTest() {
     Actions actions=new Actions(driver);
     actions.moveToElement(driver.findElement(By.xpath("//*[text()='Electronics']"))).perform();
     WebElement FKSearchBox=driver.findElement(By.xpath("//input[@class='Pke_EE' and @type='text']"));
     actions.keyDown(Keys.SHIFT).sendKeys(FKSearchBox,"lenevo laptop").keyUp(Keys.SHIFT)
             .keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();

    }

}


