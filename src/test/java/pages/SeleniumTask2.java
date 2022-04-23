package pages;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SeleniumTask2 {

    @Test
    public void secondSelenium() {
        String driverPath = "C:\\Java\\JavaGuru_QA2\\src\\test\\resources\\";
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ss.com");
        driver.manage().window().maximize();

        driver.findElement(By.id("mtd_97")).click();
        String currentUrl = driver.getCurrentUrl();
        assertThat(currentUrl).isEqualTo("https://www.ss.com/lv/transport/cars/");

        driver.findElement(By.id("f_o_8_min")).sendKeys("6000");
        driver.findElement(By.id("f_o_8_max")).sendKeys("10000");
        assertThat(driver.findElement(By.id("f_o_8_min")).getAttribute("value")).isEqualTo("6000");
        assertThat(driver.findElement(By.id("f_o_8_max")).getAttribute("value")).isEqualTo("10000");
        Select minYear = new Select(driver.findElement(By.id("f_o_18_min")));
        minYear.selectByValue("2001");
        assertThat(driver.findElement(By.id("f_o_18_min")).getAttribute("value")).isEqualTo("2001");
        Select maxEngine = new Select(driver.findElement(By.id("f_o_15_max")));
        maxEngine.selectByValue("3.0");
        assertThat(driver.findElement(By.id("f_o_15_max")).getAttribute("value")).isEqualTo("3.0");
        Select colour = new Select(driver.findElement(By.id("f_o_17")));
        colour.selectByValue("6318");
        assertThat(driver.findElement(By.id("f_o_17")).getAttribute("value")).isEqualTo("6318");

        driver.findElement(By.xpath("//input[@class = 'b s12']")).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }

}
