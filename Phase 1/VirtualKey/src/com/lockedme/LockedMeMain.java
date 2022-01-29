package com.lockedme;

public class LockedMeMain {
	public static void main(String[] args) {
		FileOperations.createMainFolderIfNotPresent("main");
		MenuOptions.printWelcomeScreen("locked Me","Chandana Patil");
		HandleOptions.handleWelcomeScreenInput();
	}

}
