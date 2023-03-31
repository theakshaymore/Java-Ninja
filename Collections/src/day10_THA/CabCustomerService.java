package day10_THA;

import java.beans.Customizer;
import java.util.ArrayList;

public class CabCustomerService {

	
	private ArrayList<CabCustomer> al = new ArrayList<CabCustomer>();
	
	public CabCustomerService(){
		//
	}
	
	public CabCustomerService(ArrayList<CabCustomer> al) {
		super();
		this.al = al;
	}



	public void addCabCustomer(CabCustomer c){
		al.add(c);
		System.out.println(al);
	}
	
	public boolean isNewCustomer(CabCustomer c){
		for(CabCustomer i: al){
			if(i.getPhone() == c.getPhone()){
				return false;
			}
		}
		return true;
//		return al.contains(c.getPhone()) ? true : false;
	}
	
	public double calculateBill(CabCustomer c){
		
		if(isNewCustomer(c)){
			return 0.0;
		}
		if(c.getDistance() <= 4){
			return 80.00;
		}else{
			return 80.0 + 6.0 * (c.getDistance() - 4.0);

		}
		
	}
	
	public String printBill(CabCustomer c){
		return c.getCustomerName() + " Please pay your bill " + calculateBill(c);
	}
}
