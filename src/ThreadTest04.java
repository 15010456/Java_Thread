/**
	java��ʵ���̵߳ĵڶ��ַ�ʽ��
		��һ����дһ����ʵ��java.lang.Runnable�ӿ�
		�ڶ�����ʵ��run����

		һ��ѡ�����ַ�ʽ����Ϊ��������ļ̳�
*/
public class ThreadTest04
{
	public static void main(String[]args){
		
		//�����߳�
		Thread t=new Thread(new Processor4());
		//�����߳�
		t.start();
	}
}
//����һ���̣߳��Ƽ�
class Processor4 implements Runnable
{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("run-->"+i);
		}
	}
}