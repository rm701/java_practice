public class Node {
    private Item i;
	private Node<Item> next;
	
	public Node(Item i, Node<Item> n) {
		this.i=i;
		this.next=n;
	}
	public Node() {
		this(null,null);
	}
	public Node(Item i) {
		this.i=i;
		this.next=null;
	}
	public void setNext(Node<Item> n) {this.next=n;}
	public void setItem(Item i) {this.i=i;}
	
	public Node<Item> getNext(){return this.next;}
	public Item getItem() {return this.i;}
	
}
