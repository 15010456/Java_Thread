/**
	t1��t2
	�첽���ģ�ͣ�t1�߳�ִ��t1�ģ�t2�߳�ִ��t2�ģ������߳�֮��˭Ҳ����˭
	ͬ�����ģ�ͣ�t1�̺߳�t2�߳�ִ�У���t1�̱߳����t2�߳�ִ�н���֮��t1�̲߳���ִ��

	ʲôʱ��Ҫͬ���أ�ΪʲôҪ�����߳�ͬ����(ȡ������)
		1.Ϊ�����ݵİ�ȫ������Ӧ�ó����ʹ���ʽ��ͣ�����Ϊ�˱�֤�����ǰ�ȫ�ģ���������߳�ͬ������
		�߳�ͬ������ʹ��������(��ͬ)���߳�
		2.ʲô������ʹ���߳�ͬ����
			1)�����Ƕ��̻߳���
			2)���̻߳�������һ������
			3)����������漰���޸Ĳ���
*/
/*
*	���³�����ʾȡ�����ӣ������̲߳�ʹ���߳�ͬ�����ƣ�
	���߳�ͬʱ���ͬһ���˻�����ȡ���������ʲô���⣿
*/
public class ThreadTest14
{
	public static void main(String[] args){
		//����һ���������˻�
		Account act=new Account("actno001",5000);
		//�����̶߳�ͬһ�˻�ȡ��
		Processor14 p=new Processor14(act);
		Thread t1=new Thread(p);
		Thread t2=new Thread(p);
		t1.start();
		t2.start();
	}
}
//ȡ���߳�
class Processor14 implements Runnable
{
	//�˻�
	Account act;
	//Constructor
	Processor14(Account act){
		this.act=act;
	}
	public void run(){
		act.withdraw(1000.0);
		System.out.println("ȡ��1000�ɹ�����"+act.getBalance());
	}
}
//�����˻�
class Account
{
	private String actno;//�˺�
	private double balance;//���
	
	public Account(){}
	public Account(String actno,double balance){
		this.actno=actno;
		this.balance=balance;
	}
	//setter��getter
	public void setActno(String actno){
		this.actno=actno;
	}
	public String getActno(){
		return actno;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
	public double getBalance(){
		return balance;
	}
	//�����ṩ��һ��ȡ��ķ���
	public void withdraw(double money){//�Ե�ǰ�˻�����ȡ�����
		double after=balance-money;
		//�ӳ٣������߳�ȡ����δ�ı�ʱ����һ���߳��ٴ�ȡ�ȥ����1000������4000
		try{Thread.sleep(1000);}catch(Exception e){}
		//����
		this.setBalance(after);
	}
}