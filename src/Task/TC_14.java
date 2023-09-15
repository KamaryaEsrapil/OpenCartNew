package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;


//THE CODE DOES NOT WORK


public class TC_14 {
    @Test
    void test14() {
        WebDriver driver = new FirefoxDriver();


        driver.get("https://demo.opencart.com");

        WebElement myAccountMenu = driver.findElement(By.xpath("//span[text()='My Account']"));
        myAccountMenu.click();

        WebElement registerOption = driver.findElement(By.linkText("Register"));
        registerOption.click();

        WebElement firstName = driver.findElement(By.id("input-firstname"));
        Assert.assertTrue(firstName.isDisplayed());



//        try {
//            // Step 1: Make an HTTP GET request to the webpage
//            String url = (driver.getCurrentUrl());
//            Document document = Jsoup.connect(url).get();
//
//            // Step 2: Select elements with ::before content using CSS selector
//            Elements elementsWithBeforeContent = document.select("::before");
//
//            // Step 3: Iterate through the selected elements
//            for (Element element : elementsWithBeforeContent) {
//                // Step 4: Extract the content of ::before pseudo-element
//                String beforeContent = element.text();
//                System.out.println(beforeContent);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        WebElement lastName = driver.findElement(By.id("input-lastname"));
//        Assert.assertTrue(lastName.isDisplayed());
//        WebElement email = driver.findElement(By.id("input-email"));
//        Assert.assertTrue(email.isDisplayed());
//        WebElement telephone = driver.findElement(By.id("input-telephone"));
//        Assert.assertTrue(telephone.isDisplayed());
//        WebElement password = driver.findElement(By.id("input-password"));
//        Assert.assertTrue(password.isDisplayed());
//        WebElement passwordConf = driver.findElement(By.id("input-confirm"));
//        Assert.assertTrue(passwordConf.isDisplayed());
//        WebElement privacyPolicy = driver.findElement(By.name("agree"));
//        Assert.assertTrue(privacyPolicy.isDisplayed());


    }
}
