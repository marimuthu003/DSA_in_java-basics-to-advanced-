class BST {

    // Method to search a given value in the BST
    public TreeNode search(TreeNode root, int val) {
        // Base cases: root is null (value not found) or root's value matches the target value
        if (root == null || root.val == val) {
            return root;
        }

        // If the target value is smaller than root's value, search in the left subtree
        if (val < root.val) {
            return search(root.left, val);
        }

        // If the target value is greater than root's value, search in the right subtree
        return search(root.right, val);
    }

    // Helper method to print the search result
    public void printSearchResult(TreeNode node, int val) {
        if (node != null) {
            System.out.println("Value " + val + " found in the tree.");
        } else {
            System.out.println("Value " + val + " not found in the tree.");
        }
    }

    public static void main(String[] args) {
        BST bst = new BST();
        TreeNode root = null;

        // Insert nodes
        root = bst.insert(root, 50);
        root = bst.insert(root, 30);
        root = bst.insert(root, 20);
        root = bst.insert(root, 40);
        root = bst.insert(root, 70);
        root = bst.insert(root, 60);
        root = bst.insert(root, 80);

        // Search for a value in the BST
        int searchValue = 40;
        TreeNode result = bst.search(root, searchValue);
        bst.printSearchResult(result, searchValue);

        searchValue = 100;
        result = bst.search(root, searchValue);
        bst.printSearchResult(result, searchValue);
    }

    // Insert method (same as the one used earlier)
    public TreeNode insert(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }

        if (val < root.val) {
            root.left = insert(root.left, val);
        } else if (val > root.val) {
            root.right = insert(root.right, val);
        }

        return root;
    }
}

// TreeNode class definition (same as earlier)
class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int item) {
        val = item;
        left = right = null;
    }
}
