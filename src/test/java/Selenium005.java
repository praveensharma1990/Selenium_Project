import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Selenium005 {

    @Test(groups ="QA")
    @Description("testing the VWO loggin page")
    public void VwoTest(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://app.vwo.com");
        WebElement anchortag=driver.findElement(By.linkText("Start a free trial"));
        System.out.println(anchortag.getAttribute("href"));
        anchortag.click();
        driver.close();


    }
}
