import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class checkBoxDemo {

   @Test
   public void testcase1() {
       WebDriver driver = new ChromeDriver();
       driver.get("https://the-internet.herokuapp.com/checkboxes");
       driver.manage().window().maximize();

       // Find all checkboxes
       List<WebElement> checkboxes = driver.findElements(By.xpath("//form[@id='checkboxes']/input[@type='checkbox']"));

       // Click on the first checkbox (index 0)
       WebElement checkbox1 = checkboxes.get(1);
       checkbox1.click();


   }



}


