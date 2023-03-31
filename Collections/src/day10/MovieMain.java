package day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MovieMain {

	

	public static void main(String[] args) {
		
		
		ArrayList<Movie> al = new ArrayList<Movie>();
		al.add(new Movie(101,4,"abc"));
		al.add(new Movie(122,5,"xyz"));
		al.add(new Movie(109,2,"sss"));
		
		Collections.sort(al);
		
		Iterator<Movie> e=al.Iterator<Movie>();
		while(e.hasNext())
		 {
			Movie el=e.next();
			System.out.println(el);
		 }

	}

}
