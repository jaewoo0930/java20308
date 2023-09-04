package s0904;

public class SingelTherad extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i<10; i++) {
			System.out.print("* ");
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
			e.printStackTrace();	
			}
			
		}
		
		
		
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
