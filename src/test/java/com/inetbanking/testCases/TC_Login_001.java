package com.inetbanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_Login_001 extends BaseClass
{
	@Test
	public void loginTest() {
		driver.get(baseUrl);
		LoginPage lp =new LoginPage(driver);
		lp.setUserName(userName);
		lp.setPassword(password);
		lp.clickSubmit();
		
		if(driver.getTitle().equals("http://www.demo.guru99.com/v4/manager/Managerhomepage.php"))
		{
			Assert.assertTrue(true);
		}
		else
			Assert.assertTrue(false);
	}
  
}
