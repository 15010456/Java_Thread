/*
	����Timer��ʱ����Ӧ��
	���ã�ÿ��һ�ι̶���ʱ��ִ��һ�δ���
	
	wait();�ȴ�
	notify();����
*/
import java.util.*;
import java.text.*;

public class ThreadTest20
{
	public static void main(String[] args) throws Exception{
		//1.������ʱ��
		Timer t=new Timer();
		//2.ָ����ʱ����t.schedule(TimerTask task, Date firstTime,long period);����һΪ��ʱ���񣬲�����Ϊ��ʼʱ�䣬������Ϊ���ʱ��
		t.schedule(
			new LogTimerTask(),
			new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").parse("2017-07-11 18:26:00 000"),
			10*1000);

	}
}
//ָ����ʱ����
class LogTimerTask extends TimerTask
{
	public void run(){
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(new Date()));
	}
}