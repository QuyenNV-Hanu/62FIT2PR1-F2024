package pr1.graph.lecture.demo;

import java.util.Arrays;

public class MyAdjacencyList {

	public static void main(String[] args) {
		int[][] adjacencyList = { { 1, 2 }, { 0, 3 }, { 0, 3, 4 }, { 1, 2 }, { 2 } };
		printMatrix(toAdjacencyMatrix(adjacencyList));
	}

	public static int[][] toAdjacencyMatrix(int[][] adjacencyList) {
		int[][] result = new int[adjacencyList.length][adjacencyList.length];

		for (int i = 0; i < adjacencyList.length; i++) {
			for (int j = 0; j < adjacencyList[i].length; j++) {
				result[i][adjacencyList[i][j]] = 1;
			}
		}

		return result;
	}

	// Utility method to print the adjacency matrix
	public static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			System.out.println(Arrays.toString(row));
		}
		System.out.println();
	}

}
