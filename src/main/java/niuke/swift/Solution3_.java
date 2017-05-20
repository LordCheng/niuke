package niuke.swift;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 * @author lordchen
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
public class Solution3_ {	
	
	public TreeNode getTree(int[] pre,int start,int end,int[] in,int start1,int end1){
		TreeNode res = null;
		if(start<=end&&start1<=end1){
			int root = pre[start];
			res = new TreeNode(root);
			int i = start1;
			for(;i<=end1;i++){
				if(root==in[i])
					break;				
			}
			res.left = getTree(pre,start+1,i+start-start1,in, start1,i-1);
			res.right = getTree(pre,i-start+start1+1,end,in,i+1,end1);
		}			
		return res;		
	}
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {    	    	
		return getTree(pre,0,pre.length-1,in,0,in.length-1);        
    }
}