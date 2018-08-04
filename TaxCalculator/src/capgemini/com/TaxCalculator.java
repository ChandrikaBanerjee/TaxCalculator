/*Simple Java Application to calculate tax based on salary with some test cases*/
package capgemini.com;

public class TaxCalculator {

	private String empName;
	private boolean isIndian;
	private double empSal;

	public double calculateTax(String empName, boolean isIndian, double empSal) throws Exception {
		double tax = 0.0;

	//Throwing exceptions	
	try {
		
		if ((empName) == null || empName.isEmpty() ) {
			throw new EmployeeNameInvalidException();
		} 
		else if (!isIndian) {
			throw new CountryNotValidException();
		}
//Calculating tax based on salary
		else if ((empSal > 100000) && (isIndian)) {
			tax = (empSal * 8 )/ 100;
		} else if (empSal >= 50000 && empSal < 100000 && (isIndian)) {
			tax =(empSal * 6)/ 100;
		} else if (empSal >= 30000 && empSal < 50000 && (isIndian)) {
			tax = (empSal * 5 )/ 100;
		} else if (empSal >= 10000 && empSal < 300000 && (isIndian)) {
			tax =(empSal * 4 )/ 100;
		} else if (empSal < 10000 && (isIndian)) {
			throw new TaxNotEligibleException();
		}
		
	}catch (CountryNotValidException | EmployeeNameInvalidException |TaxNotEligibleException e) {
		System.out.println(e.toString());
	}
	return tax;
	}

}
