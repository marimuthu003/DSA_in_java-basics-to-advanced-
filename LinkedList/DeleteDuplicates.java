class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class DeleteDuplicates {
    // Method to delete duplicates from a sorted linked list
    public Node deleteDuplicates(Node head) {
        Node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

    // Helper method to create a linked list from an array
    public static Node createLinkedList(int[] arr) {
        if (arr.length == 0) return null;
        Node head = new Node(arr[0]);
        Node current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }
        return head;
    }

    // Helper method to print the linked list
    public static void printLinkedList(Node head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {
        int[] input = {1, 1, 2};
        Node head = createLinkedList(input);

        DeleteDuplicates deleteDuplicates = new DeleteDuplicates();
        Node newHead = deleteDuplicates.deleteDuplicates(head);

        printLinkedList(newHead);
    }
}
