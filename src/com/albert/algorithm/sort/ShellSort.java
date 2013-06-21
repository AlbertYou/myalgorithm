package com.albert.algorithm.sort;

/**
 * 希尔排序
 * 
 * @author albert
 * @see http://baike.baidu.com/view/178698.htm
 */
public class ShellSort {
  public static int[] a = { 10, 32, 1, 9, 5, 7, 12, 0, 4, 3 };

	public static void main(String[] args) {
		int i; // 循环计数变量
		int Index = a.length;// 数据索引变量
		System.out.print("排序前: ");
		for (i = 0; i < Index - 1; i++)
			System.out.printf("%3s ", a[i]);
		System.out.println("");
		ShellSort(Index - 1); // 选择排序
		// 排序后结果
		System.out.print("排序后: ");
		for (i = 0; i < Index - 1; i++)
			System.out.printf("%3s ", a[i]);
		System.out.println("");
	}

	public static void ShellSort(int Index) {
		int i, j, k; // 循环计数变量
		int Temp; // 暂存变量
		boolean Change; // 数据是否改变
		int DataLength; // 分割集合的间隔长度
		int Pointer; // 进行处理的位置
		DataLength = (int) Index / 2; // 初始集合间隔长度
		while (DataLength != 0) // 数列仍可进行分割
		{
			// 对各个集合进行处理
			for (j = DataLength; j < Index; j++) {
				Change = false;
				Temp = a[j]; // 暂存Data[j]的值,待交换值时用
				Pointer = j - DataLength; // 计算进行处理的位置
				// 进行集合内数值的比较与交换值
				while (Temp < a[Pointer] && Pointer >= 0 && Pointer <= Index) {
					a[Pointer + DataLength] = a[Pointer];
					// 计算下一个欲进行处理的位置
					Pointer = Pointer - DataLength;
					Change = true;
					if (Pointer < 0 || Pointer > Index)
						break;
				}
				// 与最后的数值交换
				a[Pointer + DataLength] = Temp;
				if (Change) {
					// 打印目前排序结果
					System.out.print("排序中: ");
					for (k = 0; k < Index; k++)
						System.out.printf("%3s ", a[k]);
					System.out.println("");
				}
			}
			DataLength = DataLength / 2; // 计算下次分割的间隔长度
		}
	}
}
