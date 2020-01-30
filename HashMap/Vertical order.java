import java.util.*;


public class Solution {

    /*	Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	 */


    public static void insertIntoMultiMap(Map<Integer,List<Integer>> map,
                                          Integer key, Integer value) {
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(value);
    }

    // Recursive function to do a pre-order traversal of the tree and fill map
    // Here node has 'dist' horizontal distance from the root of the tree
    public static void printVertical(BinaryTreeNode<Integer> node, int dist,
                                     Map<Integer, List<Integer>> map)
    {
        // base case: empty tree
        if (node == null) {
            return;
        }

        // insert nodes present at current horizontal distance into the map
        insertIntoMultiMap(map, dist, node.data);

        // recur for left subtree by decreasing horizontal distance by 1
        printVertical(node.left, dist - 1, map);

        // recur for right subtree by increasing horizontal distance by 1
        printVertical(node.right, dist + 1, map);
    }

    // Function to perform vertical traversal of a given binary tree
    public static void printBinaryTreeVerticalOrder(BinaryTreeNode<Integer> root){

        {
            // create an empty TreeMap where
            // key -> relative horizontal distance of the node from root node
            // value -> nodes present at same horizontal distance
            Map<Integer, List<Integer>> map = new TreeMap<>();

            // do pre-order traversal of the tree and fill the map
            printVertical(root, 0, map);
//int k=0;
            // traverse the TreeMap and print vertical nodes
          //  Integer[] targetArray;
            for(Collection<Integer> values : map.values()){
                // Integer []foos = x.toArray(new Integer[x.size()]);
                
              Integer[] targetArray = values.toArray(new Integer[values.size()]);
                // System.out.println(targetArray);
            
            for(int i=0;i<targetArray.length;i++){
            int[] result = new int[targetArray.length];
            result[i] = targetArray[i].intValue();
                System.out.print(result[i]+" ");
            }
               System.out.println();  
               
            } 
        }
    }
}




