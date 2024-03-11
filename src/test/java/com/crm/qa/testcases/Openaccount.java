package com.crm.qa.testcases;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.OpenAccountPage;

public class Openaccount extends TestBase {

    OpenAccountPage openAccountPage;

    @BeforeMethod
    public void setUp() {
        initialization();
        openAccountPage = new OpenAccountPage();
    }

    @Test
    public void testOpenAccount() {
        //openAccountPage.openAccount("Harry Potter", "Rupee");
        String title = openAccountPage.openAccount("Hermoine Granger", "Dollar");
		Assert.assertEquals(title, "Process");
        
    }

	/*
	 * @AfterMethod public void tearDown() { driver.quit(); }
	 */
}
