public class MyLinkedList {
   Node head;

   ///////////////////////////////////////////////////////

   public void insert(int data) {
      Node newNode = new Node(data);

      if(head == null) {
         head = newNode;
      } else {
         Node tempNode = head;
         while(tempNode.getNext() != null)
            tempNode = tempNode.getNext();
         tempNode.setNext(newNode);
      }
   }

   ///////////////////////////////////////////////////////

   public void insertAtStart(int data) {
      Node newNode = new Node(data);
      newNode.setNext(head);

      head = newNode;
   }

   ///////////////////////////////////////////////////////

   public void insertAt(int index, int data) {
      Node newNode = new Node(data);

      if(index == 0) {
         insertAtStart(data);
      } else {
         Node tempNode = head;
         for(int i=0; i<index-1; i++)
            tempNode = tempNode.getNext();

         newNode.setNext(tempNode.getNext());
         tempNode.setNext(newNode);
      }
   }

   ///////////////////////////////////////////////////////

   public void deleteAt(int index) {
      if(index == 0) {
         head = head.getNext();
      } else {
         Node tempNode = head;
         Node nextNode;
         for(int i=0; i<index-1; i++)
            tempNode = tempNode.getNext();
         nextNode = tempNode.getNext();
         tempNode.setNext(nextNode.getNext());

         nextNode = null;
      }
   }

   ///////////////////////////////////////////////////////

   public void show() {
      Node node = head;
      while(node.getNext() != null) {
         System.out.print(node.getData() + " - ");
         node = node.getNext();
      }
      System.out.print(node.getData() + "\n\n");
   }
}
