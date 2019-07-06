package homework;
	
public class assignment {
		
	public static void main(String[] args) {

			
		
		//first array-------------------------------------------------------------------------------
		int[] ages = new int[] {3, 9, 23, 64, 2, 8, 28, 93};
		
		//Subtract index 0 from index last
		int firstMinusLast = ages[ages.length -1] - ages[0];
		System.out.println(firstMinusLast);
		
		//Calculate average age
		int sum = 0;
		for(int i = 0; i < ages.length; i++) 
			sum = sum + ages[i];
			double average = sum / ages.length;
		System.out.println("The average age is " + average);
		
		//new array---------------------------------------------------------------------------------
		String[] names = new String[6];
		
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		//Calculate average number of letters per name
		
		int arrLength = names.length;
		int length = 0;
		for(int i = 0; i < names.length; i++){
		    length+=names[i].length();
		}
		int avgNumberOfLetters = length / arrLength;
		System.out.println("The average number of letters per name is " + avgNumberOfLetters);
	
		//Concatenate Names in Array with spaces
		
		for(int i = 0; i < names.length; i++){

			System.out.print(names[i] + " ");
		}
		System.out.println("\n");
		
		//New array using elements from previous array-----------------------------------------------
		
		 int[] nameLength = new int[6];
		 
		 nameLength[0] = names[0].length();
		 nameLength[1] = names[1].length();
		 nameLength[2] = names[2].length();
		 nameLength[3] = names[3].length();
		 nameLength[4] = names[4].length();
		 nameLength[5] = names[5].length();
		 
		 for (int i = 0; i < nameLength.length; i++ ) {
			 System.out.println(nameLength[i]);
		 }
		 
		 //find the total of int in array-----------------------------------------------------------
		 
		int total = 0;

		for (int i : nameLength)
		    total += i;
		System.out.println(total);	
		
		//method to Print full name-----------------------------------------------------------------
		String firstName = "Jack";
		String lastName = "Roberts";
		String fullName =  createFullName(firstName, lastName);
		System.out.println(fullName);
		
		//method to add all and determine is total is above or below 100 ---------------------------
		if (sumArray(ages) >= 100) {
		System.out.println(sumArray(ages));	
		}	else {
				System.out.println("Error");
			}
		//method to concat string together using int number of times
		System.out.println(concatString("Brownies!", 3));
		
		//method to return doubles avg
		
		double[] milkPrice = new double[3];
		
		milkPrice[0] = 2.99;
		milkPrice[1] = 1.99;
		milkPrice[2] = 3.49;
		
		System.out.println(milkAverage(milkPrice));
		
		double[] sodaPrice = new double[4];
		
		sodaPrice[0] = 12.99;
		sodaPrice[1] = 5.99;
		sodaPrice[2] = 3.99;
		sodaPrice[3] = 1.99;
		
		System.out.println(sodaAverage(sodaPrice));
		
		//my own method
		boolean isHotOutside = true;
		double moneyInWallet = 15.00;
	}
	
	public static String concatString(String str, int num) {
		String result = "";
		for (int i=0; i < num; i++) {
			result += str;
		}
		return result;
	}
	public static String createFullName(String x, String y) {
		return x + " " + y;
	}
	public static int sumArray(int[] ages) {
		int sum = 0; 
		for (int number : ages) {
			sum += number;
		}
		return sum;
	}
	public static double milkAverage(double[] milkPrice) {
		double sum = 0;
		for (double priceOfMilk : milkPrice) {
			sum += priceOfMilk;
			double averageMilk = sum / milkPrice.length;
		}
		return sum / milkPrice.length;
	}
	public static double sodaAverage(double[] sodaPrice) {
		double sum = 0;
		for (double priceOfSoda : sodaPrice) {
			sum += priceOfSoda;
			double averageSoda = sum / sodaPrice.length;
		}
		return sum / sodaPrice.length;
	}
	
	
}

