import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		int i, j, k, N, c=0;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();
		for(i=1; i<=N-2; i++) {
			for(j=1; j<=N-2; j++) {
				for(k=1; k<=N-2; k++) {
					if(i%3!=0 && j%3!=0 && k%3!=0 && (i+j+k)==N) {
					System.out.print(i+" "+j+ " "+k);
					System.out.println();
				}
			}
		}
	}
	}}
