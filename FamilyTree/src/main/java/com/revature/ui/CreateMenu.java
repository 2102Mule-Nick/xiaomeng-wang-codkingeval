package com.revature.ui;

import java.util.Scanner;

import org.apache.log4j.Logger;

import com.revature.pojo.User;
import com.revature.service.UserService;

public class CreateMenu implements Menu{
	
	private Scanner scan;
	private Menu nextMenu;
	private Menu mainMenu;
	
	private UserService userService;

	public Menu advance() {
		// TODO Auto-generated method stub
		return null;
	}

	public void displayOptions() {
		User user = new User();
		
		System.out.println("Please enter a new username:");
		user.setUsername(scan.nextLine());
		System.out.println("Please enter father's name:");
		user.setFathername(scan.nextLine());
		System.out.println("Please enter mother's name:");
		user.setMothername(scan.nextLine());
		
		userService.createUser(user);
		
		nextMenu = null;
		System.out.println("create success!");
	}

	public Menu previousMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	public Scanner getScanner() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setScanner(Scanner scan) {
		// TODO Auto-generated method stub
		
	}

	public CreateMenu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreateMenu(Menu mainMenu) {
		super();
		this.mainMenu = mainMenu;
	}
	

}
