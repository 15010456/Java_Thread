/*
	���³���ʹ���߳�ͬ�����ƿ������ݵİ�ȫ
*/
public class ThreadTest16
{
	public static void main(String[] args){
		//����һ���������˻�
		Account16 act=new Account16("actno001",5000);
		//�����̶߳�ͬһ�˻�ȡ��
		Processor16 p=new Processor16(act);
		Thread t1=new Thread(p);
		Thread t2=new Thread(p);
		t1.start();
		t2.start();
	}
}
//ȡ���߳�
class Processor16 implements Runnable
{
	//�˻�
	Account16 act;
	//Constructor
	Processor16(Account16 act){
		this.act=act;
	}
	public void run(){
		act.withdraw(1000.0);
		System.out.println("ȡ��1000�ɹ�����"+act.getBalance());
	}
}


//�����˻�
class Account16
{
	private String actno;//�˺�
	private double balance;//���
	
	public Account16(){}
	public Account16(String actno,double balance){
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
	//synchronized�ؼ�����ӵ���Ա�����ϣ��߳����ߵ�Ҳ��this�Ķ�����
	/*
		synchronized�ؼ��ַ��ڷ����Ͽ��Ƶ����������������������synchronized
	*/
	public synchronized void withdraw(double money){//�Ե�ǰ�˻�����ȡ�����
		double after=balance-money;
		//�ӳ٣������߳�ȡ����δ�ı�ʱ����һ���߳��ٴ�ȡ�ȥ����1000������4000
		try{Thread.sleep(1000);}catch(Exception e){}
		//����
		this.setBalance(after);
	}
}