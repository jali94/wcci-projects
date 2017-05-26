public class FortuneTeller {

	public String buildFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}

	public String determineIncome(String firstName, String lastName, String month) {
		String firstLetterOfMonth = month.substring(0, 1).toLowerCase();
		String fullNameLowerCase = buildFullName(firstName, lastName).toLowerCase();
		if (fullNameLowerCase.contains(firstLetterOfMonth)) {
			return "$100,000,000";
		}
		return "$42";
	}
	
	public String buildFortune(String firstName, String lastName, String birthMonth) {
		// return buildFullName(firstName, lastnAME
	}

}
