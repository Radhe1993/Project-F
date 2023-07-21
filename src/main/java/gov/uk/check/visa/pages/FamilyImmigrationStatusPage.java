package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class FamilyImmigrationStatusPage extends Utility
{
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/main[1]/div[2]/div[1]/article[1]/section[1]/a[1]")
    WebElement startNowButton;

    @CacheLookup
    @FindBy(xpath = "//select[@id='response']")
    WebElement selectJobtypeList;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-4']")
    WebElement nationalityDropDownList;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton1;





    public  void clickStartNow()
    {
        clickOnElement(startNowButton);

    }
    public  void selectJobType(String job)
    {
        sendTextToElement(selectJobtypeList,job);
        //Colombia
    }

    public void clickNextStepButton()
    {
        clickOnElement(nextStepButton);
    }

    public  void selectResonNationality()
    {
        clickOnElement(nationalityDropDownList);

    }
    public void setNextStepButton1()
    {
        clickOnElement(nextStepButton1);
    }


}
