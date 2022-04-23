package pages;

import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    public static ChromeDriver driver;

    public void openChromeByUrl(String url){
        String driverPath = "C:\\Java\\QA2_Final_Work_1a_site\\src\\test\\resources\\";
        System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void closeChrome(){
        driver.quit();
    }

}
