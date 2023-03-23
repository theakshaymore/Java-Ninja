import java.util.Arrays;

public class P2 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int rotations = 1;
		
	    System.out.print(Arrays.toString(rotate(arr, rotations)));
		
		
//		arr = rotate(arr, rotations);
//		for(int i = 0; i <= arr.length; i++){
//			System.out.print(arr[i]);
//		}

	}
	
	
	public static int[] rotate(int[] arr, int rotations){
		
		if (arr == null) {
	        return null;
	    }
	    if (rotations == 0) {
	        return arr;
	    }
	    
//	    int[] rotatedArr = new int[arr.length];
//	    for (int i = 0; i < arr.length; i++) {
//	        int newI = i + rotations;
//	        if (newI >= arr.length) {
//	        	newI = newI - arr.length;
//	        }
//	        rotatedArr[newI] = arr[i];
//	    }
//	    
		for(int i = 1; i <= rotations; i++) {
			int last = arr[arr.length-1];
            for(int j = arr.length-2; j >= 0; j--) {
               arr[j + 1] = arr[j];
            }
            arr[0] = last;
        }
		
		return arr;
		
	}

}
