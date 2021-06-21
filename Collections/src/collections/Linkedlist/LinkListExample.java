package collections.Linkedlist;

import java.util.LinkedList;

public class LinkListExample {

	public static void main(String[] args) {
		
		LinkedList <String> ll=new LinkedList <String>();
		ll.add("Gaurav");
    	ll.add("Saurabh");
		ll.add(null);
        System.out.println(ll); 
        ll.addFirst("aaa");
        ll.addLast("zzz");
        System.out.println(ll);
        System.out.println(ll.size());
        ll.add(2, "Monu");
        System.out.println(ll);
        
        ll.set(0, "Ranbir");
        
        System.out.println(ll);
        System.out.println(ll.isEmpty());
        ll.remove(1);
        ll.remove("Saurabh");
        System.out.println(ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);

}
}