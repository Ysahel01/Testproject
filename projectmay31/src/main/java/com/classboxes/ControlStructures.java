package com.classboxes;

import java.util.Scanner;

public class ControlStructures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        //decision making/non-looping : if-else, switch  
				//looping structures : for, while, do-while, foreach(for)
				Scanner scanner=new Scanner(System.in);
				System.out.println("Please enter a number");
				int number=scanner.nextInt();
				//scanner.close();
				System.out.println("the number entered:"+number);
				
				if (number < 100) {  //the condition/expression should return boolean value
					if(number>50 & number<100) {
						System.out.println("the number is greater than 50 and lesser than 100");
					}else {
						System.out.println("the number is less than 50");
					}	
				} else if(number>100 & number <200){ 
					System.out.println("the number is greater than 100 and <200");
				}else {
					System.out.println("number is greather than 200");
				}
	
				//System.out referes to monitor/console. System.err is to display errors
				  //Scanner class is used to read data from keyboard(System.in)
				System.out.println("Please enter a number");
				int monthNumber=scanner.nextInt();
				//System.out.println("the number entered:"+monthNumber);
				scanner.close();
	
				//switch case accept: byte,short, character,
			switch (monthNumber) {
				case 1:
					System.out.println("January");
					break;
				case 2:
					System.out.println("Feb");
					break;
				case 3:
					System.out.println("March");
					break;
		
				default:
					System.out.println("Please check its not month number");
					break;
			}





	}


}
