import javax.swing.text.html.HTMLDocument;
import java.util.AbstractList;
import java.util.Iterator;

public class CustomList<T> extends AbstractList<T>{
    public CustomList() {
    head = null; tail = null;
    }

    private class Node {
        public T value;
        public Node next;
        public Node(Node next, T value) {
            this.next = next;
            this.value = value;
        }
    }
        private Node head;
        private Node tail;
        public void addLast(T value){
            Node newNode = new Node(null, value);
            if (head==null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
        }
        public T getLast(){
            if (tail!=null) return tail.value;
            return null;
        }
        void addFirst(T value){
            Node newNode = new Node(head,value);
            if (head==null) {
                tail = newNode;
            }
            head = newNode;
        }
        public T getFirst(){
            if (head!=null) return head.value;
            return null;
        }
        public String toString(){
            StringBuilder text = new StringBuilder();
            text.append("[");
            Node point = head;
            while (point != null){
                text.append(point.value+";");
                point = point.next;
            }
            text.append("]");
            return text.toString();
        }
        public boolean add(T t){
            Node newNode = new Node(null, t);
            if (head==null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
            return true;
        }
        @Override
        public int size(){
            int counter=0;
            Node point = head;
            while (point != null){
                counter++;
                point = point.next;
            }
            return counter;
        }
        @Override
        public T get(int index){
            Node point = head;
            while (point!=null){
                index--;
                point = point.next;
                if (index==0) return point.value;
            }
            return null;
        }
        @Override
        public Iterator<T> iterator(){
            Iterator<T> iterator = new Iterator<T>() {
                @Override
                public boolean hasNext() {
                    return false;
                }

                @Override
                public T next() {
                    return null;
                }
            };
            return iterator;
        }
}
