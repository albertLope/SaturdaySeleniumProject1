package Part2;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class signin {



    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" , "D:\\Selenium dependency\\drivers\\chromedriver.exe");

        // open the browser
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.applitools.com/");

        driver.manage().window().maximize();

        driver.findElement(By.id("username")).sendKeys("ttechno@gmail.com");

        driver.findElement(By.id("password")).sendKeys("techno123.");

        driver.findElement(By.id("log-in")).click();

        String s1 = driver.findElement(By.id("time")).getText();

        Assert.assertEquals(s1 , "Your nearest branch closes in: 30m 5s");

        System.out.println(driver.getCurrentUrl());

    }


}

