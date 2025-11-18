package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateInterfaceExamples {
    static void main() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Get a new Rediffmail ID")).click();
        Thread.sleep(2000);

        driver.navigate().back();
        Thread.sleep(2000);

        driver.navigate().forward();
        Thread.sleep(2000);

        driver.navigate().refresh();



    }
}
