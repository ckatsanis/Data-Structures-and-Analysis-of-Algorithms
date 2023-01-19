package BsTree;

import AbstractTypesArrays.Tree;

public class BsTree {

    // Instance field (data member)
    private TreeNode root;
    // Methods
    public BsTree( ) {
        root = null;
    }
    public boolean isEmpty( ) {
        return (root == null);
    }
    public void insertElement(int data) {
        if (isEmpty())
            root = new TreeNode(data);
        else
            insertNode(data, root);
    }

    public void inOrderTraversal( ) {
        System.out.println("INORDER TRAVERSAL");
        inOrder(root);
        System.out.println( );
    }
    public void preOrderTraversal( ) {
        System.out.println("PREORDER TRAVERSAL");
        preOrder(root);
        System.out.println( );
    }
    public void postOrderTraversal( ) {
        System.out.println("POSTORDER TRAVERSAL");
        postOrder(root);
        System.out.println( );
    }

    private void insertNode(int data, TreeNode node) {
        if (data < node.getNodeData()) {
            if (node.getLeftNode() == null)
                node.setLeftNode(new TreeNode(data));
            else
                insertNode(data, node.getLeftNode());
        }
        else {
            if (node.getRightNode() == null)
                node.setRightNode(new TreeNode(data));
            else
                insertNode(data, node.getRightNode());
        }
    }

    private void inOrder(TreeNode node) {
        if (node == null)
            return;

        inOrder(node.getLeftNode());
        System.out.print(node.getNodeData());
        System.out.print("    ");
        inOrder(node.getRightNode());
    }
    private void preOrder(TreeNode node) {
        if (node == null)
            return;

        System.out.print(node.getNodeData());
        System.out.print("    ");
        preOrder(node.getLeftNode());
        preOrder(node.getRightNode());
    }
    private void postOrder(TreeNode node) {
        if (node == null)
            return;

        postOrder(node.getLeftNode());
        postOrder(node.getRightNode());
        System.out.print(node.getNodeData());
        System.out.print("    ");
    }

    public int size() {
        return size(root);
    }

    private int size(TreeNode node) {
        if ( node == null)
            return 0;

        return 1 + size(node.getLeftNode()) + size(node.getRightNode());
    }

    public int treeHeight() {
        return treeHeight(root);
    }

    private int treeHeight(TreeNode node) {
        if (node == null)
            return -1;

        return 1 + Math.max(treeHeight(node.getLeftNode()), treeHeight(node.getRightNode()));
    }

    public boolean search(int data) {
        return search(root, data);
    }

    private boolean search(TreeNode node, int data) {
        if (node == null) return false;
        if (node.getNodeData() == data) return true;
        if (search(node.getLeftNode(),data)) return true;

        return search(node.getRightNode(),data);
    }

    public int treeHeight(int data) {
        return treeHeight(root, data);
    }

    private int treeHeight(TreeNode node, int data) {
        if (node.getNodeData() == data) return 0;
        if (data < node.getNodeData()) return treeHeight(node.getLeftNode(), data) +1;
        return treeHeight(node.getRightNode(),data) +1;
    }

}
