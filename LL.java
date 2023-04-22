public class LL {
  Node head;
  
  class Node{
    String data;
    Node next;

    Node(String data){
      this.data = data;
      this.next = null;
    }

  }

  public void addfirst(String data){
    Node newNode = new Node(data);
    if(head == null){
      head = newNode;
      return;
    }

    newNode.next = head;
    head = newNode;

  }

  public void addlast(String data){
    Node newNode = new Node(data);
    if(head==null){
      head = newNode;
      return;
    }

    Node currNode = head;
    while(currNode.next != null){
      currNode = currNode.next;
    }
    currNode.next = newNode;
  }

  public void printlist(){
    if (head == null){
      System.out.println("Null");
      return;
    }
    
    Node currNode = head;
    while(currNode.next != null){
      System.out.print(currNode.data+" ");
      currNode.next = currNode;
    }
    
    System.out.print(currNode.data+" ");
  }

  public static void main(String []args){
    LL list = new LL();
    list.addfirst("a");
    list.addfirst("is");
    list.printlist();
  }
}
