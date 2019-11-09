package abstracts;
/*
 * �������Ӧ�ã�ģ�巽�������ģʽ
 * 
 */
public class TemplateTest {
	
	public static void main(String[] args) {
		Template t = new SubTemplate();
		
		t.spendTime();
	}
	
}

abstract class Template{
	
	//����ĳ�δ���ִ������Ҫ���ѵ�ʱ��
	public void spendTime() {
		
		long start = System.currentTimeMillis();
		
		code();//��ȷ���Ĳ���
		
		long end = System.currentTimeMillis();
		
		System.out.println("���ѵ�ʱ�䣺" + (end - start));
	}
	
	public abstract void code();
	
}

class SubTemplate extends Template{

	@Override
	public void code() {
		
		for (int i = 2; i < 1000; i++) {
			boolean isFlag = true;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				
				if(i % j == 0) {
					isFlag = false;
					break;
				}	
			}
			if(isFlag) {
				System.out.println(i);
			}
		}
		
	}
	
}