package trie;

import java.util.Map;

public class Trie {

    public static void insert(Node root,String s){
        for(int i=0;i<s.length();i++){
            Character c = s.charAt(i);
            if(root.child.get(c) == null){
                Node n = new Node(c);
                root.child.put(c,n);
                root = n;
            }else{
                root = root.child.get(c);
            }
        }
        root.isLeaf = true;
    }

    public static void print(Node root,String str){

        if(root.isLeaf)
            System.out.println(str);

        if(root.child.isEmpty())
            return;


        for(Map.Entry<Character,Node> c : root.child.entrySet()){
            print(c.getValue(),str+c.getKey());
        }
    }

    public static boolean find(Node root,String str){

        for(int i=0;i<str.length();i++){
            Character c = str.charAt(i);
            if(root.child.get(c) == null)
                return false;

            root = root.child.get(c);
        }

        return root.isLeaf;
    }

    public static void main(String args[]){

        Node root =new Node('$');
        String[] arr = {"Cat","Bat","RAT","Suraj","Menon"};

        for(int i=0;i<arr.length;i++){
            insert(root,arr[i]);
        }
        print(root,"");

        System.out.println("\n" + "Searching ...");
        System.out.println(find(root,"Suraj"));
        System.out.println(find(root,"Hello"));
        System.out.println(find(root,"Suraja"));
        System.out.println(find(root,"Sura"));

    }
}
