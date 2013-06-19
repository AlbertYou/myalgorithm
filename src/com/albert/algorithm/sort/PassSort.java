package com.albert.algorithm.sort;

import java.util.Arrays;

/**
 * 传递排序法
 * 
 * @author Albert
 *
 */
public class PassSort {

  public static void main(String[] args) {
    int[] array = {6, 5, 3, 9, 0, 2, 7, 6, 4, 12, 11};
    sort(array);
  }
  /**
   * 升序排列
   * 设有n个数据，首先，数据位置序号模2相等的数进行排序，其次，数据位置序号各加1再模2相等的数进行排序，如此反复，直到n次比较排序完成。
   *  初始关键字 [49 38 65 97 76 27 20 11]
   *　　第一趟排序后 [38 49][ 65 97] [27 76] [11 20]
   *  第二趟排序后 38 [49 65][ 27 97][ 11 76] 20
   *　　第三趟排序后 [38 49][ 27 65][ 11 97][ 20 76]
   *　　第四趟排序后 38[ 27 49][ 11 65][ 20 97] 76
   *　　第五趟排序后 [27 38][ 11 49][ 20 65][ 76 97]
   *   第六趟排序后 27[ 11 38][ 20 49][ 65 76 ]97
   *　　第七趟排序后 [11 27][ 20 38 ][49 65 ][76 97]
   *　　最后一趟排序后 11 [20 27][ 38 49][ 65 76] 97
   * 
   * @param array
   */
  public static void sort(int[] array) {
    printArray(array);
    int a = 0;
    boolean finished = true;
    for (int i = 0; i < array.length; i++) {
      finished = true;
        for (int j = i % 2; j < array.length - 1 - i % 2; j += 2) {
          if(array[j] > array[j + 1]) {
            a = array[j + 1];
            array[j + 1] = array[j];
            array[j] = a;
            finished = false;
          }
        }
      if(finished) {
        break;
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
