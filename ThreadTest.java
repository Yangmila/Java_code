//�̳�Thread����ʵ�ֶ��߳�
public class ThreadTest extends Thread
{
	long sleepTime;//����ʱ��
	String threadName;//�߳�����
	
	public ThreadTest(long sleepTime,String threadName)
	{
		this.sleepTime=sleepTime;
		this.threadName=threadName;
	}
	
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println(threadName+":"+i+"��ѭ��");
			try {
				sleep(sleepTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
