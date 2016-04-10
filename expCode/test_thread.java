/**
 * Created by gutten on 2016/1/26.
 */





public class test_thread {
    public static void main(String args[]){
        Thread t=Thread.currentThread();
//        System.out.println(t);
        t.setName("mainThread");
        System.out.println(t.getName()+"created");
        newThread kkNewThread=new newThread("kkNewThread");
        newThread jjNewThread=new newThread("jjNewThread");
        newThread llNewThread=new newThread("llNewThread");
        for(int i=0;i<2;i++){
        	System.out.println("mainThread number:"+i);
        	try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				System.out.println("mainThread interrupted.");
				e.printStackTrace();
			}
        }
        
//        if(!kkNewThread.getT().isAlive()&&!jjNewThread.getT().isAlive()&&!llNewThread.getT().isAlive()){
//        	System.out.println("mainthread finished");
//        }
//        else {
//			System.out.println("-a0sd-fa-sdf-a0sdf-0");
//		}
        
        try {
			kkNewThread.getT().join();
			jjNewThread.getT().join();
			llNewThread.getT().join();
		} catch (Exception e) {
			// TODO: handle exception
		}
        System.out.println("KK:"+kkNewThread.getT().isAlive()+"\nJJ:"+jjNewThread.getT().isAlive()+"\nLL:"+llNewThread.getT().isAlive());
        System.out.println("mainThread finished");
    }
}
