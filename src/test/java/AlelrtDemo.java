import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlelrtDemo {
    WebDriver driver;
    @BeforeTest
    public void setupForTest(){
        driver =new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

    }  @Test(priority = 1)
    public void testCase1(){
       WebElement jsalert = driver.findElement(By.xpath("//button[@onclick='jsAlert()' and text()='Click for JS Alert']\n"));
       jsalert.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        String result= driver.findElement(By.xpath("//p[@id='result' or text()='You successfully clicked an alert']")).getText();
        System.out.println(result);
       Assert.assertEquals(result,"You successfully clicked an alert");

    }
   @Test(priority = 2)

   public void testcase2(){
   WebElement jsalet1=driver.findElement(By.xpath("//button[@onclick='jsConfirm()' and text()='Click for JS Confirm']"));
   jsalet1.click();
   Alert alert=driver.switchTo().alert();
   alert.accept();
   String result1=driver.findElement(By.xpath("//p[@id='result' and text()='You clicked: Ok']")).getText();
       System.out.println(result1);
   Assert.assertEquals(result1,"You clicked: Ok");
    }
    @Test(priority = 3)
    public void testcase3(){
        WebElement jsalet3=driver.findElement(By.xpath("//button[@onclick='jsConfirm()' and text()='Click for JS Confirm']"));
        jsalet3.click();
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert=driver.switchTo().alert();
        alert.dismiss();
        String result2=driver.findElement(By.xpath("//p[@id='result' and text()='You clicked: Cancel']")).getText();
        Assert.assertEquals(result2,"You clicked: Cancel");
        System.out.println(result2);


        }
    @Test(priority = 4)
    public void testcase4(){
     WebElement jsp= driver.findElement(By.xpath("//button[@onclick='jsPrompt()' and text()='Click for JS Prompt']"));
     jsp.click();
     WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(4));
     wait1.until(ExpectedConditions.alertIsPresent());
     Alert alert=driver.switchTo().alert();
     alert.sendKeys("Praveen Sharma");
        alert.accept();
     WebElement text=driver.findElement(By.xpath("//p[@id='result' and contains(text(), 'You entered:')]"));
     String result = text.getText();
        System.out.println(result);
        Assert.assertEquals(result,"You entered: Praveen Sharma");




    }


    @AfterTest
    public void closesetup(){
        driver.quit();

    }


}
