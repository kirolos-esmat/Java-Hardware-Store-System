
package test10;
import java.util.ArrayList;

public abstract class Components {
    
    private final ArrayList<String> name;
    private final ArrayList<Double> price;
    
    Components(){
        name = new ArrayList<>();
        price = new ArrayList<>();
    }

    public ArrayList<Double> getPrice() {
        return price;
    }
    
    public ArrayList<String> getName() {
        return name;
    }

    public void setName(String n) {
        name.add(n);
    }

    public void setPrice(double p) {
        price.add(p);
    }
    
    public Double accessPrice(int i) {
        return price.get(i);
    }
    
    public String accessName(int i) {
        return name.get(i);
    }

    public abstract int heat();
}
