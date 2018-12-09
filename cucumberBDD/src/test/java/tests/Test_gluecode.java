package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.Homepage;

public class Test_gluecode 
{

	
	public WebDriver driver;
	public Homepage hp;
	
	@Before
	public void start()
	{
		System.setProperty("webdriver.chrome.driver", "d://Testing_workspace/softwares/webdrivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
	}
	
	@Given("^launch site using \"(.*)\"$")
	public void launch_site_using(String keyword) throws Exception 
	{
//		System.setProperty("webdriver.chrome.driver", "d://Testing_workspace/softwares/webdrivers/chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.get("http://www.google.co.in");

		hp=new Homepage(driver);
	   System.out.println("The Google search word is" +keyword); 
	  		
	}
	
	@Then("^search \"(.*)\"$")
	public void search(String keyword) throws Exception 
	{
	   System.out.println("The Google search word is" +keyword);   
	   hp.search(keyword);
	}
	
	@And("^close site$")
	public void close() throws Exception 
	{
	   System.out.println("close site");  
	   hp.close();
	}
	
}
