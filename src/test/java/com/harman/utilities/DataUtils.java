package com.harman.utilities;

import org.testng.annotations.DataProvider;

public class DataUtils {


	@DataProvider
	public String[][] invalidCredentialData(){
		String[][] main = new String[2][3];
		main[0][0]="john";
		main[0][1]="john123";
		main[0][2]="Invalid credentials";
		
		main[1][0]="peter";
		main[1][1]="peter123";
		main[1][2]="Invalid credentials";
		
		return main;
		
	}
}
