import java.io.*;

// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
    private Node head; // head of list 
  
    // Method to insert a new node 
    public void add(Object dataToAdd){
        Node temp;
        if(head == null){
            Node newnode = new Node(dataToAdd);
            head = newnode;
            head.setNext(head);
        }
        else{
            if((((Word)(dataToAdd)).getOrigin()).compareTo(((Word)head.getData()).getOrigin())<0){
                temp = head;
                do 
                temp = temp.getNext();
                while(temp.getNext() != head);

                Node newnode = new Node(dataToAdd);
                newnode.setNext(head);
                temp.setNext(newnode);
                head = newnode;
            }
            else{
                temp = head;
                while(temp.getNext() != head && (((Word)(dataToAdd)).getOrigin()).compareTo(((Word)temp.getNext().getData()).getOrigin())>0)
                    temp = temp.getNext();
                Node newnode = new Node(dataToAdd);
                newnode.setNext(temp.getNext());
                temp.setNext(newnode);
            }
        }

    }
    // Method to print the LinkedList. 
    public void display() 
    { 
        if (head == null)    
        System.out.println("linked list is empty");
        else {
            Node temp = head;
            while (temp != null) {
            System.out.print(temp.getData()+" ");
            temp = temp.getNext();
            }
        }
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }
    public void delete(){
        
    }
    public int size(){
        int counter = 0;
        if(head == null) System.out.println("linked list is empty.");

        else{
                Node temp = head;
        
                do{
                    counter++;
                    temp = temp.getNext();
                }while(temp != head);
            }
        
        return counter;
    }
}
   