package Docker;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class SetUp_DockerGrid {
	
	@BeforeTest
	void startDockerGrid() throws IOException, InterruptedException
	{
		Runtime.getRuntime().exec("cmd /c start start_dockergrid.bat");
		Thread.sleep(30000);
	}

	
   @BeforeTest(dependsOnMethods="startDockerGrid")
   void increaseNumberOfNodes() throws IOException, InterruptedException
   {
	   Runtime.getRuntime().exec("cmd /c start increase_numberofnodes.bat");
	   Thread.sleep(6000);
   }
	
	@AfterTest
	void stopDockerGrid() throws IOException, InterruptedException
	{
		Runtime.getRuntime().exec("cmd /c start stop_dockergrid.bat");
		Thread.sleep(10000);
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
	}
}
