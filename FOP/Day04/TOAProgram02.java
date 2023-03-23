
public class TOAProgram02 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		
		System.out.print(getSumOfModifiedElements(arr));

	}
	
	public static int getSumOfModifiedElements(int[] arr){
		
		if(arr.length == 0){
			return -1;
		}
		
		int sum = 0;
		for(int i = 0; i <  arr.length; i++){
		
		//checking edge-cases
		if(arr[i] < 0){
			return -2;
		}
		if(arr[i] == 0){
			return -3;
		}
		//main logic
		if(arr[i] % 2 == 0){
			sum = sum + (arr[i] * 2);
		 }else{
			 sum = sum + (arr[i] / 2);
		 }
			
		}
		
		return sum;
	}

}
