package pr1.collections.lecture.demo;
import java.util.LinkedHashSet;
public class SetOperations {
	public static void main(String[] args) {
		// Create two LinkedHashSets
		LinkedHashSet<String> set1 = new LinkedHashSet<>();
		set1.add("George");
		set1.add("Jim");
		set1.add("John");
		set1.add("Blake");
		set1.add("Kevin");
		set1.add("Michael");

		LinkedHashSet<String> set2 = new LinkedHashSet<>();
		set2.add("George");
		set2.add("Katie");
		set2.add("Kevin");
		set2.add("Michelle");
		set2.add("Ryan");

		// Clone the sets to preserve original sets
		LinkedHashSet<String> unionSet = new LinkedHashSet<>(set1);
		LinkedHashSet<String> differenceSet = new LinkedHashSet<>(set1);
		LinkedHashSet<String> intersectionSet = new LinkedHashSet<>(set1);

		// Perform Union
		unionSet.addAll(set2);
		System.out.println("Union: " + unionSet);

		// Perform Difference (set1 - set2)
		differenceSet.removeAll(set2);
		System.out.println("Difference: " + differenceSet);

		// Perform Intersection
		intersectionSet.retainAll(set2);
		System.out.println("Intersection: " + intersectionSet);
	}
}
