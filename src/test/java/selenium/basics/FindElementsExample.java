package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.lang.model.element.Element;
import java.util.List;
import java.util.Objects;

public class FindElementsExample {
    static void main() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        List<WebElement> elements = driver.findElements(By.tagName("input"));
        System.out.println(elements.size());
        for (Object e : elements){
            System.out.println(e);
        }
    }
}
