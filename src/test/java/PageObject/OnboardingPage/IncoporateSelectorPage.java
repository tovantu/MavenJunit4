package PageObject.OnboardingPage;

import Interface.ClickInterface;
import TestSupport.WebElementCustom;
import org.openqa.selenium.By;

public class IncoporateSelectorPage {
    public ClickInterface continueButtonAlreadyHaveBusiness(){
        return new WebElementCustom(By.xpath("//div[contains(@class,'q-pb-md')]//div[@class='incorporated_selector__column-content']//button"));
    }

    public ClickInterface learnMoreButton(){
        return new WebElementCustom(By.xpath("//span[text()='Learn More']/ancestor::button[@type = 'submit']"));
    }
}
