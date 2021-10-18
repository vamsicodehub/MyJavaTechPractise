
public class MatrixPrimAndSecondDiagonal {

	public static void main(String[] args) {
		int[][] inputMatrix = { { 11, 2, 4 }, { 4, 5, 6 }, { 10, 8, -12 } };
		int primDiagSum = 0, secondDiagSum = 0, i = 0, j = 0;
		
		System.out.println(inputMatrix.length);

		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				if (i == j) {
					primDiagSum += inputMatrix[i][j];
				}
				if ((i + j) == (3 - 1))
					secondDiagSum += inputMatrix[i][j];
			}
		}
		System.out.println("Primary :: "+primDiagSum);
		System.out.println("Secondary :: "+secondDiagSum);
		System.out.println(Math.abs(primDiagSum - secondDiagSum));

	}

}
