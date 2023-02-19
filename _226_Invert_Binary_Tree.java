public class _226_Invert_Binary_Tree {

    public TreeNode invertTree(TreeNode root) {
        TreeNode mainRoot = root;
        if(mainRoot==null){
            return root;
        }

        invertLeftToRight(mainRoot);

        return mainRoot;


    }

    public void invertLeftToRight(TreeNode root){

        if(root==null){
            return;
        }

        TreeNode temp = root.left;
        root.left=root.right;
        root.right = temp;

        invertLeftToRight(root.left);
        invertLeftToRight(root.right);
    }
}

class TreeNode{

    int value;
    TreeNode left ;
    TreeNode right ;

    TreeNode(){}

    TreeNode(int value, TreeNode left, TreeNode right){
        this.value= value;
        this.left=left;
        this.right= right;
    }


}
