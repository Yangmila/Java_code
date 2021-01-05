
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*ThreadTest th1=new ThreadTest(200,"线程1");
		ThreadTest th2=new ThreadTest(300,"线程2");
		th1.start();
		th2.start();//将线程由新建状态变为就绪状态，排队等待获取CPU资源*/
		ThreadTest1 th1=new ThreadTest1(200,"线程1");
		ThreadTest1 th2=new ThreadTest1(300,"线程2");
		Thread t1=new Thread(th1);
		Thread t2=new Thread(th2);
		t1.start();
		t2.start();
	}

}
