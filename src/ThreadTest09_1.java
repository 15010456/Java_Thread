/*
	������
*/
public class ThreadTest09_1
{
	public static void main(String[] args) throws Exception{
		//�����߳�
		Thread t=new Processor09();
		t.setName("t");
		//�����߳�
		t.start();
		//����
		//Thread.sleep(5000);
		t.sleep(5000);//����Ӱ��run�������У�sleep������̬�����Ա�����Thread.sleep()
					  //��������main����
		System.out.println("HelloWord");

		A a=null;
		A.m1();//���ᱨ����Ϊm1�Ǿ�̬����������.�������ɵ���
	}
}
class Processor09 extends Thread
{
	public void run(){
		
		for(int i=0;i<200;i++){
			System.out.println(Thread.currentThread().getName()+"----->"+i);
		}
	}
}
class A
{
	public static void m1(){
		System.out.println("���ô˷����᲻�ᱨ��");
	}
}