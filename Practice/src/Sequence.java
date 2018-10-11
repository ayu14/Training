import java.util.Scanner;

public class Sequence {
	public static void main(String[] args) {
	int n, i;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	
	for(i=1; i<=n; i++) {
		if(i*(i+1)>=(2*n))
			break;
	}
	System.out.print(i);
	}

}
