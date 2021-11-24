package com.ust.test;

import java.util.Scanner;

public class SBA2_2_StringMethods {
	public static void main(String args[]){  
		int n = 0;
		switch(n) {
		case 1:
			
		}
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		str=sc.nextLine();
		System.out.println("contains method:-");
		 if(str.contains("hello world")) {  
	            System.out.println("The string contains hello world ");  
	        }
		 else  
	            System.out.println("The string does not contains hello world"); 
		 System.out.println("length method:-");
		 if(str.length()>0) {  
	            System.out.println("String is not empty and length is: "+str.length());  
	        }   
	        if(str.length()==0) {  
	            System.out.println("String is empty "+str.length());  
	        }   
	        System.out.println("replace method:-");
	        System.out.println("Before replace:"+str);
	        String replaceString=str.replace("hello","hi");
	        System.out.println("after replace:"+replaceString);
	        System.out.println("concat method:-");
	        System.out.println("string 1:"+str);
	        String str1;
	        Scanner sc1=new Scanner(System.in);
			System.out.println("Enter a string");
			str1=sc1.nextLine();
	        System.out.println("String 2:"+str1);
	        str=str.concat(str1);    
	        System.out.println("after concat:"+str); 
	        System.out.println("equal method:-");
	        String str2;
	        Scanner sc2=new Scanner(System.in);
			System.out.println("Enter a string");
			str2=sc.nextLine();
	        if (str.equals(str2)) {  
	            System.out.println("both strings are equal");  
	        }else System.out.println("both strings are unequal");  
		sc.close();
		sc1.close();
		sc2.close();
	}

}
