package PageObject.OnboardingPage;

import Interface.ClickInterface;
import TestSupport.WebElementCustom;
import org.openqa.selenium.By;

public class BusinessViewPage {
    public ClickInterface businessDetailOption(String name){
        return new WebElementCustom(By.xpath(String.format("//div[contains(@class, 'q-checkbox__label')][text()='%s']", name)));
    }
}
