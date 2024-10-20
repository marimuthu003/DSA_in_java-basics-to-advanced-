package LinkedList;

// Element class definition
class Element {
    int val;
    Element next;

    Element(int val) {
        this.val = val;
        this.next = null;
    }
}

// SolutionDeleteMiddle class definition
class SolutionDeleteMiddle {

    public Element deleteMiddle(Element head) {
        if (head == null || head.next == null) {
            return null;
        }

        Element slow = head;
        Element fast = head;
        Element prev = null;

        // Find the middle of the linked list using slow and fast pointers
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Delete the middle node
        if (prev != null) {
            prev.next = slow.next;
        }

        return head;
    }

    public static void main(String[] args) {
        // Creating the linked list
        Element head = new Element(1);
        head.next = new Element(2);
        head.next.next = new Element(3);
        head.next.next.next = new Element(4);
        head.next.next.next.next = new Element(5);

        // Deleting the middle node
        SolutionDeleteMiddle solution = new SolutionDeleteMiddle();
        head = solution.deleteMiddle(head);

        // Printing the modified list
        printList(head);
    }

    // Method to print the linked list
    public static void printList(Element head) {
        Element temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
