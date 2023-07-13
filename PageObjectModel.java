package Framework_FoundIt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectModel {
	
	public PageObjectModel(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@href='/'])[2]")
	WebElement FoundItHomePage;
	
	@FindBy(xpath = "(//span[.='For Employers'])[2]")
	WebElement ForEmployers;
	
	@FindBy(xpath = "(//a[@class='main-nav-link employer-link'])[2]")
	WebElement ForEmployersList;
	
	@FindBy(xpath="(//a[.='Connect with Us'])[2]")
	WebElement ConnectWithUs;
	
	@FindBy(xpath="(//a[.='Buy Online'])[2]")
	WebElement BuyOnline;
	
	@FindBy(xpath="(//a[.='Employer Login'])[2]")
	WebElement EmployerLogin;

	@FindBy(xpath="//h3[@class='linkToRegister']")
	WebElement NewText;
	
	@FindBy(xpath="//a[.='Register']")
	WebElement RegisterLink;
	 
	@FindBy(xpath="//span[.='LinkedIn']")
	WebElement LinkedInLogin;

	@FindBy(xpath = "//span[.='Google']")
	WebElement GoogleLogin;
	
	@FindBy(xpath = "//span[.='Facebook']")
	WebElement FacebookLogin;
	
	@FindBy(xpath = "//input[@id='signInName']")
	WebElement EmailTextBox;
	
	@FindBy(xpath="//label[@class='inputLabel']")
	WebElement EmailIdLabel;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement PasswordTextBox;

	@FindBy(xpath = "//label[@class='inputLabel mt10']")
	WebElement PasswordLabel;
	
	@FindBy(xpath = "//div[@id='child']")
	WebElement EyeIcon;
	
	@FindBy(xpath = "//div[@class='forgotpassword']")
	WebElement ForgotPasswordBox;
	
	@FindBy(xpath = "//input[@id='signInbtn']")
	WebElement LoginButton;
	
	@FindBy(xpath = "//input[@id='signInbtn']")
	WebElement LoginWithOTP;
	
	@FindBy(xpath = "//p[@class='mobileAppText']")
	WebElement MobileText;
	
	@FindBy(xpath = "(//a[@href='https://play.google.com/store/apps/details?id=com.monsterindia.seeker.views&referrer=utm_source%3DWebsite%26utm_campaign%3DJobs-App'])[1]")
	WebElement AndroidLink;
	
	@FindBy(xpath = "(//a[@href='https://apps.apple.com/in/app/monster-jobs/id525775161'])[1]")
	WebElement AppleLink;
	
	@FindBy(xpath = "//span[@class='no-holder']")
	WebElement TollNumber;
	
	@FindBy(xpath = "//a[.='info@foundit.in']")
	WebElement EmailContact;
	
	@FindBy(xpath = "//a[@title='Follow us on Instagram']")
	WebElement InstagramFollow;
	
	@FindBy(xpath = "//a[@title='Follow us on LinkedIn']")
	WebElement LinkedInFollow;

	@FindBy(xpath = "//a[@title='Follow us on Twitter']")
	WebElement TwitterFollow;

	@FindBy(xpath = "//a[@title='Follow us on Facebook ']")
	WebElement FacebookFollow;
	
	@FindBy(xpath = "//div[@class='col-lg-12 col-md-12 col-xs-12 copy fs-14']")
	WebElement LastText;
	
	@FindBy(xpath = "(//div[@class='fieldError'])[1]")
	WebElement FieldErrorText;
	
	@FindBy(xpath = "//select[@class='country-switch-footer hidden-md']")
	WebElement CountryList;
	
	@FindBy(xpath = "//p[@class='leftText']")
	WebElement AboutText;
	
}
