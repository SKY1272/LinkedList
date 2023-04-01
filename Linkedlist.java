// first create LinkedList class
// second craete the Node class because Every Node is class its stor the object
// third crate the constructor;
// forth
// import java.util.LinkedList;
public class Linkedlist {
  public static class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static Node head;
  public static Node tail;
  public int size;

  public void addFirst(int data) {
    // creating a new Node step1
    Node newNode = new Node(data);
    size++;
    // if likedList is empty;
    if (head == null) {
      head = tail = newNode;
      return;
    }

    // step2 newNode=head
    newNode.next = head;
    // step3 head=newNode;
    head = newNode;
  }

  public void addLast(int data) {
    Node newNode = new Node(data);
    size++;
    if (head == null) {
      head = tail = newNode;
      return;
    }
   
    tail.next = newNode;
    tail = newNode;
  }
public void print(){
  if(head==null){
    
    System.out.print("Empty");
  }
  Node temp=head;
  while(temp!=null){
    System.out.print(temp.data+"->");
    temp=temp.next;
  }
 System.out.println("null ");
}
// add node middile in the list
public void Add(int idx,int data){
   Node newNode=new Node(data);
    size++;
  Node temp=head;
  // System.out.println(temp.data);
  int i=0;
  while(i<idx-1){
    temp=temp.next;
    // System.out.println(temp.data);
    i++;
  }
  newNode.next=temp.next;
  System.out.println(newNode.data);
  temp.next=newNode;
  // size++;
  // System.out.println(newNode.data);
}
  public static void main(String args[]) {
    Linkedlist li = new Linkedlist();
    li.addFirst(2);
    // li.print();
    li.addFirst(1);
    // li.print();
    li.addLast(3);
    // li.print();
    li.addLast(4);
    li.print();
    li.Add(2,9);
    li.print();
    System.out.println(li.size);
   
  }

}