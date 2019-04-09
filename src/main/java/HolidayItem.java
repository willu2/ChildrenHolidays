
public class HolidayItem implements Comparable<HolidayItem>{

    private String name;

    private int duration;

    private boolean street;

    private boolean animator;

    private Integer price;
    public HolidayItem(String name, int duration, Integer price, boolean street, boolean animator) {

        this.name = name;
        this.duration = duration;
        this.price = price;
        this.street = street;
        this.animator = animator;
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

    public int getDuration() {
        return duration;
    }

    public boolean isStreet() {
        return street;
    }

    public boolean isAnimator() {
        return animator;
    }

    @Override
    public String toString() {
        return "Holiday [price=" + price + "]";
    }

    public int compareTo(HolidayItem o) {
        return this.getPrice().compareTo(o.getPrice());
    }


}


