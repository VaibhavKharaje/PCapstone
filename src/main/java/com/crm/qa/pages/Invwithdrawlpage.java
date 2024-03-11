package com.crm.qa.pages;




import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class Invwithdrawlpage extends TestBase  {
	
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
    
    
    public Invwithdrawlpage() {
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

        amountwithdrawField.sendKeys("-1000");
        System.out.println("Entered amount: -1000");
        withdrawSubmitButton.click();
        System.out.println("Clicked on Withdraw Submit button");
        
        if (isAlertPresent()) {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            alert.accept();
            System.out.println("Alert Message: " + alertText);
            return alertText; // You can return the alert message if needed
        } else {
            System.out.println("No alert message displayed for negative amount.");
            return "No alert"; // You can customize the return value as needed
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
        
        
    }


}


