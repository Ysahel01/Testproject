//Assignment 4:  Print the following pattern
//    1
//   212
//  32123
// 4321234
//543212345

package NareshAssignement;
public class A4_pattern {

	public static void main(String[] args) {
		
		int n=5;

	//static void pattern(int n) {
        for (int row = 1; row <= n; row++) {
		
        	for(int space=0;space<n-row;space++) {
           System.out.println(" ");
        }
        for (int col = row; col >=1 ; col--) {
        	System.out.println(col+"");
        }
        
        for(int col=2;col<=row;col++) {
        	System.out.println(col+"");
        }
        System.out.println();
		}
		}
	}

