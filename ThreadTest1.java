//用实现Runnable的方式来实现多线程
public class ThreadTest1 implements Runnable{

	long sleepTime;//休眠时间
	String threadName;//线程名称
	
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
			System.out.println(threadName+":"+i+"次循环");
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
