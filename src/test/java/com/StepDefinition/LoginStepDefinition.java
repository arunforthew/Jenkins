package com.StepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDefinition {
	WebDriver driver;
	
	@Given("the user navigates to the login page")
	public void the_user_navigates_to_the_login_page() {
		driver = new ChromeDriver();
driver.get("http://192.168.1.3:8080/register/");
driver.manage().window().maximize();

	}
	
	@When("the user enters {string} and {string} and {string} and {string}")
	public void the_user_enters_and_and_and(String string, String string2, String string3, String string4) {
		driver.findElement(By.id("username")).sendKeys("Arun");
		driver.findElement(By.id("email")).sendKeys("arunforthew@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Ihatexbox99");
		driver.findElement(By.id("confirmPassword")).sendKeys("Ihatexbox99");
		
		
	}
	@When("clicks the login button")
	public void clicks_the_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}
	@When("clicks the ok button")
	public void clicks_the_ok_button() {
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}
	

	@Then("the user should verify {string}")
	public void the_user_should_verify(String string) {
		System.out.println("Login suxxces");
		Assert.assertEquals("Registration Successful", string);
		
		

	}


}
