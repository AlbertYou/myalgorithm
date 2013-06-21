package com.albert.algorithm.sort;

import java.util.Arrays;

/**
 * 桶排序法(基数排序法)
 * 
 * @author Albert
 * @see http://baike.baidu.com/view/1784217.htm  http://baike.baidu.com/view/1170573.htm
 */
public class BucketSort {

	public static void main(String[] args) {
		int[] array = { 54, 58, 64, 58, 55 };
		sort(array);
	}

	/**
	 * 升序排列
	 * 
	 * @param array
	 */
	public static void sort(int[] array) {
		printArray(array);
		int n = array.length;
		int bask[][] = new int[10][n];
		int index[] = new int[10];
		int max = Integer.MIN_VALUE; //array中最高位数
		for (int i = 0; i < n; i++) { //求array中的最高位数
			max = max > (Integer.toString(array[i]).length()) ? max : (Integer
					.toString(array[i]).length());
		}
		String str;
		for (int i = max - 1; i >= 0; i--) {//从个位开始依次遍历个位、十位、百位...
			for (int j = 0; j < n; j++) { //把array中的数字前面补0直到和最高位的那个数字有相同的位数
				str = "";
				if (Integer.toString(array[j]).length() < max) {
					for (int k = 0; k < max
							- Integer.toString(array[j]).length(); k++)
						str += "0";
				}
				str += Integer.toString(array[j]);
				bask[str.charAt(i) - '0'][index[str.charAt(i) - '0']++] = array[j];//把array中的元素按某一位数（如个位）存放到bask中
			}
			
			int pos = 0;
			for (int j = 0; j < 10; j++) {//把按某一位数（如个位）存放的bask中的元素依次存入array中
				for (int k = 0; k < index[j]; k++) {
					array[pos++] = bask[j][k];
				}
			}
			for (int x = 0; x < 10; x++) {
				index[x] = 0;
			}
		}
		printArray(array);
	}

	private static void printArray(int[] array) {
		System.out.print(Arrays.toString(array));
		System.out.println();
	}

}
