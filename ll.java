public class ll {
Node head;
private int size;
ll(){
    this.size =0;
}
class Node{

String data;
Node next;
Node(String data){
    this.data=data;
    this.next=null;
    size++;
}
}
public  void AddatFirst(String data){
    Node newnode =new Node(data);
    if(head==null){
     head=newnode;
     return;
    }
   newnode.next=head;
   head=newnode;
}
public void addatLast(String data){
    Node newnode =new Node(data);
    if(head ==null){
        head =newnode;
        return;
    }
    Node lastNode =head;
    while(lastNode.next!=null){
        lastNode =lastNode.next;
    }
    lastNode.next =newnode;
}
public void printlist(){
 Node currNode =head;
 if(head==null){
    System.out.println("listy is empty");
    return;
 }
    while(currNode!=null){
        System.out.print(currNode.data+"--->");
        currNode =currNode.next;
    } 
    System.out.println("Null");
}
//delete first
public void deletefirst(){
    if(head==null){
        System.out.println("the list is empty");
    }
    head =head.next;
    size--;
}
public void deletelast(){
 if(head==null){
        System.out.println("the list is empty");
    }
    size--;
    if(head.next==null){
        head=null;
    }
    Node lastnode=head.next;
    Node secondlast =head.next;
    while(lastnode!=null){
        lastnode= lastnode.next;
        secondlast=secondlast.next;
    }
    secondlast.next=null;
}
public int getsize(){
    return size;
}
 public static void main(String[] args){
ll list =new ll();
list.AddatFirst("hello");
list.AddatFirst("hello");
list.AddatFirst("hello");
list.AddatFirst("3 times");
list.printlist();
list.addatLast("bhagoo");
list.printlist();
System.out.println("the size of list is "+list.getsize());
}
}
