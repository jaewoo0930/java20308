package s0828;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ArrayList로 로또 만들기");
		LottoArrayList lotto1 = new LottoArrayList();
		lotto1.getRandomBalls();
		ArrayList<Integer> lotto = new ArrayList<>();
		while(lotto.size()<6) {
			Random r = new Random();
			Integer num = r.nextInt(45)+1;
			if(lotto.contains(num)) {
				continue;
				}
			else
				lotto.add(num);
			
		}
		System.out.println(lotto.toString());
		Collections.sort(lotto);
		
		
		
		System.out.println("HashSet로 로또 만들기");
		LottoHashSet lotto2 = new LottoHashSet();
		lotto2.getRandomBalls();
		ArrayList<Integer> lotto11 = new ArrayList<>();
		while(lotto11.size()<6) {
			Random r = new Random();
			Integer num = r.nextInt(45)+1;
			if(lotto11.contains(num)) {
				continue;
				}
			else
				lotto11.add(num);
			
		}
		System.out.println(lotto11.toString());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
