
public class SwapNumbers {

	public static void main(String[] args) {
		int a=5,b=4;
		System.out.println("Value of a="+a+" b="+b);
		swap(a,b);
		System.out.println("After swap in main \nValue of a="+a+" b="+b);

	}
	/*So swap function cannot be used to swap two numbers 
	 * only one soluton is left that can be done i.e swap  directly
	 * in the main function 
	 * a=a+b; b=a-b;a=a-b;
	 * 
	 * we cannot use swap(int *s,int *b) in java because java don't have pointer
	 */
	public static void swap(int a,int b) {
		a=a+b;
	    b=a-b;
	    a=a-b;
	    System.out.println("From swap fn After Swap \n a="+a+" b="+b);
	}

}
