import io.qameta.allure.Description;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium003 {

    @Test(groups = "QA")
    @Description("verify the current URL and Title of App.VWO.com")
    public void testAppvwo(){
        WebDriver driver=new ChromeDriver();
        ChromeOptions options=new ChromeOptions();
        System.out.println(options.getBrowserName());
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        driver.get("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
      driver.close();
    }



}

