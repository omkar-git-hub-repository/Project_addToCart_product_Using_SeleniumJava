package baseClass;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass

{
	public WebDriver driver;
	public Properties p;          //create this class to access config.properties file

	@BeforeClass
	public void setup() throws IOException
	{
		
	//loading config.propertise files
	FileReader file =  new FileReader("./src/test//resources//config_add-to-cart.properties");
	p=new Properties();
	p.load(file);
	
	ChromeOptions options = new ChromeOptions();
	//options.addArguments("--headless=new");        //run test in headless mode
	
	options.addArguments("--incognito"); 
	
	driver =new ChromeDriver(options);
	driver.get(p.getProperty("appURL"));
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
	}
	
	
	@AfterClass
	public void teardown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	
}

