package s0814;

import java.util.LinkedList;

public class linekedListExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LinkedList<String> list = new LinkedList<>();
			
			list.add("김재우");
			list.add("김시겸");
			list.add("김동현");
			
			System.out.println(list.toString());
			
			System.out.println("첫번째 값"+list.get(0));
			System.out.println("마지막 값"+list.get(2));
			
			list.addFirst("권순호");
			
			list.addLast("구예성");
			
			
			for (String s : list) {
				System.out.println(s);
			}
	}

}
