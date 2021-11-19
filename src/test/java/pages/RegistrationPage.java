package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends PageObject{

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[@type='submit' and text()='Register']")
    private WebElement LOCATOR_RegisterButton;

    @FindBy(xpath = "//input[@type='text' and @name='signup_email']")
    private WebElement LOCATOR_EmailField;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    private WebElement LOCATOR_AlertErrorRegistration;

    public void enterEmail(String email){
        this.LOCATOR_EmailField.sendKeys(email);
    }

    public void clickRegisterButton(){
        this.LOCATOR_RegisterButton.click();
    }

    public boolean alertErrorRegistrationDisplayed(){
        return this.LOCATOR_AlertErrorRegistration.isDisplayed();
    }

}