import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=0,b=1,c;
		int total_count=sc.nextInt();
		System.out.print(a+" "+b);
		for(int i=2;i<total_count;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}

}
