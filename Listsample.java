package s0828;

import java.util.ArrayList;

public class Listsample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//중복 허용,순서 허용
		ArrayList<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(5);
		list.add(4);
		list.add(0,9);
		list.add(3);
		System.out.println(list.toString());
		list.remove(3);
		System.out.println(list.toString());
		if(list.contains(0)) {
			System.out.println("4있음");
		}
		System.out.println(list.get(6));
	}

}
