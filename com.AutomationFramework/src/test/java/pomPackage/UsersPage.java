package pomPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	
	//Declaration
	@FindBy(xpath="//input[@value='Create New User']") private WebElement createNewUserButton;
	@FindBy(name="username") private WebElement usernameTB;
	@FindBy(name="password") private WebElement passwordTB;
	@FindBy(name="passwordTextRetype") private WebElement retypePasswordTB;
	@FindBy(name="firstName") private WebElement firstNameTB;
	@FindBy(name="lastName") private WebElement lastNameTB;
	@FindBy(id="right12") private WebElement modifyTimeTrackCheckBox;
	@FindBy(id="right2") private WebElement manageCustomerAndProjectsCheckbox;
	@FindBy(id="right1") private WebElement generateReportsCheckbox;
	@FindBy(id="right5") private WebElement manageUsersCheckbox;
	@FindBy(id="right7") private WebElement manageBillingTypeCheckbox;
	@FindBy(xpath="//input[@type='submit']") private WebElement createUserButton;
	@FindBy(xpath="//input[contains(@value,' Cancel')]") private WebElement canselButton;
	
	public UsersPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getCreateNewUserButton() {
		return createNewUserButton;
	}

	public WebElement getUsernameTB() {
		return usernameTB;
	}

	public WebElement getPasswordTB() {
		return passwordTB;
	}

	public WebElement getRetypePasswordTB() {
		return retypePasswordTB;
	}

	public WebElement getFirstNameTB() {
		return firstNameTB;
	}

	public WebElement getLastNameTB() {
		return lastNameTB;
	}

	public WebElement getModifyTimeTrackCheckBox() {
		return modifyTimeTrackCheckBox;
	}

	public WebElement getManageCustomerAndProjectsCheckbox() {
		return manageCustomerAndProjectsCheckbox;
	}

	public WebElement getGenerateReportsCheckbox() {
		return generateReportsCheckbox;
	}

	public WebElement getManageUsersCheckbox() {
		return manageUsersCheckbox;
	}

	public WebElement getManageBillingTypeCheckbox() {
		return manageBillingTypeCheckbox;
	}

	public WebElement getCreateUserButton() {
		return createUserButton;
	}

	public WebElement getCanselButton() {
		return canselButton;
	}
	
	public void createNewUserMethod(String usn,String pwd,String fname,String lname) throws InterruptedException
	{
		Thread.sleep(2000);
		usernameTB.sendKeys(usn);
		passwordTB.sendKeys(pwd);
		retypePasswordTB.sendKeys(pwd);
		firstNameTB.sendKeys(fname);
		lastNameTB.sendKeys(lname);
		modifyTimeTrackCheckBox.click();
		manageBillingTypeCheckbox.click();
		generateReportsCheckbox.click();
		manageUsersCheckbox.click();;
		manageBillingTypeCheckbox.click();
		createUserButton.click();
	}
	
	}

