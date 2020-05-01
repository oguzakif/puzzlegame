import java.util.Collections;

public class Methods {
    public void adder(LinkedList wordlist, MultiLinkedList mll){
        Node temp = wordlist.getHead();
        int size = wordlist.size();
        boolean firsttime = true;
        for(int i=0;i<size;i++){
            if(firsttime){
                mll.insertUpper(((Word)(temp.getData())).getOrigin().charAt(0));
                firsttime = false;
            }

            mll.insertInner(((Word)(temp.getData())).getOrigin().charAt(0), temp.getData());
            temp = temp.getNext();
            if(((Word)(temp.getData())).getOrigin().charAt(0) != ((Word)(temp.getNext().getData())).getOrigin().charAt(0)){
                mll.insertUpper(((Word)(temp.getNext().getData())).getOrigin().charAt(0));
            }
        }
        System.out.println();
    }

}