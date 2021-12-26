package com.regexUC;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstName {
	public static void main(String[] args) {
		System.out.println("Enter the First Name");
	Scanner scanName = new Scanner(System.in);
	String firstName = scanName.nextLine();
	String resultPattern = "^[A-Z]{1}[a-z]{2,9}$";
	Pattern regex = Pattern.compile(resultPattern);
	Matcher inputMatcher = regex.matcher(firstName);


	if (inputMatcher.matches()) {
		
		System.out.println("Valid name : " + firstName);
	}else {
		System.out.println("invalid  name : " + firstName);	
	}
	}
}