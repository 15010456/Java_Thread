/*
	���³���ʹ���߳�ͬ�����ƿ������ݵİ�ȫ
*/
public class ThreadTest15
{
	public static void main(String[] args){
		//����һ���������˻�
		Account15 act=new Account15("actno001",5000);
		//�����̶߳�ͬһ�˻�ȡ��
		Processor15 p=new Processor15(act);
		Thread t1=new Thread(p);
		Thread t2=new Thread(p);
		t1.start();
		t2.start();
	}
}
//ȡ���߳�
class Processor15 implements Runnable
{
	//�˻�
	Account15 act;
	//Constructor
	Processor15(Account15 act){
		this.act=act;
	}
	public void run(){
		act.withdraw(1000.0);
		System.out.println("ȡ��1000�ɹ�����"+act.getBalance());
	}
}


//�����˻�
class Account15
{
	private String actno;//�˺�
	private double balance;//���
	
	public Account15(){}
	public Account15(String actno,double balance){
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
	//�����ṩ��һ��ȡ��ķ���,���´���ֻ����һ���߳�ִ��
	public void withdraw(double money){//�Ե�ǰ�˻�����ȡ�����
		//����Ҫͬ���Ĵ������ͬ��������
		/*
			ԭ��t1�̺߳�t2�߳�
			t1�߳�ִ�е��˴���������synchronized�ؼ��֣��ͻ�ȥ��
			synchronizedС�������this������
			����ҵ���this�������������ͬ��������ִ�г���
			��ͬ�������еĴ���֮�н���֮��t1�̹߳黹this�Ķ�����

			��t1�߳�ִ��ͬ������Ĺ����С����t2�߳�Ҳ����ִ�����´��룬Ҳ������
			synchronized�ؼ��֣�����Ҳ��ȥ��this�Ķ����������Ǹö�������t1����
			ֻ�ܵȴ�this�������Ĺ黹
		*/
		synchronized(this){//С�����з��빲�����
			double after=balance-money;
			//�ӳ٣������߳�ȡ����δ�ı�ʱ����һ���߳��ٴ�ȡ�ȥ����1000������4000
			try{Thread.sleep(1000);}catch(Exception e){}
			//����
			this.setBalance(after);
		}
	}
}