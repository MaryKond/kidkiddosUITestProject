import Pages.ContactUsPage;
import Pages.MainPage;
import Utilities.UseCaseBase;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static java.util.logging.LogManager.*;
import static org.junit.jupiter.api.Assertions.*;

public class MainPageTest extends UseCaseBase {
    private static MainPage mainPage;
    private static final Logger logger= LogManager.getLogger(MainPageTest.class);

    @BeforeAll
    public static void classSetUp (){
        mainPage=new MainPage();
    }
    @BeforeEach
    public void beforeTest(){
        mainPage.navigateToToMainPage();
    }
    @Test
    public void mainPageLoadTest(){
        logger.info("Main page load test");
        Boolean success=mainPage.isLogoVisible();
        assertTrue(success);
    }
    @Test()
    public void openContactUsPage(){
        ContactUsPage contactUsPage=mainPage.openContactUsTab();
        boolean isLoaded =contactUsPage.isPageTitleVisible();
        assertTrue(isLoaded);

    }
}
