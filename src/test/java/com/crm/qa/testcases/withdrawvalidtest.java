package com.crm.qa.testcases;




import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Depositpage;
import com.crm.qa.pages.Withdrawlvalidpage;

public class withdrawvalidtest extends TestBase {

	Withdrawlvalidpage wd;
	

	@BeforeMethod
    public void setUp() {
        initialization();
        wd = new Withdrawlvalidpage();
        
    }

    @Test
    public void testCustomerActions() {
    	//wd.selectUsername("Harry Potter");
    	String title = wd.selectUsername("Hermoine Granger");
		Assert.assertEquals(title, "Withdraw");
    }

	/*
	 * @AfterMethod public void tearDown() { driver.quit(); }
	 */
}

