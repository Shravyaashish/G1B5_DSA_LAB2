package com.greatelearning.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class DriverClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter total number of currency notes in our country");
		int size=sc.nextInt();
		System.out.println("Enter the denomination");
		int currency[]=new int[size];
		for(int i=0;i<size;i++)
		currency[i]=sc.nextInt();
		System.out.println("Before sorting" + Arrays.toString(currency));
	
		Mergesort ms=new Mergesort ();
		ms.sort(currency,0,size-1);
		System.out.println("After sorting" + Arrays.toString(currency));
		
		System.out.println("Enter Total amount");
		int amount=sc.nextInt();
		
         NoteCount nc=new  NoteCount();
         nc.counting(currency,amount);
	}

	
	

}
