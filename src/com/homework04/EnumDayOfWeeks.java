package com.homework04;

import java.lang.reflect.Constructor;

/**
 * Created by Marina on 03.02.2019.
 */
public enum EnumDayOfWeeks {

    //  These are values
    MONDAY("Monday", 1),
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednasday", 3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5),
    SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 7);

    //  Variables
    private String name;
    private int dayNumber;


    /**
     * Constructor
     * @param name
     * @param dayNumber
     */
    EnumDayOfWeeks (String name, int dayNumber){
        this.name=name;
        this.dayNumber=dayNumber;
    }

    /**
     * Get name of day
     * @return string with name
     */
    public String getName(){
        return name;
    }

    /**
     * Get day number
     * @return int with number
     */
    public int getDayNumber(){
        return dayNumber;
    }
}
