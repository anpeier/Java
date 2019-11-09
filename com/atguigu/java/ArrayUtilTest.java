package com.atguigu.java;

public class ArrayUtilTest {

	public static void main(String[] args) {
		
		ArrayUtil util = new ArrayUtil();
		int[] arr = new int[]{21,5,16,66,5,11,25,42,4,45,78,95};
		
		util.print(arr);
		
		int max = util.getMax(arr);
		System.out.println("最大值为："+max);
		
		int min = util.getMin(arr);
		System.out.println("最小值为："+min);
		
		int sum = util.getSum(arr);
		System.out.println("总和为："+sum);
		
		int avg = util.getAvg(arr);
		System.out.println("平均数："+avg);
		
		util.reverse(arr);
		
		int[] arr1 = util.copy(arr);
		
		util.sort(arr);
		
		util.print(arr);
		
		int index = util.getIndex(arr, 95);
		if (index >= 0) {
			System.out.println("找到了,索引为：" + index);
		}else {
			System.out.println("数组中没有该元素");
		}
		
		String [] str = new String[] {"张三","李四","王五","赵六","宋七"};
		util.reverse(str);
		util.print(str);
	}
}
