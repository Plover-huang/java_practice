
public class newThead1 implements Runnable{
	Thread thread;
	public newThead1(){
		thread=new Thread(this,"newThread1");
		System.out.println("new Thread1 created; loop for 10");
		thread.start();
	}
	public void run(){
//		for(int i=0;i<)
	}
}
