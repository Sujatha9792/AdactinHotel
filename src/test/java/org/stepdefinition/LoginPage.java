package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	
	WebDriver driver;
	//Select select = new Select(null);
	Select select;
	
	@Given("User is on the Adactin page")
	public void user_is_on_the_Adactin_page() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();

	}

	@When("User should enter {string} and {string}")
	public void user_should_enter_and(String name, String password) {
		
		WebElement txtUserName = driver.findElement(By.id("username"));
		txtUserName.sendKeys(name);
		WebElement txtPassword = driver.findElement(By.id("password"));
	    txtPassword.sendKeys(password);


	}

	@When("User should click login button")
	public void user_should_click_login_button() {
		
		WebElement btnLogin = driver.findElement(By.id("login"));
	    btnLogin.click();
		
	}

	@When("User should search hotel enter {string}, {string}, {string}, {string}, {string}, {string}, {string}, and {string},")
	public void user_should_search_hotel_enter_and(String location, String hotels, String roomType, String noOfRooms, String checkInDate, String checkOutDate, String adultsPerRoom, String childrenPerRoom) {
	    
		WebElement dDnLocation = driver.findElement(By.id("location"));
	    select = new Select(dDnLocation);
	    select.selectByVisibleText(location);
	    
	    
	    WebElement dDnHotels = driver.findElement(By.id("hotels"));
	    select = new Select(dDnHotels);
	    select.selectByVisibleText(hotels);
	    
	    WebElement dDnRoomType = driver.findElement(By.id("room_type"));
	    select = new Select(dDnRoomType);
	    select.selectByVisibleText(roomType);
	    
	    WebElement dDnnoOfRooms = driver.findElement(By.id("room_nos"));
	    select = new Select(dDnnoOfRooms);
	    select.selectByVisibleText(noOfRooms);
	    
	    WebElement CheckInDate = driver.findElement(By.id("datepick_in"));
	    CheckInDate.clear();
        CheckInDate.sendKeys(checkInDate);
	    
	    WebElement CheckOutDate = driver.findElement(By.id("datepick_out"));
	    CheckOutDate.clear();
        CheckOutDate.sendKeys(checkOutDate);
	    
	    WebElement dDnAdultsPerRoom = driver.findElement(By.id("adult_room"));
	    select = new Select(dDnAdultsPerRoom);
	    select.selectByVisibleText(adultsPerRoom);
	    
	    WebElement dDnChildPerRoom = driver.findElement(By.id("child_room"));
	    select = new Select(dDnChildPerRoom);
	    select.selectByVisibleText(childrenPerRoom);
	    
	    WebElement btnSearch = driver.findElement(By.id("Submit"));
	    btnSearch.click();

	}

	@When("User should select hotel clickRadioButton and ClickContinue")
	public void user_should_select_hotel_clickRadioButton_and_ClickContinue() {
		
		WebElement btnRadio = driver.findElement(By.id("radiobutton_0"));
		btnRadio.click();
		WebElement btnContinue = driver.findElement(By.id("continue"));
		btnContinue.click();
	   
	}

	@When("User should book a hotel enter {string}, {string}, {string}, {string}, {string}, {string}, {string} and {string}")
	public void user_should_book_a_hotel_enter_and(String firstName, String lastName, String billingAddress, String creditCardNo, String creditCardType, String expMonth, String expyear, String cvvNo) throws InterruptedException {
	    
		WebElement txtFirstName = driver.findElement(By.id("first_name"));
	    txtFirstName.sendKeys(firstName);
	    
	    WebElement txtLastName = driver.findElement(By.id("last_name"));
	    txtLastName.sendKeys(lastName);
	    
	    WebElement txtAddress = driver.findElement(By.id("address"));
	    txtAddress.sendKeys(billingAddress);
	    
	    WebElement txtCardNo = driver.findElement(By.id("cc_num"));
	    txtCardNo.sendKeys(creditCardNo);
	    
	    WebElement dDnCardType = driver.findElement(By.id("cc_type"));
	    select = new Select(dDnCardType);
	    select.selectByVisibleText(creditCardType);
	    
	    
	    WebElement dDnExpMonth = driver.findElement(By.id("cc_exp_month"));
	    select = new Select(dDnExpMonth);
	    select.selectByVisibleText(expMonth);
	    
	    WebElement dDnExpYear = driver.findElement(By.id("cc_exp_year"));
	    select = new Select(dDnExpYear);
	    select.selectByVisibleText(expyear);
	    
	    WebElement dDnCvv = driver.findElement(By.id("cc_cvv"));
	    dDnCvv.sendKeys(cvvNo);
	    
	    WebElement btnBookNow = driver.findElement(By.id("book_now"));
	    btnBookNow.click();
	    Thread.sleep(5000);
	    

	}

	@When("User should get orderId")
	public void user_should_get_orderId() throws InterruptedException {
		
		WebElement txtOrder = driver.findElement(By.id("order_no"));
		String orderID = txtOrder.getAttribute("value");
		System.out.println("txtOrder"+orderID);
		Thread.sleep(5000);
		driver.close();
	}
	    
	}




