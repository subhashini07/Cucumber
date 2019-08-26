package com.demo.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class RegisterDetails {
	WebDriver driver;

@Given("user is in demo site")
public void user_is_in_demo_site() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SureshG\\subhaworkspace\\CumDemo\\Dri\\chromedriver.exe");
  driver=new ChromeDriver();
  driver.get("http://demo.automationtesting.in/Register.html");
}

@When("User enters the {string},{string},{string},{string},{string},{string},{string} and then click and submit")
public void user_enters_the_and_then_click_and_submit(String firstName, String lastName, String address, String emailAddress, String phone , String  passWord, String confirmPassword) {
	WebElement fnm=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	fnm.sendKeys(firstName);
	WebElement lsnm=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	lsnm.sendKeys(lastName);
	WebElement add=driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
	add.sendKeys(address);
   WebElement mail=driver.findElement(By.xpath("//input[@type='email']"));
   mail.sendKeys(emailAddress);
   WebElement phono=driver.findElement(By.xpath("//input[@ng-model='Phone']"));
   phono.sendKeys(phone);
   WebElement gen=driver.findElement(By.xpath("//input[@value='FeMale']"));
      gen.click();
   WebElement hobb=driver.findElement(By.id("checkbox2"));
   hobb.click();
   WebElement lang=driver.findElement(By.id("msdd"));
   lang.click();
   WebElement lang1=driver.findElement(By.xpath("//a[text()='English']"));
   lang1.click();
   WebElement lang2=driver.findElement(By.xpath("//label[text()='Languages']"));
   lang2.click();
   WebElement sls=driver.findElement(By.id("Skills"));
   Select s=new Select(sls);
   s.selectByVisibleText("Adobe Photoshop");
   WebElement cntry=driver.findElement(By.id("countries"));
   s=new Select(cntry);
   s.selectByVisibleText("The Bahamas");
   WebElement sltcntry=driver.findElement(By.id("country"));
   s=new Select(sltcntry);
   WebElement yr=driver.findElement(By.id("yearbox"));
   s=new Select(yr);
   s.selectByVisibleText("1984");
   WebElement mnth=driver.findElement(By.xpath("//select[@ng-model='monthbox']"));
   s=new Select(mnth);
   s.selectByVisibleText("August");
   WebElement day=driver.findElement(By.id("daybox"));
   s=new Select(day);
   s.selectByVisibleText("5");
   WebElement psd=driver.findElement(By.id("firstpassword"));
   psd.sendKeys(passWord);
   WebElement cnfrmpsd=driver.findElement(By.id("secondpassword"));
   cnfrmpsd.sendKeys(confirmPassword);
   WebElement sub=driver.findElement(By.id("submitbtn"));
   sub.click();
   
    
}

@Then("verify Url contains WebTable")
public void verify_Url_contains_WebTable() {
	//WebElement lstnum=driver.findElement(By.xpath("//span[text()='Last Name']"));
	//lstnum.click();
    String txt=driver.getTitle();
    System.out.println(txt);
    String url=driver.getCurrentUrl();
    System.out.println(url);
    boolean b= url.contains("Register");
    Assert.assertTrue(b);
    System.out.println(b);
}

}
