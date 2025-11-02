package week5;
public class W5Q1 {
	//ARRAY EXAMPLE
	public static void main(String[] args) {
		int[] numbers = new int[10]; 
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (i + 1) * 10;
        }
        System.out.println("Array elements are:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
	}
}
