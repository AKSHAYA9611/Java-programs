import java.util.Scanner;
public class Conversion0To5 {
	static int convert0to5rec(int num)
	{
		if(num==0)
			return 0;
		int digit=num%10;
		if(digit==0)
			digit=5;
		return convert0to5rec(num/10)*10+digit; 
			
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int num=sc.nextInt();
		System.out.println(convert0to5rec(num));
	}
}
