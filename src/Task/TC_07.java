package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC_07 {
@Test
    void task7() {

        WebDriver driver = new FirefoxDriver();

        driver.get("https://demo.opencart.com/");

        WebElement myAccountMenu = driver.findElement(By.xpath("//span[text()='My Account']"));
        myAccountMenu.click();

        WebElement registerOption = driver.findElement(By.linkText("Register"));
        registerOption.click();

        WebElement myAccountMenu1 = driver.findElement(By.xpath("//span[text()='My Account']"));
        myAccountMenu1.click();

        WebElement login= driver.findElement(By.xpath("//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/ul/li[2]/a"));
        login.click();

        WebElement Continue= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div/a"));
        Continue.click();

        WebElement myAccountMenu2 = driver.findElement(By.xpath("//span[text()='My Account']"));
        myAccountMenu2.click();

        WebElement login1= driver.findElement(By.xpath("//*[@id=\"top\"]/div[2]/div[2]/ul/li[2]/div/ul/li[2]/a"));
        login1.click();

        WebElement register= driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[2]"));
        register.click();


   driver.quit();

    }
}
