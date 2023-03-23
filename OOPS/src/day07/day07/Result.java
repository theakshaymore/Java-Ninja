package day07.day07;

public class Result {
	
	public static String resultCalculator(Student student){
		
		if(student.getMarks1() < 40 || student.getMarks2() < 40 || student.getMarks3() < 40){
			 return "Fail";
		}else{
			double percentage = (student.getMarks1() + student.getMarks2() + student.getMarks3()) / 3;
			if(percentage > 70){
				return "A";
			}
			if(percentage >= 55 && percentage <= 70){
				 return "B";
			}
			if(percentage >= 44 && percentage < 55){
				return "C";
			}
		}
		
		 return "Fail"; 
	}
	

}
