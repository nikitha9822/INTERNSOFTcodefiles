package base;

	import java.io.FileReader;
	import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;

	import io.github.bonigarcia.wdm.WebDriverManager;

	//Creating a Class as Base Test that includes all the common elements  to load , read , write and locate the file path.
	public class serverBase {

		// Launching Chrome Browser Instance // Loading Properties File
		// from Config Properties and test data properties.
		// Config File Reader and test data FileReader to read the path location of
		// Files
		public static WebDriver driver;
		public static Properties FileUtilityProperties = new Properties();
		public static Properties datatestProperties = new Properties();
		public static FileReader FileUtilityFileReader;
		public static FileReader datatestFileReader;

		// Using Before test TestNG Method
		// setting up the configuration
		@BeforeTest
		public void setUp() throws IOException {

			if (driver == null) {

				System.out.println("The path is:" + System.getProperty("user.dir"));

				// specify the path location for Config file to (ConfigFileReader)
				FileUtilityFileReader = new FileReader(
						System.getProperty("user.dir") + "\\src\\test\\resources\\FileUtility.properties");

				// specify the path location for Test Data file in (testdataFileReader)
				datatestFileReader = new FileReader(System.getProperty("user.dir") +
						"\\src\\test\\resources\\DataTest.properties");

				// Load the file to confiProperties and testdatProperties
				FileUtilityProperties.load(FileUtilityFileReader);
				datatestProperties.load(datatestFileReader);
			}
			if (FileUtilityProperties.getProperty("browser").equalsIgnoreCase("chrome")) {
				
				// Launching Chrome Browser instance to open URL
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();

				// maximize the Chrome Browser window
				driver.manage().window().maximize();
				
				

				// Read URL from confiProperties File
				driver.get(FileUtilityProperties.getProperty("URL"));
				
				//
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
				
				
				
			}
		}

		@AfterTest
		public void tearDown() throws Exception {

			Thread.sleep(3000);
			// close the instance
			driver.quit();
			System.out.println("teardown successfull");
		}
	}

	

