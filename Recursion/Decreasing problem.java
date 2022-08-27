/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Decreasing problem
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size");
		int n=sc.nextInt();
		System.out.println("printing in decreasing order");
		dec(n);
	}
	static void dec(int n){
	    if(n==0){
	        return ;
	    }
	    System.out.print(n + " ");
	    dec(n-1);
	   // System.out.print(n + " "); for increasing
	}
}
