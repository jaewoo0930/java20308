package s0904;

public class NultiThread_2 {

	
	public static void main(String[] args) {
		
	MyRunnable myRun1 = new MyRunnable();
	MyRunnable myRun2 = new MyRunnable();
	MyRunnable myRun3 = new MyRunnable();
	
	myRun1.setPrint("?");
	myRun2.setPrint("$");
	myRun3.setPrint("@");
	
	Thread thread1 = new Thread(myRun1);// #
	Thread thread2 = new Thread(myRun2);// !
	Thread thread3 = new Thread(myRun3);// @
	
	thread1.start();
	thread2.start();
	thread3.start();
		
		for(int i = 0; i<10; i++) {
			System.out.print("* ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			e.printStackTrace();	
			}
			
		}

	}

}

class MyRunnable implements Runnable{
	
	String str;
	void setPrint(String s) {
		str = s;	
	}
	
	
	@Override
	public void run() {
	
		for(int i = 0; i<10; i++) {
			System.out.print(str + " ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();	
			}
		}
	}

}

