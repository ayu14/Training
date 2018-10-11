import java.util.Scanner;

public class Xor {
	public static void main(String[] args) {
		int n, c1=0, c2=0;
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		n=num;
		
		while(n>0) {
			if(n%10==1)
				c1++;
			else
				c2++;
			n=n/10;
		
		}
		System.out.print(c1*c2);
	}
}
