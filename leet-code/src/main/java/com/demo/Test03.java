package com.demo;

public class Test03 {
    public static void main(String[] args) {






    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode cur = result;
        int total = 0 ;
        int next1 = 0 ;
        while (l1 != null && l2 != null){
            total = l1.val + l2.val + next1;
            cur.next = new ListNode(total%10);
            next1 = total / 10;
            l1 = l1.next;
            l2 = l2.next;
            cur = cur.next;
        }

        while (l1 != null ){
            total = l1.val +next1;
            cur.next = new ListNode(total % 10);
            next1 = total / 10 ;
            l1 = l1.next;
            cur = cur.next;
        }

        while (l2 != null ){
            total = l2.val + next1;
            cur.next = new ListNode(total % 10);
            next1 = total / 10 ;
            l2 = l2.next;
            cur = cur.next;
        }
        if(next1 != 0 ){
            cur.next = new ListNode(next1);
        }
        result = result.next;
        return result;

    }
    private static class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
