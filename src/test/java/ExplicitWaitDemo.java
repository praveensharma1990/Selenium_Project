import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWaitDemo {

    @Test
    public void positiveTest() {
        WebDriver driver=new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id=\"login-username\"]")).sendKeys("psagra13@gmail.com");
        driver.findElement(By.xpath("//input[@id=\"login-password\"]")).sendKeys("Praveen@1990");
        driver.findElement(By.xpath("//button[@id=\"js-login-btn\"]")).click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3000));
       WebElement element= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1[@class=\"page-heading\" and @data-qa=\"page-heading\" and text()=\"Dashboard\"]")));
       Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/dashboard");
        System.out.println(element.getText());






    }

}