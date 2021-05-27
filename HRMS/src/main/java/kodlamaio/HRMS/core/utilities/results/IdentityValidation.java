package kodlamaio.HRMS.core.utilities.results;

import kodlamaio.HRMS.business.services.FakeMernis;

public class IdentityValidation {
	public static boolean isRealPerson(String tcno) {
		return FakeMernis.validate(tcno);
	}
}
