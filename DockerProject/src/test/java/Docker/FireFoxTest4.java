package Docker;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FireFoxTest4 {
	
	@Test
	public void test4() throws MalformedURLException
	{
		DesiredCapabilities dc= DesiredCapabilities.firefox();
		//FirefoxOptions options=new FirefoxOptions();
	
		URL url=new URL("http://localhost:4444/wd/hub");
		RemoteWebDriver driver=new RemoteWebDriver(url, dc);
		driver.get("https://www.spicejet.com/");
		String title=driver.getTitle();
		System.out.println("Title of the page:"+title);
		Assert.assertEquals(title, "SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets");
		driver.quit();
	}

}
