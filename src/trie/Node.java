package trie;

import java.util.HashMap;

public class Node {

    Character c;
    HashMap<Character,Node> child = new HashMap<>();
    boolean isLeaf = false;

    public Node(Character c){
        this.c=c;
    }

    @Override
    public String toString() {
        return "Node{" +
                "c=" + c +
                ", child=" + child +
                ", isLeaf=" + isLeaf +
                '}';
    }
}
