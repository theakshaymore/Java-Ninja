package day10;

import java.util.*;

public class Pp {

	public static void main(String[] args) {

		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		System.out.println("Enter Elements: ");
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<5; i++){
			a1.add(sc.nextInt());
		}
//		for(int a: a1){
//			a2.add(a);
//		}
		a2.addAll(a1);
		System.out.println(a2);

	}

}
