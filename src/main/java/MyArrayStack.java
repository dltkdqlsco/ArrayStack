public class MyArrayStack {

    MyArray arrayStack;
    int top;

    public MyArrayStack(){
        top = 0;
        arrayStack = new MyArray();
    }

    public MyArrayStack(int size){
        top = 0;
        arrayStack = new MyArray(size);
    }

    public void push(int data){
        if(isfull()){
            System.out.println("stack is full");
            return;
        }

        arrayStack.addElement(data);
        top++;
    }

    public int pop(){

        if(isEmpty()){
            System.out.println("stack is empty");
            return MyArray.ERROR_NUM;
        }

        return arrayStack.removeElement(--top);
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return MyArray.ERROR_NUM;
        }

        return arrayStack.getElement(top - 1);
    }

    public int getSize(){
        return top;
    }

    public void printAll(){
        arrayStack.printAll();
    }

    public boolean isfull(){
        if(top == arrayStack.ARRAY_SIZE){
            return true;
        }
        else return false;
    }

    public boolean isEmpty(){
        if(top == 0) return true;
        else return false;
    }
}
