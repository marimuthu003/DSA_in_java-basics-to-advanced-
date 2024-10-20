package LinkedList;

// ListElement class definition
class ListElement {
    int data;
    ListElement next;

    ListElement(int data) {
        this.data = data;
        this.next = null;
    }
}

// SingleLinkedList class definition
class SingleLinkedList {
    ListElement head;

    // Display the linked list and return the count of nodes
    public int display() {
        if (head == null) {
            System.out.println("empty");
            return 0;
        } else {
            ListElement temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                System.out.print(temp.data + " --> ");
                temp = temp.next;
            }
            System.out.println("null");
            return count;
        }
    }

    // Insert at the beginning
    public void insertBeginning(int data) {
        ListElement newElement = new ListElement(data);
        newElement.next = head;
        head = newElement;
    }

    // Insert at the end
    public void insertEnd(int data) {
        ListElement newElement = new ListElement(data);
        if (head == null) {
            head = newElement;
            return;
        }
        ListElement temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newElement;
    }

    // Insert at specified position
    public void insertPosition(int data, int pos) {
        ListElement newElement = new ListElement(data);
        if (pos == 0) {
            insertBeginning(data);
            return;
        }
        ListElement temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }
        newElement.next = temp.next;
        temp.next = newElement;
    }

    // Delete at beginning
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    // Delete at end
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        ListElement temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // Delete at specified position
    public void deleteAtPosition(int pos) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (pos == 0) {
            deleteAtBeginning();
            return;
        }
        ListElement temp = head;
        for (int i = 0; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Position out of bounds");
            return;
        }
        temp.next = temp.next.next;
    }
}

// Main class to test the linked list
class LinkedListExample {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();

        // Initial elements
        list.head = new ListElement(10);
        list.head.next = new ListElement(20);
        list.head.next.next = new ListElement(30);

        // Display initial list
        System.out.println("Initial linked list:");
        list.display();

        // Insert at beginning, end, and specified position
        list.insertBeginning(9);
        list.insertEnd(40);
        list.insertPosition(5, 3); // Insert 5 at position 3

        // Display after insertion
        System.out.println("Linked list after insertions:");
        list.display();

        // Deletion operations
        list.deleteAtPosition(3); // Delete node at position 3

        // Display after deletion
        System.out.println("Linked list after deletion:");
        list.display();
    }
}
