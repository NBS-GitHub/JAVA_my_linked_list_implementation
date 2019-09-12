public class Main {
   public static void main(String[] args) {

      MyLinkedList list = new MyLinkedList();

      list.insert(5);
      list.insert(2);
      list.insert(44);
      list.insert(321);
      list.show();

      list.insertAtStart(30);
      list.show();

      list.insertAt(2,3);
      list.show();

      list.deleteAt(1);
      list.show();

   }
}
