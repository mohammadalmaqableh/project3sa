package swaplab;

import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class homelab extends MYPARAMETERS {

	@BeforeMethod
	public void mySetup() {
		driver.get(Url);
	}

	@Test()
	public void LoginWithStandardUSer() throws InterruptedException {


		LoginFuncation(StandardUserName,passWord);

		Thread.sleep(2000);

	}

	@Test()
	public void LoginWithProblemUser() throws InterruptedException {
		
		
		LoginFuncation(ProblemUserName,passWord);
	
		Thread.sleep(2000);


	}

	@Test()
	public void LoginWithPerformanceUser() throws InterruptedException {
		
		LoginFuncation(PerformanceUserName,passWord);


		Thread.sleep(2000);


	}

	@AfterTest
	public void myPostTest() {
	}
}