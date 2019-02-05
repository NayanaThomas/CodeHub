package codeing;

import java.io.*;
import java.util.*;

public class FrequencyQueries {

	// Complete the solve function below.
	public int[] solve(int[][] queries) {
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> res = new ArrayList<Integer>();
		for (int[] query : queries) {
			int val = query[1];
			int op = query[0];
			if (op == 1) {
				list.add(val);
			}
			if (op == 2) {
				for (int i = 0; i < list.size(); i++) {
					if (val == list.get(i)) {
						list.remove(i);
					}
				}

			}
			if (op == 3) {
				hmap.clear();
				boolean flag = false;
				for (int num : list) {
					if (hmap.containsKey(num)) {
						hmap.put(num, hmap.get(num) + 1);
					} else {
						hmap.put(num, 1);
					}
				}
				if (hmap.containsValue(val)) {
					flag = true;
				}
				if (flag) {
					res.add(1);
				} else {
					res.add(0);
				}
			}
		}
		int[] resArr = new int[res.size()];
		int i = 0;
		for (int resVal : res) {
			resArr[i++] = resVal;
		}
		return resArr;
	}

	public static void main(String[] args) throws IOException {
		int[][] queries = { { 1, 3 }, { 1, 38 }, { 2, 1 }, { 1, 16 }, { 2, 1 }, { 2, 2 }, { 1, 64 }, { 1, 84 },
				{ 3, 1 }, { 1, 100 }, { 1, 10 }, { 2, 2 }, { 2, 1 }, { 1, 67 }, { 2, 2 }, { 3, 1 }, { 1, 99 },
				{ 1, 32 }, { 1, 58 }, { 3, 2 } };

		FrequencyQueries fq = new FrequencyQueries();
		int[] res = fq.solve(queries);
		for (int resVal : res) {
			System.out.println(resVal);
		}
	}

}
