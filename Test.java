
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*ThreadTest th1=new ThreadTest(200,"�߳�1");
		ThreadTest th2=new ThreadTest(300,"�߳�2");
		th1.start();
		th2.start();//���߳����½�״̬��Ϊ����״̬���Ŷӵȴ���ȡCPU��Դ*/
		ThreadTest1 th1=new ThreadTest1(200,"�߳�1");
		ThreadTest1 th2=new ThreadTest1(300,"�߳�2");
		Thread t1=new Thread(th1);
		Thread t2=new Thread(th2);
		t1.start();
		t2.start();
	}

}
