package com.crm.qa.testcases;




import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.invdepositpage;

public class invdeposittest extends TestBase {

	invdepositpage dp;

	@BeforeMethod
    public void setUp() {
        initialization();
        dp = new invdepositpage();
    }

    @Test
    public void testCustomerActions() {
    	//dp.selectUsername("Harry Potter");
    	
    	String title = dp.selectUsername("Hermoine Granger");
    	Assert.assertTrue(title.contains("negative amount"), "Alert message not as expected");
    }

	/*
	 * @AfterMethod public void tearDown() { driver.quit(); }
	 */
}


