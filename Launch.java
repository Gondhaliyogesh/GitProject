package com.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch {

	public static void main(String[] args) 
	{

		WebDriver obj=new FirefoxDriver();
		obj.get("https://mail.rediff.com/cgi-bin/login.cgi");
		obj.findElement(By.name("proceed")).click();
		
		Alert al=obj.switchTo().alert();
		String str1=al.getText();
		System.out.println(str1);
		
		al.accept();
		
		System.out.println(obj.findElement(By.name("proceed")).isDisplayed());
		System.out.println(obj.findElement(By.name("proceed")).isEnabled());
		System.out.println(obj.findElement(By.name("proceed")).getAttribute("type"));
		System.out.println(obj.findElement(By.name("proceed")).getAttribute("name"));
		System.out.println(obj.findElement(By.name("proceed")).getAttribute("value"));
		
		
		
		
		
		//String str =obj.findElement(By.xpath(".//*[@id='globalContainer']/div[3]/div/div/div")).getText();
		//System.out.println(str);
		
		
		
		
		
	}

}
