package com.crm.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class searchpage extends TestBase {

    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement bankButton;

    @FindBy(xpath = "//button[@ng-click='showCust()']")
    WebElement customerButton;

    @FindBy(xpath = "//input[@ng-model='searchCustomer']")
    WebElement searchField;
    
    @FindBy(xpath="//strong[contains(text(),'XYZ Bank')]")
	WebElement pgtitle;

    public searchpage() {
        PageFactory.initElements(driver, this);
    }

    public String clickBankButton(String s) {
        bankButton.click();
        System.out.println("Clicked on Bank Manager Login button");

        customerButton.click();
        System.out.println("Clicked on Customer button");
        searchField.sendKeys(s);
        System.out.println("Entered search criteria: Harry");

        return pgtitle.getText();
    }

   

}
