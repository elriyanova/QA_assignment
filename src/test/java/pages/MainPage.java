package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageObject{

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(), 'Start free')]")
    private WebElement LOCATOR_StartButton;

    public void clickStartButton(){
        this.LOCATOR_StartButton.click();
    }

}