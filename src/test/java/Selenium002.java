import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.net.MalformedURLException;

public class Selenium002 {

    public static void main(String[] args) throws MalformedURLException {

        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.navigate().to("https://theagranews.com");
        driver.navigate().to("https://lbb.in");
        driver.navigate().back();
        driver.navigate().refresh();



        driver.close();
    }
}
