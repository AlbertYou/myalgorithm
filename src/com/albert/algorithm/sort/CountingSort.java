package com.albert.algorithm.sort;

import java.util.Arrays;

/**
 * 计数排序法
 * 
 * @author Albert
 * @see http://baike.baidu.com/view/1209480.htm
 */
public class CountingSort {

  public static void main(String[] args) {
    int[] array = {6, 5, 3, 9, 0, 2, 7, 6, 4, 12, 11};
    sort(array, 12);
  }
  /**
   * 升序排列
   * 
   * @param array
   * @param max 数组a中的最大值
   */
  public static void sort(int[] array, int max) {
    printArray(array);
    int n = array.length;
    int[] result = new int[array.length];
    int[] count = new int[max + 1];  //辅助数组 count[i]存放array中小于或等于i的个数
    for(int i = 0; i <= max; i++) { //辅助数组清0
      count[i] = 0;
    }
    for (int i = 0; i < n; i++) { //将数值序号在count中计数
      count[array[i]]++;
    }
    for(int i = 1; i <= max; i++) { //count[i]包含小于或等于i的个数
      count[i] += count[i - 1];
    }
    for (int i = n; i > 0; i--) {  //复制到result中，已排序
      count[array[i - 1]]--; //复制一个减去一个，依旧是array[i-1]的排序位置
      result[count[array[i - 1]]] = array[i - 1];
    }
    printArray(result);
  }
  
  private static void printArray(int[] array) {
    System.out.print(Arrays.toString(array));
    System.out.println();
  }
  
}
