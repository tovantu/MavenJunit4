package PageObject.OnboardingPage;

import Interface.ClickInterface;
import Interface.InputInterface;
import TestSupport.WebElementCustom;
import org.openqa.selenium.By;

public class BusinessEditPage {
    public InputInterface businessNameInput(){
        return new WebElementCustom(By.xpath("//div[@label ='Business Name']//input"));
    }
    public InputInterface registrationTypeInput(){
        return new WebElementCustom(By.xpath("//div[@label ='Registration Type']//input"));
    }
    public ClickInterface registrationOption(String option){
        return new WebElementCustom(By.xpath(String.format("//div[@class='q-item__label'][text() = '%s']", option)));
    }
    public InputInterface businessNumberInput(){
        return new WebElementCustom(By.xpath("//div[@label ='Business Registration Number (UEN)']//input"));
    }
    public InputInterface industryInput(){
        return new WebElementCustom(By.xpath("//div[@label ='Industry']//input"));
    }
    public ClickInterface industryOption(String option){
        return new WebElementCustom(By.xpath(String.format("//div[@class='q-item__label'][text() = '%s']", option)));
    }
    public InputInterface subIndustryInput(){
        return new WebElementCustom(By.xpath("//div[@label ='Sub Industry']//input"));
    }
    public ClickInterface subIndustryOption(String option){
        return new WebElementCustom(By.xpath(String.format("//div[@class='q-item__label'][text() = '%s']", option)));
    }

    public void selectRegistration(String option){
        registrationTypeInput().click();
        registrationOption(option).click();
    }
    public void selectIndustry(String option){
        industryInput().click();
        industryOption(option).click();
    }
    public void selectSubIndustry(String option){
        subIndustryInput().click();
        subIndustryOption(option).click();
    }

}
