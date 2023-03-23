package oops_proj01;

public class Customer {
	
	
	
	
	public void transfer(int id1, int id2, double amount){
		
		for(int i = 0; i< count; i++){
			
			if(customerArray[i].getId() == id2){
				if(customerArray[i].getBalance() > amount){
					
					customerArray[i].setBalance() = customerArray[i].getBalance() - amount;
				}else{
					return "Insufficent amount"
				}
			}
			
			
			if(customerArray[i].getId() == id1 ){
				
				customerArray[i].setBalance() = customerArray[i].getBalance() + amount;
			}
			
			
		}
	}

	public static void main(String[] args) {
		
		

	}

}
