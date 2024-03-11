package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class Depositpage extends TestBase  {
	@FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerButton;

    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement usernameDropdown;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement loginButton;

    @FindBy(xpath = "//button[@ng-click='transactions()']")
    WebElement transactionsButton;
    
    @FindBy(xpath = "//button[contains(text(),'Deposit')]")
    WebElement depositButton;

    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement amountDepositField;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement depositSubmitButton;
    
    
    public Depositpage() {
        PageFactory.initElements(driver, this);
    }
    public void enterDepositAmount() {
        amountDepositField.clear();
        amountDepositField.sendKeys("1000");
        depositSubmitButton.click();
        System.out.println("Entered deposit amount: " + amountDepositField );
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
        
        depositButton.click();
        System.out.println("Clicked on Deposit button");
        
        //amountDepositField.sendKeys("1000");
        //System.out.println("Entered amount: 1000");
        
        depositSubmitButton.click();
        System.out.println("Clicked on Deposit Submit button");

        
        String actualMessage = depositSubmitButton.getText();
        String expectedMessage = "Deposit";

        // Asserting the actual message matches the expected message
        Assert.assertEquals(actualMessage, expectedMessage, "Deposit success message not as expected");

        return actualMessage;
        
    }


}
