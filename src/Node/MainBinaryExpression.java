package Node;

public class MainBinaryExpression {

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode("1");
        TreeNode n2 = new TreeNode("2");
        TreeNode n5l = new TreeNode("5");
        TreeNode n5r = new TreeNode("5");

        TreeNode n9 = new TreeNode("9");

        TreeNode plus = new TreeNode("+");
        TreeNode times = new TreeNode("*");
        TreeNode rootTimes = new TreeNode("*") ;
        TreeNode minus = new TreeNode("-");

plus.leftNode = n1;
plus.rightNode = n2;

        minus.leftNode = n9;
        minus.rightNode = n5r;
times.leftNode = n5l;
times.rightNode = minus;



rootTimes.leftNode = plus;
rootTimes.rightNode = times;




        MyBinaryTree mbt = new MyBinaryTree(rootTimes);

        mbt.inorder(mbt.root);
        System.out.println(mbt.comput(mbt.root));
    }


}
