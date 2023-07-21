package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class DurationOfStayPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//body/div[@id='wrapper']/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/p[3]/a[1]")
    WebElement lessThanSixMonths;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'family visa')]")
    WebElement moreThanSixMonths;

    @CacheLookup
    @FindBy(xpath = "//p[contains(text(),'You need a family visa to live with a family membe')]")
    WebElement getText;


    public void setLessThanSixMonths() {
        clickOnElement(lessThanSixMonths);
    }

    public void setMoreThanSixMonths() {
        clickOnElement(moreThanSixMonths);
    }


    public void selectLengthOfStay(String moreOrLess) {

        switch (moreOrLess)
        {
            case "A":
                setLessThanSixMonths();

                break;
            case "B" :
                setMoreThanSixMonths();
                setGetText();
                String ex = "You need a family visa to live with a family member in the UK for more than 6 months.";
                String ac = getTextFromElement(By.xpath("//p[contains(text(),'You need a family visa to live with a family membe')]"));
                Assert.assertEquals(ac,ex);
                break;

            default:

        }

    }
    public void setGetText()
    {
        getTextFromElement(getText);
    }
}





