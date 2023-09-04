package s0904;

public class MultiThead_1 {

	public static void main(String[] args) {
		
		MyThread my = new MyThread();
		my.start();
		
		MyThread2 my2 = new MyThread2();
		my2.start();
		
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
class MyThread extends Thread{
	@Override
	public void run(){
		for(int i = 0; i<10; i++) {
			System.out.print(". ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			e.printStackTrace();	
			}
		}
	}
}

class MyThread2 extends Thread{
	@Override
	public void run(){
		for(int i = 0; i<10; i++) {
			System.out.print("@ ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			e.printStackTrace();	
			}
		}
	}
}