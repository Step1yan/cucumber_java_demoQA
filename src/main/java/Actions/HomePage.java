package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;

public class HomePage {

    private WebDriver driver;

    //selectors
    static By elemntsBtn = By.className("card-up");
    static By webTablesBtn = By.xpath("//span[contains(text(),'Web Tables')]");
    static By webTableSection = By.className("web-tables-wrapper");

    //features
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void scroll() {
        ((JavascriptExecutor) driver).executeScript("scroll(0,400)");
    }

    public void clickElements() {
        driver.findElement(elemntsBtn).click();
    }

    public void clickWebTables() {
        driver.findElement(webTablesBtn).click();
    }

    public void visibleWebTables() {
        driver.findElement(webTableSection).isDisplayed();
    }

}

