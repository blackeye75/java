package ll_in_collection;

import java.util.LinkedList;

public class CollectionLL {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		System.out.println(list.size());
		list.add(10);
		list.add(20);
		System.out.println(list.size());
		list.addFirst(100);
		list.addLast(30);
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		list.set(0, 1000);
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		System.out.println(list.remove());
		
		
	}

}
