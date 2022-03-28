package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class WebTablesPage {

    private WebDriver driver;

    //selectors
    static By addBtn = By.id("addNewRecordButton");
    static By firstNameField = By.id("firstName");
    static By lastNameField = By.id("lastName");
    static By emailField = By.id("userEmail");
    static By ageField = By.id("age");
    static By salaryField = By.id("salary");
    static By departmentField = By.id("department");
    static By submitBtn = By.id("submit");
    static By firstName4 = By.xpath("//div[contains(text(),'Grigor')]");
    static By lastName4 = By.xpath("//div[contains(text(),'Stepanyan')]");
    static By age4 = By.xpath("//div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div[1]/div[3]");
    static By email4 = By.xpath("//div[contains(text(),'step@gmail.com')]");
    static By salary4 = By.xpath("//div[contains(text(),'1000000')]");
    static By department4 = By.xpath("//div[contains(text(),'abcd')]");
    static By edit4Btn = By.id("edit-record-4");
    static By delete4Btn = By.id("edit-record-4");

    //features
    public WebTablesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddBtn() {
        driver.findElement(addBtn).click();
    }

    public void firstNameInput(String firstname) {
        driver.findElement(firstNameField).sendKeys(firstname);
    }

    public void lastNameInput(String lastname) {
        driver.findElement(lastNameField).sendKeys(lastname);
    }

    public void emailinput(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void ageInput(String age) {
        driver.findElement(ageField).sendKeys(age);
    }

    public void salaryInput(String salary) {
        driver.findElement(salaryField).sendKeys(salary);
    }

    public void departmentInput(String department) {
        driver.findElement(departmentField).sendKeys(department);
    }

    public void clickSubmitBtn() {
        driver.findElement(submitBtn).click();
    }

    public void assertFirstName4() {
        Assert.assertEquals("Grigor", driver.findElement(firstName4).getText());
    }

    public void assertLastName4() {
        Assert.assertEquals("Stepanyan", driver.findElement(lastName4).getText());
    }

    public void assertAllRow4() {
        Assert.assertEquals("Grigor", driver.findElement(firstName4).getText());
        Assert.assertEquals("Stepanyan", driver.findElement(lastName4).getText());
        Assert.assertEquals("20", driver.findElement(age4).getText());
        Assert.assertEquals("step@gmail.com", driver.findElement(email4).getText());
        Assert.assertEquals("1000000", driver.findElement(salary4).getText());
        Assert.assertEquals("abcd", driver.findElement(department4).getText());
    }

    public void clickEdit4Btn() {
        driver.findElement(edit4Btn).click();
    }

    public void clearAgeField4() {
        driver.findElement(ageField).clear();
    }

    public void assertAge4() {
        Assert.assertEquals("27", driver.findElement(age4).getText());
    }

    public void clickDelete4Btn() {
        driver.findElement(delete4Btn).click();
    }
}
