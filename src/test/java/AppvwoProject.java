import net.bytebuddy.build.Plugin;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AppvwoProject {
    WebDriver driver;
   @BeforeSuite
   public void setup(){
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver=new ChromeDriver(options);
        driver.get("https://app.vwo.com/#/login");
       System.out.println(driver.getTitle());
       Assert.assertEquals(driver.getTitle(),"Login - VWO");
       Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");


        } @Test
         public void appVwoLoginWithCorrectUserNameAndPassword(){
        WebElement img=driver.findElement(By.xpath("//img[@data-qa=\"cemaxumuwu\"]"));
       boolean isLogoVisible= img.isDisplayed();
        System.out.println("Logo is visible "+isLogoVisible);
        driver.findElement(By.xpath("//input[@id=\"login-username\"]")).sendKeys("psagra13@gmail.com");
        driver.findElement(By.xpath("//input[@id=\"login-password\"]")).sendKeys("Praveen@1990");
        driver.findElement(By.xpath("//button[@id=\"js-login-btn\"]")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        }  @AfterSuite
      public void exit(){
       driver.quit();
    }

    }

