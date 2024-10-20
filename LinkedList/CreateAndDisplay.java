package LinkedList;
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class CreateAndDisplay {
    Node head;

    CreateAndDisplay() {
        this.head = null;
    }

    void display() {
        if (this.head == null) {
            System.out.println("list is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }

    }

    public static void main(String[] args) {
        CreateAndDisplay l = new CreateAndDisplay();
        Node o = new Node(10);
        l.head = o;
        Node o2 = new Node(20);
        o.next = o2;
        Node o3 = new Node(30);
        o2.next = o3;

        l.display();
    }
}
