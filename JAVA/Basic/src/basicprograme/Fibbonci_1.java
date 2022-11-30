package basicprograme;
import java.util.Scanner;

public class Fibbonci_1 {
	static long a=0, b=1,sum=0;
	
	public static void fibo(long count) {
		if(count>0) {
			sum=a+b;
			a=b;
			b=sum;
			System.out.print(" "+sum);
			fibo(count-1);
		}
		
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter a number:");
		long count=scn.nextLong();
		System.out.print(0+" "+1);
		count=count-2;
		fibo(count);
		scn.close();
	}

}
