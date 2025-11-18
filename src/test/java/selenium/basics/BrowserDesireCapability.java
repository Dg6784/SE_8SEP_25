package selenium.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDesireCapability
{
    static void main() {
        ChromeOptions cp = new ChromeOptions();
        cp.setBinary("C:\\Users\\hp\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver(cp);
        driver.get("https://www.rediff.com/");
        String Title = driver.getTitle();
        System.out.println(Title);



    }
}
