package Framework_FoundIt;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestCases extends Base {
	
	
	/*
	 * 
	 * TS_01
	 * 
	 */
	
	
	public void TC_001() throws EncryptedDocumentException, IOException {
		assertEquals(driver.getCurrentUrl(), VUrl());
	}
	@Test
	public void TC_002() throws EncryptedDocumentException, IOException {
		driver.navigate().refresh();
		assertEquals(driver.getCurrentUrl(), VUrl());
	}
	@Test
	public void TC_003() throws EncryptedDocumentException, IOException {
		driver.navigate().back();
		driver.navigate().forward();
		assertEquals(driver.getCurrentUrl(), VUrl());
	}
	 
	
	/*
	 * 
	 * TS_02
	 * 
	 */
	
	
	@Test
	public void TC_004() {
		assertEquals(driver.getTitle(), title );
	}
	@Test
	public void TC_005() throws EncryptedDocumentException, IOException {
		driver.navigate().refresh();
		assertEquals(driver.getTitle(), title);
	}
	@Test
	public void TC_006() {
		driver.navigate().back();
		driver.navigate().forward();
		assertEquals(driver.getTitle(), title);
	}
	
	/*
	 * 
	 * TS_04
	 * 
	 */
	
	@Test
	public void TC_007() {
		POM.LinkedInLogin.click();
		Set<String> list =driver.getWindowHandles();
		for (String a : list) {
			driver.switchTo().window(a);
		}
		assertEquals(driver.getTitle(), LLTitle);
	}
	public void TC_008() {
		POM.LinkedInLogin.click();
		Set<String> list =driver.getWindowHandles();
		for (String a : list) {
			driver.switchTo().window(a);
		}
		driver.navigate().refresh();
		assertEquals(driver.getTitle(), LLTitle);
	}
	@Test
	public void TC_009() throws InterruptedException {
		POM.GoogleLogin.click();
		Set<String> list =driver.getWindowHandles();
		for (String a : list) {
			driver.switchTo().window(a);
		}
		Thread.sleep(2000);
		assertEquals(driver.getTitle(),GTitle);
	}
	@Test
	public void TC_010() throws InterruptedException {
		POM.GoogleLogin.click();
		Set<String> list =driver.getWindowHandles();
		for (String a : list) {
			driver.switchTo().window(a);
		}
		assertEquals(driver.getTitle(),GTitle);
	}	
	@Test
	public void TC_011() {
		POM.FacebookLogin.click();
		Set<String> list =driver.getWindowHandles();
		for (String a : list) {
			driver.switchTo().window(a);
		}
		assertEquals(driver.getTitle(), FBTitle);
	}
	@Test
	public void TC_012() {
		POM.FacebookLogin.click();
		Set<String> list =driver.getWindowHandles();
		for (String a : list) {
			driver.switchTo().window(a);
		}
		driver.navigate().refresh();
		assertEquals(driver.getTitle(), FBTitle);
	}
	
	
	/*
	 * 
	 * TS_06
	 * 
	 */
	
	
	@Test
	public void TC_013() {
		String text = POM.TollNumber.getText();
		Reporter.log(text,true);
	}
	@Test
	public void TC_014() {
		String text = POM.EmailContact.getText();
		Reporter.log(text,true);
	}
	@Test
	public void TC_015() throws InterruptedException {
		POM.InstagramFollow.click();
		Set<String> tabs = driver.getWindowHandles();
		for(String a : tabs) {
			driver.switchTo().window(a);
			Thread.sleep(2000);
		}

		assertEquals(driver.getTitle(),InstagramFollowTitle);
	}
	@Test
	public void TC_016() {
		POM.LinkedInFollow.click();
		Set<String> tabs = driver.getWindowHandles();
		for(String a : tabs) {
			driver.switchTo().window(a);
		}
		LinkedInFollowTitle=driver.getTitle();
		assertEquals(driver.getTitle(),LinkedInFollowTitle);
	}
	@Test
	public void TC_017() throws InterruptedException {
		POM.TwitterFollow.click();
		Set<String> tabs = driver.getWindowHandles();
		for(String a : tabs) {
			driver.switchTo().window(a);
		}
		Thread.sleep(2000);
		String Actualtitle = driver.getTitle();
		assertEquals(Actualtitle,TwitterFollowTitle);
	}
	@Test
	public void TC_018() throws InterruptedException {
		POM.FacebookFollow.click();
		Set<String> tabs = driver.getWindowHandles();
		for(String a : tabs) {
			driver.switchTo().window(a);
		}
		assertEquals(driver.getTitle(),FacebookTitle);
	}
	
	
	/*
	 * 
	 * TS_05
	 * 
	 */
	
	
	@Test
	public void TC_019() throws EncryptedDocumentException, IOException{
		POM.EmailTextBox.sendKeys(VUName());
		POM.PasswordTextBox.sendKeys(IVPWord());
		POM.LoginButton.click();
		assertNotEquals(driver.getTitle(), DashBoardTitle);
	}
	@Test
	public void TC_020() throws EncryptedDocumentException, IOException{
		POM.EmailTextBox.sendKeys(VUName());
		POM.PasswordTextBox.sendKeys("");
		POM.LoginButton.submit();
		assertNotEquals(driver.getTitle(), DashBoardTitle);
	}
	@Test
	public void TC_021() throws EncryptedDocumentException, IOException{
		POM.EmailTextBox.sendKeys(IVUName());
		POM.PasswordTextBox.sendKeys(VPWord());
		POM.LoginButton.submit();
		assertNotEquals(driver.getTitle(), DashBoardTitle);
	}
	@Test
	public void TC_022() throws EncryptedDocumentException, IOException {
		POM.EmailTextBox.sendKeys("");
		POM.PasswordTextBox.sendKeys(VPWord());
		POM.LoginButton.submit();
		assertNotEquals(driver.getTitle(), DashBoardTitle);
	}
	@Test
	public void TC_023() {
		POM.EmailTextBox.sendKeys("");
		POM.PasswordTextBox.sendKeys("");
		POM.LoginButton.submit();
		assertNotEquals(driver.getTitle(), DashBoardTitle);
	}
	@Test
	public void TC_024() throws EncryptedDocumentException, IOException {
		POM.EmailTextBox.sendKeys(IVUName());
		POM.PasswordTextBox.sendKeys("");
		POM.LoginButton.submit();
		assertNotEquals(driver.getTitle(), DashBoardTitle);
	}
	
	@Test 
	public void TC_025() throws EncryptedDocumentException, IOException, InterruptedException{
		POM.EmailTextBox.sendKeys(VUName());
		Thread.sleep(2000);
		POM.PasswordTextBox.sendKeys(VPWord());
		Thread.sleep(2000);
		POM.LoginButton.click();
		Thread.sleep(2000);
		assertEquals(driver.getTitle(), DashBoardTitle);
	}
	
	@Test
	public void TC_026() throws EncryptedDocumentException, IOException {
		POM.EmailTextBox.sendKeys(IVUName());
		POM.PasswordTextBox.sendKeys(IVPWord());
		POM.LoginButton.submit();
		assertNotEquals(driver.getTitle(), DashBoardTitle);
	}

	@Test
	public void TC_027() throws EncryptedDocumentException, IOException {
		POM.EmailTextBox.sendKeys(VPNo());
		POM.PasswordTextBox.sendKeys(IVPWord());
		POM.LoginButton.submit();
		assertNotEquals(driver.getTitle(), DashBoardTitle);
	}
	@Test
	public void TC_028() throws EncryptedDocumentException, IOException {
		POM.EmailTextBox.sendKeys(VPNo());
		POM.PasswordTextBox.sendKeys("");
		POM.LoginButton.submit();
		assertNotEquals(driver.getTitle(), DashBoardTitle);
	}
	@Test
	public void TC_029() throws EncryptedDocumentException, IOException {
		POM.EmailTextBox.sendKeys(IVPNo());
		POM.PasswordTextBox.sendKeys(VPWord());
		POM.LoginButton.submit();
		assertNotEquals(driver.getTitle(), DashBoardTitle);
	}
	@Test
	public void TC_030() throws EncryptedDocumentException, IOException {
		POM.EmailTextBox.sendKeys("");
		POM.PasswordTextBox.sendKeys(VPWord());
		POM.LoginButton.submit();
		assertNotEquals(driver.getTitle(), DashBoardTitle);
	}
	@Test
	public void TC_031() throws EncryptedDocumentException, IOException {
		POM.EmailTextBox.sendKeys("");
		POM.PasswordTextBox.sendKeys("");
		POM.LoginButton.submit();
		assertNotEquals(driver.getTitle(), DashBoardTitle);
	}
	@Test
	public void TC_032() throws EncryptedDocumentException, IOException {
		POM.EmailTextBox.sendKeys(IVPNo());
		POM.PasswordTextBox.sendKeys(IVPWord());
		POM.LoginButton.submit();
		assertNotEquals(driver.getTitle(), DashBoardTitle);
	}
	@Test
	public void TC_033() throws EncryptedDocumentException, IOException{
		POM.EmailTextBox.sendKeys(VPNo());
		POM.PasswordTextBox.sendKeys(VPWord());
		POM.LoginButton.click();
		assertNotEquals(driver.getTitle(), DashBoardTitle);
	}
	@Test
	public void TC_034() throws EncryptedDocumentException, IOException {
		POM.EmailTextBox.sendKeys(IVPNo());
		POM.PasswordTextBox.sendKeys("");
		POM.LoginButton.submit();
		assertNotEquals(driver.getTitle(), DashBoardTitle);
	}

	@Test 
	public void TC_035() throws EncryptedDocumentException, IOException, InterruptedException {
		POM.EmailTextBox.sendKeys(VUName());
		POM.PasswordTextBox.sendKeys(VPWord());
		Thread.sleep(2000);
		POM.LoginButton.click();
		Thread.sleep(2000);
		assertEquals(driver.getTitle(), DashBoardTitle);
	}
	
	@Test
	public void TC_036() {
		POM.LinkedInLogin.click();
		Set<String> tabs = driver.getWindowHandles();
		for(String a : tabs) {
			driver.switchTo().window(a);
		}
		assertEquals(driver.getTitle(),LinkedinLoginTitle);
	}
	@Test
	public void TC_037() throws InterruptedException {
		POM.GoogleLogin.click();
		Set<String> tabs = driver.getWindowHandles();
		for(String a : tabs) {
			driver.switchTo().window(a);
			Thread.sleep(2000);
			}
		String ActualTitle = driver.getTitle();
		assertEquals(ActualTitle,GoogleLogintitle);
	}
	@Test
	public void TC_038() throws InterruptedException {
		POM.FacebookLogin.click();
		Set<String> tabs = driver.getWindowHandles();
		for(String a : tabs) {
			driver.switchTo().window(a);
			Thread.sleep(2000);
		}
		assertEquals(driver.getTitle(),FacebookLoginTitle);
	}
	@Test
	public void TC_039() throws EncryptedDocumentException, IOException {
		POM.EmailTextBox.sendKeys(VUName());
		POM.ForgotPasswordBox.click();
		//assertEquals(POM.FieldErrorText.getText() , "");
	}
	@Test
	public void TC_040() throws EncryptedDocumentException, IOException{
		POM.EmailTextBox.sendKeys(VPNo());
		POM.ForgotPasswordBox.click();
		//assertEquals(POM.FieldErrorText.getText() , "");
	}
	@Test
	public void TC_041() throws EncryptedDocumentException, IOException{
		POM.EmailTextBox.sendKeys(IVUName());
		POM.ForgotPasswordBox.click();
		Reporter.log(POM.FieldErrorText.getText(),true);
	}
	@Test
	public void TC_042() throws EncryptedDocumentException, IOException {
		POM.EmailTextBox.sendKeys("");
		POM.PasswordTextBox.sendKeys(IVPWord());
		POM.LoginButton.submit();
		assertNotEquals(driver.getTitle(), DashBoardTitle);
	}
	@Test
	public void TC_043() throws EncryptedDocumentException, IOException {
		POM.EmailTextBox.sendKeys("");
		POM.PasswordTextBox.sendKeys(IVPWord());
		POM.LoginButton.submit();
		assertNotEquals(driver.getTitle(), DashBoardTitle);
	}
	
	
	/*
	 * 
	 * TS_03
	 * 
	 */
	
	
	@Test
	public void TC_044() {
		POM.FoundItHomePage.click();
		assertEquals(driver.getTitle(), HomeTitle);
	}
	@Test
	public void TC_045() {
		POM.ForEmployers.click();
		assertEquals(driver.getTitle(), ForEmployerTitle);
	}

	@Test
	public void TC_046() throws EncryptedDocumentException, IOException, InterruptedException {
		POM.PasswordTextBox.sendKeys(VPWord());
		POM.EyeIcon.click();
		Thread.sleep(2000);
		assertEquals(POM.EyeIcon.isEnabled(),true);
	}
	@Test
	public void TC_047() {
		a.moveToElement(POM.ForEmployersList).perform();
		POM.ConnectWithUs.click();
		assertEquals(driver.getTitle(), ForEmployerTitle);
	}
	@Test
	public void TC_048() {
		a.moveToElement(POM.ForEmployersList).perform();
		POM.BuyOnline.click();
		assertEquals(driver.getTitle(), BuyOnlineTitle);
	}
	@Test
	public void TC_049() {
		a.moveToElement(POM.ForEmployersList).perform();
		POM.EmployerLogin.click();
		assertEquals(driver.getTitle(), EmployerLoginTitle);
	}
	@Test
	public void TC_050() {
		boolean text = POM.NewText.isDisplayed();
		assertEquals(text, true);
	}
	@Test
	public void TC_051() {
		POM.RegisterLink.click();
		assertEquals(driver.getTitle(), RPTitle);
	}
	@Test
	public void TC_052() {
		boolean Text = POM.MobileText.isDisplayed();
		assertEquals(Text, true);
	}
	@Test
	public void TC_053() {
		POM.AndroidLink.click();
		Set<String> tabs = driver.getWindowHandles();
		for(String a : tabs) {
			driver.switchTo().window(a);
		}
		assertEquals(driver.getTitle(),Androidlink);
	}
	@Test
	public void TC_054() {
		POM.AppleLink.click();
		Set<String> tabs = driver.getWindowHandles();
		for(String a : tabs) {
			driver.switchTo().window(a);
		}
		assertEquals(driver.getTitle(),Applelink);	
	}
	@Test
	public void TC_055() {
		boolean test = POM.LastText.isDisplayed();
		assertEquals(test, true);
	}
	@Test
	public void TC_056() throws InterruptedException {
		POM.CountryList.click();
		Select s= new Select(POM.CountryList);
		List<WebElement> country = s.getOptions();
		for(WebElement a: country) {
			Reporter.log(a.getText(),true);
		}
	}
	@Test
	public void TC_057() {
		POM.CountryList.click();
		Select s= new Select(POM.CountryList);
		boolean Multiple = s.isMultiple();
		assertEquals(Multiple, true);
	}
	@Test
	public void TC_058() {
		boolean Text = POM.AboutText.isDisplayed();
		assertEquals(Text, true);
	}
}
