
public class UpperNode {
    private Object data;
    private UpperNode down;
    private Node right;

    UpperNode(Object dataToAdd){
        data = dataToAdd;
        down = null;
        right = null;
    }

    public Object getData() {
        return data;
    }
   
    public void setData(Object data) {
        this.data = data;
    }
    
    public UpperNode getDown() {
        return down;
    }

    public void setDown(UpperNode down) {
        this.down = down;
    }
   
    public Node getRight() {
        return right;
    }
   
    public void setRight(Node right) {
        this.right = right;
    }

}