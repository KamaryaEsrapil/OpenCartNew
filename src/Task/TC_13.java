package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_13 {
    @Test
    void test13() {
        WebDriver driver = new FirefoxDriver();


        driver.get("https://demo.opencart.com");

        WebElement myAccountMenu = driver.findElement(By.xpath("//span[text()='My Account']"));
        myAccountMenu.click();

        WebElement registerOption = driver.findElement(By.linkText("Register"));
        registerOption.click();

        WebElement firstName = driver.findElement(By.id("input-firstname"));
        Assert.assertTrue(firstName.isDisplayed());

        WebElement lastName = driver.findElement(By.id("input-lastname"));
        Assert.assertTrue(lastName.isDisplayed());

        WebElement email = driver.findElement(By.id("input-email"));
        Assert.assertTrue(email.isDisplayed());

        WebElement telephone = driver.findElement(By.id("input-telephone"));
        Assert.assertTrue(telephone.isDisplayed());

        WebElement password = driver.findElement(By.id("input-password"));
        Assert.assertTrue(password.isDisplayed());

        WebElement passwordConf = driver.findElement(By.id("input-confirm"));
        Assert.assertTrue(passwordConf.isDisplayed());

        WebElement privacyPolicy = driver.findElement(By.name("agree"));
        Assert.assertTrue(privacyPolicy.isDisplayed());


    }
}
