public class LinkedList<T> {
    private Node mHead;
    private int count;
    public LinkedList(){
        mHead = null;
        count = 0;
    }

    public LinkedList(T pData){
            Node newNode = new Node(pData);
            mHead = newNode;
    }

    public boolean isEmpty(){
        return mHead==null;
    }

    @Override
    public String toString(){
        String returnString = "";
        if(mHead==null){
            return returnString;
        }
        Node pointer = mHead;
        while (pointer != null){
            returnString += pointer.getData();
            pointer = pointer.getNext();
            if (pointer!=null){
                returnString+=" ";
            }
        }
        return returnString;
    }

    private void add(T i) {
        Node newNode = new Node(i);
        if (mHead==null){
            mHead = newNode;
            return;
        }
        Node pointer = mHead;
        while (pointer.getNext()!=null){
            pointer = pointer.getNext();
        }
        pointer.setNext(newNode);
    }


    public static void main(String[] args){
        LinkedList<Integer> IntList = new LinkedList();
        IntList.add(15);
        IntList.add(24);
        IntList.add(48);
        IntList.add(12);
        System.out.println(IntList);


    }
    private class Node {
        private T mData;
        private Node mNext;

        public Node(){
            mData = null;
            mNext = null;
        }

        public Node(T pData){
            mData = pData;
            mNext = null;
        }


        public Node getNext() {
            return mNext;
        }

        public void setNext(Node newNode) {
            mNext = newNode;
        }

        @Override
        public String toString(){
            return mData.toString();
        }

        public T getData() {
            return mData;
        }
    }
}
