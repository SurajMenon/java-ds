package linked.list;

public class SinglyLinkedList {

    static Node head = new Node(10);

    public static void insert(Node root,int num){
        while(root.next != null){
            root = root.next;
        }

        Node n= new Node(num);
        root.next = n;
    }

    public static void delete(Node root,int num){

        //For deleting head
        if(root.num == num){
            head = root.next;
        }

        //For deleting mid elements
        while(root!=null && root.next != null){
            if(root.next.num == num){
                root.next = root.next.next;
            }
            root = root.next;
        }
    }

    public static boolean find(Node root,int num){
        while(root != null){
            if(root.num == num){
                return true;
            }
            root = root.next;
        }
        return false;
    }

    public static void print(Node root){
        while(root != null){
            System.out.print(root.num+ "->");
            root = root.next;
        }

    }

    /*public static void reverse(Node root) {

        Node ptr0 = root;
        Node ptr1 = root.next;
        System.out.println("ptr0 is:"+ptr0.num + ("ptr1 is:"+ptr1.num));
        while (root.next != null && root.next.next != null){

            System.out.println("ptr0 is:"+ptr0.num + ("ptr1 is:"+ptr1.num));
            Node tmp = root.next.next;
            ptr1.next = ptr0;
            ptr0 = ptr1;
            ptr1 = tmp;

            root = root.next;
        }
        ptr1.next = ptr0;
        System.out.println("head is:"+ptr1.num);
        head = ptr1;
    }*/

    public static void main(String args[]){

     int[] arr = {5,12,6,18,3,9,45,8,15};
     for(int i=0;i<arr.length ;i++) {
         insert(head, arr[i]);
     }

     print(head);System.out.println();
     System.out.println(find(head,45));
     System.out.println(find(head,450));

     delete(head,18);
     delete(head,10);
     delete(head,15);
     print(head);System.out.println();

     //reverse(head);print(head);System.out.println();
    }

}