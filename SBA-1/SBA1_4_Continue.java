package com.ust.test;
import java.util.Scanner;
public class SBA1_4_Continue {
		
		public static void main(String[] args) 
		{
			int Size, i, EvenSum = 0;
			Scanner sc=new Scanner(System.in);
		 
			System.out.print(" Enter sie of array: ");
			Size = sc.nextInt();	
			
			int [] a = new int[Size];
			
			System.out.print(" Enter elements of an Array : ");
			for (i = 0; i < Size; i++)
			{
				a[i] = sc.nextInt();
			}   
			sc.close();
			for(i = 0; i < Size; i++)
			{
				if(a[i] % 2 == 0)
				{
					EvenSum = EvenSum + a[i]; 
				}
				else {
					continue;
				}
			}		
			
			System.out.println("\n The Sum of Even Numbers in this Array = " + EvenSum);
			
		}
		
	}


