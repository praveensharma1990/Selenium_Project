import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Ebayproject {
  WebDriver driver;
    @BeforeTest
    public void OpernBrowser() {
      ChromeOptions options = new ChromeOptions();
      options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
      driver = new ChromeDriver(options);
    }
    @Test(groups = "QA")
    @Description("Verify the title of all mini mac")
    public  void EbayPositiveTestCase()throws InterruptedException{
    driver.get("https://www.ebay.com/b/16-GB-RAM-PC-Desktops-All-In-One-Computers/179/bn_7114669659");
    driver.manage().window().maximize();
      WebElement searchbox=driver.findElement(By.xpath("//input[@Class=\"gh-tb ui-autocomplete-input\"]"));
      searchbox.sendKeys("mac mini");
      WebElement searchbutton=driver.findElement(By.xpath("//input[@class=\"btn btn-prim gh-spr\"]"));
      searchbutton.click();
      Thread.sleep(10000);
      List<WebElement> SearchTitle=driver.findElements(By.xpath("//div[@class=\"s-item__title\"]"));
      for(WebElement allTitle:SearchTitle) {
        System.out.println(allTitle.getText());
      }


    }

}
