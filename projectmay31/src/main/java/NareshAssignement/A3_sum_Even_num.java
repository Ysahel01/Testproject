 //Assignment 3:   Java SE code that reads a set of integers, 
//and then prints the sum of the even and odd integers separately
 


package NareshAssignement;


import java.util.Scanner;

public class A3_sum_Even_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i,n,sum=0;
       System.out.println("Entre range:" );
       Scanner scanner=new Scanner (System.in);
       n=scanner.nextInt();
       if (n%2==0)
       {
		for(i=0;i<=n;i++) 
		{
			sum=sum+i;	
	}
		System.out.println("Sum of even number is:"+sum);
	}
	
	}
}