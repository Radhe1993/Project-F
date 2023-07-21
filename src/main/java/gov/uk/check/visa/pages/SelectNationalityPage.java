package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SelectNationalityPage extends Utility
{
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement nationalityDropDownList;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;



    public  void selectNationality()
     {
         clickOnElement(nationalityDropDownList);

     }
     public  void clickNextStepButton()
    {
        clickOnElement(nextStepButton);

    }
}
