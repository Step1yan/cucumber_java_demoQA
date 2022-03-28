package Tests;

import Actions.WebTablesPage;
import Settings.Settings;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddStepDef {
    private Settings settings = new Settings();
    private WebTablesPage wtp = new WebTablesPage(settings.driver);

    @Given("Web Tables page is opened")
    public void webTablesPageIsOpened() {
        settings.open("/webtables");
        settings.maximize();
    }

    @And("I click on add button")
    public void ClickOnAddButton() {
        wtp.clickAddBtn();
    }

    @And("I type {string} in the first name field")
    public void iTypeInTheFirstNameField(String firstname) {
        wtp.firstNameInput(firstname);
    }

    @And("I type {string} in the last name field")
    public void iTypeInTheLastNameField(String lastname) {
        wtp.lastNameInput(lastname);
    }

    @And("I type {string}  in the email field")
    public void iTypeInTheEmailField(String email) {

        wtp.emailinput(email);
    }

    @And("I type {string}  in the age field")
    public void iTypeInTheAgeField(String age) {

        wtp.ageInput(age);
    }

    @And("I type {string}  in the salary field")
    public void iTypeInTheSalaryField(String salary) {

        wtp.salaryInput(salary);
    }

    @And("I type {string}  in the department field")
    public void iTypeInTheDepartmentField(String department) {

        wtp.departmentInput(department);
    }

    @And("I click on submit button")
    public void iClickOnSubmitButton() {

        wtp.clickSubmitBtn();
    }

    @And("I check the contents of the table")
    public void iCheckTheContentsOfTheTable() {
        wtp.assertAllRow4();

    }

    @And("I click on the Edit button")
    public void iClickOnTheEditButton() {
        wtp.clickEdit4Btn();
    }

    @And("I clear age")
    public void iClearAge() {
        wtp.clearAgeField4();
    }

    @And("I type {string} in the age field")
    public void TypeInTheAgeField(String age) {
        wtp.ageInput(age);
    }

    @And("I check the changes")
    public void iCheckTheChanges() {
        wtp.assertAge4();
    }

    @Then("I delete the table created by me")
    public void iDeleteTheTableCreatedByMe() {
        wtp.clickDelete4Btn();
    }

    @After
    public void close() {
        settings.close();
    }


}
