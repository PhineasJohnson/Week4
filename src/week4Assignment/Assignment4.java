package week4Assignment;

public class Assignment4 {

	public static void main(String[] args) {
	//Array of ages. Final value added to prove flexibility.
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 32};
	//1., 2. Subtracts the value of the first element from the value of the final element in the array regardless of the array's length.
		int lastFromFirst = ages[ages.length - 1] - ages[0];
		System.out.println("The first age subtracted from the final age is " + lastFromFirst + ".");
	//3. Calculates the average value of the previous array.
		int totalAges = 0;
		for (int agesI = 0 ; agesI < ages.length ; agesI++) {
			totalAges =+ ages[agesI];
		}
		int agesAvg = totalAges / ages.length;
		System.out.println("The average of all of the ages is " + agesAvg + ".");
		
	//Array of names.
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	//4. Loop calculates average length of the names.
		int namesLengths = 0;
		for (int namesI = 0 ; namesI < names.length ; namesI++) {
			namesLengths = namesLengths + names[namesI].length();
		}
		int namesAvg = namesLengths / names.length;
		System.out.println("The average length of the names is " + namesAvg + ".");
	//5. Loop concatenates all names together with spaces in between.
		String allNames = "";
		for (int namesII = 0 ; namesII < names.length ; namesII++) {
			allNames = allNames + names[namesII];
			if (namesII < names.length - 1) {
				allNames = allNames + " ";
			}
		}
		System.out.println(allNames);
		
	//6. To access the last element of the array, use the length function and subtract one to get the final element's index.
	//7. The first element of the array always has an index of 0.
		
	//8. A new array that takes the last one and adds the length of each name to the array using a loop.
		int[] nameLengths = new int[names.length];
		for (int nLI = 0 ; nLI < names.length ; nLI++) {
			nameLengths[nLI] = names[nLI].length();
		}
		
	//9. A loop that adds together the values of all elements in the previous array.
		int nameLengthsTotal = 0;
		for (int tNLI = 0 ; tNLI < nameLengths.length ; tNLI++) {
			nameLengthsTotal = nameLengthsTotal + nameLengths[tNLI];
		}
		System.out.println("The total length of all names is " + nameLengthsTotal + ".");

// Start of the second set of questions.
	//10b. Prints the result of 10a to prove it functions.
		System.out.println("The concatenated word is " + conWord("Thirty", 5) + ".");
		
	//11b. Prints the result of 11a to prove it functions.
		System.out.println("Their full name is " + makeName("Tim", "Allen") + ".");
		
	//12b. Creates the array for 12a and prints the result of 12a to prove it functions.
		int[] numArray = {2, 60, 14, 2, 5};
		System.out.println("It is " + moreThanCentury(numArray) + " that the array is greater than 100.");
		
	//13b. Creates the array for 13a and prints the result of 13a to prove it functions.
		double[] dubArray = {5.22, 61.2, 72.4, 14.23};
		System.out.println("The average of the double array is " + makeDoubleAvg(dubArray) + ".");
	
	//14b. Creates the two arrays for 14a and prints the result of 14a to prove it functions.
		double[] dubArrayI = {16.4, 1.2, 53.8, 42.242};
		double[] dubArrayII = {22.43, 42, 11.221, 13};
		System.out.println("It is " + firstOverSecond(dubArrayI, dubArrayII) + " that the first array's average is greater than the second's.");
	
	//15b. Prints the result of 15a to prove it functions.
		System.out.println("It is " + willBuyDrink(true, 11.50) + " that I will buy a drink today.");
		
	//16b. Prints the result of 16a to prove it functions.
		System.out.println("It's " + makeNewContent(100, 200, 3, 7) + " that I need to create another video soon.");
	}
	
	//10a. A method that concatenates a word to itself a specified number of times.
	public static String conWord(String inWord, int inNum) {
		String connedWord = "";
		for (int cWI = 0 ; cWI < inNum ; cWI++) {
			connedWord = connedWord + inWord;
		}
		return connedWord;
	}
	
	//11a. A method that takes two strings and puts them together to create a full name.
	public static String makeName(String firstName, String lastName) {
		String fullName = firstName + " " + lastName;
		return fullName;
	}
	
	//12a. A method that returns true if an array of integers totals greater than 100.
	public static boolean moreThanCentury(int[] numArray) {
		int sumNumArray = 0;
		for (int nAI = 0 ; nAI < numArray.length ; nAI++) {
			sumNumArray = sumNumArray + numArray[nAI];
		}
		boolean isGreater;
		if (sumNumArray > 100) {
			isGreater = true;
		} else {
			isGreater = false;
		}
		return isGreater;
	}
	
	//13a. A method that returns the overall average of an array of double variables.
	public static double makeDoubleAvg(double[] dubArray) {
		double doubleTotal = 0.0;
		for (int dTI = 0 ; dTI < dubArray.length ; dTI++) {
			doubleTotal = doubleTotal + dubArray[dTI];
		}
		double doubleAvg = doubleTotal / dubArray.length;
		return doubleAvg;
	}
	
	//14a. A method that returns true if the first double array has a higher average than the second one.
	public static boolean firstOverSecond(double[] dubArrayI, double[] dubArrayII) {
		double doubleTotalI = 0.0;
		for (int dTII = 0 ; dTII < dubArrayI.length ; dTII++) {
			doubleTotalI = doubleTotalI + dubArrayI[dTII];
		}
		double doubleTotalII = 0.0;
		for (int dTIII = 0 ; dTIII < dubArrayII.length ; dTIII++) {
			doubleTotalII = doubleTotalII + dubArrayII[dTIII];
		}
		double doubleAvgI = doubleTotalI / dubArrayI.length;
		double doubleAvgII = doubleTotalII / dubArrayII.length;
		boolean isFirstBigger = false;
		if (doubleAvgI > doubleAvgII) {
			isFirstBigger = true;
		}
		return isFirstBigger;
	}
	
	//15a. A method that determines whether a drink will be bought based on if it is hot and the amount of money at one's disposal.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		boolean willBuy = false;
		if (isHotOutside && moneyInPocket > 10.50) {
			willBuy = true;
		}
		return willBuy;
	}
	
	//16a. A method I have created that returns true if I need to create a new YouTube video because either I'm short on rent or I haven't uploaded in a month.
	public static boolean makeNewContent(double bankedCash, double rentDue, int sinceUpload, int maxWait) {
		boolean needContent = false;
		if (rentDue >= bankedCash || sinceUpload >= maxWait) {
			needContent = true;
		}
		return needContent;
	}
}