package LinkedList;

class MergeNode {
    int value;
    MergeNode next;

    MergeNode(int value) {
        this.value = value;
        this.next = null;
    }
}

class ListMerger {
    public MergeNode mergeTwoLists(MergeNode list1, MergeNode list2) {
        MergeNode dummy = new MergeNode(0);
        MergeNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.value < list2.value) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        }
        if (list2 != null) {
            current.next = list2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        // Example usage
        // Create sample lists and test the mergeTwoLists method
    }
}

