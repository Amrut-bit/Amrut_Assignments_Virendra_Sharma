package core.program;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emailvalidation {

	public static void main(String[] args)
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter vaild email ");  
		 String str= sc.nextLine();   
		 System.out.print(Pattern.matches("[a-z0-9]+@[a-z]+\\.[a-z]{2,3}",str));

	}

}

