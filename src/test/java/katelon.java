import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class katelon {
  WebDriver driver;
   @BeforeTest
   public void setup(){

        ChromeOptions options =new ChromeOptions();
        options.addArguments("--start-maximized");

        driver=new ChromeDriver(options);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

    }
    @Test(groups ="QA" )
    public void katalonLoginTest(){
      WebElement appointment = driver.findElement(By.id("btn-make-appointment"));
     // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      appointment.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/profile.php#login");
        WebElement userinput =driver.findElement(By.xpath("//input[@id=\"txt-username\"]"));
        userinput.sendKeys("John Doe");
        WebElement pass=driver.findElement(By.xpath("//input[@id=\"txt-password\"]"));
        pass.sendKeys("ThisIsNotAPassword");
        WebElement login= driver.findElement(By.id("btn-login"));
        login.click();
        WebElement dropdwon= driver.findElement(By.xpath("//select[@id=\"combo_facility\"]"));
        Select select=new Select(dropdwon);
        select.selectByVisibleText("Seoul CURA Healthcare Center");
        WebElement chkbox= driver.findElement(By.xpath("//label[@for=\"chk_hospotal_readmission\"]"));
        chkbox.click();
        List<WebElement> rdButton= driver.findElements(By.xpath("//div[@class='col-sm-4']/label[@class=\"radio-inline\"]"));
        WebElement rButton= rdButton.get(2);
        rButton.click();
        WebElement dtCalender= driver.findElement(By.xpath("//input[@type='text' and @id='txt_visit_date']"));
        dtCalender.sendKeys("22/04/2024");
        WebElement commentbox=driver.findElement(By.xpath("//textarea[@class='form-control' and @id='txt_comment']"));
        commentbox.sendKeys("Welcome to ATB 5X");
        WebElement appointment1 =driver.findElement(By.xpath("//button[@id='btn-book-appointment']"));
        appointment1.click();
        WebElement message = driver.findElement(By.xpath("//div[@class='col-xs-8' ]/p[@id='comment']"));
        String msg =message.getText();
        System.out.println(msg);
        Assert.assertEquals(msg,"Welcome to ATB 5X");






    }
}
