package dev.alexanderbell;

class LeetCodeReverseLinkedList{
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode next = new ListNode(2);
        listNode.next = next;
        ListNode next1 = new ListNode(3);
        next.next = next1;
        ListNode next2 = new ListNode(4);
        next1.next = next2;
        next2.next = new ListNode(5);

        reverseList(listNode);
    }

    public static ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode currentNode = head;
        ListNode prevNode = null;
        ListNode nextNode;
        while (currentNode.next != null){
            nextNode = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = nextNode;
        }
        currentNode.next = prevNode;
        prevNode = currentNode;
        return prevNode;
    }
}