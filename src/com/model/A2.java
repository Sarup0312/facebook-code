package com.model;


		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.remote.server.handler.FindElement;
		import org.openqa.selenium.support.ui.Select;

		public class A2 
		{


			public static void main(String[] args) 
			{
				 System.setProperty("webdriver.chrome.driver","E:\\soft\\chrome_new\\chromedriver.exe");
					WebDriver driver=new ChromeDriver();
					driver.get("https://www.facebook.com");
					driver.manage().window().maximize();
					
				String url=driver.getCurrentUrl();
				System.out.println("Current url page is " +url);
				
				//Name Text box
				WebElement name=driver.findElement(By.name("firstname"));
				name.sendKeys("Rupali");
				String uname=name.getAttribute("value");
				System.out.println("First name is= " + uname);
			     String tt=name.getAttribute("title");
			     System.out.println(tt);
				
				//last name box
				WebElement lastnm=driver.findElement(By.id("u_0_o"));
				lastnm.sendKeys("Agale");
				String lnm=lastnm.getAttribute("value");
				System.out.println("The last name is=" +lnm);
				
				//get email and mobile no
				WebElement mail=driver.findElement(By.xpath("//input[@name='reg_email__']"));
				mail.sendKeys("rupalikhule92@rediffmail.com");
				
				String no=mail.getAttribute("value");
				System.out.println("The mailid is="+no);
				
				//Re enterd mail
				WebElement rmail=driver.findElement(By.name("reg_email_confirmation__"));
				rmail.sendKeys("rupalikhule92@rediffmail.com");
				String rmails=rmail.getAttribute("value");
				System.out.println("Reenterd mail is " +rmails);
				
				//password 
				WebElement pwd=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		        pwd.sendKeys("Rupali@12345");
		        String pwds=pwd.getAttribute("value");
		       System.out.println("password is " +pwds);
		       
		       //Birhday Label
		       WebElement bdy= driver.findElement(By.xpath("//div[@class='mtm mbs _2_68 _7-1r']"));
		       String bdlbel= bdy.getText();
		       System.out.println("The label is "+bdlbel);
		     
		        //birhday Date
		        WebElement obj=driver.findElement(By.id("day"));
		        Select sel=new Select(obj);
		        sel.selectByValue("16");
		        String date=obj.getAttribute("value");
		        System.out.println("enterd date is "+date);
		     
		        //bithday month
		        WebElement month= driver.findElement(By.id("month"));  
		        Select sel1=new Select(month);
		        sel1.selectByValue("12");
		        String obj1=month.getAttribute("value");
		        System.out.println("Entred month is "+obj1);
		    
		    //Bithday year
		    WebElement year=driver.findElement(By.id("year"));
		    Select sel2=new Select(year);
		    sel2.selectByValue("1993");
		    
		    //female radio button
		    driver.findElement(By.xpath("//input[@type='radio']")).click();
		    
		    //sign up button
		   //driver.findElement(By.xpath("//div[@class='clearfix']/child::*")).click();
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			driver.navigate().back();
			}
}



	


