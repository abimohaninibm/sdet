package Activity2_4;

public class Activity2_4 {

	public static void main(String[] args) {
		try {
			Activity2_4.exceptionTest("Will print in console");
			Activity2_4.exceptionTest(null);
			Activity2_4.exceptionTest("Wont Execute");

		} catch (CustomException a) {
			System.out.println("Custom error : " + a.getMessage());
		}

	}

	public static void exceptionTest(String s) throws CustomException {

		if (s == null) {
			throw new CustomException("String Value is NULL.......");
		} else {
			System.out.println("The String is : " + s);
		}
	}
}
