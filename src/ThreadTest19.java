/**
	�߳������֣��û��̡߳��ػ��߳�(�ڴ�֮ǰ���س�ȫ��Ϊ�û��߳�)

	�ػ��̣߳����е��û��߳̽����������ڣ��ػ��̲߳Ż�����������ڣ�
  ֻҪ��һ���û��̴߳���,��ô�ػ��߳̾Ͳ������������java��������
  ��������������һ���ػ��̣߳�ֻ��Ӧ�ó���������߳̽��������Ż����

  �������е��û��߳̽��������ػ��߳��˳�
  �ػ��߳�һ�㶼������֮�е�
	
*/
public class ThreadTest19
{
	public static void main(String[] args) throws Exception{
		Thread t1=new Processor19();
		t1.setName("t1");
		//void setDaemon(boolean on)���̱߳��Ϊ�ػ��̻߳����û��߳�
		//��t1�û��߳��޸�Ϊ�ػ��߳� 
		t1.setDaemon(true);
		t1.start();
		//���߳�   
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+"-->"+i);
			Thread.sleep(1000);
		}
	}
}
class Processor19 extends Thread
{
	public void run(){
		int i=0;
		while(true){
			i++;
			System.out.println(Thread.currentThread().getName()+"-->"+i);
			try{Thread.sleep(500);}catch(Exception e){}
		}
	}
}