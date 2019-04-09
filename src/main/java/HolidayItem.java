import java.util.Random;

public class HolidayItem implements Comparable<HolidayItem>{

    public String name;
    public int duration;
    public boolean street;
    public Integer price;

    public HolidayItem(String name, int duration, Integer price, boolean street) {

        this.name = name;
        this.duration = duration;
        this.price = price;
        this.street = street;
    }

    public HolidayItem() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Holiday [price=" + price + "]";
    }

    public int compareTo(HolidayItem o) {
        return this.getPrice().compareTo(o.getPrice());
    }

    public int ranDig(int ran){
        Random random = new Random();
        int digit = random.nextInt(ran) + 12;
        return digit;
    }
}


