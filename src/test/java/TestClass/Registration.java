package TestClass;

import Helper.DatePicker;
import Helper.RanDomNumber;
import TestSupport.TestBase;
import org.junit.Assert;
import org.junit.Test;

public class Registration extends TestBase {


    @Test
    public void checkWhenInputWrongPhoneNumber() {
        Page.homPage.registerLink().click();

        Page.registerPage.fullName().sendKeys("fullName");
        Page.registerPage.email().sendKeys(String.format("invalid@mail.com"));
        Page.registerPage.selectPhoneNumberOption("Thailand (+66)");
        Page.registerPage.phoneNumber().sendKeys("1234");
        Page.registerPage.role("Appointed director").click();
        String phoneError = "Phone number must be at least 11 characters.";
        Assert.assertEquals("Didn't see error above phone number",phoneError, Page.registerPage.phoneNumbberError().getText(phoneError));

    }

    @Test
    public void registrationSucessfullTest() throws InterruptedException {

        Page.homPage.registerLink().click();

        Page.registerPage.fullName().sendKeys("Full name");
        int ranDomNumber = RanDomNumber.ranDomNumber(1, 99999);
        Page.registerPage.email().sendKeys(String.format("invalid%s@mail.com", ranDomNumber));
        Page.registerPage.selectPhoneNumberOption("Thailand (+66)");
        int ranDomPhoneNumber = RanDomNumber.ranDomNumber(111111111, 999999999);
        Page.registerPage.phoneNumber().sendKeys(String.valueOf(ranDomPhoneNumber));
        Page.registerPage.role("Appointed director").click();
        Page.registerPage.selectHearAboutUs("Referral");
        Page.registerPage.privacyCheckBox().click();
        Page.registerPage.submitButton().click();

        Page.verifyOtpPage.inputOTP(new String[]{"1","2","3","4"});

        Page.completedPage.continueButton().click();

        Page.incoporateSelectorPage.continueButtonAlreadyHaveBusiness().click();

        Page.registerSelectedMethodPage.getStartedStandard().click();


        Page.personViewPage.getStartedButton().click();

        Page.personEditPage.dateOfBirth().click();

        String date = "1 02 2000";
        DatePicker picker = new DatePicker();
        picker.selectDate(date);

        Page.personEditPage.selectNational("Albania");
        Page.personEditPage.selectGender("Male");
        Page.personEditPage.selectProductInterested(new String[]{"Credit Line", "Debit Card"});
        Page.commonPage.buttonSubmit().click();

        Page.verifyOtpPage.inputOTP(new String[]{"1","2","3","4"});
        Page.commonPage.buttonSubmit().click();

        Page.businessEditPage.businessNameInput().sendKeys("Business Name");
        Page.businessEditPage.selectRegistration("Limited liability partnership");
        int businessNumber = RanDomNumber.ranDomNumber(11111111, 99999999);
        Page.businessEditPage.businessNumberInput().sendKeys(String.valueOf(businessNumber) + "A");
        Page.businessEditPage.selectIndustry("Retail Goods");
        Page.businessEditPage.selectSubIndustry("Chemicals");
        Page.commonPage.buttonSubmit().click();

        String textExpected = "Identity Verification";
        Assert.assertEquals("Cannot see Identity Verification",textExpected, Page.identityViewPage.identityLabel().getText(textExpected));
        Page.commonPage.buttonSubmit().click();
        Page.identityViewPage.beginVeirfycation().click();

        Assert.assertTrue("Cannot see Identity card", Page.identityViewPage.identityDetails().isDisplayed());

    }
}
