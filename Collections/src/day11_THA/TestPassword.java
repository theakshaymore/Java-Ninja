package day11_THA;

public class TestPassword {

	public static void main(String[] args) {

		Validator v1 = new Validator();
		try {
			System.out.println(v1.validatePassword("Akshay@27262727") ? "Pass validated succesfully" : "ERROR");
		} catch (WrongPasswordException e) {

			e.getMessage();

		}
	}

}
