
public class TOAProgram01 {

	public static void main(String[] args) {
		int row = 4, col = 5;
		System.out.println(createBoxPattern(row, col));

	}
	
	
	public static String createBoxPattern(int row, int col){
		
		String output = "";
		
		if(row < 0 || col < 0){
			return output = output + "-1";
		}
		if(row == 0 || col == 0){
			return output = output + "-2";
		}
		for(int i = 1; i <= row; i ++){
			for(int j = 1; j <= col; j++){
				if(i == 1 || i == row || j == 1 || j == col ){
					output = output + "*";
				}else{
					
					output = output + " ";
				}

			}
//			System.out.println();
			output = output + "\n";
		}
		return output;
	}

}
