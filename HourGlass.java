package codeing;

import java.io.*;
import java.util.*;

public class HourGlass {

	// Complete the hourglassSum function below.
	static int hourglassSum(int[][] arr) {
		int k = 0, l = 0;
		int[][] matrix = new int[3][3];
		int[][] hourGlassSums = new int[4][4];
		while (k < 4) {
			l=0;
			while (l < 4) {
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						matrix[i][j] = arr[i + l][j + k];
					}
				}
				hourGlassSums[k][l] = calculateSum(matrix);
				l++;
			}
			k++;
		}
		int max = findMax(hourGlassSums);
		return max;
	}

	static int calculateSum(int[][] matrix) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (!((i == 1) && (j == 0 || j == 2))) {
					sum = sum + matrix[i][j];
				}
			}
		}
		return sum;
	}

	static int findMax(int[][] matrix) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (matrix[i][j] > max) {
					max = matrix[i][j];
				}
			}
		}
		return max;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int[][] arr = { { -1, 1, -1, 0, 0, 0 }, { 0, -1, 0, 0, 0, 0 }, { -1, -1, -1, 0, 0, 0 }, { 0, -9, 2, -4, -4, 0 },
				{ -7, 0, 0, -2, 0, 0 }, { 0, 0, -1, -2, -4, 0 } };
		
		

		int result = hourglassSum(arr);

		System.out.println(result+"");
	}
}