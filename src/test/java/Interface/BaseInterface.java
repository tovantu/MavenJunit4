package Interface;

import TestSupport.WebElementCustom;
import org.openqa.selenium.WebElement;

public interface BaseInterface {
    void waitForElementDisable();
    void waitForVisibilityOfElement();
    boolean isDisplayed();
}
