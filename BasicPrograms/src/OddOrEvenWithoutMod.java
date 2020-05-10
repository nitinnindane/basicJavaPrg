import java.util.Scanner;

public class OddOrEvenWithoutMod {

	public static void main(String[] args) {
		//there are two other method to find even or odd integer without using modulus
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Find Even Or Odd");
		int num=sc.nextInt();
		if((num&1)==1) {
			System.out.println("Odd");
		}else {
			System.out.println("Even");
		}

	}

}
