package com.albert.algorithm.sort;

import java.util.Arrays;

/**
 * 鸽巢排序法
 * 
 * @author Albert
 * @see http://baike.baidu.com/view/2020276.htm
 */
public class PigeonholeSort {

  public static void main(String[] args) {
    int[] array = {6, 5, 3, 9, 0, 2, 7, 6, 4, 12, 11};
    sort(array);
  }
  /**
   * 升序排列
   * 
   * @param array
   */
  public static void sort(int[] array) {
    printArray(array);
    int max = 12;
    int index = 0;
    int[] count = new int[max + 1];
    for (int i = 0; i < array.length; i++) {
  	count[i]++;
	}
    for (int i = 0; i < count.length; i++) {
		for (int j = 0; j < count[i]; j++) {
			array[index++] = i;
		}
	}
    printArray(array);
  }
  
  private static void printArray(int[] array) {
    System.out.print(Arrays.toString(array));
    System.out.println();
  }
  
}
