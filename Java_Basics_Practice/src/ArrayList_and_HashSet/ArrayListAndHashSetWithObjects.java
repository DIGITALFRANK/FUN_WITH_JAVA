package ArrayList_and_HashSet;

import java.util.*;

public class ArrayListAndHashSetWithObjects {
	
	public static void main(String[] args) {
		List<Book> list = new ArrayList<Book>();
		
		Book b1 = new Book(101,  "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
		Book b4 = new Book(104, "Operating System", "Galvin", "Wiley", 6);
//		list.add(b1);
//		list.add(b2);
//		list.add(b3);
//		list.add(b1);
//		
//		for(Book b:list) {
//			System.out.println(b.id + " " + b.name + " " + b.author+" "+b.publisher+" "+b.quantity);
//		}
		
//		ListIterator<Book> itr = list.listIterator();
//		while(itr.hasNext()) {
//			new Book myBook = itr.next();
//			System.out.print(myBook.id + " ");
//			System.out.println(itr.next());
//		}
		
		HashSet<Book> set = new HashSet<Book>();
		set.add(b4);
		set.add(b3);
		set.add(b2);
		set.add(b1);
		
		System.out.println(set);
//		set.add(b1);
		
		for(Book b:set) {
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
	}
}


