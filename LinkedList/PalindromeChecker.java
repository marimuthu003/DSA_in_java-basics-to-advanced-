package LinkedList;

class PalindromeNode {
    int value;
    PalindromeNode next;

    PalindromeNode(int value) {
        this.value = value;
        this.next = null;
    }
}

class PalindromeChecker {
    public boolean isPalindrome(PalindromeNode head) {
        if (head == null || head.next == null) return true;

        // Step 1: Find the middle of the list
        PalindromeNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // Step 2: Reverse the second half of the list
        PalindromeNode prev = null;
        while (slow != null) {
            PalindromeNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }

        // Step 3: Compare the first half with the reversed second half
        PalindromeNode firstHalf = head, secondHalf = prev;
        while (secondHalf != null) {
            if (firstHalf.value != secondHalf.value) return false;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }

    public static PalindromeNode createLinkedList(int[] arr) {
        if (arr.length == 0) return null;
        PalindromeNode head = new PalindromeNode(arr[0]);
        PalindromeNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new PalindromeNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 2, 1};
        PalindromeNode head = createLinkedList(input);

        PalindromeChecker checker = new PalindromeChecker();
        boolean isPalindrome = checker.isPalindrome(head);

        System.out.println("Is Palindrome: " + isPalindrome);
    }
}

