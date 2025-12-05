package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FormQAPage;

public class RegisterFormQA {
    WebDriver driver;
    FormQAPage formQAPage;

    @BeforeClass
    public void SetUp() throws Exception{
        System.setProperty("WebDriver.firefox.driver", "C:\\Users\\Yeferson\\Desktop\\QA\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void NavigateToSite(){
        driver.get("https://qa-practice.netlify.app/bugs-form");
    }

    @Test
    public void SuccessFullRegisterForm(){
        formQAPage = new FormQAPage(driver);
        formQAPage.TypeUsername("Yeferson");
        formQAPage.TypeLastName("Uribe");
        formQAPage.TypePhone("3213509172");
        formQAPage.selectCountryByValue("Colombia");
        formQAPage.TypeEmail("Yuribe1205@gmail.com");
        formQAPage.TypePassword("123456*");
        formQAPage.ClickCheckbox();
        formQAPage.ClickBtnRegister();

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
