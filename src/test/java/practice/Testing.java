package practice;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {
    @Test
    public void ipTest() {

        WebDriver driver = new ChromeDriver();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        String myIp = "46.109.24.107";
        driver.get("https://ip-api.com/");
//
        driver.findElement(By.name("ip")).sendKeys(myIp); // => "Google"
        driver.findElements(By.className("button"));

/*                driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement searchBox = driver.findElement(By.name("q"));
        WebElement searchButton = driver.findElement(By.name("btnK"));

        searchBox.sendKeys("Selenium");
        searchButton.click();

        searchBox = driver.findElement(By.name("q"));
        searchBox.getAttribute("value"); // => "Selenium"*/

        //   driver.quit();
    }
}
