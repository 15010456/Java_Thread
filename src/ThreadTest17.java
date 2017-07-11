/*
	��������ֻ��һ�������������༶��ֻ��һ��
	synchronized��ӵ���̬�����ϣ��߳�ִ�о���Ҫ����������������޹ء�
*/
public class ThreadTest17
{
	public static void main(String[] args) throws Exception{
		Thread t1=new Thread(new Processor17());
		Thread t2=new Thread(new Processor17());
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		Thread.sleep(1000);//�ӳ٣���֤t1��ִ��
		t2.start();
	}
}
class Processor17 implements Runnable
{
	public void run(){
		if("t1".equals(Thread.currentThread().getName())){
			Myclass.m1();
		}
		if("t2".equals(Thread.currentThread().getName())){
			Myclass.m2();
		}
	}
}
class Myclass
{
	//synchronized��ӵ���̬�����ϣ��߳�ִ�д˷�����ʱ���������
	public synchronized static void m1(){
		try{Thread.sleep(10000);}catch(Exception e){}
		System.out.println("m1.....");
	}
	//�����m1��������Ϊ�÷���û�б�synchronized����
	/*
	public static void m2(){
		System.out.println("m2.....");
	}*/

	//�÷�����synchronized���߳�ִ�и÷�����Ҫ�������������湲���˻���û�У�����ֻ��һ�ѣ����Եȴ�
	public synchronized static void m2(){
		System.out.println("m2.....");
	}
}