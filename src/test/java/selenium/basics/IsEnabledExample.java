package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.JsonOutput;

public class IsEnabledExample {
    static void main() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        WebElement disblebutton = driver.findElement(By.id("disabled-button"));
        WebElement enablebutton = driver.findElement(By.id("enabled-button"));
        WebElement textfield = driver.findElement(By.id("enabled-example-input"));

        System.out.println(textfield.isEnabled());  //true
        disblebutton.click();
        System.out.println(textfield.isEnabled()); //false
        enablebutton.click();
        System.out.println(textfield.isEnabled());  //true



    }
}
