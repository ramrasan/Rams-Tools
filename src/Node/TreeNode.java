package Node;

public class TreeNode {

    String value;
    TreeNode leftNode;
    TreeNode rightNode;

    public TreeNode(String value,
                    TreeNode leftNode,
                    TreeNode rightNode) {
        this.value = value;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public TreeNode(String value) {
        this.value = value;
        leftNode = null;
        rightNode = null;
    }


}
