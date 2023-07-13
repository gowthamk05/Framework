package Framework_FoundIt;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

	WebDriver driver;
	PageObjectModel POM;
	Actions a;
	DataFormatter da;
	
	static String title ="Jobseeker's Sign in - Search & Apply to Latest Jobs Online | foundit India";
	static String LLTitle ="LinkedIn Login, Sign in | LinkedIn";
	static String GTitle ="Sign in - Google Accounts";
	static String FBTitle ="Facebook";
	static String HomeTitle ="foundit : Latest Jobs in India (2023), Job Vacancies, Recruitment - foundit.in";
	static String ForEmployerTitle="Resume Search - Online Job Posting Service - Recruitement & Hiring Solutions | foundit.in";
	static String BuyOnlineTitle="Buy online - Job Postings, Resume Access, SMS Solution, Adverting Jobs, Job Posting services, Packages and Offers";
	static String EmployerLoginTitle="Resume Search - Online Job Posting Service - Recruitement & Hiring Solutions | foundit.in";
	static String RPTitle ="Registration | foundit India";
	static String Androidlink="foundit (Monster) Job Search - Apps on Google Play";
	static String Applelink="foundit (Monster) Job Search on the App Store";
	static String InstagramFollowTitle="foundit India (@foundit_india) • Instagram photos and videos";
	static String LinkedInFollowTitle="foundit | LinkedIn";
	static String TwitterFollowTitle="Log in to Twitter / Twitter";
	static String FacebookTitle="Foundit India | Hyderabad";
	static String LinkedinLoginTitle="LinkedIn Login, Sign in | LinkedIn";
	static String GoogleLogintitle="Sign in - Google Accounts";
	static String FacebookLoginTitle="Facebook";
	static String DashBoardTitle="My Dashboard | foundit India";
	
	public String VUrl() throws EncryptedDocumentException, IOException {	
		FileInputStream fio=new FileInputStream("./Data/FounditData.xlsx");
		Workbook wb=WorkbookFactory.create(fio);
		return wb.getSheet("Sheet1").getRow(1).getCell(1).toString();
	}
	
	public String VUName() throws EncryptedDocumentException, IOException {
		FileInputStream fio=new FileInputStream("./Data/FounditData.xlsx");
		Workbook wb=WorkbookFactory.create(fio);
		return wb.getSheet("Sheet1").getRow(2).getCell(1).toString();
	}
	public String IVUName() throws EncryptedDocumentException, IOException {
		FileInputStream fio=new FileInputStream("./Data/FounditData.xlsx");
		Workbook wb=WorkbookFactory.create(fio);
		return wb.getSheet("Sheet1").getRow(3).getCell(1).toString();
	}
	public String VPNo() throws EncryptedDocumentException, IOException {
		FileInputStream fio=new FileInputStream("./Data/FounditData.xlsx");
		Workbook wb=WorkbookFactory.create(fio);
		da=new DataFormatter();
		return da.formatCellValue(wb.getSheet("Sheet1").getRow(4).getCell(1));
	}
	public String IVPNo() throws EncryptedDocumentException, IOException {
		FileInputStream fio=new FileInputStream("./Data/FounditData.xlsx");
		Workbook wb=WorkbookFactory.create(fio);
		da=new DataFormatter();
		return da.formatCellValue(wb.getSheet("Sheet1").getRow(5).getCell(1));
	}
	public String VPWord() throws EncryptedDocumentException, IOException {
		FileInputStream fio=new FileInputStream("./Data/FounditData.xlsx");
		Workbook wb=WorkbookFactory.create(fio);
		return wb.getSheet("Sheet1").getRow(6).getCell(1).toString();
	}
	public String IVPWord() throws EncryptedDocumentException, IOException {
		FileInputStream fio=new FileInputStream("./Data/FounditData.xlsx");
		Workbook wb=WorkbookFactory.create(fio);
		return wb.getSheet("Sheet1").getRow(7).getCell(1).toString();
	}
	@BeforeMethod
	public void OTB() throws EncryptedDocumentException, IOException {
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		POM=new PageObjectModel(driver);
		a = new Actions(driver);
		driver.get(VUrl());
	}	
	@AfterMethod
	public void CTB() {
		driver.quit();
	}
}