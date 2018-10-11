import java.util.Scanner;

public class FiboRecurr {
public static int fibo(int n) {
	if(n==1 || n==2) 
		return 1;
	else
		return fibo(n-1)+fibo(n-2);
}

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	
	for(int i=1; i<=num; i++) {
	System.out.print(fibo(i)+" ");
	}
}
}
