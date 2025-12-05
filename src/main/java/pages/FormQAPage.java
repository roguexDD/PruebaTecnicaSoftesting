package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FormQAPage {

    WebDriver driver;

    public FormQAPage (WebDriver driver){
        this.driver = driver;
    }

    By FirstnameInput = By.id("firstName");
    By LastNameInput = By.id("lastName");
    By PhoneNumberInput = By.id("phone");
    By CountriesSelectInput = By.id("countries_dropdown_menu");
    By EmailInput = By.id("emailAddress");
    By PasswordInput = By.id("password");
    By CheckBoxInput = By.id("exampleCheck1");
    By RegisterBtn = By.id("registerBtn");

    public void TypeUsername (String Username){
        driver.findElement(FirstnameInput).sendKeys(Username);
    }

    public void TypeLastName (String LastName){
        driver.findElement(LastNameInput).sendKeys(LastName);
    }

    public void TypePhone (String Phone){
        driver.findElement(PhoneNumberInput).sendKeys(Phone);
    }

    public void selectCountryByValue(String value) {
        new Select(driver.findElement(CountriesSelectInput))
                .selectByValue(value);
    }

    public void TypeEmail (String email){
        driver.findElement(EmailInput).sendKeys(email);
    }

    public void TypePassword (String Password){
        driver.findElement(PasswordInput).sendKeys(Password);
    }

    public void ClickCheckbox (){
        WebElement check = driver.findElement(CheckBoxInput);
        if (!check.isSelected()) {
            check.click();
        }
    }

    public void ClickBtnRegister (){
        driver.findElement(RegisterBtn).click();
    }

}
