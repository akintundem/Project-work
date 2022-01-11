class QueueArr{
    int count =0;
    int[] queue;
    public QueueArr(int size){
        queue = new int[size];
    }

    public void enqueue(int newItem){
        queue[count++] = newItem;
    }

    public int dequeue(){
        int answer = queue[0];
        for(int i  =0 ; i < queue.length-1; i++){
            queue[i] = queue[i+1];
        }
        count--;
        return answer;
    }

    public int peek(){
        return queue[0];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public String toString(){
        String answer = "<";
        for(int i  =0; i< queue.length; i++){
            answer += queue[i] +" ,";
        }
        return answer + "<";
    }

}
