package com.revature.ui;

import java.util.Scanner;

public class MainMenu implements Menu {
	
	private Scanner scan;
	
	private Menu nextMenu;
	
	private Menu createMenu;
	
	private Menu updateMenu;
	
	private Menu deleteMenu;
	
	

	public Menu advance() {
		// TODO Auto-generated method stub
		return nextMenu;
	}

	public void displayOptions() {
		
		System.out.println("Welcome to FamilyTree");
		System.out.println("Would you like to create, update, or delete family member?");
		
		String answer = scan.nextLine();
		
		if ("create".equals(answer)) {
			nextMenu = createMenu;
		} else if ("update".equals(answer)) {
			nextMenu = updateMenu;
		} else if ("delete".equals(answer)) {
			nextMenu = deleteMenu;
		} else {
			System.out.println("invalid input");
			// redirect user to same welcome menu
			nextMenu = this;
		}
		
	}

	public Menu previousMenu() {
		// TODO Auto-generated method stub
		return null;
	}

	public Scanner getScanner() {
		return this.scan;
	}

	public void setScanner(Scanner scan) {
		this.scan = scan;
		
	}

	public MainMenu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MainMenu( Menu createMenu) {
		super();
		
		this.createMenu = createMenu;
		//this.updateMenu = updateMenu;
		//this.deleteMenu = deleteMenu;
	}
	
	

}
