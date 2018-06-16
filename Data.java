package Arrange;

/*
 * Data.java		ver_2
 * Created by SEUNG WON JOENG 2018-06-13
 * Copyright © 2018 SEUNG WON JOENG. All rights reserved.
 * 
 */


public class Data {
	
	String EMAIL;
	String NAME;
	
	//CONSTRUCTOR
	public Data(String EMAIL, String NAME) {
		this.EMAIL = finalizedEmail(EMAIL);
		String garbageName = finalizedName(NAME);
		this.NAME = checkingName(garbageName);
	}
	
	public String finalizedEmail(String EMAIL) {
		
		String F_EMAIL = "";
		
		for(int i = 0; i < EMAIL.length(); i++) {
			if(EMAIL.charAt(i) != '"') F_EMAIL += EMAIL.charAt(i);
		}
		
		if(F_EMAIL.charAt(0) == '/') F_EMAIL = "IN MY CONTACT";
		
		return F_EMAIL;
	}
	
	public String finalizedName(String NAME) {
		
		String F_NAME = "";
		
		for(int i = 0; i < NAME.length(); i++) {
			if(NAME.charAt(i) != '"') F_NAME += NAME.charAt(i);
		}
		
		return F_NAME;
	}
	
	//Checking if there is @ in name
	public String checkingName(String NAME) {
		
		String reName = "";
		for(int i = 0; i < NAME.length(); i++) {
			if(NAME.charAt(i) == '@') break;
			reName += NAME.charAt(i);
		}
		return reName;
	}
	
	//HELPER METHOD
	public String getEmail() {
		return this.EMAIL;
	}
	public String getName() {
		return this.NAME;
	}
}
