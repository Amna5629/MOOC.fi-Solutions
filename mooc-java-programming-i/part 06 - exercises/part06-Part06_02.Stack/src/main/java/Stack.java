import java.util.ArrayList;

public class Stack {
    ArrayList<String> stack;
    
    public Stack(){
        this.stack=new ArrayList<>();

    }
    public boolean isEmpty(){
        return this.stack.isEmpty();
    }

    public void add(String value){
        this.stack.add(value);
    }
    public ArrayList<String> values(){
        return new ArrayList<>(this.stack);
    }
    public String take(){
        return this.stack.remove(this.stack.size()-1);
        
    }
}
