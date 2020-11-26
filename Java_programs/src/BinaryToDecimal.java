import java.util.Scanner;
public class BinaryToDecimal {
	public static int btod(int n)
	{
		int num=n;
		int base=1,res=0;
		int temp=num;
		int rem;
		while(temp>0)
		{
			rem=temp%10;
			temp=temp/10;
			res+=rem*base;
			base=base*2;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=btod(n);
		System.out.println(t);

	}

}