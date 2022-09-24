
import java.util.Scanner;
public class Naturalnumber {

	public static void main(String[] args) {
		// TODO Auto-generated metche element");
		System.out.println("Enter the element");
		Scanner scan= new Scanner (System.in);
		int num= scan.nextInt();
				int sum=0;
		for(int i=1;i<=num;i++)
		{
			sum+=i;
		}
		System.out.println("sum of natural number"+num+ "is "+sum);
	
	}
}