package LinkedList;

import java.util.HashMap;

class Block {
    int value;
    Block next, random;

    Block(int value) {
        this.value = value;
        this.next = null;
        this.random = null;
    }
}

class RandomListDuplicator {
    public Block copyRandomList(Block head) {
        if (head == null) return null;

        // Create a HashMap to store mapping of original nodes to their copies
        HashMap<Block, Block> oldToNewMap = new HashMap<>();
        Block current = head;

        // First pass: Create new nodes and map them with old nodes
        while (current != null) {
            Block newNode = new Block(current.value);
            oldToNewMap.put(current, newNode);
            current = current.next;
        }

        // Second pass: Set the next and random pointers of the new nodes
        current = head;
        while (current != null) {
            Block newNode = oldToNewMap.get(current);
            newNode.next = oldToNewMap.get(current.next);
            newNode.random = oldToNewMap.get(current.random);
            current = current.next;
        }

        // Return the head of the copied list
        return oldToNewMap.get(head);
    }

    public static void main(String[] args) {
        Block node1 = new Block(1);
        Block node2 = new Block(2);
        Block node3 = new Block(3);

        node1.next = node2;
        node2.next = node3;

        node1.random = node3;
        node2.random = node1;

        RandomListDuplicator duplicator = new RandomListDuplicator();
        Block copiedListHead = duplicator.copyRandomList(node1);

        // You can add code to print or verify the copied list here
        System.out.println("List copied successfully.");
    }
}

