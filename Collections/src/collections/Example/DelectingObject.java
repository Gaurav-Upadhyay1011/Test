package collections.Example;

import java.util.ArrayList;
import java.util.Iterator;

public class DelectingObject {

	public static void main(String[] args) {
		 ArrayList<Books> books=new ArrayList<Books>();
		 books.add(new Books(111,"java","ratan"));
		 books.add(new Books(222,"C","anu"));
		 books.add(new Books(333,"CPP","durga"));
		 
		 Iterator<Books> itr=books.iterator();
		 
		 while(itr.hasNext())
		 {
			 Books books1=itr.next();
			 if(books1.bid==111)
			 {
				 itr.remove();
			 }
		 }
		 for(Books b:books)
		 {
			 System.out.println(b.bid+" "+b.bauthor+" "+b.bname);
		 }
	}

}
