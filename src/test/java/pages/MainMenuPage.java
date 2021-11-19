package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainMenuPage extends PageObject{

    public MainMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='Your profile is incomplete']")
    private WebElement LOCATOR_ProfileTab;

    public boolean ProfileTabDisplayed(){
        return this.LOCATOR_ProfileTab.isDisplayed();
    }

}
