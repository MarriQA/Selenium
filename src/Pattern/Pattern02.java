package Pattern;
import java.util.Scanner;
public class Pattern02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println(" Enter the row no");
		int n= sc.nextInt();
		
		System.out.println("Enter the Column no");
		int m= sc.nextInt()	;
		
		for(int i=1; i<=n; i++) { 
		for(int j=1; j<=n; j++) {
			
			if(i==1 || j==1 || i==n ||j==n) {
		System.out.print("*");
		}else {
			System.out.print(" ");
		}}
		System.out.println();
	}}}
