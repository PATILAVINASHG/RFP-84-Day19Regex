package com.regexUC;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

	public static void main (String[] args) {
		System.out.println("Enter the  EmailId");
		Scanner scanName = new Scanner(System.in);
		String email = scanName.nextLine();

		String resultPattern = "^[a-z.]{2,30}@{1}[a-z]{3,10}.[a-z]{3}$";
		Pattern regex = Pattern.compile(resultPattern);
		Matcher inputMatcher = regex.matcher(email);

		if (inputMatcher.matches()) {
			System.out.println("valid EmailID, :" + email);
		}else {
			System.out.println("Invalid EmaiId please try again : " + email);
		}
	}
}
