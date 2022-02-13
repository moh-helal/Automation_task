package webpages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutProcedure extends PageBase {

	public CheckoutProcedure(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css="i.icon-minus") 
	WebElement subbtn;
	
	@FindBy(xpath="//*[@id=\"cart_title\"]/span")
	WebElement summarymsg;
	
	@FindBy(id="cart_title")
	WebElement pageheader1;
	
	@FindBy(id="total_price")
	WebElement totalprice;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/p[2]/a[1]/span") 
	WebElement proceedbtn1;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/form/p/button/span")
	WebElement proceedbtn2;
	
	@FindBy(xpath="//*[@id=\"uniform-cgv\"]/span")
	WebElement checkbox;
	
	@FindBy(xpath="//*[@id=\"form\"]/p/button/span")  
	WebElement proceedbtn3;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/h1")
	WebElement pageheader2;
	
	@FindBy(xpath="//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	WebElement paymentbtn;
	
	@FindBy(xpath="//*[@id=\"cart_navigation\"]/button/span")  
	WebElement confpaybtn;
	
	@FindBy(linkText="Back to orders")
	WebElement backtoorderbtn;
	
	@FindBy(xpath="//*[@id=\"center_column\"]/h1")
	WebElement pageheader3;
	
	@FindBy(xpath="//*[@id=\"order-list\"]/tbody/tr[1]/td[1]/a")
	WebElement order;
	
	@FindBy(id="total_shipping")
	WebElement shippingprice;
	
	@FindBy(xpath="//*[@id=\"order-list\"]/tbody/tr/td[2]")
	WebElement orderdate;
	
	@FindBy(xpath="//*[@id=\"order-list\"]/tbody/tr/td[4]")
	WebElement orderpayment;
	
	@FindBy(xpath="//*[@id=\"order-list\"]/tbody/tr/td[5]/span")
	WebElement orderstatus;
	
	@FindBy(xpath="//*[@id=\"order-list\"]/tbody/tr/td[3]/span")
	WebElement orderprice;
	

	public void SubtractQuantity() throws InterruptedException
	{
		System.out.println(pageheader1.getText());
		Thread.sleep(2000);
		System.out.println(summarymsg.getText() + "the price: " + totalprice.getText());
		Thread.sleep(2000);
		clickbtn(subbtn);
		Thread.sleep(2000);
	    System.out.println("Updated: " + summarymsg.getText() + " & the updated price: " + totalprice.getText()+ " & the shippingprice: "+shippingprice.getText());
	    Thread.sleep(2000);
	}
	
	public void checkoutproceeding() throws InterruptedException, IOException
	{
		clickbtn(proceedbtn1);
		Thread.sleep(1000);
		clickbtn(proceedbtn2);
		System.out.println("Terms Checkbox selection: "+ checkbox.isSelected());
		Thread.sleep(2000);
		clickbtn(checkbox);
		Thread.sleep(3000);
		clickbtn(proceedbtn3);
		Thread.sleep(1500);
		System.out.println(pageheader2.getText() + "either by bank wire or by check");
		Thread.sleep(1500);
		clickbtn(paymentbtn);
		Thread.sleep(1500);
		clickbtn(confpaybtn);
		Thread.sleep(2000);		
	}
	
	public void orderhistory() throws InterruptedException, IOException
	{
		clickbtn(backtoorderbtn);
		Thread.sleep(1000);
		System.out.println(pageheader3.getText()+"page");
		Thread.sleep(2000);
		System.out.println("Here's the order "+order.getText()+ " \n " +"order date: "+ orderdate.getText()+ " \n " 
		+ "\n" +"order status: "+ orderstatus.getText()+ "\n " + "orderprice: "+orderprice.getText() );
		Thread.sleep(2000);
		
	}
}
