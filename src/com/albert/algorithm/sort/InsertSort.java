package com.albert.algorithm.sort;

import java.util.Arrays;

/**
 * 插入排序法
 * 
 * @author Albert
 * @see http://baike.baidu.com/view/1443814.htm
 */
public class InsertSort {

  public static void main(String[] args) {
    int[] array = {6, 5, 3, 9, 0, 2, 7, 6, 4, 12, 11};
    sort(array);
  }
  /**
   * 升序
   * 
   * @param array
   */
  public static void sort(int[] array) {
    printArray(array);
    int tmp, index;
    for (int i = 0; i < array.length - 1; i++) {
      tmp = array[i + 1]; 
      for (index = i; index >= 0; index--) {
        if(array[index] > tmp) {
          array[index + 1] = array[index];
        } else {
          break;
        }
      }
      array[index + 1] = tmp;
      printArray(array);
    }
  }
  
  private static void printArray(int[] array) {
    System.out.print(Arrays.toString(array));
    System.out.println();
  }
  
}
