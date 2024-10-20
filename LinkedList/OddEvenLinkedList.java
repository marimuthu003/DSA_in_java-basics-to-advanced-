package LinkedList;
class ListNodeOddEvenArrange {
    int val;
    ListNodeOddEvenArrange next;
    ListNodeOddEvenArrange(int val) {
        this.val = val;
        this.next = null;
    }
}

class OddEvenLinkedList {
    public ListNodeOddEvenArrange oddEvenList(ListNodeOddEvenArrange head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNodeOddEvenArrange odd = head;
        ListNodeOddEvenArrange even = head.next;
        ListNodeOddEvenArrange evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
    }

    public static void main(String[] args) {
        ListNodeOddEvenArrange n1 = new ListNodeOddEvenArrange(1);
        ListNodeOddEvenArrange n2 = new ListNodeOddEvenArrange(2);
        ListNodeOddEvenArrange n3 = new ListNodeOddEvenArrange(3);
        ListNodeOddEvenArrange n4 = new ListNodeOddEvenArrange(4);
        ListNodeOddEvenArrange n5 = new ListNodeOddEvenArrange(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        OddEvenLinkedList solution = new OddEvenLinkedList();
        ListNodeOddEvenArrange result = solution.oddEvenList(n1);

        // Print resulting linked list
        while (result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
        System.out.println("null");
    }
}

