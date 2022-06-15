package com.classboxes;

import java.util.Scanner;

public class bankAccount {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 char exitOption;
		 
		 Scanner scanner=new Scanner(System.in);
		do {
       
        System.out.println("Welcome to ABC banking");
        System.out.println("1-creat an account");
        System.out.println("2-Credit");
        System.out.println("3-Debit");
        System.out.println("4-Transfer Amount");
        System.out.println("5-Mini Statement");
        System.out.println("Entre your option");
        int num=scanner.nextInt();
        switch (num) {
		case 1:
			 System.out.println("Create Account");
			 
			break;
		case 2:
			 System.out.println("Amount is debited");
			 
			break;	
		case 3:
			 System.out.println("Amount is Credited");
			 
			break;
		case 4:
			 System.out.println("Amount is Transferted ");
			 
			break;
		case 5:
			 System.out.println("Mini Statement");
			 
			break;

		default:
			System.out.println("Invalid number");
		 break;
        }
    	System.out.println("Do You Want to Continue (Y/N)");
		exitOption=scanner.next().charAt(0);
	  }while(exitOption=='Y');	
	       scanner.close();
	      System.out.println("Thank You.. Please visit again ");	
}
	
}
