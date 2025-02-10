import Node.ListNode;

import java.util.ArrayList;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0;
        while(head.next != null) {
            arr.add(head.val);
            head = head.next;
            i++;
        }
        ListNode node = null;
        ListNode res = node;
        for (int j = arr.size() - 1; j >= 0; i--) {
            node = new ListNode(arr.get(j));
            node = node.next;
        }
        return res;
    }
}
