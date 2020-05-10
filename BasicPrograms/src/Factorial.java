import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	 System.out.println("Factorial  Program \nEnter Num :");
	 int num=sc.nextInt();
	 System.out.println("Factorial :"+fact(num));

	}
	
	public static int fact(int num) {
		int fact=1;
		for(int i=num;i>1;i--) {
			fact=fact*i;
		}
		return fact;
	}

}
