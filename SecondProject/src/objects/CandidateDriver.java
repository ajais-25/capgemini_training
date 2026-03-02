package objects;

public class CandidateDriver {

	public static void main(String[] args) {
		Candidate c1 = new Candidate("Akshat Jaiswal", 1234567890L, true);
		
//		c1.name = "Akshat Jaiswal";
//		c1.mobileNumber = 1234567890L;
//		c1.gender = false;
		
		System.out.println(c1.name);
		System.out.println(c1.mobileNumber);
		System.out.println(c1.gender);

	}

}
