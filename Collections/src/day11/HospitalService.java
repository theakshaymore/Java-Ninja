package day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HospitalService extends Hospital {
	
	private List<Hospital> hospitalList;
	private int hospitalCode;
	
	
	
	public HospitalService() {
		hospitalList = new ArrayList<Hospital>();
        hospitalCode = 1000;
	}



	public int addHospital(Hospital hospital) {
        hospital.setHospitalCode(hospitalCode++);
        hospitalList.add(hospital);
        return hospital.getHospitalCode();
    }
	
	public Map<Integer, String> getHospitals() {
        Map<Integer, String> hospitalMap = new HashMap<Integer, String>();
        for (Hospital hospital : hospitalList) {
            hospitalMap.put(hospital.getHospitalCode(), hospital.getHospitalName());
        }
        return hospitalMap;
    }
	
	public Hospital getHospitalDetails(int hospitalCode) {
        for (Hospital hospital : hospitalList) {
            if (hospital.getHospitalCode() == hospitalCode) {
                return hospital;
            }
        }
        return null;
    }
}
