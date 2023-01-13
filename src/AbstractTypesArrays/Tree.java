package AbstractTypesArrays;
import BsTree.*;

public class Tree {

    public static void get() {

        int matrix[ ] = {40, 15, 25, 50, 20, 10, 70, 55, 45, 5 };
        int matrix2[ ] = {15, 40, 25, 20, 50, 55, 70, 10, 5, 45 };

        BsTree tree = new BsTree( );
        BsTree tree2 = new BsTree( );

        for (int i=0; i<matrix.length; i++) {
            tree.insertElement(matrix[i]);
            tree2.insertElement(matrix2[i]);
        }

        tree.inOrderTraversal( );
        tree.preOrderTraversal( );
        tree.postOrderTraversal( );
        System.out.println(tree.size());
        System.out.println(tree.treeHeight());

        tree2.inOrderTraversal( );
        tree2.preOrderTraversal( );
        tree2.postOrderTraversal( );
        System.out.println(tree2.size());
        System.out.println(tree2.treeHeight());
    }

}
