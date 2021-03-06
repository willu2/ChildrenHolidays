package holiday.chill.com;

public class HolidayItem implements Comparable<HolidayItem>, ItemHelpMethods{

    private String name;
    private int duration;
    private Integer price;
    private boolean street;
    private boolean animator;

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

    public Integer getPrice() {
        return price;
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

    @Override
    public String isStreetText(boolean is_street) {
        if(is_street){
            return "outside";
        }else{
            return "inside";
        }
    }

    @Override
    public String isAnimatorText(boolean is_animator) {
        if(is_animator){
            return "present";
        }else {
            return "absent";
        }
    }
}


