package org.datastructure.simplestructures;

/**
 * 简单单项列表实现
 *
 * @author Ignas Lelys
 * @created May 4, 2011
 */
public class LinkedList {

    private Entry head;

    // TODO error checking
    public int get(int index) {
        Entry entry = head;
        for (int i = 0; i < index; i++) {
            entry = entry.next;
        }
        return entry.element;
    }

    public void insert(int element) {
        Entry oldHead = this.head;
        this.head = new Entry(null, oldHead, element);
        if (oldHead != null) {
            oldHead.previous = head;
        }
    }

    public void delete(int element) {
        Entry elementEntry = search(element);
        if (elementEntry != null) {
            if (elementEntry.previous != null) {
                elementEntry.previous.next = elementEntry.next;
            } else {
                // if no previous, that means we are deleting head
                this.head = elementEntry.next;
            }
            if (elementEntry.next != null) {
                elementEntry.next.previous = elementEntry.previous;
            }
        }
    }

    private Entry search(int key) {
        Entry entry = head;
        while (entry != null) {
            if (entry.element == key) {
                return entry;
            }
            entry = entry.next;
        }
        return null;
    }

    /**
     * 自定义链表节点
     */
    private static class Entry {
        public Entry previous;
        public Entry next;
        public int element;

        public Entry(Entry previous, Entry next, int element) {
            super();
            this.previous = previous;
            this.next = next;
            this.element = element;
        }

    }
}
