package pr1.variables.lecture.demo.population;

public class PopulationProject {
	public static void main(String[] args) {
		int population = 312032486;
		long secondInOneYear = 365 * 24 * 60 * 60;
		long secondInTwoYears = secondInOneYear * 2;
		long secondInThreeYears = secondInOneYear * 3;
		long secondInFourYears = secondInOneYear * 4;
		long secondInFiveYears = secondInOneYear * 5;
		System.out.println("Population after 1 year: "
				+ (population + secondInOneYear / 7 + secondInOneYear / 13 + secondInOneYear / 45));
		System.out.println("Population after 2 years: "
				+ (population + secondInTwoYears / 7 - secondInTwoYears / 13 + secondInTwoYears / 45));
		System.out.println("Population after 3 years: "
				+ (population + secondInThreeYears / 7 - secondInThreeYears / 13 + secondInThreeYears / 45));
		System.out.println("Population after 4 years: "
				+ (population + secondInFourYears / 7 - secondInFourYears / 13 + secondInFourYears / 45));
		System.out.println("Population after 5 years: "
				+ (population + secondInFiveYears / 7 - secondInFiveYears / 13 + secondInFiveYears / 45));
	}
}
