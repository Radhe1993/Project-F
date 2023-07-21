package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends Utility
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
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement nationalityDropDownList;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton1;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement longMonth;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continue1;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement selectHealthAndCare;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement Continue2;

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You need a visa to work in health and care')]")
    WebElement text2;


    public  void clickStartNow()
    {
        clickOnElement(startNowButton);

    }
    public  void selectJobType(String job)
    {
        selectByValueFromDropDown(selectJobtypeList,job);
        //chile
    }

    public void clickNextStepButton()
    {
        clickOnElement(nextStepButton);
    }

    public  void selectNationality()
    {
        clickOnElement(nationalityDropDownList);


    }
    public void setNextStepButton1()
    {
        clickOnElement(nextStepButton1);
    }
    public void clickOnLongMonth()
    {
        clickOnElement(longMonth);
    }
    public void clickOnContinue()
    {
        clickOnElement(continue1);
    }
    public void setSelectHealthAndCare()
    {
        clickOnElement(selectHealthAndCare);
    }
    public void setContinue2()
    {
        clickOnElement(Continue2);
    }
    public void getText2()
    {
        getTextFromElement(text2);
    }

}
