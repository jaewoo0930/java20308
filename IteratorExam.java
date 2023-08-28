package s0828;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("바나나");
		list.add("사과");
		list.add("복숭아");
		list.add("시겸이");
		
		for (String s : list) {
			System.out.println(s);
		}
		Iterator<String> it = list.iterator();
	
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());

		for(int i=0;i<list.size();i++)
			System.out.println(it.next());
		
		
		
		it = list.iterator();
		while(it.hasNext()) {
			String s = it.next();
			if(s.contains("시겸이")) {
				it.remove();
			}
			
		}
		
		System.out.println(list.toString());
	
	
	
	
	}
		
}
