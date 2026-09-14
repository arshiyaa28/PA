public class ddlinsert {
    static class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static Node insertbeg(Node head, int val){
        Node newNode=new Node(val);
        newNode.next=head;
        if(head!=null){
            head.prev=newNode;
        }
        head=newNode;
        return head;
    }
    static void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node head=new Node(10);
        Node second=new Node(20);
        Node third=new Node(30);
        Node fourth=new Node(40);
        head.next=second;
        second.prev=head;
        second.next=third;
        third.prev=second;
        third.next=fourth;
        fourth.prev=third;
        int val=0;
        head=insertbeg(head, val);
        printList(head);
    }
}
