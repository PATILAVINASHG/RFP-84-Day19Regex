package com.regexUC;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PredefinedPassWard {

	public static void main(String[] args) {
		System.out.println("set the passWord  ");
		Scanner scanName = new Scanner(System.in);
		String passWordNum= scanName.nextLine();

		String resultPattern = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";

		Pattern regex = Pattern.compile(resultPattern);
		Matcher inputMatcher = regex.matcher(passWordNum);

		if  (inputMatcher.matches()) {
			System.out.println("Valid PassWord N : " + passWordNum);
		}else {
			System.out.println(	"Error: Invalid PassWord please one Upper case and one numeric number and one Special character, please try again");
	}
	}

}
