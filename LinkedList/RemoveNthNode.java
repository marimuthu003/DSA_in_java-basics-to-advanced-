class ListNodeRemove {
    int val;
    ListNodeRemove next;
    ListNodeRemove(int val) {
        this.val = val;
        this.next = null;
    }
}

class RemoveNthNode {
    public ListNodeRemove removeNthFromEnd(ListNodeRemove head, int n) {
        ListNodeRemove dummy = new ListNodeRemove(0);
        dummy.next = head;
        ListNodeRemove ahead = dummy;
        ListNodeRemove behind = dummy;

        for (int i = 0; i <= n; i++) {
            ahead = ahead.next;
        }

        while (ahead != null) {
            ahead = ahead.next;
            behind = behind.next;
        }

        behind.next = behind.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNodeRemove n1 = new ListNodeRemove(1);
        ListNodeRemove n2 = new ListNodeRemove(2);
        ListNodeRemove n3 = new ListNodeRemove(3);
        ListNodeRemove n4 = new ListNodeRemove(4);
        ListNodeRemove n5 = new ListNodeRemove(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        RemoveNthNode solution = new RemoveNthNode();
        ListNodeRemove result = solution.removeNthFromEnd(n1, 2);

        // Print resulting linked list
        while (result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
        System.out.println("null");
    }
}
