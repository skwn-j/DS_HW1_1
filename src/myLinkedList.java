import java.util.ListIterator;

public class myLinkedList implements LinkedList{
    private myNode head;
    private myNode curr;
    public myLinkedList() {
        head = new myNode(null);
        curr = head;
    }

    public boolean isEmpty() {
        if(this.head.getNext() == null)
            return true;
        else
            return false;
    }
    public int size() {
        return 0;
    }
    public String get(int index) {
        return null;
    }
    public int indexOf(Object elem) {
        return 0;
    }
    public Object remove(int index) {
        return null;
    }
    public void add(int index, Object obj) {
        return;
    }
    public String toString() {
        return "hi";
    }

    public ListIterator myListIterator() {
        return new ListIterator();
    }
    //Iterator
    class ListIterator {
        private myNode next;
        private myNode lastReturned;
        private int nextIndex;

        ListIterator() {
            next = head;
        }

        public String next() {
            return null;
        }

        public boolean hasNext() {
            return true;
        }
    }

    //Node
    class myNode {
        private Object elem;
        private myNode next;
        public myNode(Object elem) {
            this.elem = elem;
            this.next = null;
        }
        public myNode(Object elem, myNode next) {
            this.elem = elem;
            this.next = next;
        }

        public Object getElem() {
            return elem;
        }
        public void setElem(Object elem) {
            this.elem = elem;
        }

        public myNode getNext() {
            return next;
        }
        public void setNext(myNode next) {
            this.next = next;
        }
    }

}
