package holiday.chill.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuBuillder {

    public void mainManu(){
        System.out.println("Menu :> ");
        System.out.println(" 1 :> Show all funs >>");
        System.out.println(" 2 :> Show outside funs >> ");
        System.out.println(" 3 :> Show inside funs >> ");
        System.out.println(" 4 :> Show games with animator >> ");
        System.out.println(" 5 :> Show games without animator >> ");
        System.out.println(" 6 :> Find funs by price >> ");
        System.out.println(" 8 :> Exit ");

        System.out.println("Enter position :> ");
    }

    public void enterPriceMenu(){
        System.out.println("Enter your price: ");
    }

    public int menuTotalPriceEnter(){
        int visitorPrice = 0;

        try {
            while (visitorPrice <= 0 ){
                try {
                    BufferedReader inPrice = new BufferedReader(new InputStreamReader(System.in));
                    visitorPrice = Integer.parseInt(inPrice.readLine());
                }catch (NumberFormatException c){}
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return visitorPrice;
    }
}
