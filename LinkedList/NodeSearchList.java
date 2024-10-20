package LinkedList;

class NodeSearchList {
    int data;
    NodeSearchList next;
    NodeSearchList(int data) {
        this.data = data;
        this.next = null;
    }
}

class SearchLinkedList {
    public boolean search(NodeSearchList head, int val) {
        NodeSearchList temp = head;
        while (temp != null) {
            if (temp.data == val) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        NodeSearchList n1 = new NodeSearchList(1);
        NodeSearchList n2 = new NodeSearchList(2);
        NodeSearchList n3 = new NodeSearchList(3);
        n1.next = n2;
        n2.next = n3;

        SearchLinkedList solution = new SearchLinkedList();
        boolean found = solution.search(n1, 2);

        // Output the result of search
        System.out.println("Found: " + found);
    }
}

