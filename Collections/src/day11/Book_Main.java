package day11;

import java.util.*;
import java.util.Map.Entry;

public class Book_Main 
{

	public static void main(String[] args) 
	{
		
		Book b1=new Book(101,"Java","JamesGosling","TS publications");
		Book b2=new Book(102,"C","DennisRitche","RS publications");
		Book b3=new Book(103,"Spring","Rod Jhonson","TSR publications");
		Book b4=new Book(104,"Hadoop","xyz","TS publications");
		Book b5=new Book(105,"c++","James","TSR publications");
		Map<Integer,Book> b=new LinkedHashMap<Integer,Book>();
		b.put(b1.getId(),b1);
		b.put(b2.getId(),b2);
		b.put(b3.getId(),b3);
		b.put(b4.getId(),b4);
		b.put(b5.getId(),b5);
		display(b);
        Map<Integer,Book> tree_map=new TreeMap<Integer,Book>(new keysDescOrder());
        tree_map.putAll(b);
        display(tree_map);
	}

	public static void display(Map<Integer,Book> b) 
	{
		for(Entry<Integer,Book> e: b.entrySet())
		{
			System.out.println(e);
		}
		System.out.println("....................");
	}

}
