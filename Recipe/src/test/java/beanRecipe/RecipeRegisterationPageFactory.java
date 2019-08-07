package beanRecipe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecipeRegisterationPageFactory {
	WebDriver driver;
	
	// Identifying elements
		@FindBy(name="fname")
		@CacheLookup
		WebElement firstName;

		@FindBy(name="lname")
		@CacheLookup
		WebElement lastName;
		
		@FindBy(name="email")
		@CacheLookup
		WebElement email;
		
		@FindBy(name="mobile")
		@CacheLookup
		WebElement mobile;
		
		@FindBy(name="D6")
		@CacheLookup
		WebElement category;
		
		@FindBy(name="D5")
		@CacheLookup
		WebElement city;
		
		@FindBy(name="D4")
		@CacheLookup
		WebElement mode;
		
		@FindBy(name="D3")
		@CacheLookup
		WebElement course;
		
		@FindBy(name="enqdetails")
		@CacheLookup
		WebElement enquiry;
		
		@FindBy(id="Submit1")
		@CacheLookup
		WebElement submitButton;
		
		@FindBy(id="navg")
		@CacheLookup
		WebElement navigatation;
		
		//initiating Elements
		public RecipeRegisterationPageFactory(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		public WebDriver getDriver() {
			return driver;
		}

		public void setDriver(WebDriver driver) {
			this.driver = driver;
		}

		public WebElement getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName.sendKeys(firstName);
		}

		public WebElement getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName.sendKeys(lastName);
		}

		public WebElement getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email.sendKeys(email);
		}

		public WebElement getMobile() {
			return mobile;
		}

		public void setMobile(String mobile) {
			this.mobile.sendKeys(mobile);
		}

		public WebElement getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category.sendKeys(category);
		}

		public WebElement getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city.sendKeys(city);
		}

		public WebElement getMode() {
			return mode;
		}

		public void setMode(String mode) {
			this.mode.sendKeys(mode);
		}

		public WebElement getCourse() {
			return course;
		}

		public void setCourse(String course) {
			this.course.sendKeys(course);
		}

		public WebElement getEnquiry() {
			return enquiry;
		}

		public void setEnquiry(String enquiry) {
			this.enquiry.sendKeys(enquiry);
		}

		public WebElement getSubmitButton() {
			return submitButton;
		}

		public void setSubmitButton() {
			this.submitButton.submit();
		}

		public WebElement getNavigatation() {
			return navigatation;
		}

		public void setNavigatation() {
			this.navigatation.click();
		}
		
		
		
}