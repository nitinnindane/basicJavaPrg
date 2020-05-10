import java.util.Scanner;

public class PrintEvenNumInReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Print Even num /nEnter no to even terms :");
		int count=sc.nextInt();
		int i=2*count;
		while(i>=2) {
			System.out.println(i+" ");
			i-=2;
		}
	}

}
