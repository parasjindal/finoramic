/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode A, int B) {
        
        ArrayList<Integer> temp=new ArrayList<Integer>();
        //temp.add(A.val);
        check(A,B,temp);
        
        return res;
        
    }
    
    public void check(TreeNode A, int B, ArrayList<Integer> temp){
        if(A==null){
            return;
        }
        temp.add(A.val);
        B=B-A.val;
        if(B==0&&A.left==null&&A.right==null){
            //System.out.println(temp);
            ArrayList<Integer> r=new ArrayList<Integer>(temp);
            res.add(r);
            //return;
        }
        
        check(A.left,B,temp);
        check(A.right,B,temp);
        temp.remove(temp.size()-1);
        //B=B+A.val;
    }
}