class stackArray{
    int top = -1;
    int[] stack;
    public stackArray(int size){
        stack = new int[size];
    }

    public void push(int newItem){
        stack[++top] = newItem;
    }

    public int pop(){
        int answer = stack[top];
        stack[top] = 0;
        top--;
        return answer;
    }

    public int Top(){
        return stack[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public String toString(){
        String answer = "[";
        for (int i = 0; i < stack.length; i++){
            answer += stack[i] + ", ";
        }
        return answer + ">";
    }
}
