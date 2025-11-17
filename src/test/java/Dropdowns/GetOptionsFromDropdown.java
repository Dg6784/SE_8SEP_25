package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class GetOptionsFromDropdown {
    static void main() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        WebElement dropdown = driver.findElement(By.id("carselect"));

        Select s = new Select(dropdown);
        List<WebElement> allelements = s.getOptions();

        for (WebElement e : allelements){
            System.out.println(e.getText());
        }

    }
}
