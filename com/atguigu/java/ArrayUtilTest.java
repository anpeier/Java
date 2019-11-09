package com.atguigu.java;

public class ArrayUtilTest {

	public static void main(String[] args) {
		
		ArrayUtil util = new ArrayUtil();
		int[] arr = new int[]{21,5,16,66,5,11,25,42,4,45,78,95};
		
		util.print(arr);
		
		int max = util.getMax(arr);
		System.out.println("���ֵΪ��"+max);
		
		int min = util.getMin(arr);
		System.out.println("��СֵΪ��"+min);
		
		int sum = util.getSum(arr);
		System.out.println("�ܺ�Ϊ��"+sum);
		
		int avg = util.getAvg(arr);
		System.out.println("ƽ������"+avg);
		
		util.reverse(arr);
		
		int[] arr1 = util.copy(arr);
		
		util.sort(arr);
		
		util.print(arr);
		
		int index = util.getIndex(arr, 95);
		if (index >= 0) {
			System.out.println("�ҵ���,����Ϊ��" + index);
		}else {
			System.out.println("������û�и�Ԫ��");
		}
		
		String [] str = new String[] {"����","����","����","����","����"};
		util.reverse(str);
		util.print(str);
	}
}
