package com.fido;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoThirdsOfLinkedListTest {

    private TwoThirdsOfLinkedList twoThirdsOfLinkedList;

    @BeforeEach
    void setUp() {
        twoThirdsOfLinkedList = new TwoThirdsOfLinkedList();
    }

    // Helper method to create a linked list from an array
    private <T> Node<T> createLinkedList(T[] data) {
        if (data == null || data.length == 0) {
            return null;
        }
        Node<T> head = new Node<>();
        head.data = data[0];
        Node<T> current = head;
        for (int i = 1; i < data.length; i++) {
            Node<T> newNode = new Node<>();
            newNode.data = data[i];
            current.next = newNode;
            current = newNode;
        }
        return head;
    }

    @Test
    void testEmptyList() {
        assertNull(twoThirdsOfLinkedList.getTwoThirdsNode(null),
                "Should return null for an empty list.");
    }

    @Test
    void testSingleNodeList() {
        Node<Integer> head = createLinkedList(new Integer[]{1});
        assertNull(twoThirdsOfLinkedList.getTwoThirdsNode(head),
                "Should return null for a single node list.");
    }

    @Test
    void testTwoNodeList() {
        Node<Integer> head = createLinkedList(new Integer[]{0, 1});
        Node<Integer> result = twoThirdsOfLinkedList.getTwoThirdsNode(head);
        assertNotNull(result);
        assertEquals(0, result.data);
    }

    @Test
    void testThreeNodeList() {
        Node<Integer> head = createLinkedList(new Integer[]{0, 1, 2});
        Node<Integer> result = twoThirdsOfLinkedList.getTwoThirdsNode(head);
        assertNotNull(result);
        assertEquals(1, result.data);
    }

    @Test
    void testFourNodeList() {
        Node<Integer> head = createLinkedList(new Integer[]{0, 1, 2, 3});
        Node<Integer> result = twoThirdsOfLinkedList.getTwoThirdsNode(head);
        assertNotNull(result);
        assertEquals(1, result.data);
    }

    @Test
    void testFiveNodeList() {
        Node<Integer> head = createLinkedList(new Integer[]{0, 1, 2, 3, 4});
        Node<Integer> result = twoThirdsOfLinkedList.getTwoThirdsNode(head);
        assertNotNull(result);
        assertEquals(2, result.data);
    }

    @Test
    void testSixNodeList() {
        Node<Integer> head = createLinkedList(new Integer[]{0, 1, 2, 3, 4, 5});
        Node<Integer> result = twoThirdsOfLinkedList.getTwoThirdsNode(head);
        assertNotNull(result);
        assertEquals(3, result.data);
    }

    @Test
    void testSevenNodeList() {
        Node<Integer> head = createLinkedList(new Integer[]{0, 1, 2, 3, 4, 5, 6});
        Node<Integer> result = twoThirdsOfLinkedList.getTwoThirdsNode(head);
        assertNotNull(result);
        assertEquals(3, result.data);
    }

    @Test
    void testEightNodeList() {
        Node<Integer> head = createLinkedList(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7});
        Node<Integer> result = twoThirdsOfLinkedList.getTwoThirdsNode(head);
        assertNotNull(result);
        assertEquals(4, result.data);
    }

    @Test
    void testTenNodeList() {
        Node<Character> head = createLinkedList(new Character[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'});
        Node<Character> result = twoThirdsOfLinkedList.getTwoThirdsNode(head);
        assertNotNull(result);
        assertEquals('f', result.data); // index 5
    }
    @Test
    void test5NodeList() {
        Node<Character> head = createLinkedList(new Character[]{'a', 'b', 'c', 'd', 'e'});
        Node<Character> result = twoThirdsOfLinkedList.getTwoThirdsNode(head);
        assertNotNull(result);
        assertEquals('c', result.data); // index 5
    }
    @Test
    void testListWithDifferentDataTypes() {
        Node<String> head = createLinkedList(new String[]{"apple", "banana", "cherry"});
        Node<String> result = twoThirdsOfLinkedList.getTwoThirdsNode(head);
        assertNotNull(result);
        assertEquals("banana", result.data); // index 1
    }
}
