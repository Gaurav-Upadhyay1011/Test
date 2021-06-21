package collections.Example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;



public class ListIterator1 {

	public static void main(String[] args) {
		
		
		ArrayList al=new ArrayList();
		al.add("ratan");
		al.add("anu");
		al.add("durga");
        al.add("sraviya");
        System.out.println(al);
        
        System.out.println("***Iterator Remove***");
		
        Iterator itr=al.iterator();
        while(itr.hasNext())
        {
        	String name=(String) itr.next();
        	if(name.equals("sraviya")) 
        	{
        		itr.remove();       		
       
        	}
        	
        }
        System.out.println(al);

	}

}
