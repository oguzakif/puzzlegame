
public class MultiLinkedList {
    private UpperNode head;

    public void insertUpper(Object dataToAdd){
        if(head == null){
            UpperNode newnode= new UpperNode(dataToAdd);
            head = newnode;
        }
        else{
            UpperNode temp = head;
            while(temp.getDown() != null)
                temp = temp.getDown();
            UpperNode newnode = new UpperNode(dataToAdd);
            temp.setDown(newnode);
        }
    }
    public void insertInner(Object upper,Object dataToAdd){
       if(head == null) System.out.println("Add a uppernode before the inner.");
       else{
           UpperNode temp = head;
           while(temp != null){
               if(upper.equals(temp.getData())){
                   Node temp2 = temp.getRight();
                   if(temp2 == null){
                       Node newnode = new Node(dataToAdd);
                       temp.setRight(newnode);
                   }
                   else{
                       while(temp2.getNext() !=null) temp2 = temp2.getNext();
                    Node newnode = new Node(dataToAdd);
                    temp2.setNext(newnode);
                   }
                }
                temp = temp.getDown();

           }
       }
    }
    public void display(){
        if(head == null){
            System.out.println("linked list is empty.");
        }
        else{
            UpperNode temp = head;
            while(temp != null){
                Node temp2 = temp.getRight();
                while(temp2 != null){
                    System.out.print(temp2.getData()+" ");
                    temp2 = temp2.getNext();
                }
                temp = temp.getDown();
                System.out.println();
            }
        }
    }
    public int sizeUp(){
        int count =0;
        if(head == null) System.out.println("Linked list is empty.");
        else{
            UpperNode temp = head;
            while(temp !=null) {
                count++;
                temp = temp.getDown();
            }
        }
        return count;
    } 
    public int sizeIn(){
        int count =0;
        if(head == null) System.out.println("Linked list is empty.");
        else{
            UpperNode temp = head;
            Node temp2 = temp.getRight();
            while(temp2 != null){
                count++;
                temp2 = temp2.getNext();
            }
        }
        return count;
    }
   
    public UpperNode getHead() {
        return head;
    }

    public void setHead(UpperNode head) {
        this.head = head;
    }

}