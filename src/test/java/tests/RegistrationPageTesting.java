package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainMenuPage;
import pages.MainPage;
import pages.RegistrationPage;

public class RegistrationPageTesting {
    WebDriver driver = new ChromeDriver();
    MainPage mainPage = new MainPage(driver);
    RegistrationPage registrationPage = new RegistrationPage(driver);
    MainMenuPage mainMenuPage = new MainMenuPage(driver);

    @Before
    public void beforeTest(){
        driver.get(Utils.BASE_URL);
    }

    @Test
    @DisplayName("Registration with valid email")
    public void checkValidRegistration(){
        String email = "promo@mailinator.com";
        mainPage.clickStartButton();
        registrationPage.enterEmail(email);
        registrationPage.clickRegisterButton();
        Assert.assertTrue(mainMenuPage.ProfileTabDisplayed());
    }

    @Test
    @DisplayName("Registration with invalid email")
    public void checkInvalidRegistration(){
        String invalidEmail = "promo";
        mainPage.clickStartButton();
        registrationPage.enterEmail(invalidEmail);
        registrationPage.clickRegisterButton();
        Assert.assertTrue(registrationPage.alertErrorRegistrationDisplayed());
    }

    @Test
    @DisplayName("Registration with empty email field")
    public void checkEmptyEmailFieldRegistration(){
        mainPage.clickStartButton();
        registrationPage.clickRegisterButton();
        Assert.assertTrue(registrationPage.alertErrorRegistrationDisplayed());
    }

    @After
    public void afterTest(){
        driver.close();
    }
}
