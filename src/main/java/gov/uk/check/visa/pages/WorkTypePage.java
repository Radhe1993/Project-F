package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class WorkTypePage extends Utility
{
    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/div[1]/select[1]")
    WebElement selectJobtypeList;

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/form[1]/div[1]/button[1]")
    WebElement nextStepButton;



    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/h2[1]")
    WebElement text;

    public  void selectJobType(String job)
    {
        sendTextToElement(selectJobtypeList,job);
       // australia
    }

    public void clickNextStepButton()
    {
        clickOnElement(nextStepButton);
    }

    public void getText()
    {
        getTextFromElement(text);
    }

}
