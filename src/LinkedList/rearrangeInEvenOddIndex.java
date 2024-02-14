package LinkedList;

public class rearrangeInEvenOddIndex {
    public static  class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        void display(ListNode head){
            while (head != null){
                System.out.print(head.val+" ");
                head = head.next;
            }
            System.out.println();

        }


    }

    public static ListNode oddEvenList2(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode odd = null, even = null, cur = head;
        ListNode oddCur = null, evenCur = null;
        int i = 1;
        while(cur != null){
            if(i % 2 != 0){
                if(odd == null){
                    odd = cur;
                    oddCur = odd;
                }else {
                    oddCur.next = cur;
                    oddCur= oddCur.next;
                }
            }else {
                if(even == null){
                    even = cur;
                    evenCur = even;
                }else {
                    evenCur.next = cur;
                    evenCur= evenCur.next;
                }
            }
            i++;
            cur = cur.next;
        }
        oddCur.next = even;
        evenCur.next = null;
        head = odd;
        return head;
    }
    public static ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode odd = null, even = null, cur = head;
        ListNode oddCur = null, evenCur = null;
        int i = 1;
        while(cur != null){
            if(cur.val % 2 != 0){
                if(odd == null){
                    odd = cur;
                    oddCur = odd;
                }else {
                    oddCur.next = cur;
                    oddCur= oddCur.next;
                }
            }else {
                if(even == null){
                    even = cur;
                    evenCur = even;
                }else {
                    evenCur.next = cur;
                    evenCur= evenCur.next;
                }
            }
            i++;
            cur = cur.next;
        }
        oddCur.next = even;
        evenCur.next = null;
        head = odd;
        return head;
    }

    public static ListNode oddEvenList1(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenhead = even;
        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenhead;
        return head;
    }

    



    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(1);
//        ListNode c = new ListNode(1);
//        ListNode d = new ListNode(4);
//        ListNode e = new ListNode(6);
//        ListNode f = new ListNode(6);
//        a.next = b;
//        b.next = c;
//        c.next = d;
//        d.next = f;
//        a.display(a);

        //below two are for index wise even odd

//        ListNode ans2 = oddEvenList2(a);
//        ans.display(ans2);
//        ListNode ans1 = oddEvenList1(a);
//        ans1.display(ans1);


        // odd even wise

//        ListNode ans = oddEvenList(a);
//        ans.display(ans);




    }

}
