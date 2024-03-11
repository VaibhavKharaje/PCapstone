package com.crm.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Depositpage;

public class Deposittest extends TestBase {

	Depositpage dp;

	@BeforeMethod
    public void setUp() {
        initialization();
        dp = new Depositpage();
    }

    @Test
    public void testCustomerActions() {
    	//dp.selectUsername("Harry Potter");
    	String title = dp.selectUsername("Harry Potter");
		Assert.assertEquals(title, "Deposit");
		
		
		for (int i = 1; i <= 8; i++) {
            dp.enterDepositAmount();
        }
    }

	/*
	 * @AfterMethod public void tearDown() { driver.quit(); }
	 */
}

