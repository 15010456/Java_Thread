/*
	�߳����ȼ��ߵĻ�ȡ��CPUʱ��Ƭ��Զ�һЩ
	
	���ȼ�1-10
	���1
	���10
	Ĭ��5
		
*/
public class ThreadTest08
{
	public static void main(String[] args){
		
		System.out.println("���ȼ����"+Thread.MAX_PRIORITY);//10
		System.out.println("���ȼ���С��"+Thread.MIN_PRIORITY);//1
		System.out.println("���ȼ�Ĭ�ϣ�"+Thread.NORM_PRIORITY);//5

		Thread t1=new Processor8();
		t1.setName("t1");
		
		Thread t2=new Processor8();
		t2.setName("t2");
		System.out.println("-----"+t1.getPriority());//5
		System.out.println("-----"+t2.getPriority());//5
		//�������ȼ�
		t1.setPriority(1);
		t2.setPriority(10);
		System.out.println("-----"+t1.getPriority());//1
		System.out.println("-----"+t2.getPriority());//10
		//�����߳�
		t1.start();
		t2.start();
	}
}
class Processor8 extends Thread
{
	public void run(){
		for(int i=0;i<50;i++){
			System.out.println(Thread.currentThread().getName()+"--->"+i);
		}
	}
}