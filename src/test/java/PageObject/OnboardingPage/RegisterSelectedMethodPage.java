package PageObject.OnboardingPage;

import Interface.ClickInterface;
import TestSupport.WebElementCustom;
import org.openqa.selenium.By;

public class RegisterSelectedMethodPage {
    public ClickInterface getStartedStandard(){
        return new WebElementCustom(By.xpath("//div[contains(@class,'q-mt-lg')]//span[text()='Get Started']/ancestor::button"));
    }
}
