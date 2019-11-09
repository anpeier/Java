package com.atguigu.java;

public class ArrayUtil {
	
	//���������ֵ
	public int getMax(int[] arr) {
		int maxValue = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(maxValue < arr[i]) {
				maxValue = arr[i];
			}
		}
		return maxValue;
	}
	
	//��������Сֵ
	public int getMin(int[] arr) {
		int minValue = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(minValue > arr[i]) {
				minValue = arr[i];
			}
		}
		return minValue;
	}
	
	//�������
	public int getSum(int[] arr) {
		int sum = 0 ;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	//������ƽ��ֵ
	public int getAvg(int[] arr) {
		return getSum(arr)/arr.length;
	}
	
	//��ת����
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
	
	//��������
	public int[]copy(int[] arr){
		int[] arr1 =new int[arr.length];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr[i];
		}
		return arr1;
	}
	
	//��������
	public void sort(int[] arr) {
		for (int i = 0; i < arr.length-1; i++) {/* ��ѭ��Ϊ����������length��������length-1�� */
			for(int j = 0; j < arr.length-1-i; j++) {/* ��ѭ��Ϊÿ�˱ȽϵĴ�������i�˱Ƚ�length-i�� */
				if(arr[j]<arr[j+1]) {/* ����Ԫ�رȽϣ��������򽻻�������Ϊ������ң�����֮�� */
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
	
	//��������
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
	
	//����ָ��Ԫ��
	public int getIndex(int[] arr,int dest) {
		//���Բ���
		
		for (int i = 0; i < arr.length; i++) {
			if(dest == arr[i]) {
				return i ;
			}
		}
		return -1;
	}
}
