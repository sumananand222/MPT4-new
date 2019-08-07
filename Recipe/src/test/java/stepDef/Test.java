package stepDef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import beanRecipe.RecipeRegisterationPageFactory;

public class Test {
	
	private WebDriver driver;
	private RecipeRegisterationPageFactory recipePageFactory;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\chromedriver_win32\\chromedriver.exe" );
		driver= new ChromeDriver();
	}
	
	@Given("^User is on '  Recipe Class Enquiry Form' Page$")
	public void user_is_on_Recipe_Class_Enquiry_Form_Page() throws Throwable {
	  // Write code here that turns the phrase above into concrete actions
	driver.get("D:\\Selenium Workspace\\Recipe\\Recipe_class_registration.html");
	recipePageFactory = new RecipeRegisterationPageFactory(driver);
	Thread.sleep(1000);
	}

	@When("^The page loads$")
	public void the_page_loads() throws Throwable {
	  // Write code here that turns the phrase above into concrete actions
	}

	@Then("^Title should be \"([^\"]*)\"$")
	public void title_should_be_(String arg1) throws Throwable {
	  // Write code here that turns the phrase above into concrete actions
		String actualTitle = driver.getTitle();
		String expectedTitle = "Online Cooking Class Enquiry Form";
		Assert.assertEquals(expectedTitle,actualTitle);
		driver.close();
	}
	
	@Then("^Check whether text \"(.*?)\" is present or not$")
	public void check_whether_text_is_present_or_not(String arg1) throws Throwable {
	  // Write code here that turns the phrase above into concrete actions	  
	  System.out.println(driver.getPageSource().contains("Online Cooking School"));
	  driver.close();
	}

	@When("^User clicks on hyperlink \"(.*?)\"$")
	public void user_clicks_on_hyperlink(String arg1) throws Throwable {
	  // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.linkText("Download our Recipe class Brochure")).click();
		 Thread.sleep(15000);
	}

	@Then("^New Window should appear with the msg page$")
	public void new_Window_should_appear_with_the_msg_page() throws Throwable {
	  // Write code here that turns the phrase above into concrete actions
		driver.get("D:\\BDD\\Recipe\\msg.html");
	}

	@Given("^User is on msg page$")
	public void user_is_on_msg_Page() throws Throwable {
	  // Write code here that turns the phrase above into concrete actions
		driver.get("D:\\Selenium Workspace\\Recipe\\msg.html");
		//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	recipePageFactory = new RecipeRegisterationPageFactory(driver);
	Thread.sleep(1000);
	}

	@When("^Message page opens$")
	public void message_page_opens() throws Throwable {
	  // Write code here that turns the phrase above into concrete actions
	}

	@Then("^Checks whether a text \"(.*?)\" is present or not$")
	public void checks_whether_a_text_is_present_or_not(String arg1) throws Throwable {
	  // Write code here that turns the phrase above into concrete actions
		System.out.println(driver.getPageSource().contains("Recipe class Brochure is sent to your registered mail id"));		 
	}

	@When("^User clicks on the link \"(.*?)\"$")
	public void user_clicks_on_the_link(String arg1) throws Throwable {
	  // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.linkText("Go Back to Registration")).click();
	}

	@Then("^' Recipe Class Enquiry Form' Page should come again$")
	public void recipe_Class_Enquiry_Form_Page_should_come_again() throws Throwable {
	  // Write code here that turns the phrase above into concrete actions
		driver.get("D:\\Selenium Workspace\\Recipe\\Recipe_class_registration.html");
		driver.close();
	}

	@When("^user enters invalid First Name$")
	public void user_enters_invalid_First_Name() throws Throwable {
	  // Write code here that turns the phrase above into concrete actions
	 recipePageFactory.setFirstName("");
	 recipePageFactory.setSubmitButton();
	}

	@Then("^display 'First Name must be filled out'$")
	public void display_First_Name_must_be_filled_out() throws Throwable {
	  // Write code here that turns the phrase above into concrete actions	
		String expectedMessage="First Name must be filled out";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();	
	}

	@When("^user enters invalid Last Name$")
	public void user_enters_invalid_Last_Name() throws Throwable {
	  // Write code here that turns the phrase above into concrete actions
		 recipePageFactory.setFirstName("Suman");
		 recipePageFactory.setLastName("");
		 recipePageFactory.setSubmitButton();
	}
	
	@Then("^display 'Last Name must be filled out'$")
	public void display_Last_Name_must_be_filled_out() throws Throwable {
	  // Write code here that turns the phrase above into concrete actions
		String expectedMessage="Last Name must be filled out";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();	
	}

	@When("^User enters characters in the mobile textbox$")
	public void user_enters_characters_in_the_mobile_textbox() throws Throwable {
	  // Write code here that turns the phrase above into concrete actions
		recipePageFactory.setFirstName("Suman");
		 recipePageFactory.setLastName("Anand");
		 recipePageFactory.setEmail("sumananand@mail.com");
		 recipePageFactory.setMobile("kdfgjkdslg");
		 recipePageFactory.setSubmitButton();
	}

	@Then("^Display message to 'Enter numeric value'$")
	public void display_message_to_Enter_numeric_value() throws Throwable {
	  // Write code here that turns the phrase above into concrete actions
		String expectedMessage="Enter numeric value";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();	
	}

	@When("^User enters invalid mobile$")
	public void user_enters_invalid_mobile() throws Throwable {
	  // Write code here that turns the phrase above into concrete actions
		recipePageFactory.setFirstName("Suman");
		 recipePageFactory.setLastName("Anand");
		 recipePageFactory.setEmail("sumananand@mail.com");
		 recipePageFactory.setMobile("987865");
		 recipePageFactory.setSubmitButton();
	}

	@Then("^Display message to 'Enter (\\d+) digit Mobile number'$")
	public void display_message_to_Enter_digit_Mobile_number(int arg1) throws Throwable {
	  // Write code here that turns the phrase above into concrete actions
		String expectedMessage="Enter 10 digit Mobile number";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();	
	}

	@When("^user enters invalid Enquiry Details$")
	public void user_enters_invalid_Enquiry_Details() throws Throwable {
	  // Write code here that turns the phrase above into concrete actions
		recipePageFactory.setFirstName("Suman");
		 recipePageFactory.setLastName("Anand");
		 recipePageFactory.setEmail("sumananand@mail.com");
		 recipePageFactory.setMobile("9878654532");
		 recipePageFactory.setCategory("Non-Veg");
		 recipePageFactory.setCity("Mumbai");
		 recipePageFactory.setMode("In house training");
		 recipePageFactory.setCourse("6 months");
		 recipePageFactory.setEnquiry("");
		 recipePageFactory.setSubmitButton();
	}

	@Then("^display 'Enquiry details must be filled out'$")
	public void display_Enquiry_details_must_be_filled_out() throws Throwable {
	  // Write code here that turns the phrase above into concrete actions
		String expectedMessage="Enquiry details must be filled out";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();		 
	}

	@When("^user enters all Valid Details$")
	public void user_enters_all_Valid_Details() throws Throwable {
	  // Write code here that turns the phrase above into concrete actions
		recipePageFactory.setFirstName("Suman");
		 recipePageFactory.setLastName("Anand");
		 recipePageFactory.setEmail("sumananand@mail.com");
		 recipePageFactory.setMobile("9878654532");
		 recipePageFactory.setCategory("Non-Veg");
		 recipePageFactory.setCity("Mumbai");
		 recipePageFactory.setMode("In house training");
		 recipePageFactory.setCourse("6 months");
		 recipePageFactory.setEnquiry("This is Enquiry Box");
		 recipePageFactory.setSubmitButton();
	}

	@Then("^display 'Thank you for submitting the online recipe class Enquiry'$")
	public void display_Thank_you_for_submitting_the_online_recipe_class_Enquiry() throws Throwable {
	  // Write code here that turns the phrase above into concrete actions
		String expectedMessage="Thank you for submitting the online recipe class Enquiry";
		String actualMessage=driver.switchTo().alert().getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		driver.switchTo().alert().accept();
		driver.close();	
	}

	@Then("^display text message 'Our location representative will contact you soon\\.'$")
	public void display_text_message_Our_location_representative_will_contact_you_soon() throws Throwable {
	  // Write code here that turns the phrase above into concrete actions
	  driver.close();
	}
}