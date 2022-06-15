 //Assignment 1:  JavaSE application to generate Electricity bill   (use if-else-if ladder)
//inputs are old reading and current reading and generate the bill by following  slabs/ranges: Scan the inputs using Scanner class
//0-50: Rs.1
//50-100: Rs2
//100-200: Rs.3
//200-400: Rs.4
//>400: Rs.5
//example if the number of units are 120 then the consumption charge is (50*1)+(50*2)+(20*3)=Rs.210 
 

package NareshAssignement;
import java.util.Scanner;

public class A1_UnitesBillElectriciti {

			String n;
			int units=120;
			double bill=0;
			
			
			public static void main(String[] args) {
				Scanner Scanner = new Scanner (System.in);
				System.out.println("Please enter the number of units");
				int units = Scanner.nextInt();
				System.out.println("The bill entered"+units);
			
				if(units<120) 
				{
					
				double bill = units*1.20;
				}
				else if(units<100);
				{
				double bill = 100*1.20+(units - 50)*2;
				}
				if(units>400);
				{
				double bill = 100*1.20+200*2+(units - 100)*3;
				}
			
				System.out.println("Bill to pay :" +units);
			}

		
	}


