package pr1.graph.lecture.demo;

import java.util.*;

class CustomGraphException extends Exception {
	public CustomGraphException(String message) {
		super("CustomGraphException: " + message);
	}
}

public class Adjacency {

	public static int[][] toAdjacencyMatrix(int[][] adjacencyList) throws CustomGraphException {
		if (adjacencyList == null || adjacencyList.length == 0) {
			throw new CustomGraphException("The adjacency list is empty or null.");
		}
		int[][] result = new int[adjacencyList.length][adjacencyList.length];
		for (int i = 0; i < adjacencyList.length; i++) {
			if (adjacencyList[i] == null) {
				throw new CustomGraphException("The adjacency list contains null for vertex " + i);
			}
			for (int j = 0; j < adjacencyList[i].length; j++) {
				if (j < 0 || j >= adjacencyList.length) {
					throw new CustomGraphException("Invalid vertex index " + j + " in adjacency list.");
				}
				result[i][adjacencyList[i][j]] = 1;
			}
		}
		return result;
	}

	// Test cases
	public static void main(String[] args) {
		try {
			// Test case 1: Basic graph
			int[][] adjacencyList1 = { { 1, 2 }, // Vertex 0 has edges to 1 and 2
					{ 0 }, // Vertex 1 has an edge to 0
					{ 0, 3 }, // Vertex 2 has edges to 0 and 3
					{ 2 } // Vertex 3 has an edge to 2
			};
			printMatrix(toAdjacencyMatrix(adjacencyList1));

			// Test case 2: Single vertex, no edges
			int[][] adjacencyList2 = { {} // Vertex 0 has no edges
			};
			printMatrix(toAdjacencyMatrix(adjacencyList2));

			// Test case 3: Empty graph (throws exception)
			int[][] adjacencyList3 = {};
			printMatrix(toAdjacencyMatrix(adjacencyList3));

		} catch (CustomGraphException e) {
			System.out.println(e.getMessage());
		}

		try {
			// Test case 4: Invalid vertex index in adjacency list (throws exception)
			int[][] adjacencyList4 = { { 1, 2 }, { 0 }, { 0, 4 }, // Invalid index (out of bounds)
					{ 2 } };
			printMatrix(toAdjacencyMatrix(adjacencyList4));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			// Test case 5: Null adjacency list (throws exception)
			int[][] adjacencyList5 = null;
			printMatrix(toAdjacencyMatrix(adjacencyList5));
		} catch (CustomGraphException e) {
			System.out.println(e.getMessage());
		}

		try {
			// Test case 6: Null vertex adjacency (throws exception)
			int[][] adjacencyList6 = { { 1, 2 }, null, // Null adjacency list for vertex 1
					{ 0, 3 }, { 2 } };
			printMatrix(toAdjacencyMatrix(adjacencyList6));

		} catch (CustomGraphException e) {
			System.out.println(e.getMessage());
		}

		try {
			// Test case 07
			int[][] adjacencyList7 = { { 1, 2 }, { 0, 3 }, { 0, 3, 4 }, { 1, 2 }, { 2 } };
			printMatrix(toAdjacencyMatrix(adjacencyList7));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// Utility method to print the adjacency matrix
	public static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			System.out.println(Arrays.toString(row));
		}
		System.out.println();
	}

}
