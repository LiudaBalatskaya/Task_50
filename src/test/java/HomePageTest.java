import base.TestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;


public class HomePageTest extends TestBase {
    @AfterMethod
    public void quit(){
        LoginPage.quit(driver);
    }

    @BeforeMethod
    public void gotoPage(){
        gotoPage(driver);
        LoginPage.login(driver);
    }
    @Test
    public void findAllLinks(){  HomePage.findAllLinks(driver);
    }
    @Test
    public void findAllInputs(){ HomePage.findAllInputs(driver); }

    @Test
    public void findAllElements(){ HomePage.findAllElements(driver); }

    @Test
    public void findNearNameAllElements(){
        HomePage.findNearNameAllElements(driver);
    }

    @Test
    public void findListElement051(){
        HomePage.findListElement(driver, HomePage.LINK051);
        HomePage.findListElement(driver, HomePage.LINK051XPATH);
    }

    @Test
    public void findListElement424(){
        HomePage.findListElement(driver, HomePage.LINK424);
        HomePage.findListElement(driver, HomePage.LINK424XPATH);
    }

    @Test
    public void findListElement118(){
        HomePage.findListElement(driver, HomePage.LINK118);
        HomePage.findListElement(driver, HomePage.LINK118XPATH);
    }

    @Test
    public void findListElementsStep5(){
        HomePage.findListElement(driver, HomePage.LINKS_STEP5);
        HomePage.findListElement(driver, HomePage.LINKS_STEP5XPATH);
    }

    @Test
    public void findAllElementsWithClasses(){
        HomePage.findListElement(driver, HomePage.LINKS_CLASSES);
        HomePage.findListElement(driver, HomePage.LINKS_CLASSES_AFTER_WIDGET);
    }

    @Test
    public void findElementsWithID(){
        HomePage.findListElement(driver, HomePage.LINKS_ALL_ID_AFTER_WRAPPER);
    }

    @Test
    public void findAllDataOfficeid(){
        HomePage.findListElement(driver, HomePage.DATA_OFFICEID);
    }

    @Test
    public void findManagementBelarus(){
        HomePage.findListElement(driver, HomePage.MANAGEMENT_BELARUS);
    }

    @Test
    public void toCompanyMenu(){
        HomePage.findListElement(driver, HomePage.TO_COMPANY);
    }

}
