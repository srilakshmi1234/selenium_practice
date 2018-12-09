package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage
{
  
  WebDriver driver_lc;
	
  @FindBy(name="q")
  WebElement search;
  
  public Homepage(WebDriver driver)
  {
	  driver_lc=driver;
	  PageFactory.initElements(driver,this);
  }
  
  public void search(String str)
  {
	  search.sendKeys(str);
  }
  public void close()
  {
	  driver_lc.close();
  }
	
}
