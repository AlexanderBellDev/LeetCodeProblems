package dev.alexanderbell;

public class LeetCodeDeleteNodeInLinkedList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(5);
        ListNode next = new ListNode(1);
        listNode.next = next;
        next.next = new ListNode(9);
        deleteNode(listNode);
    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}


