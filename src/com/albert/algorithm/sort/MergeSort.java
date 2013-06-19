package com.albert.algorithm.sort;

import java.util.Arrays;

/**
 * 归并排序 
 * 
 * @author Albert
 * @see http://baike.baidu.com/view/90797.htm
 */
public class MergeSort {

  public static void main(String[] args) {
    int[] array = { 1, 5, 3, 9, 0, 2, 7, 6, 4, 12, 11 };
    printArray(array);
    int[] result = sort(array);
    printArray(result);
  }

  /**
   * 第一步：申请空间，使其大小为两个已经排序序列之和，该空间用来存放合并后的序列
   * 第二步：设定两个指针，最初位置分别为两个已经排序序列的起始位置
   * 第三步：比较两个指针所指向的元素，选择相对小的元素放入到合并空间，并移动指针到下一位置
   * 重复步骤3直到某一指针达到序列尾
   * 将另一序列剩下的所有元素直接复制到合并序列尾
   *   
   * @param array
   */
  public static int[] sort(int[] list) {
      if (list.length == 1) {
          return list;
      } else {
          int[] listL = new int[list.length / 2];
          int[] listR = new int[list.length - list.length / 2];
          int Center = list.length / 2;
          for (int i = 0; i < Center; i++) {
              listL[i] = list[i];
          }
          for (int i = Center, j = 0; i < list.length; i++, j++) {
              listR[j] = list[i];
          }

          int[] sortedListL=sort(listL);
          int[] sortedListR=sort(listR);
          int[] result = mergeTwoList(sortedListL, sortedListR);
          return result;
      }
  }

  private static int[] mergeTwoList(int[] listL, int[] listR) {
      int i = 0, j = 0;
      int[] list = new int[listL.length + listR.length];
      int foot = 0;
      while (i < listL.length && j < listR.length) {
          if (listL[i] <= listR[j]) {
              list[foot] = listL[i];
              i++;
          } else {
              list[foot] = listR[j];
              j++;
          }
          foot++;
      }
      if (i == listL.length) {
          while (j < listR.length) {
              list[foot++] = listR[j++];
          }
      } else {
          while (i < listL.length) {
              list[foot++] = listL[i++];
          }
      }
      return list;
  }
  
  private static void printArray(int[] array) {
    System.out.print(Arrays.toString(array));
    System.out.println();
  }

}
