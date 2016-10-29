
public class nodeMain{
	public static void main(String[] args) {
		Tree theTree = new Tree();
		theTree.addNode(50);
		theTree.addNode(30);
		System.out.println("");
		theTree.addNode(25);
		theTree.addNode(15);
		theTree.addNode(30);
		theTree.addNode(75);
		theTree.addNode(85);
		theTree.addNode(30);
		theTree.addNode(50);
		theTree.addNode(25);
		theTree.addNode(25);
		theTree.PrintTree2(theTree.root);
		System.out.println("\nNode with the key 75");
		System.out.println(theTree.findNode(75));
		System.out.println("\nNode with the key 30");
		System.out.println(theTree.findNode(30));
		System.out.println("\nNode with the key 15");
		System.out.println(theTree.findNode(15));
		System.out.println("\nNode with the key 12");
		System.out.println(theTree.findNode(12));
		System.out.println("\nNode with the key 82");
		System.out.println(theTree.findNode(82));
	}
}