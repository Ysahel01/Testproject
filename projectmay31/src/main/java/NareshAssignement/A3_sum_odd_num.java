package NareshAssignement;

import java.util.Scanner;

public class A3_sum_odd_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int i,n,sum=0;
     Scanner c=new Scanner(System.in);
     System.out.println("Entre range");
     n=c.nextInt();
     if (n%2!=0) {
		for(i=0;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("sum of odd numbers is:"+sum);
	}
	}

}
