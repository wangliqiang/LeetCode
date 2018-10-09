package linkedlist;

import org.junit.Test;
import utils.LinkedList;
import utils.ListNode;

/**
 * @Author wangliqiang
 * @Description 删除链表中的节点
 * @Date 2018/10/8 10:13
 **/
public class DeleteNode {

    @Test
    public void test() {
        LinkedList linkedList = new LinkedList();
        int[] n = {4, 5, 1, 9};
        ListNode node = linkedList.init(n);
        linkedList.print(node);
        linkedList.print(linkedList.deleteNode(node, 5));
    }
}
