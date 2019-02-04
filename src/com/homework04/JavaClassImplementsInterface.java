package com.homework04;

/**
 * Created by Marina on 03.02.2019.
 */
public class JavaClassImplementsInterface implements InterfaceWithMethods {

    //  Class variables
    private String nameOfWeek;
    private int numOfWeek;

    /**
     *  Method from interface that we must override with print message
     */
    @Override
    public void printPhrase() {
        System.out.println("Message from JavaClassImplementsInterface");
    }

    /**
     * Method get day name from enum by number
     * @param dayOfWeek
     * @return String name of week
     */
    public String returnDayNameByNum(int dayOfWeek) {
        switch (dayOfWeek) {
            case 1: nameOfWeek = EnumDayOfWeeks.MONDAY.getName();
                 break;
            case 2: nameOfWeek = EnumDayOfWeeks.THURSDAY.getName();
                break;
            case 3: nameOfWeek = EnumDayOfWeeks.WEDNESDAY.getName();
                break;
            case 4: nameOfWeek = EnumDayOfWeeks.THURSDAY.getName();
                break;
            case 5: nameOfWeek = EnumDayOfWeeks.FRIDAY.getName();
                break;
            case 6: nameOfWeek = EnumDayOfWeeks.SATURDAY.getName();
                break;
            case 7: nameOfWeek = EnumDayOfWeeks.SUNDAY.getName();
            break;
        }
        return nameOfWeek;
    }

    /**
     * Method get day number from enum by name
     * @param nameOfWeek
     * @return int number of week
     */
    @Override
    public int returnDayNumByName(String nameOfWeek) {
        switch (nameOfWeek) {
            case "Monday": numOfWeek = EnumDayOfWeeks.MONDAY.getDayNumber();
                break;
            case "Tuesday": numOfWeek = EnumDayOfWeeks.TUESDAY.getDayNumber();
                break;
            case "Wednesday": numOfWeek = EnumDayOfWeeks.WEDNESDAY.getDayNumber();
                break;
            case "Thursday": numOfWeek = EnumDayOfWeeks.THURSDAY.getDayNumber();
                break;
            case "Friday": numOfWeek = EnumDayOfWeeks.FRIDAY.getDayNumber();
                break;
            case "Saturday": numOfWeek = EnumDayOfWeeks.SATURDAY.getDayNumber();
                break;
            case "Sunday": numOfWeek = EnumDayOfWeeks.SUNDAY.getDayNumber();
                break;
        }
        return numOfWeek;
    }
}
