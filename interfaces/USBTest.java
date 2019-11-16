package interfaces;
/*
 * �ӿڵ�ʹ��
 * 1.�ӿ�ʹ���������̬��
 * 2.�ӿ�ʵ���Ͼ��Ƕ�����һ�ֹ淶
 * 3.�����У��������ӿڱ��
 */
public class USBTest {
	public static void main(String[] args) {
		
		Computer com = new Computer();
		//1.�����˽ӿڵķ�����ʵ����ķ���������
		Flash f = new Flash();
		com.transferData(f);
		
		//2.�����ӿڵķ�����ʵ�������������
		com.transferData(new Printer());
		
		//2.�����ӿڵ�����ʵ����ķ���������
		USB phone = new USB() {

			@Override
			public void start() {
				System.out.println("�ֻ���ʼ����");
			}

			@Override
			public void stop() {
				System.out.println("�ֻ�ֹͣ����");
			}
			
		};
		com.transferData(phone);
		
		//4.�����ӿڵ�����ʵ�������������
		com.transferData(new USB() {

			@Override
			public void start() {
				System.out.println("mp3��ʼ����");
			}

			@Override
			public void stop() {
				System.out.println("mp3��������");
			}
			
		});
		
	}
}

class Computer{
	public void transferData(USB usb) {//USB usb = new Flash();
		usb.start();
		System.out.println("���崫������ϸ��");
		usb.stop();
	}
}

interface USB{
	//�����������˳������ߡ������С�����ٶ�
	
	void start();
	
	void stop();
	
}

class Flash implements USB{

	@Override
	public void start() {
		System.out.println("U�̿���");
	}

	@Override
	public void stop() {
		System.out.println("U�̹ر�");
	}
	
}

class Printer implements USB{

	@Override
	public void start() {
		System.out.println("��ӡ������");
	}

	@Override
	public void stop() {
		System.out.println("��ӡ���ر�");
	}
	
}