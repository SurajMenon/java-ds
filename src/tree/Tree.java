package tree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {

    public static Node insertNode(Node root,int num){
        if(root == null) {
            Node n = new Node(num);
            return n;
        }

        if(root.num > num) {
            root.left = insertNode(root.left, num);
        }

        else  if (root.num < num) {
            root.right  = insertNode(root.right, num);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.num + " ");
        inorder(root.right);
    }

    public static void levelOrder(Node root){

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(new Node(Integer.MAX_VALUE));


        while(!q.isEmpty()
                && (!(q.size() == 1 && q.peek().num == Integer.MAX_VALUE))){

            Node n = q.remove();

            if(n.num == Integer.MAX_VALUE){
                System.out.println();
                q.add(new Node(Integer.MAX_VALUE));
                continue;
            }

            System.out.print(n.num + " ");
            if(n.left != null)
                q.add(n.left);

            if(n.right != null)
                q.add(n.right);
        }

    }

    public static void main(String args[]){

        Node root = insertNode(null,10);
        int[] arr = {5,12,6,18,3,9,45,8,15};
        for(int i=0;i<arr.length ;i++) {
            insertNode(root, arr[i]);
        }

        inorder(root);System.out.println();
        levelOrder(root);
    }
}
