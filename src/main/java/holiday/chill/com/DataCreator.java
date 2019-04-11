package holiday.chill.com;

import java.util.*;

public class DataCreator {

    private String[] games = {"Apple Pass", "Art Gallery", "Backs to the Board Game", "Badminton"," Banana Race",
    "Basketball Card Line-UP", "Bean Bag Toss", "Blind Toss", "Blindfold Guess", "Category Spin", "Category Tag",
    "WhisperCharades", "Dog & Cat Chase", "DiceDraw and Roll", "Give Me Game", "Hangman"};

    private List allHolidays;
    private HolidayItem holidayItem;

    public DataCreator() {
        allHolidays = new ArrayList<HolidayItem>();

        pullData();
    }

    //add all random data to base
    private void pullData(){
        for (int i = 0; i < games.length; i++){
            holidayItem = new HolidayItem(games[i], random(45,15), random(150, 50), randomBool(), randomBool());
            allHolidays.add(holidayItem);
        }
    }

    public void showAllData(){

        for (Iterator<HolidayItem> it = allHolidays.iterator(); it.hasNext(); ) {
            HolidayItem itemEntity = it.next();
            printItemList(itemEntity);
        }
    }
    public void showByStreet(){
        Collections.sort(allHolidays);
        for (Iterator<HolidayItem> it = allHolidays.iterator(); it.hasNext(); ) {
            HolidayItem itemEntity = it.next();
            if (itemEntity.isStreet()){
                printItemList(itemEntity);
            }
        }
    }

    //print all in the house
    public void showByInside(){
        Collections.sort(allHolidays);
        for (Iterator<HolidayItem> it = allHolidays.iterator(); it.hasNext(); ) {
            HolidayItem itemEntity = it.next();
            if (!itemEntity.isStreet()){
                printItemList(itemEntity);
            }
        }
    }

    public void showWithAnimator(){
        Collections.sort(allHolidays);
        for (Iterator<HolidayItem> it = allHolidays.iterator(); it.hasNext(); ) {
            HolidayItem itemEntity = it.next();
            if (itemEntity.isAnimator()){
                printItemList(itemEntity);
            }
        }
    }

    public void showWithoutAnimator(){
        Collections.sort(allHolidays);
        for (Iterator<HolidayItem> it = allHolidays.iterator(); it.hasNext(); ) {
            HolidayItem itemEntity = it.next();
            if (!itemEntity.isAnimator()){
                printItemList(itemEntity);
            }
        }
    }

    public void showByPrice(int price){
        Collections.sort(allHolidays);
        for (Iterator<HolidayItem> it = allHolidays.iterator(); it.hasNext(); ) {
            HolidayItem itemEntity = it.next();
            if (itemEntity.getPrice() < price){
                printItemList(itemEntity);
            }
        }
    }

    private void printItemList(HolidayItem itemEntity){
        System.out.print("Game name:>  " + itemEntity.getName());
        System.out.print("  |duration:> " + itemEntity.getDuration()+" min");
        System.out.print("  |location:> " + itemEntity.isStreetText(itemEntity.isStreet()));
        System.out.print("  |animator:> " + itemEntity.isAnimatorText(itemEntity.isAnimator()));
        System.out.print("  |price:> " + itemEntity.getPrice() + " $");
        System.out.println();
    }

    private int random(int ran, int min){
        Random random = new Random();
        int digit = random.nextInt(ran) + min;
        return digit;
    }

    private boolean randomBool(){
        Random random = new Random();
        int digit = random.nextInt(2);
        if (digit == 0){
            return false;
        }else {
            return true;
        }
    }
}
