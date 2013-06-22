package com.albert.algorithm.sort;

import java.util.Arrays;

/**
 * 简单选择排序法
 * 
 * @author Albert
 * @see http://baike.baidu.com/view/1575807.htm
 */
public class SelectSort {

  public static void main(String[] args) {
    int[] array = {6, 5, 3, 9, 0, 2, 7, 6, 4, 12, 11};
    sort(array);
  }
  /**
   * 简单选择排序
   * 
   * @param array
   */
  public static void sort(int[] array) {
    printArray(array);
    int index = 0;
    int tmp = array[0];
    int j;
    for (int i = 0; i < array.length - 1; i++) {
      index = 0;
      tmp = array[0];
      for (j = 1; j < array.length - i; j++) {
        if(tmp < array[j]) {
          index = j;
          tmp = array[j];
        }
      }
      j--;
      array[index] = array[j];
      array[j] = tmp;
      printArray(array);
    }
  }
  
  private static void printArray(int[] array) {
    System.out.print(Arrays.toString(array));
    System.out.println();
  }
}
