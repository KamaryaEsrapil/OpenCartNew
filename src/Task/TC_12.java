package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_12 {
    @Test
    void test12() {
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

        firstName.sendKeys("mik e");
        lastName.sendKeys("fay e");
        email.sendKeys("    AMyeerr@exam12312311.com");
        password.sendKeys("password123@");
        passwordConf.sendKeys("password123@");
        telephone.sendKeys("1 11");
        privacyPolicy.click();
        WebElement continueButton = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]"));
        continueButton.click();

        WebElement successMessage = driver.findElement(By.id("content"));

        Assert.assertFalse(successMessage.getText().contains("Congratulations!"));
    }
}
