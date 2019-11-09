package wrapper;

import java.util.Scanner;
import java.util.Vector;

/*
 *  ����Vector�������鴦���Ӽ��̶���ѧ���ɼ����Ը�������������������ҳ���߷֣������ѧ���ɼ��ȼ���
	��ʾ������һ�����������Ⱦ͹̶����䣬�����ڴ�������ǰ����Ҫ֪�����ĳ��ȡ�
	��������java.util.Vector���Ը�����Ҫ��̬������
	
	����Vector����Vector v=new Vector();
	���������Ԫ�أ�v.addElement(Object obj);   //obj�����Ƕ���
	ȡ�������е�Ԫ�أ�Object  obj=v.elementAt(0);
	ע���һ��Ԫ�ص��±���0������ֵ��Object���͵ġ�
	���������ĳ��ȣ�v.size();
	������߷����10���ڣ�A�ȣ�20���ڣ�B�ȣ�
	      30���ڣ�C�ȣ�������D��

 * 
 * 
 */

public class ScoreTest {
	public static void main(String[] args) {
		//1.ʵ����Scanner,���ڴӼ��̻�ȡѧ���ɼ�
		Scanner scan = new Scanner(System.in);
		//2.����Vector����Vector v = new Vector();�൱�ڳɼ�����
		Vector v = new Vector();
		//3.ͨ��forѭ����whileѭ������Vector���������
		int maxScore = 0;
		for (; ;) {
			System.out.println("������ѧ���ɼ����������������");
			int score = scan.nextInt();
			//3.2������Ϊ����ʱ����ѭ��
			if(score<0) {
				break;
			}
			if(score>100) {
				System.out.println("��������ݷǷ�������������");
				continue;
			}
			//3.1��Ӳ�����v.addElement(Object obj)
			//jdk5.0֮ǰ��
//			Integer inScore = new Integer(score);
//			v.addElement(inScore);//��̬
			//jdk5.0֮��
			v.addElement(score);
			//4��ȡѧ���ɼ����ֵ
			if(maxScore < score) {
				maxScore = score;
			}
		}
		//5.����Vector���õ�ÿ��ѧ���ɼ����������ɼ��Ƚϣ��õ�ѧ���ĵȼ�
		char level;
		for (int i = 0; i < v.size(); i++) {
			Object obj = v.elementAt(i);
			//jdk5.0z֮ǰ
//			Integer inScore = (Integer)obj;
//			int score = inScore.intValue();
			//jdk5.0֮��
			int score = (int)obj;
			
			if(maxScore - score <= 10) {
				level = 'A';
			}else if(maxScore - score <=20) {
				level = 'B';
			}else if(maxScore - score <=30) {
				level = 'C';
			}else {
				level = 'D';
			}
			System.out.println("Student-" + i + " score is" + score + ",level is " + level);
		}
		
	}
}
