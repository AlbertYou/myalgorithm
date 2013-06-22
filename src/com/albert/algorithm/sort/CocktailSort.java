package com.albert.algorithm.sort;

import java.util.Arrays;

/**
 * 鸡尾酒排序 双向的冒泡排序 — O(n^2） 稳定的
 * 
 * @author Albert
 * @see http://baike.baidu.com/view/1981861.htm
 */
public class CocktailSort {

  public static void main(String[] args) {
    int[] array = { 1, 5, 3, 9, 0, 2, 7, 6, 4, 12, 11 };
    cocktailSort(array);
  }

  /**
   * 升序排列
   *   数组中的数字本是无规律的排放，先找到最小的数字，把他放到第一位，然后找到最大的数字放到最后一位。
   *   然后再找到第二小的数字放到第二位，再找到第二大的数字放到倒数第二位。以此类推，直到完成排序。
   *   
   * @param array
   */
  public static void cocktailSort(int[] array) {
    printArray(array);
    int a = 0;
    for (int i = 0; i < array.length / 2; i++) {
      for (int m = 1; m < array.length - i; m++) {
        if (array[m - 1] > array[m]) {
          a = array[m - 1];
          array[m - 1] = array[m];
          array[m] = a;
        }
      }
      for (int n = array.length - i - 2; n > i; n--) {
        if (array[n - 1] > array[n]) {
          a = array[n - 1];
          array[n - 1] = array[n];
          array[n] = a;
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
