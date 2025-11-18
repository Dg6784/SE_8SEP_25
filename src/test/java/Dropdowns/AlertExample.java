package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {
    static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();
        WebElement alert = driver.findElement(By.xpath("//input[@id='alertbtn']"));
        alert.click();

        Thread.sleep(3000);
        driver.findElement(By.id("benzcheck")).click();
    }
}
