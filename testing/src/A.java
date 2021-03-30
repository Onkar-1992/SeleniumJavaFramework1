import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class A{
	//public static void main(String[] args) 
	@Test//(priority=1)
	public void validtest(){
		System.out.println("First Test");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("HTTP://WWW.facebook.COM");
		String title = driver.getTitle();
		System.out.print("PageTitle: ");
		System.out.println(title);
		Assert.assertTrue(true == true);
		Assert.assertEquals("Facebook – log in or sign up",title);
	}
	
	@Test(priority=1)
	public void errortest() {
		//driver.findElementById("identifierId").sendKeys("omkar.thopate11@gmail.com");
		//	driver.findElementByXPath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button")
		//	.click();
		//	String error = driver.findElementByXPath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div/div[2]/div[2]/div/text()")
		//			.getText();
		//	System.out.println(error);
		//	Assert.assertTrue(true == true);
		//	Assert.assertEquals("Hello",error);
		System.out.println("Second Test");

		
	}
		
		
	

	
} 

/*import org.testng.Assert;
import org.testng.annotations.Test;

public class A {

    String className = "HardAssertion";

    @Test
    public void test_UsingHardAssertion() {
      //  Assert.assertTrue(true == true);
        Assert.assertEquals("HardAssertion", "HardAssertion");
        Assert.assertEquals(className, "HardAssertion");
        System.out.println("Successfully passed!");
    }
}*/