public class Main {

    public static void main(String[] args) {
        LinkedList list=new LinkedList();

        list.insertAtBeg(10);
        list.insertAtBeg(20);
        list.insertAtBeg(30);
        list.insertAtEnd(40);
        list.insertAtIndex(50,2);
        list.show();
        list.delBeg();
        list.show();
        list.delEnd();
        list.show();
       // list.delAtIndex(1);
        list.show();
        list.reverse();

    }
}
