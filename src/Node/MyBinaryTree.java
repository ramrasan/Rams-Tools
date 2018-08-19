package Node;

public class MyBinaryTree {

    TreeNode root;

    public MyBinaryTree(TreeNode root) {
        this.root = root;
    }

    public MyBinaryTree() {
        root = null;
    }

    public void print (TreeNode p){
        System.out.print(p.value + " ");
    }

    public void inorder (TreeNode root){
        if( root == null) return;
        inorder(root.leftNode);
        print(root);
        inorder(root.rightNode);
    }

    public Long comput(TreeNode treeNode){
        if(treeNode == null) return 0L;
          if (isAnOperator(treeNode)) {
              if (treeNode.value.equals("+")) return comput(treeNode.leftNode) + comput(treeNode.rightNode);
              if (treeNode.value.equals("*")) return comput(treeNode.leftNode) * comput(treeNode.rightNode);
              if (treeNode.value.equals("-")) return comput(treeNode.leftNode) - comput(treeNode.rightNode);

          }
          return Long.valueOf(treeNode.value);


    }

    public boolean isAnOperator(TreeNode treeNode){
        if ((treeNode.value.equals("+"))||(treeNode.value.equals("-"))||(treeNode.value.equals(":"))||(treeNode.value.equals("*"))) {
            return true;
        }
                return false;
    }




}