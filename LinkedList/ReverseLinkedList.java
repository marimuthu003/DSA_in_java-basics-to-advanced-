package LinkedList;

class NodeReverse {
    int val;
    NodeReverse next;
    NodeReverse(int val) {
        this.val = val;
        this.next = null;
    }
}

class ReverseLinkedList {
    public NodeReverse reverseList(NodeReverse head) {
        NodeReverse prev = null;
        NodeReverse curr = head;
        while (curr != null) {
            NodeReverse temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static void main(String[] args) {
        NodeReverse n1 = new NodeReverse(1);
        NodeReverse n2 = new NodeReverse(2);
        NodeReverse n3 = new NodeReverse(3);
        NodeReverse n4 = new NodeReverse(4);
        NodeReverse n5 = new NodeReverse(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        ReverseLinkedList solution = new ReverseLinkedList();
        NodeReverse result = solution.reverseList(n1);

        // Print resulting linked list
        while (result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
        System.out.println("null");
    }
}
