package com.classboxes;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Array is a collection of similar typed data(homogenious). can also hold objects
		
				int empArray[]=new int[10];  // declaration, instantiation(object creation),  1st way of creating Array
				empArray[0]=104;  //inititalization
				empArray[1]=101;
				empArray[2]=105;
				empArray[3]=102;
				System.out.println(empArray[2]);  //105
				System.out.println(empArray[5]);  //0 
				System.out.println(empArray[9]);  // 
				
				
				//2nd way of creating an array object
				int data[]= {34,56,43,78,21,980,234};
				System.out.println(data[5]);
				
				System.out.println(data.length);  //length is the keyword to find the size of an array
				System.out.println(empArray.length);
				
				System.out.println("*****using for loop *****");
				for (int i = 0; i < data.length; i++) {  //extracting data from array object 
					System.out.print(data[i]+"\t");
				}
				for (int element : data) {   //foreach is enhancement of for loop specifically given to extract the data from collection objects 
					System.out.println(element);
				}
				
				for (int empId : empArray) {   //empId is a variable, empArray is an array object 
					//System.out.print(empId+"\t");
				}
				//2-D= an array of arrays
				int arr1[][]= {{341,562},{432,781,121},{980,234}};  //2-D
				//System.out.println(arr1[2][1]);  //
				
				for (int is[] : arr1) {  //for outer array
					for (int is2 : is) {  //for inner arrays
						System.out.print(is2+"\t");
					}
					System.out.println();
				}
				
	}

}
