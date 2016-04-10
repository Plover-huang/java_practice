import java.util.Random;

public class newThread implements Runnable{
	private Thread t;
	private int a[]={1,5,10};
	public newThread(String threadname){
		setT(new Thread(this,threadname));
//		t.setName(threadname);
		Random b=new Random();
		int kk=b.nextInt(3);
		int pp=a[kk];
		t.setPriority(pp);
		System.out.println(getT().getName()+"gutten thread created:"+getT());
		System.out.println(getT().getName()+"priority:"+getT().getPriority());
		getT().start();
	}
	public void run(){
		Random kRandom=new Random();
		int bound=kRandom.nextInt(5);
		bound+=5;
		System.out.println(getT().getName()+"bound:"+bound);
		for(int i=0;i<bound;i++){
			System.out.println(getT().getName()+"gutten thread number:"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("gutten thread interrupted.");
				e.printStackTrace();
			}
		}
		System.out.println(getT().getName()+"gutten thread finished");
	}
	/**
	 * @return the t
	 */
	public Thread getT() {
		return t;
	}
	/**
	 * @param t the t to set
	 */
	private void setT(Thread t) {
		this.t = t;
	}
}
