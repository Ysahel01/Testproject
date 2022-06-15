package com.classboxes;

public class welcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Hello Guys to java ")	;
    //keywords = 50, lower case letters, int, double, new, class, try, throw  
    		//datatypes = type of the data + size of the data
    		//numerical(byte,short, int, long)+character(char)+floating point(float,double)+logical type(boolean)
    		byte num1=125; //1byte=8 bits  (-128 to +127)
    		
    		short num2=32767; //2bytes  (-32768 to 32767)
    		
    		int num3=120; //4 bytes, 2pow32, default numerical type
    		
    		long num4=450; //8 bytes, default value of numerical types is zero
    		
    		char num5=7869;  // 2bytes, holds a single character , default value is zero or empty space
    		System.out.println(num5);
    		
    		float salary=1234.789f;  // 4bytes, 7-8 decimals of accuracy, default value is zero
    		
    		double num6=434.323;  //8 bytes, 15-16 decimals of accuracy, default floating point type
    		
    		boolean status=true; // logical value representation which can hold only either true or false, default value is false 
    		
    		welcome wel=null;  //default value of object is null
    		String message="welcome to Java";
    		
      }

}
