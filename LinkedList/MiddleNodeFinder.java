package LinkedList;
class MiddleNode {
    int value;
    MiddleNode next;

    MiddleNode(int value) {
        this.value = value;
        this.next = null;
    }
}

class MiddleNodeFinder {
    public MiddleNode findMiddleNode(MiddleNode head) {
        MiddleNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static MiddleNode createLinkedList(int[] arr) {
        if (arr.length == 0) return null;
        MiddleNode head = new MiddleNode(arr[0]);
        MiddleNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new MiddleNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    public static void printLinkedList(MiddleNode head) {
        while (head != null) {
            System.out.print(head.value + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 6};
        MiddleNode head = createLinkedList(input);

        MiddleNodeFinder finder = new MiddleNodeFinder();
        MiddleNode middleNode = finder.findMiddleNode(head);

        printLinkedList(middleNode);
    }
}

