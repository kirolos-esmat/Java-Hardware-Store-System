
package test10;
import java.util.Scanner;
import java.util.ArrayList;

public class Builds {
    
    private final ArrayList<String> BuildName;
    private final Scanner input;
    private final GraphicCard g;
    private final Hard h;
    private final Motherboard m;
    private final Ram r;
    private final Processor p;
    private final User u;
    
    private int choose=1;
    
    //make opjects
    public Builds() {
        input = new Scanner(System.in);
        BuildName = new ArrayList<>();
        g = new GraphicCard();
        h = new Hard();
        m = new Motherboard();
        r = new Ram();
        p = new Processor();
        u = new User();
        data();
        displayMenu();
    }
    
    public void setBuildName(String n) {
        BuildName.add(n);
    }
        
    public String accessBuildName(int i) {
        return BuildName.get(i);
    }
    
    public int getChoose(){
        return choose;
    }
    
    //menu to display all method
    private void displayMenu() {
        
        while(true) {
            System.out.println("=======================================================");
            System.out.println("|                        MENU                         |");
            System.out.println("=======================================================");
            System.out.println("| Options:                                            |");
            System.out.println("|        1. Display Components          (press 1)     |");
            System.out.println("|        2. Display Available Builds    (press 2)     |");
            System.out.println("|        3. Add Custom Build            (press 3)     |");
            System.out.println("|        4. Display Temperature         (press 4)     |");            
            System.out.println("|        5. Cart                        (press 5)     |");
            System.out.println("|        6. Cart Review                 (press 6)     |");
            System.out.println("|        7. Order                       (press 7)     |");            
            System.out.println("|        8. Exit                        (press 8)     |");
            System.out.println("=======================================================");
            
            String line = input.nextLine();
            int command = 0;
            
            try {
                command = Integer.parseInt(line);
            } 
            catch (NumberFormatException e) {
        }
            
            switch(command) {
                case 1 :
                    displayComponents();
                    break;
                case 2 :
                    displayBuilds();
                    break;
                case 3 :
                    customBuild();
                    break;
                case 4 :
                    display_temperature();
                    break;
                case 5 :
                    cart();
                    break;
                case 6 :
                    cartReview();
                    break;
                case 7:
                    order();
                    break;
                case 8:
                    System.out.println("Exiting ...");
                    clear();
                    System.exit(0);
                    break;
            default:
            System.out.println("Error Choose from (1-6) ...");
        }       
    }
   }
    
    //method to set the basic data
    private void data(){
        
        BuildName.add("Low Range:");
        BuildName.add("Mid Range:");
        BuildName.add("High Range:");

        g.setName("RX 5500");
        g.setName("RTX 3060 TI");
        g.setName("RTX 3090");
        g.setPrice(3800);
        g.setPrice(11500);
        g.setPrice(34500);
        
        m.setName("MSI A320 M-ABRC MAX");
        m.setName("MSI B450 M PRO-VDX MAX");  
        m.setName("ASROCK B550 TAICHI");
        m.setPrice(1000);
        m.setPrice(1550);
        m.setPrice(5525);        
        
        h.setName("WD BLUE");
        h.setName("ADATA");
        h.setName("SEAGATE");
        h.setPrice(700);
        h.setPrice(1500);
        h.setPrice(1800);

        r.setName("XPG HUNTER");
        r.setName("XPG SPECTRIX D50");
        r.setName("XPG SPECTRIX D50");
        r.setPrice(650);
        r.setPrice(1600);
        r.setPrice(2300);
       
        p.setName("RYZEN 5 3400G");
        p.setName("RYZEN 5 3600X");
        p.setName("RYZEN 9 5950X");
        p.setPrice(2500);
        p.setPrice(4200);
        p.setPrice(13550);
    }
    
    //method to get all components and display it
    private void displayComponents(){
        
        System.out.println("Processors: "+ p.getName() +" Cores: "+ p.getCore() +" Prices: "+ p.getPrice());
        System.out.println("GraphicCards: "+ g.getName() +" VRams: "+ g.getVRAM() +" Prices: "+ g.getPrice());
        System.out.println("MotherBoards: "+ m.getName() +" Prices: "+ m.getPrice());
        System.out.println("Rams: "+ r.getName() +" Capacities: "+ r.getCapacity() +" Frequencies: "+ r.getFrequency() +" Prices: "+ r.getPrice());
        System.out.println("Hards: "+ h.getName() +" Capacities: "+ h.getCapacity() +" Prices: "+ h.getPrice());
        
    }
    
    //method to assemble build from components
    private void displayBuilds(){
            
        for (int i = 0; i < BuildName.size(); i++){
            System.out.println(""+ BuildName.get(i));
            System.out.println("Processor: "+ p.accessName(i) +" "+ p.accessCore(i) +" Cores");
            System.out.println("GraphicCard: "+ g.accessName(i) +" "+ g.accessVRam(i) + " GB");
            System.out.println("MotherBoard: "+ m.accessName(i));
            System.out.println("Ram: "+ r.accessName(i) +" "+ r.accessCapacity(i) +" GB "+ r.accessFrequency(i) +" HZ");
            System.out.println("Hard: "+ h.accessName(i) +" "+ h.accessCapacity(i) +" GB");
            double sum = g.accessPrice(i)+h.accessPrice(i)+m.accessPrice(i)+p.accessPrice(i)+r.accessPrice(i);
            System.out.println("The Total Price = " + sum + " EGP\n");
        }
        
    }
    
