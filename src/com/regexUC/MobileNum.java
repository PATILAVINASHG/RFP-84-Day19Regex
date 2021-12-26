package com.regexUC;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNum {

	public static void main(String[] args) {
		System.out.println("Enter the PhoneNumber");
		Scanner scanName = new Scanner(System.in);
		String phoneNum= scanName.nextLine();

		String resultPattern = "^[0-9]{0,2}\s[0-9]{10}$";
		Pattern regex = Pattern.compile(resultPattern);
		Matcher inputMatcher = regex.matcher(phoneNum);

		if  (inputMatcher.matches()) {
			System.out.println("Valid Number : " + phoneNum);
		}else {
			System.out.println(	"Error: Invalid Phone number, please try again");
	}
	}
}
