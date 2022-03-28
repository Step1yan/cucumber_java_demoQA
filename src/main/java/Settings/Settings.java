package Settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Settings {
    public WebDriver driver;
    public String baseUrl;

    public Settings() {
        System.setProperty("webdriver.chrome.driver", "src/WebDriver/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.baseUrl = "https://demoqa.com";
    }

    public void maximize() {
        driver.manage().window().maximize();
    }

    public void open(String url) {
        driver.get(baseUrl + url);
    }

    public void close() {
        driver.close();
    }
}
