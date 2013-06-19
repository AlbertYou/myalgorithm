package com.albert.algorithm.sort;

import java.util.Arrays;

/**
 * 快速排序法
 * 
 * @author Albert
 * @see http://baike.baidu.com/view/19016.htm
 */
public class QuickSort {

  public static void main(String[] args) {
    int[] array = {6, 5, 3, 9, 0, 2, 7, 6, 4, 12, 11};
    printArray(array);
    sort(array, 0, array.length - 1);
    printArray(array);
  }
  /**
   * 升序
   * 
   * @param array
   */
  public static void sort(int[] array, int start, int end) {
    if(start >= end) {
      return;
    }
    int i = sortUtil(array, start, end);
    sort(array, start, i - 1);
    sort(array, i + 1, end);
  }
  private static int sortUtil(int[] array, int low, int high) {
    int key = array[low];
    while(low < high) {
      while(high > low && array[high] >= key) {
        high--;
      }
      array[low] = array[high];
      while(low < high && array[low] <= key) {
        low++;
      }
      array[high] = array[low];
      printArray(array);
    }
    array[high] = key;
    return high;
  }
  
  private static void printArray(int[] array) {
    System.out.print(Arrays.toString(array));
    System.out.println();
  }
  
}
