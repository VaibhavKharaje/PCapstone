package com.crm.qa.testcases;





import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Invwithdrawlpage;

public class Invwithdrawtest extends TestBase {

	Invwithdrawlpage wd;

	@BeforeMethod
    public void setUp() {
        initialization();
        wd = new Invwithdrawlpage();
    }

    @Test
    public void testCustomerActions() {
    	//wd.selectUsername("Harry Potter");
    	String alertMessage = wd.selectUsername("Hermoine Granger");
        Assert.assertTrue(alertMessage.contains("negative amount"), "Alert message not as expected");
    }

	/*
	 * @AfterMethod public void tearDown() { driver.quit(); }
	 */
}


