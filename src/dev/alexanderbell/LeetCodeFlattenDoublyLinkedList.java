package dev.alexanderbell;

public class LeetCodeFlattenDoublyLinkedList {
    public static void main(String[] args) {
        Node node = new Node();
        node.val = 10;
        Node next = new Node();
        Node child = new Node();
        Node finalNode = new Node();
        Node childNext = new Node();
        Node seventy = new Node();
        childNext.val = 50;
        finalNode.val = 40;
        child.val = 30;
        next.val = 20;
        node.next = next;
        next.prev = node;
        next.child = child;
        child.next = childNext;
        childNext.prev = child;
        next.next = finalNode;
        finalNode.prev = next;
        seventy.val = 70;
        finalNode.child = seventy;

        flatten(node);
    }

    public static Node flatten(Node head) {
        boolean child = false;
        boolean childFound = false;
        Node tempNext = null;
        while (head != null){
            if(head.next == null && head.child != null && !childFound){
                head.child.prev = head;
                head.next = head.child;
                head.child = null;
                childFound = true;
            }else if(head.next!= null && head.child != null && !childFound){
                tempNext = head.next;
                head.child.prev = head;
                head.next = head.child;
                head.child = null;
                childFound = true;
            }
            if(head.next == null && tempNext!=null){
                tempNext.prev = head;
                head.next = tempNext;
                head = tempNext;
                break;
            }
           if(head.next != null){
               head = head.next;
           }else {
               break;
           }

        }

        while (head!= null && head.prev != null){
            if(head.child != null){
                child = true;
            }
            head = head.prev;
        }

        if(child){
            return flatten(head);
        }

        return head;
    }
}

// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
