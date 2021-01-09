
package test10;
import java.util.ArrayList;

public class Processor extends Components {
    
    private final ArrayList<Integer> core;
    
    Processor(){
        core = new ArrayList<>();
        core.add(4);
        core.add(6);
        core.add(16);   
    }
    
    public ArrayList<Integer> getCore() {
        return core;
    }
    
    public void setCore(int c) {
        core.add(c);
    }
    
    public Integer accessCore(int i) {
        return core.get(i);
    }
        
    @Override
    public int heat() {
        return 45;
    }
    
}
