package pr1.collections.lecture.demo;

import java.util.PriorityQueue;

public class SetOperationsOnPriorityQueues {
	public static void main(String[] args) {
		// Create two priority queues
		PriorityQueue<String> queue1 = new PriorityQueue<>();
		PriorityQueue<String> queue2 = new PriorityQueue<>();

		// Add elements to the first queue
		queue1.add("George");
		queue1.add("Jim");
		queue1.add("John");
		queue1.add("Blake");
		queue1.add("Kevin");
		queue1.add("Michael");

		// Add elements to the second queue
		queue2.add("George");
		queue2.add("Katie");
		queue2.add("Kevin");
		queue2.add("Michelle");
		queue2.add("Ryan");
		System.out.println("Queue 1: " + queue1);
		System.out.println("Queue 2: " + queue2);

		// Perform union (all elements from both queues)
		PriorityQueue<String> unionQueue = new PriorityQueue<>(queue1);
		System.out.println("Union 0: " + unionQueue);
		unionQueue.add("George");
		System.out.println("Union 1: " + unionQueue);
		unionQueue.add("Katie");
		System.out.println("Union 2: " + unionQueue);
		unionQueue.add("Kevin");
		System.out.println("Union 3: " + unionQueue);
		unionQueue.add("Michelle");
		System.out.println("Union 4: " + unionQueue);
		unionQueue.add("Ryan");
//		unionQueue.addAll(queue2);
		System.out.println("Union: " + unionQueue);

		// Perform difference (elements in queue1 but not in queue2)
		PriorityQueue<String> differenceQueue = new PriorityQueue<>(queue1);
		differenceQueue.removeAll(queue2);
		System.out.println("Difference: " + differenceQueue);

		// Perform intersection (common elements between both queues)
		PriorityQueue<String> intersectionQueue = new PriorityQueue<>(queue1);
		intersectionQueue.retainAll(queue2);
		System.out.println("Intersection: " + intersectionQueue);
	}
}
