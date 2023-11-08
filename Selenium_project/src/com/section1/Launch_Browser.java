package com.section1;

import org.openqa.selenium.Dimension;

import org.openqa.selenium.Point;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
//		driver.get("https://chdtransport.gov.in/hsrp?q=hsrp");
		driver.get("https://in.bookmyshow.com/explore/home/chandigarh");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getPageSource());
		driver.manage().window().maximize();
		
		Dimension dim = new Dimension(1000, 500);
		driver.manage().window().setSize(dim);
		Point pt = new Point(9,5);
		driver.manage().window().setPosition(pt);
		
//		driver.close();
		
		
//		int n;
//		System.out.println("Enter");
//		System.out.println("1. for Chrome");
//		System.out.println("2. for Firefox");
//		System.out.println("3. for Edge");
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt();
		// using if else
		
//		if(n == 1) {
//			ChromeDriver driver = new ChromeDriver();
//		}
//		else if(n == 2) {
//			FirefoxDriver driver = new FirefoxDriver();
//		}
//		else if(n == 3) {
//			EdgeDriver driver = new EdgeDriver();
//		}
//		else {
//			System.out.println("Invalid Output");
//		}
		
		//using switch
		
//		switch (n) {
//		case 1: ChromeDriver driver = new ChromeDriver();
//		break;
//		case 2: FirefoxDriver driver1 = new FirefoxDriver();
//		break;
//		case 3: EdgeDriver driver2 = new EdgeDriver();
//		break;
//		
//		default: System.out.println("Invalid Output");
//		break;
		
		}
	}



