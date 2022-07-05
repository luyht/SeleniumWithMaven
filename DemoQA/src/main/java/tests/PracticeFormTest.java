package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import common.TestBasic;
import pages.FormPage;
import pages.HomePage;

public class PracticeFormTest {
	TestBasic testBasic = new TestBasic();
	
	//Contains all test cases which are test for Practice Form
	//TC01: [PracticeForm] Submit data successfully
	@BeforeMethod
	public void openWebsite() {
		testBasic.openWebsite("https://demoqa.com/");
	}
	
	@AfterMethod
	public void closeBrowser() {
		testBasic.driver.quit();
	}
	
	@Test
	public void submitDataSuccessfully() {
		HomePage homePage = new HomePage(testBasic.driver);
		FormPage formPage = homePage.clickFormItem();
		
		
	}

}
