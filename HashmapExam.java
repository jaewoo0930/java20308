package s0828;

import java.util.HashMap;

public class HashmapExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map = new HashMap<>();
		map.put(20308, "김재우");
		map.put(20306, "김채륀");
		map.put(20304, "김동현");
		map.put(20303, "권순호");
		map.put(20302, "베트콩");
		
		System.out.println(map.toString());
		System.out.println(map.size());
		System.out.println(map.get(20306));
		map.put(20306, "김시겸S2ㅊㄹ");
		System.out.println(map.toString());
		for (Integer a : map.keySet()) {
			System.out.println(a);
		}
		for (String a : map.values()) {
			System.out.println(a);
		}
		for (Integer a : map.keySet()) {
			System.out.print("학번"+a);
			System.out.println("이름"+map.get(a));
			
		}
		map.remove(20306);
		System.out.println(map.toString());
		
	}

}
