import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class NewTest {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "C:\\Users\\ANH DUC\\Downloads\\chromedriver_win32\\chromedriver.exe";
    public WebDriver driver ; 
    @BeforeTest
    public void setBaseUrl() {
  	  System.out.println("launching firefox browser"); 
  	  System.setProperty("webdriver.chrome.driver", driverPath);
  	  driver = new ChromeDriver();
      driver.get(baseUrl);
    }
    
    
    @Test
    public void verifyHomepageTitle() {
  	  String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        driver.close();
    }
}
