package com.yoga_class;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Omnify_Yoga_Class  {
	
	static WebDriver driver;
	static Actions a;
	static Select dropdown;
	
	public static void setproperty() {                                   
		//setproperty is used to launch the browser;
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kanna\\eclipse-workspace\\Omnify\\cdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();                      
		//Used to maximize the window;
	}
	
	public static void launchurl(){									 
		//This method is use to open the webpage;
		driver.get("WWW.Omnify.com");
	}
	//==============================Admin functionality=========================================================
	public static void Adminlogin() {										 
		//This method is use to check the admin is able to login the page using correct username and password.
		WebElement adminlogin = driver.findElement(By.id("admin_login"));
		adminlogin.click();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Admin123");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("123@");
		driver.findElement(By.id("login")).click();
		
	}
	
	public static void createclass() {
		//Used to create the new class
		WebElement createclass = driver.findElement(By.id("createclass"));
		createclass.click();		
	}
	
	public static void title() throws AWTException {
		Actions a = new Actions (driver);						  
		//Action is used to access the mouse action of the webpage
		WebElement title = driver.findElement(By.name("title"));
		a.click(title).build().perform();
		Robot r = new Robot();									  
		//Robot is used to access the keyboard action of the webpage
		r.keyPress(KeyEvent.VK_Y);
		r.keyRelease(KeyEvent.VK_Y);
		r.keyPress(KeyEvent.VK_O);
		r.keyRelease(KeyEvent.VK_O);
		r.keyPress(KeyEvent.VK_G);
		r.keyRelease(KeyEvent.VK_G);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		r.keyPress(KeyEvent.VK_L);
		r.keyRelease(KeyEvent.VK_L);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_S);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_S);
	}
	
		public static void description() {
		//Used to write the description
		WebElement description = driver.findElement(By.id("Description"));
		description.sendKeys("This class incorporates yoga postures, gentle movement sequences, breath work,"
				+"supported silent meditation, and guided relaxation to support increased awareness and "
				+"mindfulness of the breath and body, and quieting of the nervous system.");
		}
		public static void colourchange() {
		//Used to change the colour
		WebElement colourchange = driver.findElement(By.id("change colour"));
		Select dropdown = new Select(colourchange);
		dropdown.deselectByVisibleText("blue");
		}
		
		public static void addimage() throws InterruptedException {   
		//Used to add the image in the page
		WebElement image = driver.findElement(By.id("image"));
		image.click();
		Thread.sleep(10000);
		//used for wait purpose
		WebElement select = driver.findElement(By.name("select"));
		select.click();
		}
		
		public static void classdetails() {
		//This method used to fill the classdetails
		driver.findElement(By.id("location"));
		dropdown.selectByVisibleText("online");
		
		driver.findElement(By.xpath("//div[@class='trainer']"));
		dropdown.deselectByVisibleText("Kannan R");
		
		WebElement servicetype = driver.findElement(By.partialLinkText("serv"));
		a.click(servicetype).build().perform();
		WebElement paid = driver.findElement(By.id("paid"));
		a.click(paid).build().perform();
		}
		
		public static void class_schedule() {
		//This method is used to fill the clas schedule
		WebElement no_of_days_week = driver.findElement(By.partialLinkText("day"));
		no_of_days_week.sendKeys("5");
			
		WebElement startdate = driver.findElement(By.linkText("start_date"));
		startdate.clear();
		startdate.sendKeys("29/03/2023");
			
		WebElement starttime = driver.findElement(By.linkText("start_time"));
		starttime.clear();
		starttime.sendKeys("6:00 AM");
			
		WebElement enddate = driver.findElement(By.partialLinkText("end"));
		enddate.clear();
		enddate.sendKeys("29/04/2023");
			
		WebElement endtime = driver.findElement(By.linkText("end_time"));
		endtime.clear();
		endtime.sendKeys("9:00 PM");
		}
		
		public static void booking_window() {
		//this is used to mention booking window details
		driver.findElement(By.partialLinkText("booking"));
		dropdown.selectByVisibleText("The booking window opens before no. of days");
			
		WebElement save = driver.findElement(By.id("save"));
		save.click();
		}
		
		public static void edit() {
		WebElement edit = driver.findElement(By.id("edit"));
		edit.click();
		driver.findElement(By.id("save")).click();
		}
		public static void delete() throws InterruptedException {
			WebElement delete = driver.findElement(By.id("delete"));
			delete.click();
			driver.findElement(By.id("delete")).click();
			
			Thread.sleep(5000);
			driver.close();
			//To close the window
		}
		//============User functionality============================================
		public static void userlogin() {
			WebElement userlogin = driver.findElement(By.partialLinkText("login"));
			userlogin.click();
			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys("kannan123");
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("12345678");
			driver.findElement(By.id("name")).click();
		}

		public static void searchcontent() {
			WebElement search_content = driver.findElement(By.partialLinkText("search"));
			search_content.sendKeys("Yoga class with Omnify");
		}
		public static void Pay_now() {
			driver.findElement(By.id("booknow")).click();
			WebElement name = driver.findElement(By.id("Name"));
			name.sendKeys("Kannan");
			WebElement email = driver.findElement(By.id("Email"));
			email.sendKeys("kannan222@gmail.com");
			WebElement phone_no = driver.findElement(By.id("number"));
			phone_no.sendKeys("9080701216");
			WebElement payment = driver.findElement(By.id("upi"));
			payment.sendKeys("kannan23@upi");
			driver.findElement(By.id("pay_now")).click();
		}
		//============Runner Method========================================================
		public static void main(String[] args) throws InterruptedException, AWTException {
			//=======Admin Functionality=========
			setproperty();
			launchurl();
			Adminlogin();
			createclass();
			title();
			description();
			colourchange();
			addimage();
			classdetails();
			class_schedule();
			//edit();
			//delete();
			//=======user functionality==========
			setproperty();
			launchurl();
			userlogin();
			searchcontent();
			Pay_now();
			
		}
	
}
