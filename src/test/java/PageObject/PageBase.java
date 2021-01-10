package PageObject;

import PageObject.OnboardingPage.*;
import PageObject.RegisterPage.CompletedPage;
import PageObject.RegisterPage.RegisterPage;
import PageObject.RegisterPage.VerifyOtpPage;

public class PageBase {
    public CommonPage commonPage = null;
    public HomePage homPage = null;
    public RegisterPage registerPage = null;
    public VerifyOtpPage verifyOtpPage = null;
    public CompletedPage completedPage = null;
    public IncoporateSelectorPage incoporateSelectorPage = null;
    public RegisterSelectedMethodPage registerSelectedMethodPage = null;
    public PersonViewPage personViewPage = null;
    public PersonEditPage personEditPage = null;
    public BusinessViewPage businessViewPage = null;
    public BusinessEditPage businessEditPage = null;
    public IdentityViewPage identityViewPage = null;



    public PageBase(){
        commonPage = new CommonPage();
        homPage = new HomePage();
        registerPage = new RegisterPage();
        verifyOtpPage = new VerifyOtpPage();
        completedPage = new CompletedPage();
        incoporateSelectorPage = new IncoporateSelectorPage();
        registerSelectedMethodPage = new RegisterSelectedMethodPage();
        personViewPage = new PersonViewPage();
        personEditPage = new PersonEditPage();
        businessViewPage = new BusinessViewPage();
        businessEditPage = new BusinessEditPage();
        identityViewPage = new IdentityViewPage();
    }
}
