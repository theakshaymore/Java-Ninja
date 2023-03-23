// package FOP.WeeklyTest;

import java.util.Scanner;

public class KaprekarNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		String result = isKaprekarNumber(num);
		System.out.println(result);
		sc.close();

	}
	public static String isKaprekarNumber(int num)
	{
			if(num<0)
				return "-1";
			if(num==0)
				return "0";
			if (num == 1)
				return "true";
	      
	        int sqNum = num * num;
	        int digitCounter = 0;
	        while (sqNum != 0)
	        {
	        	digitCounter = digitCounter + 1;
	            sqNum = sqNum / 10;
	        }
	      
	        sqNum = num * num; 

	        for (int splitPoint=1; splitPoint<digitCounter; splitPoint++)
	        {
	             int splitPointValue = (int) Math.pow(10, splitPoint);
	      
	             if (splitPointValue == num)
	                continue;
	      
	             int sum = sqNum/splitPointValue + sqNum % splitPointValue;
	             if (sum == num)
	               return "true";
	        }
	        return "false";
		
	}

}
