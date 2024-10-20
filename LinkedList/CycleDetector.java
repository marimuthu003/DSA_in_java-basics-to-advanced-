package LinkedList;

class CycleNode {
    int value;
    CycleNode next;

    CycleNode(int value) {
        this.value = value;
        this.next = null;
    }
}

class CycleDetector {
    public CycleNode detectCycle(CycleNode head) {
        CycleNode fast = head;
        CycleNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow; // Return the start of the cycle
            }
        }
        return null; // No cycle
    }

    public static void main(String[] args) {
        // Example usage
        // Create sample lists and test the detectCycle method
    }
}

