import java.util.ArrayList;
import java.util.List;

public class StackImplementation {
    private int stackSize;
    private String stackTop;
    List<String> stackList = new ArrayList<>();
    public StackImplementation(String stackTop){
        this.stackTop = stackTop;
        stackList.add(stackTop);
        stackSize++; // increment stack size
    }
    public StackImplementation(){
        this.stackTop = null;
        stackSize = 0;
    }
    public boolean isEmpty(){
        return stackSize == 0;
    }
    public String top() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty!");
        }
        return stackTop;
    }
    public String pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is empty!");
        }
        String top = this.stackTop;
        stackList.remove(0);
        stackSize--;
        if(stackSize > 0){
            stackTop = stackList.get(0);
        }else{
            stackTop = null;
        }
        return top;
    }
    public void push(String element){
        stackList.add(0, element);
        stackTop = element;
        stackSize++;
    }
}