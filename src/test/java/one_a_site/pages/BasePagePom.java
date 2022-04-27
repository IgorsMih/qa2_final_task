package one_a_site.pages;

import org.openqa.selenium.chrome.ChromeDriver;

public class BasePagePom {

    public static ChromeDriver driver;

    public void openChromeByUrl(String url) {
        String driverPath = "C:\\Java\\qa2_final_task\\src\\test\\resources\\";
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void closeChrome() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        driver.quit();
    }

}
