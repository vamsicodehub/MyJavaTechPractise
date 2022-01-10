import java.util.Arrays;

public class ArrayLeftRotate {

	public static void main(String[] args) {
		int inputArr[] = { 1, 2, 3, 4, 5, 6, 7 };
		leftRotate(inputArr, 3);
		System.out.println("After Left Rotatation :: " + Arrays.toString(inputArr));
//		rightRotate(inputArr, 3);
//		System.out.println("After Right Rotation :: " + Arrays.toString(inputArr));
	}

	private static void rightRotate(int[] inputArr, int d) {
		if(d == 0)
			return;
		
		int length = inputArr.length;
		int rot = d % length;
		
		reverseArr(inputArr, 0, length - 1);
		reverseArr(inputArr, rot, length - 1);
		reverseArr(inputArr, 0, rot - 1);
	}

	private static void leftRotate(int[] inputArr, int d) {
		int length = inputArr.length;
		int rot = d % length;

		reverseArr(inputArr, 0, rot - 1);
		reverseArr(inputArr, rot, length - 1);
		reverseArr(inputArr, 0, length - 1);
	}

	private static void reverseArr(int[] inputArr, int start, int end) {
		// TODO Auto-generated method stub

		int temp = 0;
		while (start < end) {
			temp = inputArr[start];
			inputArr[start] = inputArr[end];
			inputArr[end] = temp;
			start++;
			end--;
		}

	}

}
