package PageObject.OnboardingPage;

import TestSupport.WebElementCustom;
import org.openqa.selenium.By;

public class PersonViewPage {
    public WebElementCustom getStartedButton(){
        return new WebElementCustom(By.xpath("//div[@class='auth-form']//button"));
    }
}
