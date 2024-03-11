package com.crm.qa.pages;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class deletepage extends TestBase {

    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement bankButton;

    @FindBy(xpath = "//button[@ng-click='showCust()']")
    WebElement customerButton;

    @FindBy(xpath = "//input[@ng-model='searchCustomer']")
    WebElement searchField;
    
    @FindBy(xpath = "(//button[@ng-click='deleteCust(cust)'])[1]")
    WebElement delete;
    
    @FindBy(xpath="//strong[contains(text(),'XYZ Bank')]")
   	WebElement pgtitle;

    public deletepage() {
        PageFactory.initElements(driver, this);
    }

    public String  clickBankButton(String cusname) {
        bankButton.click();
        System.out.println("Clicked on Bank Manager");
        customerButton.click();
        System.out.println("Clicked on Add Customer");
        searchField.sendKeys(cusname);
        System.out.println("Entered search criteria ");
        delete.click();
        System.out.println("Clicked on Delete button");
        return pgtitle.getText();
        
    }

   

}
