package com.albert.algorithm.sort;

import java.util.Arrays;

/**
 * 堆排序
 * 
 * @author Albert
 * @see http://baike.baidu.com/view/157305.htm
 */
public class HeapSort {

	public static void main(String[] args) {
		int[] heap = new int[] { 1, 3, 7, 5, 2, 8, 4, 6, 10, 9 };
		int temp;
		printArray(heap);
		createHeap(heap); //创建堆（对该堆进行简单的排序）
		printArray(heap);
		for (int i = heap.length - 1; i > 0; i--) {
			temp = heap[0];
			heap[0] = heap[i];
			heap[i] = temp;
			printArray(heap);
			adjustHeap(heap, 0, i); //从堆顶进行调整，使未排序堆中最大关键字到堆顶
		}
	}
	/*
	 * 创建堆（对该堆进行简单的排序）
	 */
	public static void createHeap(int[] heap) {
		for (int i = heap.length - 1; i >= 0; i--) {
			adjustHeap(heap, i, heap.length);
		}
	}
	/*
	 * 调整堆使其堆顶为未排序堆中最大关键字
	 */
	public static void adjustHeap(int[] heap, int location, int unSortlength) {
		int temp;
		int tempLoc;
		if ((tempLoc = (location + 1) * 2) < unSortlength) { //如果左右节点存在
			if (heap[tempLoc] >= heap[tempLoc - 1]) { //判断左右节点大小
				if (heap[location] < heap[tempLoc]) { //判断父节点与子节点的大小，若父节点小，则与大的子节点换位
					temp = heap[location];
					heap[location] = heap[tempLoc];
					heap[tempLoc] = temp;
					adjustHeap(heap, tempLoc, unSortlength); //递归法对换位后的子节点及其子节点进行调整
				}
			} else {
				if (heap[location] < heap[tempLoc - 1]) { //左节点大于右节点
					temp = heap[location];
					heap[location] = heap[tempLoc - 1];
					heap[tempLoc - 1] = temp;
					adjustHeap(heap, tempLoc - 1, unSortlength); //递归法对换位后的子节点及其子节点进行调整
				}
			}
		} else if ((tempLoc = (location + 1) * 2 - 1) < unSortlength) { //如果左节点存在
			if (heap[location] < heap[tempLoc]) { //与左节点进行比较
				temp = heap[location]; //左子节点大于父节点，将两者进行换位
				heap[location] = heap[tempLoc];
				heap[tempLoc] = temp;
				adjustHeap(heap, tempLoc, unSortlength);
			}
		}
	}
	
	private static void printArray(int[] array) {
		 System.out.print(Arrays.toString(array));
		 System.out.println();
	 }
	
}
