package Docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChromeTest3 {
	
	@Test
	public void test3() throws MalformedURLException
	{
		//DesiredCapabilities dc= DesiredCapabilities.firefox();
		ChromeOptions options=new ChromeOptions();
	
		URL url=new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver=new RemoteWebDriver(url, options);
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		System.out.println("Title of the page:"+title);
		Assert.assertEquals(title, "Facebook - Log In or Sign Up");
		driver.quit();
	}

}
