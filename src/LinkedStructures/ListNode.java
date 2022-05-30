package LinkedStructures;

public class ListNode<E> {

    private E item;
    ListNode next;

    public ListNode(E data) {
        this.item = data;
        next = null;
    }
}
