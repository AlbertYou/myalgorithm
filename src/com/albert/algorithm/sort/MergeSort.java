package com.albert.algorithm.sort;

import java.util.Arrays;

/**
 * 归并排序 
 * 
 * @author Albert
 * 
 */
public class MergeSort {

  public static void main(String[] args) {
    int[] array = { 1, 5, 3, 9, 0, 2, 7, 6, 4, 12, 11 };
    cocktailSort(array);
  }

  /**
   * 升序排列
   *   
   * @param array
   */
  public static void cocktailSort(int[] array) {
    
  }

  private static void printArray(int[] array) {
    System.out.print(Arrays.toString(array));
    System.out.println();
  }

}
