package Pages;

import Constants.Consts;

public class MainPage extends BasePage {
    private static final String LOGO_IMG = "//img[@itemprop='logo']";
    private static final String CONTACT_US = "//a[text()='Contact us']";

    public void navigateToToMainPage() {
        webDriver.get(Consts.MAIN_URL);
    }
    public boolean isLogoVisible(){
        Boolean isVisible = elementExists(LOGO_IMG);
        return isVisible;
    }
    public ContactUsPage openContactUsTab(){
       clickElementByXpath(CONTACT_US);
       return new ContactUsPage();
    }

}
