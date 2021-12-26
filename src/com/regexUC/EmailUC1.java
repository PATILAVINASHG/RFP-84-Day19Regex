package com.regexUC;


	import java.util.Scanner;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class EmailUC1 {

		public static void main(String[] args) {

			String emailPattern = "[a-zA-Z] * 0-9_.]+@[a-zA-Z0-9]+.[a-zA-Z]{2,3}[.] {0,1}[a-zA-Z]+";
			Pattern emailRegex = Pattern.compile(emailPattern);

			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the Email: ");
			String inputStr = sc.nextLine();
					sc.close();
			if ( emailPattern.matches(inputStr)) {
				
				System.out.println(inputStr + " is valid ");
			} else {
				System.out.println(inputStr + " is invalid pin code.");
			}

		}
}
