package day13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Pp {

	public static void main(String[] args) throws IOException {
	
		FileReader fr = new FileReader("C:\\Users\\AKSHAY\\Desktop\\demo1.txt");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("C:\\Users\\AKSHAY\\Desktop\\demo2.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String s = "";
		while((s = br.readLine()) != null){
//			System.out.println(s);
			s = br.readLine();
		}
		fr.close();
		
		
		String s2 = "Hello Everyone";
		bw.write(s);
		bw.close();
		fw.close();
		
	}

}
