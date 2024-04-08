import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class selenium0013 {

    @Test(groups="QA")
    @Description("varify the login page of VWO")
    public void testVWOlogin(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://app.vwo.com/");
        //print all anchor tags on vwo.com
        //a tags and print the get text
        List<WebElement> all_tag=driver.findElements(By.tagName("a"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         //all_tag.get(0).click();
         //all_tag.get(1).click();
        System.out.println(all_tag.size());
        for(WebElement element:all_tag) {
            System.out.println(element.getText());

        }


        driver.quit();


    }
}
