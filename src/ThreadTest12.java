/*
	Thread.yield();
	����sleep()���ƣ�ֻ�ǲ����û�ָ����ͣ�೤ʱ�䣬����yield()����ֻ����ͬ���ȼ����߳���ִ�еĻ���

	1.�÷�����һ����̬����
	2.���ã���ͬһ�����ȼ����߳���λ��������λʱ�䲻�̶�
	3.��sleep()������ͬ������yield()ʱ�䲻�̶�
*/
public class ThreadTest12
{
	public static void main(String[]agrs){
		Thread t=new Processor12();
		t.setName("t");
		t.start();
		//���߳���
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
	}
}
class Processor12 extends Thread
{
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+"-->"+i);
			if(i%20==0){
				Thread.yield();
			}
		}
	}
}