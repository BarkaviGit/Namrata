package org.stepdef;

import java.util.Scanner;

import org.helper.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class StepDefinitionfeature1 extends LibGlobal {
	double balance;
	@Before
	@Given("User Has to be in their Banking Account Page")
	public void user_Has_to_be_in_their_Banking_Account_Page() {
		driver.navigate().to("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		WebElement cus = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		cus.sendKeys("23457032");
		driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
		driver.findElement(By.xpath("//input[@id='fldPasswordDispId']")).sendKeys("Bark@123");
		driver.findElement(By.xpath("(//div[@class='inputfield ibvt loginData'])[3]")).click();
		System.out.println("Successfully logged in");
	}

	@When("User Account balance check and it has to be equal to or above Rupees {int}")
	public void user_Account_balance_check_and_it_has_to_be_equal_to_or_above_Rupees(Integer int1) {
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		Scanner scan = new Scanner(System.in);
		double balance = scan.nextDouble();
		if (balance <= 50) {
			System.out.println("Having amount to transfer Rs. 50 or more");
		} else {
			System.out.println("Cannot pay - insufficient funds");
		}
		System.out.println("Total balance: " + balance);
	}

	@When("User try to transfer of Rupees {double}")
	public void user_try_to_transfer_of_Rupees(Double int1) {
		double balance = 50.00;
		if (balance >= 50) {
			System.out.println("Your Balance is: " + balance);
			System.out.println("Having amount to transfer Rs. 50 or more");
		} else {
			System.out.println("Cannot pay - insufficient funds");
		}
		System.out.println("Total balance: " + balance);
	}

	@When("User try to transfer of Rs{double} and above")
	public void user_try_to_transfer_of_Rs_and_above(Double double1) {
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		Scanner scan = new Scanner(System.in);
		double balance = scan.nextDouble();
		if (balance <= 50) {
			System.out.println("Having amount to transfer Rs. 50 or more");
		} else {
			System.out.println("Cannot pay - insufficient funds");
		}
		System.out.println("Total balance: " + balance);
	
	driver.findElement(By.xpath("//a[text()='Logout']")).click();
}
@When("Fund transfer failed")
public void fund_transfer_failed() {
	
//Transfer of Rs.150 -Negative Scenario
	Scanner scan = new Scanner(System.in);
	double balance=scan.nextDouble();
	 if (balance>=100.01) {
		 System.out.println("Your Balance is: "+balance);
        System.out.println("Having amount to transfer Rs. 100 or more");
	 }
	 else {
	         System.out.println("Limit Up to Transfer of Rs.100");
	 }
     System.out.println("Total balance: " + balance); 
     driver.findElement(By.xpath("//a[text()='Logout']")).click(); 
} 

}