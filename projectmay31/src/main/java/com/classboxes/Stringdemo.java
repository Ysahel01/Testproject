package com.classboxes;

import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char letter='d';
		char letters[]= {'h','e','l','l','o'};
		
				
		
		//String : A group of characters (Alpha Numberics) enclosed in double quotes
		String message=new String("Hello Welcome to String");  //1st of way of String object
		
	
		
				String message1="Hello Welcome to String";  //2nd way: String Literal Pool (SCP)=SCP
				String message2="Hello Welcome to String";  //2nd way: String Literal Pool (SCP)
				
				
				System.out.println(message1.hashCode()); //hashCode() return the address/reference of the object
				System.out.println(message2.hashCode());
				System.out.println(message1==message2);  //true. in SCP approach if the contents of both the Strings are same, it will not create a new object   
				
				System.out.println(message==message1);  //false. ==operator checks for both content matching and reference matching
				
				System.out.println(message.equals(message1)); //true   equals() checks for the content matching
				
				StringBuffer sBuffer=new StringBuffer("Hello this is String buffer");  //mutable and thread safe
				sBuffer.append("bye");   //mutable=conttent can be modified
				System.out.println(sBuffer); 
				//All the methods of String Buffer are synchronized(no two obects/threads can access these methods at a time)  
			
				StringTokenizer sTokenizer=new StringTokenizer(sBuilder.toString());  //It splits the given String into token(String)  
				while(sTokenizer.hasMoreTokens()) {  //hasMoreTokens checks the next token availability 
					System.out.println(sTokenizer.nextToken());
				}
				

		 
				
				
				StringJoiner joiner=new StringJoiner("-","{","}");  //joins the strings with delimeter, prefix and suffix
				joiner.add("hi");  //introduced in java8
				joiner.add("hello");
				joiner.add("String Joiner");
				joiner.add("bye");
				System.out.println(joiner);
				
				
				System.out.println("*****non-repeating char****");
				//printing non-repeating characters of a string
				String message = joiner.toString();  //StringJoiner into String
				System.out.println(message);
				char[] charArray = message.toCharArray();  //string to char array
				for (char character : charArray) {  //for-each to extract the characters from charArray 
					if(message.indexOf(character)==message.lastIndexOf(character)) {
						System.out.println(character);
					}
				}
				

	
		//System.out.println(message.charAt(0));
		//System.out.println(message.concat("group of chars"));
		//System.out.println(message.substring(2,10)); //
		//System.out.println(message.trim());
		//System.out.println(message.toUpperCase());
		//System.out.println(message);   //String is immutable (the content of String object can not be modified)
		
		char msg[]=message.toCharArray();
		String splittedArray[]=message.split(",");
		for (String string : splittedArray) {
			System.out.println(string);
		}
		
		System.out.println(message.contains("toasdsa"));
		
		System.out.println("lenght of the String:"+message.length());
	  
	}
		 synchronized String sayHello(String name) {  // thread safe=synchronized
				return "Hello from"+name;
	}
	

}
