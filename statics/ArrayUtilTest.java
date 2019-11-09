package statics;

public class ArrayUtilTest {

	public static void main(String[] args) {
		
//		ArrayArrayUtil ArrayUtil = new ArrayArrayUtil();
		int[] arr = new int[]{21,5,16,66,5,11,25,42,4,45,78,95};
		
		ArrayUtil.print(arr);
		
		int max = ArrayUtil.getMax(arr);
		System.out.println("���ֵΪ��"+max);
		
		int min = ArrayUtil.getMin(arr);
		System.out.println("��СֵΪ��"+min);
		
		int sum = ArrayUtil.getSum(arr);
		System.out.println("�ܺ�Ϊ��"+sum);
		
		int avg = ArrayUtil.getAvg(arr);
		System.out.println("ƽ������"+avg);
		
		ArrayUtil.reverse(arr);
		
		int[] arr1 = ArrayUtil.copy(arr);
		
		ArrayUtil.sort(arr);
		
		ArrayUtil.print(arr);
		
		int index = ArrayUtil.getIndex(arr, 95);
		if (index >= 0) {
			System.out.println("�ҵ���,����Ϊ��" + index);
		}else {
			System.out.println("������û�и�Ԫ��");
		}
		
		String [] str = new String[] {"����","����","����","����","����"};
		ArrayUtil.reverse(str);
		ArrayUtil.print(str);
	}
}
