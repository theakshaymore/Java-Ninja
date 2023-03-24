package day09_GA;



public class MyCalculator implements AdvancedArithmetic {

	
	public int divisorSum(int n) {
		int count = 1;
		for(int i = 2; i <= n; i++){
			if(n % i == 0){
				count += i;
			}
		}
		return count;
	}

	

}
