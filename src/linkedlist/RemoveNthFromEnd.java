package linkedlist;

import org.junit.Test;
import utils.LinkedList;
import utils.ListNode;

/**
 * @Author wangliqiang
 * @Description 删除链表的倒数第N个节点
 * @Date 2018/10/8 11:08
 **/
public class RemoveNthFromEnd {

    @Test
    public void test() {
        LinkedList linkedList = new LinkedList();
        int[] n = {1, 2, 3, 4, 5, 6};
        ListNode node = linkedList.init(n);
        linkedList.print(node);
        linkedList.print(linkedList.removeNthFromEnd(node, 2));
    }
}
