import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ShowMenu {

    private MenuBuillder menu = new MenuBuillder();
    private DataCreator cleansFabric = new DataCreator();

    private boolean exit = false;

    public ShowMenu() {
    }

    public void show() {
        do {
            int price = 0;

            menu.mainManu();

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            switch (menu.menuTotalPriceEnter()) {
                case 1:
                    cleansFabric.showAllData();
                    break;
                case 2:
                    cleansFabric.showByStreet();
                    break;
                case 3:
                    cleansFabric.showByInside();
                    break;
                case 4:
                    cleansFabric.showWithAnimator();
                    break;
                case 5:
                    cleansFabric.showWithoutAnimator();
                    break;
                case 6:
                    menu.enterPriceMenu();
                    price = menu.menuTotalPriceEnter();
                    cleansFabric.showByPrice(price);
                    break;
                case 7:
                    break;
                case 8:
                    exit = true;
                    break;
                default:
                    System.out.println("Try again...");
            }

        } while (!exit);
    }
}
