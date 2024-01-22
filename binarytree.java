import java.util.Scanner;

public class binarytree{ 
    class node{
        int data;
        node left;
        node right;
        node(int data){
         this.data= data;
         
        }
    }
    node root;
    public void populate(Scanner sc){
        System.out.println("enter the root node value");
        int data=sc.nextInt();
        root=new node(data); 
        populate(root, sc);
    }
    public void populate(node node,Scanner sc){
        System.out.println("do you want to enter left of " +node.data);
        boolean left =sc.nextBoolean();
        if(left){
            System.err.println("enter the value of left node"+node.data);
            int data = sc.nextInt();
            node.left=new node(data);
            populate(node.left, sc);
        }
        System.out.println("do you want to enter right of " +node.data);
        boolean right =sc.nextBoolean();
        if(right){
            System.err.println("enter the value of right node"+node.data);
            int data = sc.nextInt();
            node.right=new node(data);
            populate(node.right, sc);
        }
    }
    public void display(){
       display(root ,"|---> ");
    }
    private void  display(node n,String intdent){
        if(n==null){
            return;
        }
        System.out.println(n.data);
        display(n.left, intdent);
        display(n.right, intdent);
    }
    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        binarytree tree =new binarytree();
        tree.populate(sc);
        tree.display();
    }
}
