package com.revature;

import java.util.Scanner;

import com.revature.dao.UserDao;
import com.revature.dao.UserDaoPostgres;
import com.revature.service.UserService;
import com.revature.service.UserServiceImpl;
import com.revature.ui.CreateMenu;
import com.revature.ui.MainMenu;
import com.revature.ui.Menu;

public class Driver {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		UserDao userDao = new UserDaoPostgres();
		UserService userService = new UserServiceImpl(userDao);
		
		CreateMenu createMenu = new CreateMenu();
		Menu mainMenu = new MainMenu(createMenu);
		mainMenu.setScanner(scan);
		
		Menu nextMenu = mainMenu;
		
		do {
			nextMenu.displayOptions();
			
			nextMenu = nextMenu.advance();
			
		} while (nextMenu != null);
		
		
	}
}
