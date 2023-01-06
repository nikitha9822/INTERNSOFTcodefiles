package testcase;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.serverBase;

@Test(priority = 1)
public class LoginToLogout extends serverBase {
	public static void loginest() throws Exception {

		// fetching the login details by using xpath & sendKeys reading from the
		// properties file

		// Valid Email and Password
		// Thread.sleep(3000);
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Email_Id_Xpath")))
				.sendKeys(datatestProperties.getProperty("Email_Testdata"));

		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Password_Id_Xpath")))
				.sendKeys(datatestProperties.getProperty("Password_Testdata"));

		// Thread.sleep(3000);
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Login"))).click();
	}

	// Server Page
	
	@Test(priority = 2)
	public static void ServerPage() throws Exception {
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("server"))).click();

		// Thread.sleep(3000);
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Add_icon"))).click();

		// Thread.sleep(3000);
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Server_Name")))
				.sendKeys(datatestProperties.getProperty("Server_Value"));

		// Thread.sleep(3000);
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Server_Serial")))
				.sendKeys(datatestProperties.getProperty("ServerSerial_Value"));

		// hread.sleep(3000);
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Server_Model")))
				.sendKeys(datatestProperties.getProperty("ServerModel_Value"));

		// Thread.sleep(3000);
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Manufacture")))
				.sendKeys(datatestProperties.getProperty("Manufacturer_Value"));

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Owner")))
				.sendKeys(datatestProperties.getProperty("Owner_Value"));

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Category")))
				.sendKeys(datatestProperties.getProperty("Category_Value"));

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Radio_Button"))).click();

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Current_Project")))
				.sendKeys(datatestProperties.getProperty("CurrentProject_Value"));

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Notes")))
				.sendKeys(datatestProperties.getProperty("Notes_Value"));

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Previous_Project")))
				.sendKeys(datatestProperties.getProperty("PreviousProject_Value"));

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("BOM")))
				.sendKeys(datatestProperties.getProperty("BOM_Value"));

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Support_Case")))
				.sendKeys(datatestProperties.getProperty("SupportCase_Value"));

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Cluster_Id")))
				.sendKeys(datatestProperties.getProperty("ClusterId_Value"));

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Asset_Location")))
				.sendKeys(datatestProperties.getProperty("AssetLocation_Value"));

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Lab")))
				.sendKeys(datatestProperties.getProperty("Lab_Value"));

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Row")))
				.sendKeys(datatestProperties.getProperty("Row_Value"));

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Rack")))
				.sendKeys(datatestProperties.getProperty("Rack_Value"));

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Ru")))
				.sendKeys(datatestProperties.getProperty("Ru_Value"));

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("DC_Status")))
				.sendKeys(datatestProperties.getProperty("DCStatus_Value"));

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Speed = driver.findElement(By.xpath(FileUtilityProperties.getProperty("Cpu_Model")));
		Speed.click();
		Speed.sendKeys("Ro");
		Speed.sendKeys(Keys.ARROW_UP);
		Speed.sendKeys(Keys.ENTER);

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Generation")))
				.sendKeys(datatestProperties.getProperty("Generation_Value"));

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.findElement(By.xpath(FileUtilityProperties.getProperty("Cpu_Socket"))).click();
		WebElement Socket = driver.findElement(By.xpath(FileUtilityProperties.getProperty("Cpu_Socket")));
		Socket.click();
		Socket.sendKeys("2");
		Socket.sendKeys(Keys.ARROW_DOWN);
		Socket.sendKeys(Keys.ENTER);

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Pdu_Ip")))
				.sendKeys(datatestProperties.getProperty("PduId_Value"));

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Pdu_User")))
				.sendKeys(datatestProperties.getProperty("PduUser_Value"));

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Pdu_Password")))
				.sendKeys(datatestProperties.getProperty("PduPassword_Value"));

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Operating_System")))
				.sendKeys(datatestProperties.getProperty("OperatingSystem_Value"));

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Bmc_Ip")))
				.sendKeys(datatestProperties.getProperty("BmcIp_Value"));

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Bmc_User")))
				.sendKeys(datatestProperties.getProperty("BmcUser_Value"));

		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Bmc_Password")))
				.sendKeys(datatestProperties.getProperty("BmcPassword_Value"));

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Bmc_Fqdn")))
				.sendKeys(datatestProperties.getProperty("BmcFqdn_Value"));

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Os_Ip")))
				.sendKeys(datatestProperties.getProperty("OsIp_Value"));

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Os_User")))
				.sendKeys(datatestProperties.getProperty("OsUser_Value"));

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Os_Password")))
				.sendKeys(datatestProperties.getProperty("OsPassword_Value"));

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Dimm_Size")))
				.sendKeys(datatestProperties.getProperty("DimmSize_Value"));

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Dimm_Capcity")))
				.sendKeys(datatestProperties.getProperty("DimmCapcity_Value"));

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.findElement(By.xpath(FileUtilityProperties.getProperty("Storage_Vendor"))).click();
		WebElement Vendor = driver.findElement(By.xpath(FileUtilityProperties.getProperty("Storage_Vendor")));
		Vendor.click();
		Vendor.sendKeys("Samsung");
		Vendor.sendKeys(Keys.ARROW_DOWN);
		Vendor.sendKeys(Keys.ENTER);

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.findElement(By.xpath(FileUtilityProperties.getProperty("Storage_Controller"))).click();
		WebElement Controller = driver.findElement(By.xpath(FileUtilityProperties.getProperty("Storage_Controller")));
		Controller.click();
		Controller.sendKeys("SA");
		Controller.sendKeys(Keys.ARROW_DOWN);
		Controller.sendKeys(Keys.ENTER);

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Storage_Capcity")))
				.sendKeys(datatestProperties.getProperty("StorageCapcity_Value"));

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Network_Type"))).click();

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.findElement(By.xpath(FileUtilityProperties.getProperty("Network_Speed"))).click();
		WebElement Network = driver.findElement(By.xpath(FileUtilityProperties.getProperty("Network_Speed")));
		Network.click();
		Network.sendKeys("25");
		Network.sendKeys(Keys.ARROW_DOWN);
		Network.sendKeys(Keys.ENTER);

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.findElement(By.xpath(FileUtilityProperties.getProperty("Network_Ports"))).click();
		WebElement Port = driver.findElement(By.xpath(FileUtilityProperties.getProperty("Network_Ports")));
		Port.click();
		Port.sendKeys("4");
		Port.sendKeys(Keys.ARROW_UP);
		Port.sendKeys(Keys.ENTER);

		// Thread.sleep(3000);
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Swtiching_Needs")))
				.sendKeys(datatestProperties.getProperty("SwtichingNeeds_Value"));

		// Thread.sleep(3000);
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Purpose")))
				.sendKeys(datatestProperties.getProperty("Purpose_Value"));

		// Thread.sleep(3000);
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Start_Date")))
				.sendKeys(datatestProperties.getProperty("StartDate_Value"));

		// Thread.sleep(3000);
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("End_Date")))
				.sendKeys(datatestProperties.getProperty("EndDate_Value"));

		// Thread.sleep(3000);
		System.out.println("............xpath is:" + FileUtilityProperties.getProperty("Update"));

		// driver.findElement(By.id((FileUtilityProperties.getProperty("Add_Server")))).click();

		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Update"))).click();
	}

	// ServerPool Page
	@Test(priority = 3)
	public static void ServerPoolPage() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Server_Pool"))).click();

		// Thread.sleep(3000);
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Release_Server"))).click();

		// hread.sleep(3000);
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Select_User"))).click();

		// Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		List<WebElement> Select = driver.findElements(By.xpath(FileUtilityProperties.getProperty("Select_Dropdown")));
		System.out.println("total number of dropdown" + Select.size());
		Select.get(0).click();
		System.out.println(Select.get(0).isSelected());

		// Thread.sleep(3000);
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Select"))).click();

		// Thread.sleep(3000);
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Ok_Btn"))).click();

		
	}

	// In user page add user option for admin
	@Test(priority = 4)

	public static void AddUser() throws Exception {
		Thread.sleep(3000);

		System.out.println("..........>" + FileUtilityProperties.getProperty("User"));

		driver.findElement(By.xpath(FileUtilityProperties.getProperty("User"))).click();

		// Thread.sleep(3000);
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Add_User"))).click();

		// Thread.sleep(3000);
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("First_Name")))
				.sendKeys(datatestProperties.getProperty("FirstName_Value"));

		// Thread.sleep(3000);
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Last_Name")))
				.sendKeys(datatestProperties.getProperty("LastName_Value"));

		// Thread.sleep(3000);
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Role"))).click();

		// Thread.sleep(3000);
		// driver.findElement(By.xpath(FileUtilityProperties.getProperty("Role_Option1"))).sendKeys(datatestProperties.getProperty("RoleOption1_Value"));
		List<WebElement> Role = driver.findElements(By.xpath(FileUtilityProperties.getProperty("Role_Option1")));
		System.out.println("total number of dropdown" + Role.size());
		Role.get(0).click();
		// System.out.println(Select.get(0).isSelected());

		// Thread.sleep(3000);
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Teams")))
				.sendKeys(datatestProperties.getProperty("Teams_Value"));

		// Thread.sleep(3000);
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Email_Id")))
				.sendKeys(datatestProperties.getProperty("EmailId_Value"));

		// Thread.sleep(3000);
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Password")))
				.sendKeys(datatestProperties.getProperty("Password_Value"));

		// Thread.sleep(3000);
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Add"))).click();

	}
	
	// Server Request page in Admin login
	@Test(priority = 5)
	public static void ServerRequest() throws Exception {
		Thread.sleep(3000);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("listrequestuser_icon"))).click();

		// Thread.sleep(3000);
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Chat_Option"))).click();

		// Thread.sleep(3000);
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Send_Message")))
				.sendKeys(datatestProperties.getProperty("SendMessage_Option"));

		// Thread.sleep(3000);
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Send"))).click();

		// Thread.sleep(3000);
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Close_Button"))).click();

		// Thread.sleep(3000);
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Add_Icon"))).click();

		// Thread.sleep(3000);
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Add_Server"))).clear();

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Add_Server")))
				.sendKeys(datatestProperties.getProperty("AddServer_Option"));

		// Thread.sleep(3000);
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Cancel"))).click();

		// Thread.sleep(3000);
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("More_Option"))).click();

		// Thread.sleep(3000);
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Close_MoreOption"))).click();
	}

	/// LogoutPage
	@Test(priority = 6)
	public static void ServerLogOut() throws Exception {
		Thread.sleep(5000);
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("User_Logout"))).click();

		
		// Thread.sleep(3000);
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Logout"))).click();

		// Thread.sleep(3000);
		driver.findElement(By.xpath(FileUtilityProperties.getProperty("Ok_Button1"))).click();

		// test for validation of web application
		String title = "Server Management";
		String actualTitle = driver.getTitle();
		System.out.println("Verifying the page title has started");
		Assert.assertEquals(actualTitle, title, "Page title doesnt match");
		System.out.println("The page title has been successfully verified");
		System.out.println("User logged in successfully");

	}
}
