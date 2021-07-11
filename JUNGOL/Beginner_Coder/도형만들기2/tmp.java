package Beginner_Coder.도형만들기2;

import java.util.Scanner;

public class tmp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int len = n * 2 - 1;

		int arr[][] = new int[len][len];

		// null -> ' '세팅
		for (int r = 0; r < len; r++) {
			for (int c = 0; c < len; c++) {
				arr[r][c] = ' ';
			}
		}

		int f = n;
		int x = -1;
		int y = n;
		int num = 0;

		char alphabet = 'A';

		while (n > 0) {
			for (int i = 0; i < n; i++)	{

				arr[++x][--y] = alphabet++;				
				if (alphabet > 'Z') {
					alphabet = 'A';
				}

			}

			if (n == f)

			{

				f = -1;

				n--;

			}

			for (int i = 0; i < n; i++) {

				arr[++x][++y] = alphabet++;
				if (alphabet > 'Z') {
					alphabet = 'A';
				}
			}

			for (int i = 0; i < n; i++) {

				arr[--x][++y] = alphabet++;

				if (alphabet > 'Z') {
					alphabet = 'A';
				}

			}

			n--;

			for (int i = 0; i < n; i++)

			{

				arr[--x][--y] = alphabet++;

				if (alphabet > 'Z') {
					alphabet = 'A';
				}
			}

			arr[x][--y] = alphabet++;

			if (alphabet > 'Z') {
				alphabet = 'A';
			}

		}

		for (int i = 0; i < arr.length; i++)

		{

			for (int j = 0; j < arr.length; j++)

			{

				System.out.print((char) arr[i][j] + " ");

			}

			System.out.println();

		}

	}

}