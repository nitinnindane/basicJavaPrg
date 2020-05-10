import java.util.Scanner;

public class SumOfNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Sum of N Natural Number\nEnter No of terms:");
		int count=sc.nextInt();
		int i=0,sum=0;
		for(;i<count;i++) {
			sum=sum+i;
		}
		System.out.println("Sum :"+sum);

	}

}
