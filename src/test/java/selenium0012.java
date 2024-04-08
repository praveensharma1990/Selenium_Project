import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class selenium0012 {

   @Test(groups="QA")
   @Description("varify the login page of VWO")
   public void testVWOlogin(){
       WebDriver driver=new ChromeDriver();
       driver.get("https://app.vwo.com/");
       WebElement anchortag= driver.findElement(By.partialLinkText("free trial"));
       System.out.print(anchortag.getAttribute("href"));
       anchortag.click();
       driver.close();



    }
}
