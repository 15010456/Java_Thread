/**
	1.Thread.sleep(����)
	2.sleep������һ����̬����
	3.�÷��������ã�������ǰ�̣߳��ڳ�CPU�ø������̡߳���������������ĸ��߳��У��ͱ�����
*/
public class ThreadTest09
{
	public static void main(String[] args) throws InterruptedException{
		Thread t1=new Processor9();
		t1.setName("t1");
		t1.start();
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+"-----?"+i);
			Thread.sleep(500);
		}
	}
}
class Processor9 extends Thread
{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+"----?"+i);
			try{
				Thread.sleep(1000);//�õ�ǰ�߳�����һ�룬Ҫ�׳�һ���쳣
							   //����run��������д����ķ���
							   //��д�ķ������ܱȱ���д�ķ����׳��������쳣
							   //����run�������쳣ֻ��try catch
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			
		}
			
		//m1();
	}

	//m1�����ǿ���ʹ��throws��
	public void m1() throws Exception{
		System.out.println("m1");
	}
}