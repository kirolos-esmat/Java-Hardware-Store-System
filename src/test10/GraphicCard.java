
package test10;
import java.util.ArrayList;

public class GraphicCard extends Components {
    
    private final ArrayList<Integer> vRam;
    
    GraphicCard(){
        vRam = new ArrayList<>();
        vRam.add(4);
        vRam.add(8);
        vRam.add(24);
    }
        
    public ArrayList<Integer> getVRAM() {
        return vRam;
    }
    
    public void setVRam(int v) {
        vRam.add(v);
    }
    
    public Integer accessVRam(int i) {
        return vRam.get(i);
    }
    
    @Override
    public int heat() {
        return 50;
    }
}
