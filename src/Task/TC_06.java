package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC_06 {
@Test
    void task6() {

        WebDriver driver = new FirefoxDriver();


        driver.get("https://opencart.abstracta.us/");

        WebElement myAccountMenu = driver.findElement(By.xpath("//span[text()='My Account']"));
        myAccountMenu.click();

        WebElement registerOption = driver.findElement(By.linkText("Register"));
        registerOption.click();

        WebElement firstName = driver.findElement(By.id("input-firstname"));
        WebElement lastName = driver.findElement(By.id("input-lastname"));
        WebElement email = driver.findElement(By.id("input-email"));
        WebElement telephone = driver.findElement(By.id("input-telephone"));
        WebElement password = driver.findElement(By.id("input-password"));
        WebElement passwordConf = driver.findElement(By.id("input-confirm"));
        WebElement privacyPolicy = driver.findElement(By.name("agree"));

        firstName.sendKeys("mitch");
        lastName.sendKeys("fes");
        email.sendKeys("Mgitchyes@example.com");
        password.sendKeys("password123@");
        passwordConf.sendKeys("password123@");
        telephone.sendKeys("8142405646");
        privacyPolicy.click();
        WebElement continueButton = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]"));
        continueButton.click();
        WebElement continueSuccessButton = driver.findElement(By.xpath("//a[text()='Continue']"));
       continueSuccessButton.click();

       WebElement newsletter = driver.findElement(By.cssSelector("ul.list-unstyled:nth-child(8) > li:nth-child(1) > a:nth-child(1)"));
       newsletter.click();


        WebElement subscribe = driver.findElement(By.name("newsletter"));
       subscribe.click();

       WebElement Continue = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div[2]/input"));
       Continue.click();

        WebElement newsletter1 = driver.findElement(By.cssSelector("ul.list-unstyled:nth-child(8) > li:nth-child(1) > a:nth-child(1)"));
        newsletter1.click();

        WebElement Continue2 = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div[2]/input"));
        Continue2.click();

        driver.quit();
    }
}