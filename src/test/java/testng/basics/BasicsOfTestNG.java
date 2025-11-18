package testng.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicsOfTestNG {

    @Test
    public void testDemo() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rediff.com/");
    }

    @Test
    public void testDemo1() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
    }

}
