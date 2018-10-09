package utils;

/**
 * @Author wangliqiang
 * @Description TODO
 * @Date 2018/10/8 10:46
 **/
public class LinkedList {

    public ListNode head;
    public ListNode current;

    /**
     * 初始化链表
     *
     * @param n
     * @return
     */
    public ListNode init(int[] n) {
        for (int i = 0; i < n.length; i++) {
            this.add(n[i]);
        }
        return head;
    }

    /**
     * 插入node
     *
     * @param data
     */
    public void add(int data) {
        if (head == null) {
            head = new ListNode(data);
            current = head;
        } else {
            current.next = new ListNode(data);
            current = current.next;
        }
    }

    /**
     * 打印
     *
     * @param node
     */
    public void print(ListNode node) {
        if (node == null) {
            return;
        }
        current = node;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    /**
     * 删除链表中的节点
     *
     * @param head
     * @param i
     * @return
     */
    public ListNode deleteNode(ListNode head, int i) {
        ListNode node = head;
        while (node.next != null) {
            if (node.next.val == i) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        return head;
    }

    /**
     * 删除链表的倒数第N个节点
     *
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode preNode = head;
        ListNode curNode = head;
        for (int i = 0; i < n; i++) {
            curNode = curNode.next;
        }
        if (curNode == null) {
            return preNode.next;
        }
        while (curNode.next != null) {
            preNode = preNode.next;
            curNode = curNode.next;
        }
        preNode.next = preNode.next.next;
        return head;
    }

    /**
     * 翻转链表 - 递归
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }

    /**
     * 合并两个有序链表
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode node;
        if (l1 == null || l2 == null) {
            return l1 == null ? l2 : l1;
        } else {
            if (l1.val < l2.val) {
                node = new ListNode(l1.val);
                l1 = l1.next;
                node.next = mergeTwoLists(l1, l2);
            } else {
                node = new ListNode(l2.val);
                l2 = l2.next;
                node.next = mergeTwoLists(l1, l2);
            }
            return node;
        }
    }

    /**
     * 回文链表
     *
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) {
            return true;
        }

        ListNode preNode, aftNode;
        preNode = head;
        aftNode = head;

        while (aftNode.next != null && aftNode.next.next != null) {
            aftNode = aftNode.next.next;
            preNode = preNode.next;
        }

        if (aftNode != null) {
            preNode.next = reverseList(preNode.next);
            preNode = preNode.next;
        } else {
            preNode = reverseList(preNode);
        }
        while (preNode != null) {
            if (head.val != preNode.val) {
                return false;
            }
            preNode = preNode.next;
            head = head.next;
        }
        return true;
    }

    /**
     * 环形链表
     * @param head
     */
    public void hasCycle(ListNode head){
        
    }
}
