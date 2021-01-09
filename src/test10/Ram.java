
package test10;
import java.util.ArrayList;

public class Ram extends Components {
    
    private final ArrayList<Integer> frequency;
    private final ArrayList<Integer> capacity;
    
    Ram(){
        frequency = new ArrayList<>();
        frequency.add(3000);
        frequency.add(3200);
        frequency.add(4133);   
        capacity = new ArrayList<>();
        capacity.add(8);
        capacity.add(16);
        capacity.add(32);   
    }
    
    public ArrayList<Integer> getCapacity() {
        return capacity;
    }
    
    public ArrayList<Integer> getFrequency() {
        return frequency;
    }
    
    public void setCapacity(int c) {
        capacity.add(c);
    } 

    public void setFrequency(int f) {
        frequency.add(f);
    } 
    
    public Integer accessCapacity(int i) {
        return capacity.get(i);
    }
    
    public Integer accessFrequency(int i) {
        return frequency.get(i);
    }        
        
    @Override
    public int heat() {
        return 40;
    }
    
}
