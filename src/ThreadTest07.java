/*
*
	1.�̵߳ĵ��������
		
		ͨ�����Ǽ����ֻ��һ��CPU��cpu��ĳһʱ��ֻ��ִ��һ��ָ��߳�ֻ�еõ�CPU
	ʱ��Ƭ��Ҳ����ʹ��Ȩ���ſ���ִ������ڵ���CPU�Ļ������̲߳����ǲ������еģ�ֻ���ڶ��Cpu
	���̲߳ſ��Բ������С�
		java�����Ҫ�����̵߳ĵ��ȣ�ȡ��CPU��ʹ��Ȩ��
		Ŀǰ�����ֵ���ģʽ����ʱ����ģʽ����ռʽ����ģʽ��javaʹ����ռʽ����ģʽ
		��ʽ����ģʽ�������߳�����ʹ��CPU��ʹ��Ȩ��ƽ������ÿ���߳�ռ��CPU��ʱ��Ƭ
		��ռʽ����ģʽ�����ȼ��ߵ��̻߳�ȡCPUʱ��Ƭ��Զ�һЩ������̵߳����ȼ���ͬ����ô�����ѡ��һ��

	2.�߳����ȼ�(��1��10)
		MAX_PRIORITY(��߼�)=10��MIN_PRIORITY(��ͼ�)=1��NORM_PRIORITY(��׼)Ĭ��=5


*/

/*
*����������
	1.��ȡ��ǰ�̶߳���Thread.currentThread();
	2.���߳����� t.setName("t1");
	3.��ȡ�̵߳����� t.getName();
*/
public class ThreadTest07
{
	public static void main(String[] args){
		//��λ�ȡ��ǰ�̶߳��� 
		//static Thread currentThread()���ضԵ�ǰ����ִ�е��̶߳��������
		Thread t=Thread.currentThread();//t������ڴ��ַָ����߳������̶߳���
		//��ȡ�̵߳�����
		System.out.println(t.getName());//main

		//�����߳�
		Thread t1=new Thread(new Processor7());
		//���߳�����
		t1.setName("t1");
		//�����߳�
		t1.start();//Thread-0

		Thread t2=new Thread(new Processor7());
		t2.setName("t2");
		t2.start();//Thread-1
	}
}

class Processor7 implements Runnable
{
	public void run(){
		Thread t=Thread.currentThread();//t������ڴ��ַָ����߳���t1�߳�
		System.out.println(t.getName());//Thread-0
	}
}