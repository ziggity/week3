package week3;

public class week3 {

	public static void main(String[] args) {
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		int[] ages2 = {5,3,5,2,1,7,64,35,254,3, 9, 23, 64, 2, 8, 28, 93};
		calculateAverageAge();
		calculateAverageLetters();
		concatAllNamesFromArrayEasy();
		concatAllNamesFromArrayWLoop();
		printNameLengthsArray();
		calcSumNamelengths();
		String concat = concatNumTimes("cat", 5);
		System.out.println(concat);
		String fullNamePrinter = fullName("zach", "beecher");
		System.out.println(fullNamePrinter);
		int[] nums = {5,2,1,5,3,333,22};
		System.out.println(sumIsGreaterThan100(nums));
		
		double[] numbers = {2.32, 2.33, 1.22, 3.35};
		double[] numbers2 = {4.32, 4.33, 4.22, 3.35};
		System.out.println(avgElementsInArray(numbers));
		System.out.println(avgCheckFirstArrayGreater(numbers, numbers2));
		
		//boolean isHotOutside = true;
		//double moneyInPocket = 22.45;
		//System.out.print(willBuyDrink(isHotOutside, moneyInPocket));
		double haybin = 2.03; 
		int rabbits = 2;
		boolean hungry = true;
		System.out.print(willBuyRabbitHay(haybin, rabbits, hungry));

//Add up first and last value of an array without using bracket notation with numbers
		int firstValueFound = 0;
		int lastValueFound = 0;
		for(int i = 0; i < ages.length; i++) {
			if (i == 0) {
				firstValueFound = ages[i];
			} if(i == ages.length -1) {
				lastValueFound = ages[i];
			}
		}
		System.out.println(Math.abs((firstValueFound - lastValueFound)));
//Prints out the values of new Array we created from the add age to array
		   int newAge = 5;
		   ages2 = addNewAge(ages2, newAge);
		    System.out.print("Ages: ");
		    for (int i = 0; i < ages2.length; i++){
		        if (i == ages2.length - 1){
		            System.out.println(ages2[i]);
		        }
		        else{
		           System.out.print(ages2[i] + ", ");
		          }
		        }
		    }
//Method to Add new age to the ages array
		public static int[] addNewAge(int [] ages2, int newAge){
		    int[] newAgeArray = new int[ages2.length + 1];
		    for (int i = 0; i < ages2.length; i++){
		    	newAgeArray[i] = ages2[i];
		    }
		    newAgeArray[newAgeArray.length - 1] = newAge;
		    ages2 = newAgeArray; 
		    return ages2;
}
//calculateAverageAge(ages2)
		public static int calculateAverageAge(){
			int average;
			int holdNumsToAdd = 0;
			int[] ages3 = {5,3,5,2,1,7,64,35,28,3, 9, 23, 64, 2, 8, 28, 93};
			int ages3Length = ages3.length -1;
			for(int avg : ages3) {
				holdNumsToAdd += avg;
			}
			
			average = Math.round(holdNumsToAdd / ages3Length);
			System.out.print("average ");
			System.out.println(average);
			return average;
			
			}
//Loop through String array calculate average letters per name
		static String[] names = new String[]{"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		static int namesLength = names.length;

		static int totalCountLetters = 0; 
		static int averageLettersPerName = 0;
		static int currentLetterCount = 0;

		public static int calculateAverageLetters() {

			System.out.print(namesLength);

			for(int i=0; i<names.length -1; i++) {
				System.out.print(names[i].length());

				currentLetterCount = names[i].length();
				totalCountLetters = currentLetterCount + totalCountLetters;
			}
			System.out.print("From Names array, the Total avg # of letters per name: ");
			System.out.println(Math.round((totalCountLetters/namesLength)));
			return totalCountLetters/namesLength;
		}


		
	//	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		public static String concatAllNamesFromArrayEasy() {
			String joined = String.join(",", names);
			System.out.print(joined);
			return joined;
			}
		
		public static String concatAllNamesFromArrayWLoop() {
			String concatNames = "";
			for(int i = 0; i < names.length; i++) {
				if(i == names.length-1) {
					concatNames = concatNames + names[i];
					System.out.print("else if2  ");
				}else if(i != 0) {
					concatNames = concatNames + names[i] + ", ";
					System.out.print("if1 ");
				}
			else {
				concatNames = concatNames + names[i] + ", ";
				System.out.print("else3 ");
			}	
		}
			System.out.print(concatNames);
			return concatNames;
			
		}

//Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
	public static void printNameLengthsArray() {
		String[] names2 = new String[]{"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int lengthOfNames = names2.length;
		int[] nameLengths = new int[lengthOfNames];
		for(int i = 0; i < lengthOfNames; i++) {
			nameLengths[i]= names2[i].length();
			}
			System.out.print("namelengths :");
			for(int name : nameLengths) {
				System.out.print(name + ", ");		
			}
	return;
	}
//Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
	public static void calcSumNamelengths() {
		int counter = 0;
		String[] names2 = new String[]{"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int lengthOfNames = names2.length;
		int[] nameLengths = new int[lengthOfNames];
		for(int i = 0; i < lengthOfNames; i++) {
			nameLengths[i]= names2[i].length();
			}
		for(int count : nameLengths ) {
			counter += count;
		}
		System.out.println("Sum of elements in array: ");
		System.out.println(counter);
		return;
	}
//Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
	public static String concatNumTimes(String word, int n) {
		String concatWords = "";
		for(int i = 0; i < n; i++) {
			concatWords += word;
		}
		System.out.print("concatwords: ");
		System.out.print(concatWords);
		return concatWords;
	}
//Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
		}
//Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	public static boolean sumIsGreaterThan100(int[] nums) {
		boolean sumOddTrue = false;
		int addNumsTotal = 0;
		for(int num : nums) {
			addNumsTotal += num;
		}
		if(addNumsTotal > 100) {
			sumOddTrue = true;
		}
		System.out.println(addNumsTotal);
		return sumOddTrue;	
	}
//Write a method that takes an array of double and returns the average of all the elements in the array.
	public static double avgElementsInArray(double[] numbers) {
		double total = 0;
		double counter = 0;
		for(double num : numbers) {
			counter++;
			total += num;
		}
		total = total / counter;
		return total;
	}
//Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the 
//elements in the second array.
	public static boolean avgCheckFirstArrayGreater(double[] x, double[] y) {
		double total = 0;
		double counter = 0;
		double total2 = 0;
		double counter2 = 0;
		for(double num : x) {
			counter++;
			total += num;
		}
		for(double num1 : y) {
			counter2++;
			total2 += num1;
		}
		total = total / counter;
		total2 = total2 / counter2;
		if(total > total2) {
			return true;
		}
		return false;
	}
//Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if 
//moneyInPocket is greater than 10.50.
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(moneyInPocket > 10.50 && isHotOutside == true) {
			return true;	
		} 
		return false;
	}
//	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
	// I have two rabbits and always need to check the haybin in the garage to see if we need to buy more hay for these voracious hay eaters! This method
	//takes 3 parameters (haybin level, number of rabbits I have, and if they are hungry) I could hook up a few arduino computers to monitor their food and plug it into this algorithm. 
	public static boolean willBuyRabbitHay(double haybinLevel, int rabbits, boolean hungry) {
		if(haybinLevel < 2.50 && rabbits > 0 && hungry) {
			return true;
		}
		return false;
	}
}