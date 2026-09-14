public class dllremove {
    static class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static Node deletebeg(Node head){
        if(head==null) return null;
        head=head.next;
        if(head!=null){
            head.prev=null;
        }
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
        head=deletebeg(head);
        printList(head);
    }
}
