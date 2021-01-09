
package test10;

import java.util.Random;
import java.util.Scanner;

public class User implements Login {
    
    Scanner input = new Scanner(System.in);
    Random r = new Random( System.currentTimeMillis() );
    int ran = ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
    
    @Override
    public void user_data() {
        
        System.out.println("Enter First Name: ");
        String f = input.next();
        f += input.nextLine();
        System.out.println("Enter Last Name: ");
        String l = input.next();
        l += input.nextLine();            
        System.out.println("Enter Addres: ");
        String a = input.next();
        a += input.nextLine();            
        System.out.println("Enter Account: ");
        String c = input.next();
        c += input.nextLine();
            
        System.out.println("Enter Payment: ");
            
        System.out.println("Card Nunber: ");
        int card_num = input.nextInt();
        System.out.println("Month: ");
        int n = input.nextInt();
        System.out.println("Year: ");            
        int y = input.nextInt();
        System.out.println("CVV: ");            
        int v = input.nextInt();
        
        System.out.println("Your order number "+"#"+ran);
        System.out.println("Your name is "+f+" "+l +" "+ "Your Addres "+ a + " And your Account "+c);
        System.out.println("Payment "+ "Card Number "+ card_num + " VALID THRU "+ n + "/" + y);
        System.out.println("Your order is confirmed.");
        System.out.println("Exiting ...");
        System.exit(0);
    }
    
}
