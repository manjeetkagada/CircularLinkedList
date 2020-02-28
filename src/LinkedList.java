public class LinkedList {
    Node head;
    Node tail;


    public void insertAtBeg(int data){
        Node node=new Node();
        node.data=data;
        node.next=null;
        if (head==null){
            head=node;
            tail=node;

        }else {
            Node temp=head;
            node.next=head;
            head=node;
            tail.next=head;


        }


    }
    public void insertAtIndex(int data,int pos){
        Node node=new Node();
        node.data=data;
        node.next=null;
        Node temp=head;

        if (pos==0)
           insertAtBeg(data);
         for (int i=0;i<pos-1;i++){
             temp=temp.next;

         }
         node.next=temp.next;
         temp.next=node;






    }




    public void insertAtEnd(int data){
        Node node=new Node();
        node.data=data;
        node.next=null;
        if (head==null){
            head=node;
            tail=node;

        }else {

            tail.next=node;
            tail=node;
            node.next=head;


        }


    }

    public void delBeg(){
        Node node=null;
        node=head;
        head=head.next;
        tail.next=head;
        node=null;



    }
    public void delEnd(){
        Node node=null;
        Node temp=head;
        while (temp.next!=tail){
            temp=temp.next;
        }
        tail=temp;
        tail.next=head;
        node=temp.next;



        node=null;



    }
    public void delAtIndex(int pos){
        Node node=null;
        Node temp=head;
        for (int i=0;i<pos-1;i++){
            temp=temp.next;
        }
        node=temp.next;
        temp.next=node.next;

         node=null;



    }
    public void show(){
        Node node=head;
        while (node.next!=head){
            System.out.print(node.data+"->");
            node=node.next;
        }

        System.out.print(node.data+"\n");

    }
    public void reverse(){
      Node current=head;
      Node nextnode;
      head=tail;
      Node prev=null;
      while (current!=head){
          nextnode=current.next;
          current.next=prev;
          prev=current;
          current=nextnode;
      }

      Node tem=head;
      while (tem.next!=null){

          System.out.print(tem.data+"->");
          tem=tem.next;
      }
        System.out.print(tem.data);



    }



}
