import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class AwesomeQa {
    WebDriver driver;
   @BeforeTest
   public void setup(){
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/practice.html");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    } @Test
    public void test1(){
        WebElement inputbox= driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
        inputbox.sendKeys("Praveen");
        WebElement inputbox2=driver.findElement(By.xpath("//input[@name=\"lastname\"]"));
        inputbox2.sendKeys("Sharma");
        WebElement radiobtn= driver.findElement(By.xpath("//input[@id=\"sex-0\"]"));
        radiobtn.click();
        WebElement date= driver.findElement(By.xpath("//input[@id='datepicker']"));
        date.sendKeys("07 April 2024");
        WebElement prof= driver.findElement(By.xpath("//span[text()='Profession']"));
        driver.findElement(with(By.id("profession-1")).toRightOf(prof)).click();

        WebElement years_of_Exp=driver.findElement(By.xpath("//span[text()='Years of Experience']"));
        driver.findElement(with(By.id("exp-1")).toRightOf(years_of_Exp)).click();
        WebElement Tools= driver.findElement(By.xpath("//span[text()='Automation Tools']"));
        driver.findElement(with(By.id("tool-2")).toRightOf(Tools)).click();
        Select select =new Select(driver.findElement(By.xpath("//select[@class='input-xlarge' and @id='continents']")));
        select.selectByVisibleText("Africa");
        WebElement selenium_command= driver.findElement(By.xpath("//select[@class='input-xlarge' and @id='selenium_commands']"));
        Select s1 =new Select(selenium_command);
        s1.selectByIndex(3);

        WebElement fileupload= driver.findElement(By.xpath("//input[@class='input-file']"));
        fileupload.sendKeys("C:\\Users\\LENOVO\\Desktop\\Interview Preparation");
        driver.findElement(By.xpath("//a[text()='Click here to Download File']")).click();
       // driver.findElement(By.xpath("//button[@id='submit']")).click();


    }



}
