import java.util.Scanner;
public class DecimalToBinary {
	  public static void DtoB(int decimal){    
		     int binary[] = new int[40];    
		     int i = 0;    
		     while(decimal > 0){    
		       binary[i++] = decimal%2;    
		       decimal = decimal/2;    
		     }    
		     for(int p = i-1;p >= 0;p--){    
		       System.out.print(binary[p]);    
		     }    
		System.out.println();  
		}    
	public static void main(String args[])
	{ 
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.print("Binary equivalent of "+num+" is ");
		DtoB(num);
	}

}
