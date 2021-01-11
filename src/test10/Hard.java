
package test10;
import java.util.ArrayList;

public class Hard extends Components {
    
    private final ArrayList<Integer> capacity;
    
    Hard(){
        capacity = new ArrayList<>();
        capacity.add(1024);
        capacity.add(2048);
        capacity.add(4072); 
        //super.getPrice();
    }
    
    public ArrayList<Integer> getCapacity() {
        return capacity;
    }
    
    public void setCapacity(int c) {
        capacity.add(c);
    }
    
    public Integer accessCapacity(int i) {
        return capacity.get(i);
    }

    @Override
    public int heat() {
        return 60;
    }
}
