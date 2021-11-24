package com.ust.test;
import java.util.Scanner;

public class SBA1_2_PositiveNum {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter size of the array: ");
    
    int n = scan.nextInt();
    int numbers[] = new int[n];
    System.out.println("Enter array elements: ");
    
    for (int i = 0; i < n; ++i) {
      numbers[i] = scan.nextInt();
    }
    
    int sum = positiveSum(numbers);
    System.out.println("Sum of positive numbers = " + sum);
    scan.close();
  }
  public static int positiveSum(int[] numbers) {
    int sum = 0;
    for (int i : numbers) {
      if(i >= 0) sum += i;
    }
    return sum;
  }
}
