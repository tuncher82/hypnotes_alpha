package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//a[@class='ant-dropdown-trigger BaseNavbar_dropBtn__zkmnE btn']")
    public WebElement signUpButton;

}
