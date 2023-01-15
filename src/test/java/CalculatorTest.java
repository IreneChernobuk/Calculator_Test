import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    @Test

    public void StarvationTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("30");
        driver.findElement(By.name("ht")).sendKeys("190");
        driver.findElement(By.name("cc")).click();
        String actualText = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(actualText, "Your category is Starvation", "message didn't find");
        driver.quit();
    }

    @Test
    public void UnderWeightTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("50");
        driver.findElement(By.name("ht")).sendKeys("170");
        driver.findElement(By.name("cc")).click();
        String actualText = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(actualText, "Your category is Underweight", "message didn't find");
        driver.quit();
    }

    @Test
    public void NormalTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("50");
        driver.findElement(By.name("ht")).sendKeys("159");
        driver.findElement(By.name("cc")).click();
        String actualText = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(actualText, "Your category is Normal", "message didn't find");
        driver.quit();
    }

    @Test
    public void OverweightTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("100");
        driver.findElement(By.name("ht")).sendKeys("190");
        driver.findElement(By.name("cc")).click();
        String actualText = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(actualText, "Your category is Overweight", "message didn't find");
        driver.quit();
    }


    @Test
    public void ObeseTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://healthunify.com/bmicalculator/");
        driver.findElement(By.name("wg")).sendKeys("100");
        driver.findElement(By.name("ht")).sendKeys("100");
        driver.findElement(By.name("cc")).click();

        String actualText = driver.findElement(By.name("desc")).getAttribute("value");
        Assert.assertEquals(actualText, "Your category is Obese", "message didn't find");
        driver.quit();
    }
}

