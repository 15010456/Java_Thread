/*
	ĳ�߳��������ߣ���������������
	���·�ʽ���������쳣�������
*/
public class ThreadTest10
{
	public static  void main(String[]args) throws Exception{
	
		//���������߳�֮��5s֮�����̵߳�����
		Thread t=new Thread(new Processor10());
		//����
		t.setName("t");
		//����
		t.start();
		//5s֮��
		Thread.sleep(5000);
		//���t������void interrupt()�ж��߳�
		t.interrupt();

	}
}
class Processor10 implements Runnable
{
	public void run(){
		try{
			Thread.sleep(1000000);
			System.out.println("HelloWord");
		}catch(InterruptedException e){
			//e.printStackTrace();
		}
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
	}
}