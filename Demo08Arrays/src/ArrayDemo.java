
public class ArrayDemo {

	public static void main(String[] args) {
		int[] myArray = new int[10];
		
		for (int index = 0; index < myArray.length; index++) {
			myArray[index] = 0;
		}
		
		int[][] myMatrix = new int[10][12];
		
		for (int outer = 0; outer < 10; outer++) {
			for (int inner = 0; inner < 12; inner++) {
				myMatrix[outer][inner] = 0;
			}
		}
	}

}
