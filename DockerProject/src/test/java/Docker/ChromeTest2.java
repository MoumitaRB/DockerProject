package Docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChromeTest2 {
	
	@Test
	public void test2() throws MalformedURLException
	{
		//DesiredCapabilities dc= DesiredCapabilities.firefox();
		ChromeOptions options=new ChromeOptions();
	
		URL url=new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver=new RemoteWebDriver(url, options);
		driver.get("http://www.google.com/");
		String title=driver.getTitle();
		System.out.println("Title of the page:"+title);
		Assert.assertEquals(title, "Google");
		driver.quit();
	}

}
