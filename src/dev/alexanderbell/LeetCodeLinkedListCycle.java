package dev.alexanderbell;

public class LeetCodeLinkedListCycle {


    public static void main(String[] args) {

        ListNode three = new ListNode(3);
        ListNode two = new ListNode(2);
        three.next = two;
        ListNode zero = new ListNode(0);
        two.next = zero;
        ListNode minus4 = new ListNode(-4);
        zero.next = minus4;
        minus4.next = two;

        System.out.println(hasCycle(three));

    }

    public static boolean hasCycle(ListNode head) {

        //naive approach - check if node already exists in set if not then add if so then return true for a cycle existing
//        boolean cycle = false;
//        Set<ListNode> listNodes = new HashSet<>();
//        while (head != null){
//          if(!listNodes.contains(head)){
//              listNodes.add(head);
//          }else {
//              cycle = true;
//              break;
//          }
//            head = head.next;
//        }
//        return cycle;

//Optimized version tortoise and hare (two pointers one moves in one step one moves in two steps if the two ever meet it indicates a cycle)
        ListNode a = head;
        ListNode b = head;
        while (b!= null && b.next != null){
            a = a.next;
            b = b.next.next;
            if(b == a){
                return true;
            }
        }

        return false;
    }
}


class ListNode {
   int val;
   ListNode next;
     ListNode(int x) {
      val = x;
         next = null;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
