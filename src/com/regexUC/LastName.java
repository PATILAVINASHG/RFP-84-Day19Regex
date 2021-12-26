package com.regexUC;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastName {

	public static void main(String[] args) {
		System.out.println("Enter the LastName");
	Scanner scanName = new Scanner(System.in);
	String lastName = scanName.nextLine();
	String resultPattern = "^[A-Z]{1}[a-z]{2,9}$";
	Pattern regex = Pattern.compile(resultPattern);
	Matcher inputMatcher = regex.matcher(lastName);


	if (inputMatcher.matches()) {
		
		System.out.println("Valid name : " + lastName);
	}else {
		System.out.println("invalid  name : " + lastName);	
	}
	}

}
