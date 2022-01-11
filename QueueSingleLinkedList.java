class QueueSingleLinkedList{
    private Node top;
    private Node tail;

    private class Node {
        public int item;
        public Node next;

        public Node(int newItem, Node newNext) {
            this.item = newItem;
            this.next = newNext;
        }
    }

    public QueueSingleLinkedList(){
        top = null;
        tail = null;
    }

    public void Enqueue(int newItem){
        if(top == null){
            top = tail = new Node(newItem,top);
        }else{
            Node newNode = new Node(newItem,null);
            tail.next= newNode;
            tail = newNode;
        }
    }

    public int Dequeue(){
        int answer = top.item;
        top = top.next;
        return answer;
    }

    public int Top(){
        return top.item;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public String toString(){
        String answer = "<";
        Node curr = top;
        while (curr != null){
            answer += curr.item + ", ";
            curr = curr.next;
        }
        return answer + '<';
    }

}
