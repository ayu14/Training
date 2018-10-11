import java.util.Scanner;

public class Mesh {

	public static void main(String[] args) {
		int m, n;
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		int[][] matrix = new int[m][n];
		direction(matrix, 0, 0);

	}

	private static void direction(int[][] a, int i, int j) {

		if (a[i][j] == 1) {
			++j;
			direction(a, i, j);
		} else if (a[i][j] == 2) {
			++i;
			direction(a, i, j);
		} else if (a[i][j] == 3) {
			if (a[i + 1][j] > a[i][j + 1]) {
				++i;
				direction(a, i, j);
			} else if (a[i][j + 1] > a[i + 1][j]) {
				++j;
				direction(a, i, j);
			} else {
				int x = 0, y = 0;
				x = i + 1;
				y = j + 1;
				direction(a, x, j);
				direction(a, i, y);
			}

		}

	}
}
