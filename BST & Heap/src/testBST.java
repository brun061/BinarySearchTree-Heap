
public class testBST {

	public static void main(String[] args) {
		
		Integer n[] = new Integer[10];
		for(int i = 0 ; i < n.length ; i++)
		{
			n[i] = (int)(Math.random()*100);
			System.out.print(n[i] + " ");
		}
		System.out.println();
		BST<Integer> deneme = new BST<Integer>(n);
				
		deneme.breadthFirstTraversal();
		System.out.println("\n"+deneme.height());

	}

}
