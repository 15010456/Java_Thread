/*
	t.join����Ա������
	�̵߳ĺϲ�
*/
public class ThreadTest13
{
	public static void main(String[] args) throws Exception{
		Thread t=new Thread(new Processor13());
		t.setName("t");
		t.start();
		//�ϲ��߳�
		t.join();//t�����̺߳ϲ�����ɵ��̣߳�����ջ�ռ���һ��ջ��
		
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
	}
}
class Processor13 implements Runnable
{
	public void run(){
		for(int i=0;i<5;i++){
			try{Thread.sleep(1000);}catch(InterruptedException e){}
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
	}
}