package linkedlist;

import org.junit.Test;
import utils.LinkedList;
import utils.ListNode;

/**
 * @Author wangliqiang
 * @Description TODO
 * @Date 2018/10/9 10:00
 **/
public class MergeTwoLists {

    @Test
    public void test() {
        LinkedList linkedList1 = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        LinkedList node = new LinkedList();
        int[] n1 = {1, 2, 4};
        int[] n2 = {1, 3, 4};
        ListNode l1 = linkedList1.init(n1);
        ListNode l2 = linkedList2.init(n2);

        linkedList1.print(l1);
        linkedList2.print(l2);

        node.print(node.mergeTwoLists(l1, l2));
    }

}
