package com.greatelearning.lab2;

import java.util.Scanner;

     public class TransactionTarget{
  public static void main(String[]args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter number of Transactions");
	  int size=sc.nextInt();
      int i;
	 int trans[]=new int[size];
	 for( i=0;i<size;i++)
	 {
		 System.out.println("Enter value of transaction");
		 trans[i]=sc.nextInt();
	  }
	      System.out.println("Enter the number of Targets");
	      int targets=sc.nextInt();
	      for( i=1;i<=targets;i++)
	      {
	      int sum=0 ;
	      int  flag =0;
	      System.out.println("Enter the number of Targets" +i);
	      int target=sc.nextInt();
	      for(int j=0;j<trans.length;j++)
	       {
		 sum+=trans[j];
		 if(sum>=target)
		 {
			 flag=1;
			 System.out.println("Target achieved on transaction number"+(j+1));
			 sum=sum-target;
			 System.out.println("After achieved balance is: "+sum);
			 j++;
			 break;
		 }
	  j++;
	       }
	      if(flag==0)
	      {
	    	  System.out.println("Sorry this target not achieved");
	      }
	      
	      
	       }
}
}