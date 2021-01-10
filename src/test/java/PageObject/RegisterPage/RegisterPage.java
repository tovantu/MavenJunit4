package PageObject.RegisterPage;

import Interface.*;
import TestSupport.WebElementCustom;
import org.openqa.selenium.By;

public class RegisterPage {
    public InputInterface fullName(){
        return new WebElementCustom(By.xpath("//input[@name = 'full_name']"));
    }
    public InputInterface email(){
        return new WebElementCustom(By.xpath("//input[@name = 'email']"));
    }
    public ClickInterface phoneNumberDropdown(){
        return new WebElementCustom(By.xpath("//*[@name = 'phone']//*[contains(@class, 'q-select__dropdown-icon')]"));
    }
    public ClickInterface country(String country){
        return new WebElementCustom(By.xpath(String.format("//*[contains(text(),'%s')]",country)));
    }
    public InputInterface phoneNumber(){
        return new WebElementCustom(By.xpath("//input[@name='phone']"));
    }
    public TextInterface phoneNumbberError(){
        return new WebElementCustom(By.xpath("//div[@label='Phone number']//div[contains(@class, 'aspire-label__text')]"));
    }
    public ClickInterface role(String role){
        return new WebElementCustom(By.xpath(String.format("//*[contains(@class, 'register-step-person__registration-role-option')]//div[contains(normalize-space(.), '%s')]", role)));
    }
    public ClickInterface hearAboutUsDropdown(){
        return new WebElementCustom(By.xpath("//div[@placeholder='Select any of the following']"));
    }
    public ClickInterface hearAboutUsOption(String reference){
        return new WebElementCustom(By.xpath(String.format("//div[@class ='q-item__label'][contains(text(),'%s')]", reference)));
    }
    public ClickInterface privacyCheckBox(){
        return new WebElementCustom(By.xpath("//*[contains(@class,'q-checkbox__svg')]"));
    }
    public ClickInterface submitButton(){
        return new WebElementCustom(By.xpath("//button[@type='submit']"));
    }

    public void selectPhoneNumberOption(String country){
        phoneNumberDropdown().click();
        country(country).click();
    }
    public void selectHearAboutUs(String option){
        hearAboutUsDropdown().click();
        hearAboutUsOption(option).click();
    }
}
