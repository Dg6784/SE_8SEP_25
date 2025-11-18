package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class XpathAxes {
    static void main() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        List<WebElement> allElements = driver.findElements(By.xpath("//div[@class='nav-div']//following::a"));
          for (WebElement e : allElements){
              if (e.getText().equals("Electronics")){
                  e.click();
                  break;
              }
          }
    }
}
