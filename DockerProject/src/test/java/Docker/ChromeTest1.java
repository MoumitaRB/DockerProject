package Docker;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChromeTest1 {
	
	@Test
	public void test1() throws MalformedURLException
	{
		//DesiredCapabilities dc= DesiredCapabilities.firefox();
		ChromeOptions options=new ChromeOptions();
	
		URL url=new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver=new RemoteWebDriver(url, options);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String title=driver.getTitle();
		System.out.println("Title of the page:"+title);
		Assert.assertEquals(title, "OrangeHRM");
		driver.quit();
	}

}
