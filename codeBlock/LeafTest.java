package codeBlock;
//�ܽ᣺�ɸ����ӣ���̬����
class Root{
	static{
		System.out.println("Root�ľ�̬��ʼ����");
	}
	{
		System.out.println("Root����ͨ��ʼ����");
	}
	public Root(){
		super();
		System.out.println("Root���޲����Ĺ�����");
	}
}
class Mid extends Root{
	static{
		System.out.println("Mid�ľ�̬��ʼ����");
	}
	{
		System.out.println("Mid����ͨ��ʼ����");
	}
	public Mid(){
		super();
		System.out.println("Mid���޲����Ĺ�����");
	}
	public Mid(String msg){
		//ͨ��this����ͬһ�������صĹ�����
		this();
		System.out.println("Mid�Ĵ������������������ֵ��"
			+ msg);
	}
}
class Leaf extends Mid{
	static{
		System.out.println("Leaf�ľ�̬��ʼ����");
	}
	{
		System.out.println("Leaf����ͨ��ʼ����");
	}	
	public Leaf(){
		//ͨ��super���ø�������һ���ַ��������Ĺ�����
		super("�й��");
		System.out.println("Leaf�Ĺ�����");
	}
}
public class LeafTest{
	public static void main(String[] args){
		new Leaf(); 
		System.out.println();
		new Leaf();
	}
}

