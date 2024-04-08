import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium004 {

    @Test(groups ="QA")
    @Description("Varified the login with correct user name and password")
public void login_VWO_test(){

    ChromeOptions options=new ChromeOptions();
    System.out.println(options.getBrowserName());

    WebDriver driver=new ChromeDriver();
    driver.get("https://app.vwo.com/#/login");
    Assert.assertEquals(driver.getTitle(),"Login - VWO");
    WebElement email= driver.findElement(By.id("login-username"));
    email.sendKeys("psagra13@gmail.com");
    driver.findElement(By.name("password")).sendKeys("Praveen@1990");
    driver.findElement(By.id("js-login-btn")).click();
    try{
        Thread.sleep(5000);
    } catch (InterruptedException E){
        throw new RuntimeException(E);

  }
    WebElement errorMsg=driver.findElement(By.className("notification-box-description"));
    String Erro_Message=errorMsg.getText();
    Assert.assertEquals(Erro_Message,"Your email, password, IP address or location did not match");


        driver.quit();



 }




}

