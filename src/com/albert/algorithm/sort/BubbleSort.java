package com.albert.algorithm.sort;

import java.util.Arrays;

/**
 * 冒泡排序法 平均时间复杂度为O(n^2)  最好的时间复杂度为O(0)  稳定的
 * 
 * @author Albert
 *
 */
public class BubbleSort {

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
    int a = 0;
    for (int i = 0; i < array.length - 1; i++) {
      for (int j = 1; j < array.length - i; j++) {
        if(array[j - 1] > array[j]) {
          a = array[j - 1];
          array[j - 1] = array[j];
          array[j] = a;
        }
      }
      printArray(array);
    }
    printArray(array);
  }
  
  private static void printArray(int[] array) {
    System.out.print(Arrays.toString(array));
    System.out.println();
  }
  
}
