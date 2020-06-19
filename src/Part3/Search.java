package Part3;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" , "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        // open the browser
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.snapdeal.com/");

        driver.manage().window().maximize();

        driver.findElement(By.id("inputValEnter")).sendKeys("Teddy bear");

        driver.findElement(By.className("searchTextSpan")).click();

        String s1 = driver.findElement(By.className("nnn")).getText();

        Assert.assertEquals("We've got 1983 results for 'Teddy bear'", s1);

        driver.findElement(By.linkText("Help Center")).click();

        String url = driver.getCurrentUrl();
        Assert.assertEquals("https://www.snapdeal.com/" , url);
    }
}
