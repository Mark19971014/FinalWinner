

class E026 {
    
    public E026(){}

    public ListNode reverseList(ListNode head){
       
        ListNode prev = null;
        ListNode cur = head;
        while(cur!= null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
      
        }
          return head;
    }

    public void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Print the original list
        E026 solution = new E026();
        System.out.println("Original List:");
        solution.printList(head);

        // Reverse the list
        ListNode reversedHead = solution.reverseList(head);

        // Print the reversed list
        System.out.println("Reversed List:");
        solution.printList(reversedHead);
    }

}