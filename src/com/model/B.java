package com.model;


		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.remote.server.handler.FindElement;
		import org.openqa.selenium.support.ui.Select;

		public class B 
		{


			public static void main(String[] args) 
			{
				 System.setProperty("webdriver.chrome.driver","E:\\soft\\chrome_new\\chromedriver.exe");
					WebDriver driver=new ChromeDriver();
					driver.get("www.facebook.com");
					driver.manage().window().maximize();
					
			}
}



	


