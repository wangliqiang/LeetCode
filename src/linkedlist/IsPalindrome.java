package linkedlist;

import org.junit.Test;
import utils.LinkedList;
import utils.ListNode;

/**
 * @Author wangliqiang
 * @Description 回文链表
 * @Date 2018/10/9 10:10
 **/
public class IsPalindrome {

    @Test
    public void test() {
        LinkedList linkedList1 = new LinkedList();
        LinkedList linkedList2 = new LinkedList();

        int[] n1 = {1, 2};
        int[] n2 = {1, 2, 2, 1};

        ListNode node1 = linkedList1.init(n1);
        ListNode node2 = linkedList2.init(n2);

        linkedList1.print(node1);
        linkedList2.print(node2);

        System.out.println(linkedList1.isPalindrome(node1));
        System.out.println(linkedList2.isPalindrome(node2));

    }
}
