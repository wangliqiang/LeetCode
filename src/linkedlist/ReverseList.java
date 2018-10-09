package linkedlist;

import org.junit.Test;
import utils.LinkedList;
import utils.ListNode;

/**
 * @Author wangliqiang
 * @Description 反转链表
 * @Date 2018/10/8 13:30
 **/
public class ReverseList {

    @Test
    public void test() {
        LinkedList linkedList = new LinkedList();
        int[] n = {1, 2, 3, 4, 5};
        ListNode node = linkedList.init(n);
        linkedList.print(node);
        linkedList.print(linkedList.reverseList(node));
    }

}
