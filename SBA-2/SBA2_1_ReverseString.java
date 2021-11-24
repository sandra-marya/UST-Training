package com.ust.test;

import java.util.*;

public class SBA2_1_ReverseString {
	public static void main(String args[]) {
	String initial, rev=" ";
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string to reverse");
	initial=sc.nextLine();
	int length=initial.length();
	for(int i=length-1;i>=0;i--)
	  rev=rev+initial.charAt(i);
	System.out.println("Reversed string: "+rev);
	sc.close();
	}

}
