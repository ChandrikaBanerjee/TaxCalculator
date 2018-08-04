package capgemini.com;

public class TaxNotEligibleException extends Exception {

	@Override
	public String toString() {
		return "The employee does not need to pay tax.";
	}

}