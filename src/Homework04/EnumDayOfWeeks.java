package Homework04;

/**
 * Created by Marina on 03.02.2019.
 */
public enum EnumDayOfWeeks {

    MONDAY("Monday", 1),
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednasday", 3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5),
    SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 7);

    private String name;
    private int dayNumber;

    EnumDayOfWeeks (String name, int dayNumber){
        this.name=name;
        this.dayNumber=dayNumber;
    }

    public String getName(){
        return name;
    }

    public int getDayNumber(){
        return dayNumber;
    }
}
