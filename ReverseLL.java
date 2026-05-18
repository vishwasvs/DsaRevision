public class ReverseLL {
    public static void main(String[] args) 
    {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        Node res = sub(head);
        System.out.println(res);
    }   

    public static Node sub(Node head)
    {
        Node temp = head;
        Node prev = null;

        while(temp!=null)
        {
            Node front = temp.next;
            temp.next= prev;
            prev = temp;
            temp = front ;
        }
    return prev;
    }
}
