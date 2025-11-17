package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUPAndDown {
    static void main() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        WebElement searchTextBox = driver.findElement(By.xpath("//input[@class='Pke_EE']"));

        Actions as = new Actions(driver);
        as.moveToElement(searchTextBox)
                .pause(4000)
                .click(searchTextBox)
                .pause(2000)
                .keyDown(Keys.SHIFT)
                .sendKeys("T shirt for men")
                .pause(2000)
                .keyUp(Keys.SHIFT)
                .sendKeys(Keys.ENTER)
                .perform();

    }
}
