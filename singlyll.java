public class singlyll{
    node head;
     class node{
        int val;
        node next;
        node(int val){
            this.val =val;
            next=null;
        }
        
    }
    public  void insertfirst(int val){
     node Node =new node(val);
     Node.next=head;
     head= Node;
    }
    public void display(){
        node temp = head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp =temp.next;
        }
        System.out.print("null");
    }
    public void insertlast(int val){
        node temp = head;
        while(temp.next!=null){
            temp =temp.next;
        }
        node newnode =new node(val);
        temp.next=newnode;
        newnode.next = null;
    }
    public void removefirst(){
        if(head==null){
            System.out.println("the list is empty");
            return;
        }
        head =head.next;
       
    }
    public void removelast(){
        node temp =head;
        node lastnode =head.next;
        while(lastnode.next!=null){
            lastnode =lastnode.next;
            temp =temp.next;
        }
      temp.next=null;
        
    }
    public void particularindex(int index){
        node temp=head;
        while(temp.next!=null){
            temp =temp.next;
        }
        temp.next=null;
    }
    public static void main(String[] args) {
        singlyll l =new singlyll();
        l.insertfirst(4);
        l.insertfirst(5);
        l.insertfirst(6);
        l.insertfirst(7);
        l.insertlast(8);  
        l.display();
          
    }
}