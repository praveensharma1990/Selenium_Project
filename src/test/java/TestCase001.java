import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestCase001 {

     @Test
     @Description("verify the title of lbb.in")
   public void test1(){
        WebDriver driver =new EdgeDriver();
        driver.get("https://lbb.in");
        System.out.println(driver.getTitle());

   }
}
