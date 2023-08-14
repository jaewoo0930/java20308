package s0814;

import java.util.ArrayList;

public class ArrayListExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Hello");
			
			ArrayList<String> list = new ArrayList<>();
			list.add("김재우");
			list.add("개시겸");
			list.add("김시겸");
			list.add("포천시겸");
			list.add("똥시겸");

			System.out.println(list.toString());
			list.remove("김시겸");
			System.out.println(list.toString());
			System.out.println(list.get(3));
			System.out.println(list.size());
			System.out.println("------------------------------------------------------------------------------------------------------------");
	
			for (String s : list) {
				System.out.println(s);
			}
			System.out.println("------------------------------------------------------------------------------------------------------------");

			list.removeAll(list);
			
			System.out.println("지운후 사이즈"+list.size());
			System.out.println("------------------------------------------------------------------------------------------------------------");
			list.add("서울");
			list.add("로봇");
			if(list.contains("서울")== true);
				System.out.println("서울을 포함하고 있음");
	
	
	}	

}
