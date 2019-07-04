package homework;

public class assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ages = new int[8];
		
		ages[0] = 3;
		ages[1] = 9;
		ages[2] = 23;
		ages[3] = 64;
		ages[4] = 2;
		ages[5] = 8;
		ages[6] = 28;
		ages[7] = 93;
		
		System.out.println(calculateAverage);
		//
		
		String[] names = new String[6];
		
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
				
	}

	
	public static int calculateAverage(int[] ages) {	
		int sum = 0;
		for (int age : ages) {
			sum += age;
		}
		return sum / ages.length;
	} 
}
