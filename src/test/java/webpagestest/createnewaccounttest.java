package webpagestest;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import webpages.createnewaccount;

public class createnewaccounttest extends TestBase {
	
	createnewaccount newacc;
	
	@DataProvider(name="exceldata")
	public Object[][] logindata() throws IOException
	{
		excelreader2 er = new excelreader2();
		return er.exceldata();	
	}
	
	@Test(dataProvider="exceldata")
	public void createtest(String fname,String lname,String addr,String city,String mobile, String alias,
			String createaccemail,String persfname,String perslname,String pass) throws InterruptedException
	{
		newacc=new createnewaccount(driver);
		Thread.sleep(1000);
		newacc.createacctxtbox(createaccemail);
		Thread.sleep(1000);
		newacc.radiobtn();
		Thread.sleep(1000);
		newacc.dropdownrreg();
		Thread.sleep(2000);
		newacc.enterreg2(fname, lname, addr, city, mobile, alias);
		newacc.firstlastname(persfname,perslname,pass);
		Thread.sleep(2000);
		newacc.registering();
		Thread.sleep(1000);
		}
}
