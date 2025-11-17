package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExamples {
    static void main() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        // Using ID locator

        WebElement id =  driver.findElement(By.id("login1"));
        id.sendKeys("data");

        // Using ClassName locator
        WebElement loginbtn =  driver.findElement(By.className("signin-btn"));
        loginbtn.click();

        // using Name Locator
        WebElement passWord =  driver.findElement(By.name("passwd"));
        passWord.sendKeys("Jbdjbdj");

        // Using LinkText
        WebElement forgotPass =  driver.findElement(By.linkText("Forgot password?"));
        forgotPass.click();

        //Using PartialLinkText
        WebElement forgotPassText =  driver.findElement(By.partialLinkText("Forgot "));
        forgotPassText.click();

        //Using ID CSS Selector
        WebElement inputlogin =  driver.findElement(By.cssSelector("input[id='login1']"));
        inputlogin.sendKeys("Data");

       //Using Absolute Xpath locator
        WebElement userNameInputTextBox =  driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div[2]/form/div[1]/div/input"));
        userNameInputTextBox.sendKeys("Test Data");

       //Using Relative Xpath locator
        WebElement PasswordInputTextBox =  driver.findElement(By.xpath("//input[@id='password']"));
        PasswordInputTextBox.sendKeys("TestData");

        //Relative Xpath locator using Text() s
        WebElement forgotPassword =  driver.findElement(By.xpath("//a[text()='Forgot password?']"));
        forgotPassword.click();



    }
}

