package myPractice.getterSetter.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

    public static void main(String args[]) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://ip-api.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.xpath("//span[10]")).click();
        String value = driver.findElement(By.xpath("//*[@id=\"codeOutput\"]/span[10]")).getText();
        driver.quit();
        System.out.println(value);
//Mazimize current window


//Delay execution for 5 seconds to view the maximize operation
        // Thread.sleep(5000);

//Close the browser

    }
}