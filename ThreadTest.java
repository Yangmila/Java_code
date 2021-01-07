//继承Thread类来实现多线程
public class ThreadTest extends Thread
{
	long sleepTime;//休眠时间
	String threadName;//线程名称
	
	public ThreadTest(long sleepTime,String threadName)
	{
		this.sleepTime=sleepTime;
		this.threadName=threadName;
	}
	
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println(threadName+":"+i+"次循环");
			try {
				sleep(sleepTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
