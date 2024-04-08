import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.List;

public class selenium0014 {
    @Test(groups = "QA")
    @Description("varify the login page of VWO")
    public void testVWOlogin() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/");
       List<WebElement> image= driver.findElements(By.xpath("//img[@data-qa=\"cemaxumuwu\"]"));
        System.out.println(image.size());

    }
}
