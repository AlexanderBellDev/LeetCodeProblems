package dev.alexanderbell;

public class LeetCodeMergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode next = new ListNode(2);
        listNode.next = next;
        ListNode next1 = new ListNode(4);
        next.next = next1;

        ListNode listNode1 = new ListNode(1);
        ListNode next11 = new ListNode(3);
        listNode1.next = next11;
        ListNode next111 = new ListNode(4);
        next11.next = next111;

        mergeTwoLists(new ListNode(2),new ListNode(1));
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //null case
        if(l1 == null && l2 == null) return null;

        if(l1 == null){
            return l2;
        }else if(l2 == null){
            return l1;
        }
        ListNode listNode;
        int firstVal;
        if(l1.val <= l2.val){
            listNode = new ListNode(l1.val);
            l1 = l1.next;
        }else {
            listNode = new ListNode(l2.val);
            l2 = l2.next;
        }

        ListNode currentNode = listNode;

        while (l1 != null || l2 != null){
            if(l1 != null && l2 == null || l1!= null && l1.val <= l2.val){
                currentNode.next = new ListNode(l1.val);
                currentNode = currentNode.next;
                l1 = l1.next;
            }else {
                currentNode.next = new ListNode(l2.val);
                currentNode = currentNode.next;
                l2 = l2.next;
            }
        }

        return listNode;
    }
}
