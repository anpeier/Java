package statics;

public class ArrayUtilTest {

	public static void main(String[] args) {
		
//		ArrayArrayUtil ArrayUtil = new ArrayArrayUtil();
		int[] arr = new int[]{21,5,16,66,5,11,25,42,4,45,78,95};
		
		ArrayUtil.print(arr);
		
		int max = ArrayUtil.getMax(arr);
		System.out.println("最大值为："+max);
		
		int min = ArrayUtil.getMin(arr);
		System.out.println("最小值为："+min);
		
		int sum = ArrayUtil.getSum(arr);
		System.out.println("总和为："+sum);
		
		int avg = ArrayUtil.getAvg(arr);
		System.out.println("平均数："+avg);
		
		ArrayUtil.reverse(arr);
		
		int[] arr1 = ArrayUtil.copy(arr);
		
		ArrayUtil.sort(arr);
		
		ArrayUtil.print(arr);
		
		int index = ArrayUtil.getIndex(arr, 95);
		if (index >= 0) {
			System.out.println("找到了,索引为：" + index);
		}else {
			System.out.println("数组中没有该元素");
		}
		
		String [] str = new String[] {"张三","李四","王五","赵六","宋七"};
		ArrayUtil.reverse(str);
		ArrayUtil.print(str);
	}
}
