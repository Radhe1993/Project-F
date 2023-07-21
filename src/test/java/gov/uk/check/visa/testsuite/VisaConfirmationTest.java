package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.customListeners.CustomListeners;
import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class VisaConfirmationTest extends BaseTest {

    StartPage startPage ;
    WorkTypePage workTypePage;
    SelectNationalityPage selectNationalityPage;
    ResultPage resultPage;
    FamilyImmigrationStatusPage family;
    DurationOfStayPage stayPage;


    @BeforeMethod(groups = {"smoke","sanity","regression"})
    public void iNit()
    {
        startPage = new StartPage();
        workTypePage = new WorkTypePage();
        selectNationalityPage = new SelectNationalityPage();
        resultPage = new ResultPage();
        family = new FamilyImmigrationStatusPage();
        stayPage = new DurationOfStayPage();
    }

    @Test(groups = {"smoke","sanity","regression"})
    public void anAustralianCominToUKForTourism() throws InterruptedException {
        startPage.clickStartNow();
        Thread.sleep(2000);
        workTypePage.selectJobType("Australia");
        selectNationalityPage.clickNextStepButton();
        selectNationalityPage.selectNationality();
        workTypePage.clickNextStepButton();
        workTypePage.getText();

    }

    @Test(groups = {"regression"})
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths()
    {
        resultPage. clickStartNow();
        resultPage.selectJobType("chile");
        resultPage.clickNextStepButton();
        resultPage.selectNationality();
        resultPage.setNextStepButton1();
        resultPage.clickOnLongMonth();
        resultPage.clickOnContinue();
        resultPage.setSelectHealthAndCare();
        resultPage.setContinue2();
        resultPage.getText2();

    }

    @Test(groups = {"sanity","regression"})
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card()
    {
        family.clickStartNow();
        family.selectJobType("Colombia");
        family. clickNextStepButton();
        family.selectResonNationality();
        family.setNextStepButton1();
        stayPage.selectLengthOfStay("family visa");
    }
}
