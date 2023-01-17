import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HtmlTest {
    private static final String PATH = "file:C:\\Users\\Nout\\IdeaProjects\\Calculator_Test\\src\\test\\resources\\index.html";

    @Test

    public void сontainWelcomeTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(PATH);
        Assert.assertTrue(driver.findElement(By.name("priv")).isDisplayed(), "'Welcome message' isn't displayed");
        driver.quit();
    }

    @Test
    public void сontainListTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(PATH);
        Assert.assertTrue(driver.findElement(By.name("band")).isDisplayed(), "band list isn't displayed");
        driver.quit();
    }

    @Test
    public void сontainButtonTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(PATH);
        Assert.assertTrue(driver.findElement(By.id("other_site")).isDisplayed(), "Button isn't displayed");
        driver.quit();
    }

    @Test
    public void getNameTest() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(PATH);
        WebElement element = driver.findElement(By.name("my_name"));
        boolean Name = element.getText().contains("Irina");
        Assert.assertTrue(Name, "name 'Irina' didn't find");
        driver.quit();
    }

    @Test
    public void passLinkTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(PATH);
        driver.findElement(By.id("link")).click();
        WebElement button = driver.findElement(By.id("w3loginbtn"));
        Assert.assertTrue(button.isDisplayed(), "link to w3schools.com didn't work");
        driver.quit();
    }

    @Test
    public void checkAltTextTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(PATH);
        String img = driver.findElement(By.id("img")).getAttribute("alt");
        Assert.assertEquals(img, "oops, you found it", "alternative text exists");
        driver.quit();
    }
}
