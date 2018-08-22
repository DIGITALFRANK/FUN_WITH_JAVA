package ArrayList;

import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
//      System.out.println("Initial size of al: " + al.size());
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("hello");
        al2.add("hi");
//      System.out.println(al2);
        al.add("C");
//      System.out.println(al.get(0));
//      System.out.println(al);
        al.add("A");
//      System.out.println(al);
        al.add("E");
//      System.out.println(al);
        al.add("B");
//      System.out.println(al);
        al.add("D");
        System.out.println(al);
//      al.add(1, "A2");
        al.add(1,al2.get(1));
//      al.addAll(1, al2);
        System.out.println(al);
//      System.out.println("Size of al after additions: " + al.size());
//      
//      al.remove("F");
//      System.out.println(al);
//      al.remove("E");
//      System.out.println(al);
//      al.remove(2);
//      System.out.println(al);
//      System.out.println("Size of al after deletions: " + al.size());
    }
}
