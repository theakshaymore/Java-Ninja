package day13_THA;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class DataFile {
	public static void main(String[] args) throws IOException {
		RandomAccessFile inputFile = new RandomAccessFile("C:\\Users\\AKSHAY\\Desktop\\Book1.csv", "r");
		List<Student> students = readStudents(inputFile);
		if (students == null) {
			System.out.println("Input file is empty");
		} else {
			for (Student student : students) {
				System.out.println(student);
				System.out.println("Total marks: " + student.getTotalMarks());
			}
		}
		inputFile.close();
	}
	
	
	public static List<Student> readStudents(RandomAccessFile raf) throws IOException {
		List<Student> students = new ArrayList<>();
		String row;
		while ((row = raf.readLine()) != null) {
			String[] fields = row.split(":");
			if (fields.length == 5) {
				int id = Integer.parseInt(fields[0]);
				String name = fields[1];
				int marks1 = Integer.parseInt(fields[2]);
				int marks2 = Integer.parseInt(fields[3]);
				int marks3 = Integer.parseInt(fields[4]);
				Student student = new Student(name, id, marks1, marks2, marks3);
				students.add(student);
			}
		}
		if (students.size() == 0) {
			return null;
		}
		return students;
	}
}
