package s0904;

import java.util.Scanner;

public class RobotRace {
	
	
	public static void main(String[] args) {
		
		System.out.println("로봇 선택");
		
		Scanner s = new Scanner(System.in);
		String myRobot = s.next();
				
		// TODO Auto-generated method stub
		Race race1 = new Race("A");
		Race race2 = new Race("B");
		Race race3 = new Race("C");
	
	
		
		race1.start();
		race2.start();
		race3.start();
		
		
	}

}
	class Race extends Thread{
		static int score = 0;
		int	myscore=0;
		String name;
		Race(String name){
			this.name=name;
		
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
			for(int i=0;i<10;i++) {
				if(name.equals("A")) {
					System.out.println("	A");
				}
				else if(name.equals("B")) {
					System.out.println("		B");
				}
					
				else if(name.equals("C")) {
					System.out.println("			C");
				}
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
					// TODO: handle exception
			}
				
			}
				score = score + 1;
				myscore = score;
				System.out.println(name+": 결승선에 도착함");
				System.out.println("당신이 선택한 "+ name +"은"+myscore+"등 입니다");
		}
}
		
		
		
	