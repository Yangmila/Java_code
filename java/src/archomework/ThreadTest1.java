//��ʵ��Runnable�ķ�ʽ��ʵ�ֶ��߳�
public class ThreadTest1 implements Runnable{

	long sleepTime;//����ʱ��
	String threadName;//�߳�����
	
	public ThreadTest1(long sleepTime,String threadName)
	{
		this.sleepTime=sleepTime;
		this.threadName=threadName;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++)
		{
			System.out.println(threadName+":"+i+"��ѭ��");
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
