package com.crm.qa.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class Withdrawlvalidpage extends TestBase  {
	
	
	@FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerButton;

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement usernameDropdown;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement loginButton;

    @FindBy(xpath = "//button[@ng-click='transactions()']")
    WebElement transactionsButton;
    

    
    @FindBy(xpath = "//button[@ng-click='withdrawl()']")
    WebElement withdrawButton;
    
    


    @FindBy(xpath = "//input[@ng-model='amount']")
    WebElement amountwithdrawField;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement withdrawSubmitButton;
    
    

    
    
    public Withdrawlvalidpage() {
        PageFactory.initElements(driver, this);
    }

    

    public String selectUsername(String username) {
    	
    	customerButton.click();
    	System.out.println("Clicked on Customer Login button");

        Select usernameSelect = new Select(usernameDropdown);
        usernameSelect.selectByVisibleText(username);
        System.out.println("Selected username: " + username);
        
        loginButton.click();
        System.out.println("Clicked on Login button");
        
        transactionsButton.click();
        System.out.println("Clicked on Transactions button");
        
		
       

         withdrawButton.click();
        System.out.println("Clicked on Withdraw button");
        
        amountwithdrawField.sendKeys("5096");
        System.out.println("Entered amount: 5096");
        
        
        withdrawSubmitButton.click();
        System.out.println("Clicked on Withdraw Submit button");

        return withdrawSubmitButton.getText();
        
        
        
    }


}

