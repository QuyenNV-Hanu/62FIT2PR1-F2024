package pr1.graph.lecture.demo;

import java.util.ArrayList;
import java.util.List;

public class GraphAnalysis {

	// Method to find isolated and pendant vertices
	public static void findIsolatedAndPendantVertices(int[][] adjacencyList) throws CustomGraphException {
		if (adjacencyList == null || adjacencyList.length == 0) {
			throw new CustomGraphException("Adjacency list is null or empty");
		}

		List<Integer> isolatedVertices = new ArrayList<>();
		List<Integer> pendantVertices = new ArrayList<>();

		// Iterate through the adjacency list
		for (int i = 0; i < adjacencyList.length; i++) {
			if (adjacencyList[i].length == 0) {
				isolatedVertices.add(i); // No edges, isolated vertex
			} else if (adjacencyList[i].length == 1) {
				pendantVertices.add(i); // Exactly one edge, pendant vertex
			}
		}

		// Print results
		System.out.println("Isolated Vertices: " + isolatedVertices);
		System.out.println("Pendant Vertices: " + pendantVertices);
	}

	// Test cases
	public static void main(String[] args) {
		try {
			// Test Case 1: Given graph with adjacency list {{1, 5}, {0, 2, 4, 5}, {2, 4,
			// 5}, {3}, {1, 2, 5}, {0, 1, 2, 4}, {}}
			int[][] adjacencyList1 = { { 1, 5 }, // Vertex 0
					{ 0, 2, 4, 5 }, // Vertex 1
					{ 2, 4, 5 }, // Vertex 2
					{ 3 }, // Vertex 3 (Pendant)
					{ 1, 2, 5 }, // Vertex 4
					{ 0, 1, 2, 4 }, // Vertex 5
					{} // Vertex 6 (Isolated)
			};
			System.out.println("Test Case 1:");
			findIsolatedAndPendantVertices(adjacencyList1);

			// Test Case 2: A graph with no isolated or pendant vertices
			int[][] adjacencyList2 = { { 1, 2 }, // Vertex 0
					{ 0, 2 }, // Vertex 1
					{ 0, 1 } // Vertex 2
			};
			System.out.println("Test Case 2:");
			findIsolatedAndPendantVertices(adjacencyList2);

			// Test Case 3: All isolated vertices
			int[][] adjacencyList3 = { {}, // Vertex 0 (Isolated)
					{}, // Vertex 1 (Isolated)
					{} // Vertex 2 (Isolated)
			};
			System.out.println("Test Case 3:");
			findIsolatedAndPendantVertices(adjacencyList3);

			// Test Case 4: All pendant vertices
			int[][] adjacencyList4 = { { 1 }, // Vertex 0 (Pendant)
					{ 0 }, // Vertex 1 (Pendant)
					{ 3 }, // Vertex 2 (Pendant)
					{ 2 } // Vertex 3 (Pendant)
			};
			System.out.println("Test Case 4:");
			findIsolatedAndPendantVertices(adjacencyList4);

			// Test Case 5: Mixed graph
			int[][] adjacencyList5 = { {}, // Vertex 0 (Isolated)
					{ 2 }, // Vertex 1 (Pendant)
					{ 1, 3 }, // Vertex 2
					{ 2 }, // Vertex 3 (Pendant)
					{}, // Vertex 4 (Isolated)
			};
			System.out.println("Test Case 5:");
			findIsolatedAndPendantVertices(adjacencyList5);
			// Test Case 6: null
			int[][] adjacencyList6 = null;
			System.out.println("Test Case 6:");
			findIsolatedAndPendantVertices(adjacencyList6);
		} catch (CustomGraphException e) {
			System.out.println(e.getMessage());
		}
	}
}
