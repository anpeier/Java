package com.atguigu.java;

public class ArrayUtil {
	
	//求数组最大值
	public int getMax(int[] arr) {
		int maxValue = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(maxValue < arr[i]) {
				maxValue = arr[i];
			}
		}
		return maxValue;
	}
	
	//求数组最小值
	public int getMin(int[] arr) {
		int minValue = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(minValue > arr[i]) {
				minValue = arr[i];
			}
		}
		return minValue;
	}
	
	//求数组和
	public int getSum(int[] arr) {
		int sum = 0 ;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	//求数组平均值
	public int getAvg(int[] arr) {
		return getSum(arr)/arr.length;
	}
	
	//反转数组
	public void reverse(int[] arr) {
		 for (int i = 0; i < arr.length/2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
	}
	
	public void reverse(String[] arr) {
		 for (int i = 0; i < arr.length/2; i++) {
			String temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
	}
	
	//复制数组
	public int[]copy(int[] arr){
		int[] arr1 =new int[arr.length];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr[i];
		}
		return arr1;
	}
	
	//数组排序
	public void sort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {/* 外循环为排序趟数，length个数进行length-1趟 */
			for(int j = 0; j < arr.length-1-i; j++) {/* 内循环为每趟比较的次数，第i趟比较length-i次 */
				if(arr[j]<arr[j+1]) {/* 相邻元素比较，若逆序则交换（升序为左大于右，降序反之） */
					/*int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;*/
					swap(arr,j,j+1);
				}
			}
		}
	}
	
	public void swap(int[]arr,int i , int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	//遍历数组
	public void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +"\t");
		}
		System.out.println();
	}
	
	public void print(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +"\t");
		}
		System.out.println();
	}
	
	//查找指定元素
	public int getIndex(int[] arr,int dest) {
		//线性查找
		
		for (int i = 0; i < arr.length; i++) {
			if(dest == arr[i]) {
				return i ;
			}
		}
		return -1;
	}
}
