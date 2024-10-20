package LinkedList;

class CycleCheckNode {
    int value;
    CycleCheckNode next;

    CycleCheckNode(int value) {
        this.value = value;
        this.next = null;
    }
}

class CycleChecker {
    public boolean hasCycle(CycleCheckNode head) {
        CycleCheckNode dummy = new CycleCheckNode(0);
        dummy.next = head;

        CycleCheckNode slow = dummy;
        CycleCheckNode fast = dummy;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (slow == fast) {
                return true; // Cycle detected
            }
        }
        return false; // No cycle
    }

    public static void main(String[] args) {
        // Example usage
        // Create sample lists and test the hasCycle method
    }
}

