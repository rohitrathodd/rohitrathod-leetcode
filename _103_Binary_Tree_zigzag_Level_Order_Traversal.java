import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _103_Binary_Tree_zigzag_Level_Order_Traversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> list = new ArrayList<List<Integer>>();

        if(root==null){

            return list;
        }
        int count=0;
        list.add(new ArrayList<>());
        list.get(count).add(root.value);
        traversal(root,list,count);

        return list;

    }

    public void traversal(TreeNode root, List<List<Integer>> list,int count){
        if(root == null){

            return;
        }
        count++;
        if(root.right!=null||root.left!=null)
        {
            if(list.size()<=count)
                list.add(new ArrayList<>());

        }
        if(count%2==1){

            if(root.right!=null)
                list.get(count).add(root.right.value);
            if(root.left!=null)
                list.get(count).add(root.left.value);


            traversal(root.left,list,count);
            traversal(root.right,list,count);

        }else{

            if(root.left!=null)
                list.get(count).add(root.left.value);
            if(root.right!=null)
                list.get(count).add(root.right.value);

            traversal(root.right,list,count);
            traversal(root.left,list,count);
        }
    }

    // BFS
    public List<List<Integer>> zigzagLevelOrder(TreeNode root,int value) {
        List<List<Integer>> ans = new LinkedList();
        if(root==null){
            return ans;
        }
        Queue <TreeNode> q = new LinkedList();
        q.add(root);
        int level = 1;
        while(!q.isEmpty()){
            List<Integer> l = new ArrayList();
            int c = q.size();
            for(int i=0;i<c;i++){
                TreeNode cur = q.poll();
                l.add(cur.value);
                if(cur.left!=null){
                    q.add(cur.left);
                }
                if(cur.right!=null){
                    q.add(cur.right);
                }
            }
            if(level%2==0){
                List<Integer> ll = new ArrayList();
                for(int i =l.size()-1;i>=0;i--){
                    ll.add(l.get(i));
                }
                ans.add(ll);
            }else{
                ans.add(l);
            }
            level++;
        }
        return ans;
    }

    public static void main(String[] args){

    }

}
