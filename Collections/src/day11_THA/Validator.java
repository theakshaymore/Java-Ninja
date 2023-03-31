package day11_THA;

public class Validator extends Exception{

	public boolean validatePassword(String password) throws WrongPasswordException{
		int smallLetterCount = 0,
				capitalLetterCount = 0,
				numberCount = 0,
				symbolCount = 0;


		for(int i = 0; i < password.length(); i++){
			char c = password.charAt(i);
			if(Character.isLowerCase(c)){
				smallLetterCount += 1;
			}
			if(Character.isUpperCase(c)){
				capitalLetterCount += 1;
			}
			if(Character.isDigit(c)){
				numberCount += 1;
			}
			if(!Character.isLetterOrDigit(c) && !Character.isWhitespace(c)){
				symbolCount += 1;
			}		
		}

		if(password.length() >= 8 
				&& !password.contains(" ") 
				&& smallLetterCount > capitalLetterCount 
				&& smallLetterCount >=2 
				&& capitalLetterCount >= 1
				&& symbolCount >= 1
				&& numberCount >= 1
				){
			return true;
		}else{

			throw new WrongPasswordException("The password does not meet the criteria");
		}
	}	
}
