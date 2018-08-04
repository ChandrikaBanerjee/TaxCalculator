package capgemini.com;

public class EmployeeNameInvalidException extends Exception {

	@Override
	public String toString() {
		return "The employee name cannot be empty.";
	}

}
