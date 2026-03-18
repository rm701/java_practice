public class SingleLinkedList<Item> {
    private Node<Item> head;
    private Node<Item> tail;
    private int length; // size of the linked list

    // Constructors
    SingleLinkedList() {
        head = tail = null;
    }

    SingleLinkedList(Node<Item> i) {
        head = tail = i;
        length = 1;
    }

    // Basic methods
    public boolean isEmpty() {
        return head == null;
    }

    public void setHead(Node<Item> i) {
        head = i;
    }

    public Node<Item> getHead() {
        return head;
    }

    public int length() {
        return length;
    }

    // Add methods
    public void addAtFront(Node<Item> n) {
        setHead(n);
    }

    public void addAtEnd(Node<Item> n) {
        if (isEmpty()) {
            head = tail = n;
        } else {
            tail.setNext(n);
            tail = n;
        }
        length++;
    }

    public void addNodeAtIndex(int i, Node<Item> n) {
        if (i == 0) {
            n.setNext(head);
            head = n;
        } else {
            Node<Item> current = head;
            for (int j = 0; j < i - 1; j++) {
                current = current.getNext();
            }
            n.setNext(current.getNext());
            current.setNext(n);
        }
        length++;
    }

    // Find method
    public int findNodeIndex(Node<Item> n) {
        Node<Item> current = head;
        int index = 0;
        while (current != null) {
            if (current == n) return index;
            current = current.getNext();
            index++;
        }
        return -1;
    }

    // Remove methods
    public Node<Item> remove(Node<Item> n) {
        if (isEmpty()) return null;
        if (head == n) return removeFromFront();
        Node<Item> current = head;
        while (current.getNext() != null) {
            if (current.getNext() == n) {
                current.setNext(n.getNext());
                length--;
                return n;
            }
            current = current.getNext();
        }
        return null;
    }

    public Node<Item> removeFromFront() {
        if (isEmpty()) return null;
        Node<Item> removed = head;
        head = head.getNext();
        length--;
        return removed;
    }

    public Node<Item> removeFromEnd() {
        if (isEmpty()) return null;
        if (head == tail) {
            Node<Item> removed = head;
            head = tail = null;
            length--;
            return removed;
        }
        Node<Item> current = head;
        while (current.getNext() != tail) {
            current = current.getNext();
        }
        Node<Item> removed = tail;
        tail = current;
        tail.setNext(null);
        length--;
        return removed;
    }

    public Node<Item> removeNodeAtIndex(int i) {
        if (i == 0) return removeFromFront();
        Node<Item> current = head;
        for (int j = 0; j < i - 1; j++) {
            current = current.getNext();
        }
        Node<Item> removed = current.getNext();
        current.setNext(removed.getNext());
        length--;
        return removed;
    }

    // Display
    public void displayLinkedList() {
        Node<Item> current = head;
        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
    public void addNodeInSortedOrder(Node<Item>n) {
    	Node<Item> prev,current;
    	prev = null;
    	current=getHead();
    	while(current!=null && n.compareTo(current)>0) {
    		prev=current;
    		current=current.getNext();}
    	n.setNext(current);
    	if(prev==null) {
    		head=n;}
    	else prev.setNext(n);
    		
    	}
    	
    	
    	
    
}