    //method to add custom build
    private void customBuild(){
        System.out.println("Enter The Build Name: ");
        String b_name = input.next();
        b_name += input.nextLine();
        BuildName.add(b_name);
        
        System.out.println("Enter Processor: ");
        String p_name = input.next();
        p_name += input.nextLine();
        System.out.println("Enter his cores: ");
        int core = input.nextInt();
        System.out.println("Price: ");
        double p_price = input.nextDouble();
        p.setPrice(p_price);
        p.setName(p_name);
        p.setCore(core);
        
        System.out.println("Enter GraphicCard: ");
        String g_name = input.next();
        g_name += input.nextLine();
        System.out.println("Enter his vRam: ");
        int vram = input.nextInt();
        System.out.println("Price: ");
        double g_price = input.nextDouble();
        g.setPrice(g_price);
        g.setName(g_name);
        g.setVRam(vram);
        
        System.out.println("Enter Motherboard: ");
        String m_name = input.next();
        m_name += input.nextLine();
        System.out.println("Price: ");
        double m_price = input.nextDouble();
        m.setPrice(m_price);
        m.setName(m_name);
        
        System.out.println("Enter Ram: ");
        String r_name = input.next();
        r_name += input.nextLine();
        System.out.println("Enter his capacity (GB): ");
        int cap = input.nextInt();
        System.out.println("Enter his frequency: ");
        int freq = input.nextInt();
        System.out.println("Price: ");
        double r_price = input.nextDouble();
        r.setPrice(r_price);
        r.setName(r_name); 
        r.setCapacity(cap);
        r.setFrequency(freq);
        
        System.out.println("Enter Hard: ");
        String h_name = input.next();
        h_name += input.nextLine();
        System.out.println("Enter his capacity (GB): ");
        int hcap = input.nextInt();
        System.out.println("Price: ");
        double h_price = input.nextDouble();
        h.setPrice(h_price);
        h.setName(h_name);
        h.setCapacity(hcap);
        
        displayBuilds();
    }
    
    //method to save your choosen build
    private void cart(){
        displayBuilds();
        System.out.println("Choose Your Build (enter the number): ");
        for (int i = 0; i < BuildName.size(); i++){
            System.out.println(""+ BuildName.get(i) +" "+ i);
        }
        choose = input.nextInt();
        System.out.println("The build added to your cart.");
    }
    
    //method to display your choosen build
    private void cartReview(){
        
        int i = choose;
        System.out.println(""+ BuildName.get(i));
        System.out.println("Processor: "+ p.accessName(i) +" "+ p.accessCore(i) +" Cores");
        System.out.println("GraphicCard: "+ g.accessName(i) +" "+ g.accessVRam(i) + " GB");
        System.out.println("MotherBoard: "+ m.accessName(i));
        System.out.println("Ram: "+ r.accessName(i) +" "+ r.accessCapacity(i) +" GB "+ r.accessFrequency(i) +" HZ");
        System.out.println("Hard: "+ h.accessName(i) +" "+ h.accessCapacity(i) +" GB");
        double sum = g.accessPrice(i)+h.accessPrice(i)+m.accessPrice(i)+p.accessPrice(i)+r.accessPrice(i);
        System.out.println("The Total Price = " + sum + " EGP\n");
        
    }
    
    //method to make the order
    private void order(){
        char state;
        cartReview();
        
        System.out.println("To confirm press (y) else press (any character):");
        state = input.next().charAt(0);
        
        //user data
        if (state == 'y'){
            u.user_data();
            clear();
        }
        else {
            System.out.println("Choose Again ...");
        }
    }
    
    //method to display the safe temperature
    private void display_temperature(){
        
        System.out.println("Processor Safe Temperature: "+ p.heat() +" Degrees Celsius");
        System.out.println("GraphicCard Safe Temperature: "+ g.heat() +" Degrees Celsius");
        System.out.println("Motherboard Safe Temperature: "+ m.heat() +" Degrees Celsius");
        System.out.println("Ram Safe Temperature: "+ r.heat() +" Degrees Celsius");
        System.out.println("Hard Safe Temperature: "+ h.heat() +" Degrees Celsius");
        
    }
    
    //to clear garbage value
    private void clear(){
        
        p.getCore().clear();
        p.getName().clear();
        p.getPrice().clear();
            
        g.getVRAM().clear();
        g.getName().clear();
        g.getPrice().clear();
            
        m.getName().clear();
        m.getPrice().clear();
            
        r.getCapacity().clear();
        r.getFrequency().clear();
        r.getName().clear();
        r.getPrice().clear();
            
        h.getCapacity().clear();
        h.getName().clear();
        h.getPrice().clear();
    }
    
}
