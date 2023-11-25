package day11;
import Hot100.day11.Node;
import Hot100.day11.Solution1;
import org.junit.Test;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class CopyRandomListTest {
    @Test
    public void testCopyRandomList() {
        // 创建原始链表
        Node head = new Node(7);
        Node node2 = new Node(13);
        Node node3 = new Node(11);
        Node node4 = new Node(10);
        Node node5 = new Node(1);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        head.random = null;
        node2.random = head;
        node3.random = node5;
        node4.random = node3;
        node5.random = head;

        // 复制链表
        Solution1 solution = new Solution1();
        Node copiedHead = solution.copyRandomList(head);

        // 验证复制链表的节点值和随机指针
        Map<Node, Node> originalToCopyMap = new HashMap<>();
        Node originalNode = head;
        Node copiedNode = copiedHead;

        while (originalNode != null && copiedNode != null) {
            Assert.assertEquals(originalNode.val, copiedNode.val);
            if (originalNode.random != null) {
                Assert.assertEquals(originalNode.random.val, copiedNode.random.val);
            } else {
                Assert.assertNull(copiedNode.random);
            }
            originalToCopyMap.put(originalNode, copiedNode);
            originalNode = originalNode.next;
            copiedNode = copiedNode.next;
        }

        // 验证随机指针指向是否正确
        originalNode = head;
        copiedNode = copiedHead;
        while (originalNode != null && copiedNode != null) {
            if (originalNode.random != null) {
                Assert.assertEquals(originalToCopyMap.get(originalNode.random), copiedNode.random);
            }
            originalNode = originalNode.next;
            copiedNode = copiedNode.next;
        }
    }







    @Test
    public void additionalTest() {
        // 创建额外的测试链表
        Node head = new Node(3);
        Node node2 = new Node(5);
        Node node3 = new Node(4);
        Node node4 = new Node(-9);
        Node node5 = new Node(-10);
        Node node6 = new Node(5);
        Node node7 = new Node(0);
        Node node8 = new Node(6);
        Node node9 = new Node(-6);
        Node node10 = new Node(3);
        Node node11 = new Node(-6);
        Node node12 = new Node(9);
        Node node13 = new Node(-2);
        Node node14 = new Node(-3);
        Node node15 = new Node(-1);
        Node node16 = new Node(2);
        Node node17 = new Node(-3);
        Node node18 = new Node(-9);
        Node node19 = new Node(-2);
        Node node20 = new Node(-8);
        Node node21 = new Node(5);

        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        node9.next = node10;
        node10.next = node11;
        node11.next = node12;
        node12.next = node13;
        node13.next = node14;
        node14.next = node15;
        node15.next = node16;
        node16.next = node17;
        node17.next = node18;
        node18.next = node19;
        node19.next = node20;
        node20.next = node21;

        head.random = null;
        node2.random = node17;
        node3.random = null;
        node4.random = node6;
        node5.random = node3;
        node6.random = node15;
        node7.random = node11;
        node8.random = null;
        node9.random = node16;
        node10.random = node16;
        node11.random = node11;
        node12.random = node12;
        node13.random = head;
        node14.random = node11;
        node15.random = node10;
        node16.random = null;
        node17.random = node7;
        node18.random = null;
        node19.random = node4;
        node20.random = null;
        node21.random = null;

        // 复制链表
        Solution1 solution = new Solution1();
        Node copiedHead = solution.copyRandomList(head);

        // 验证复制链表的节点值和随机指针
        Map<Node, Node> originalToCopyMap = new HashMap<>();
        Node originalNode = head;
        Node copiedNode = copiedHead;

        while (originalNode != null && copiedNode != null) {
            Assert.assertEquals(originalNode.val, copiedNode.val);
            if (originalNode.random != null) {
                Assert.assertEquals(originalNode.random.val, copiedNode.random.val);
            } else {
                Assert.assertNull(copiedNode.random);
            }
            originalToCopyMap.put(originalNode, copiedNode);
            originalNode = originalNode.next;
            copiedNode = copiedNode.next;
        }

        // 验证随机指针指向是否正确
        originalNode = head;
        copiedNode = copiedHead;
        while (originalNode != null && copiedNode != null) {
            if (originalNode.random != null) {
                Assert.assertEquals(originalToCopyMap.get(originalNode.random), copiedNode.random);
            }
            originalNode = originalNode.next;
            copiedNode = copiedNode.next;
        }
    }
}
