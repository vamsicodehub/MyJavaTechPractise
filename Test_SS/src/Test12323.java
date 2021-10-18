import java.util.Arrays;

public class Test12323 {

	public static void main(String[] args) {
		int[] inputArr = {1,2,8, 9, 3, 20, 2, 3};
		int sumValue = 40;
		System.out.println(Arrays.toString(findElementSum(inputArr, sumValue)));
		
	}

	private static int[] findElementSum(int[] inputArr, int sumValue) {
		if(inputArr.length == 0)
			return inputArr;
		int[] resultArr = new int[3];
		int tempVal = 0;
		for(int i = 0; i<inputArr.length;i++) {
			tempVal = inputArr[i];//1,2,5
			int tempVal1 = 0;
			for(int j = i + 1 ; j<inputArr.length;j++) {
				tempVal1 = tempVal + inputArr[j];//1 + 2
				for(int k = j+1 ; k < inputArr.length ; k++) {
					if(tempVal1 + inputArr[k] == sumValue){//1+2+5
					 resultArr[0] = inputArr[i];
					 resultArr[1] = inputArr[j];
					 resultArr[2] = inputArr[k];
					 
					 return resultArr;
					}
				}
				
					
			}
		}
		return resultArr;
	}
}
