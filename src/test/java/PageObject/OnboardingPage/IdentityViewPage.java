package PageObject.OnboardingPage;

import Interface.ClickInterface;
import Interface.TextInterface;
import TestSupport.WebElementCustom;
import org.openqa.selenium.By;

public class IdentityViewPage {
    public TextInterface identityLabel(){
        return new WebElementCustom(By.xpath("//div[@class='auth-form__card']//div[contains(@class,'text-weight-bold')]"), 60);
    }
    public ClickInterface beginVeirfycation(){
        return new WebElementCustom(By.xpath("//span[text()='Begin Verification']/ancestor::button"));
    }
    public TextInterface identityDetails(){
        return new WebElementCustom(By.xpath("//div[text()='Select the type of document you would like to upload']"));
    }
}
