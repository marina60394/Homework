package com.homework04;

/**
 * Created by Marina on 03.02.2019.
 */
public abstract class AbstractClass {

    //  Privare class variables
    private int numOfMonth;
    private String nameOfMonth;

    /**
     *   Constructor
     *   All classes that inherited that abstract class must create the same constructor
     *   @param numOfMonth
     */
    public AbstractClass(int numOfMonth){
            this.numOfMonth = numOfMonth;
            this.printPhrase();
        }

    /**
     * Abstract method that must be implemented in all child classes
     */
    public abstract void printPhrase();

    /**
     * Enum. It's just a list of months
     */
    public enum EnumMonth {

        // These are values
        JaANUARY("January"),
        FEBRUARY("February"),
        MARCH("March"),
        APRIL("April"),
        MAY("May"),
        JUNE("June"),
        JULY("July"),
        AUGUST("August"),
        SEPTEMPBER("September"),
        OCTOBER("October"),
        NOVEMBER("November"),
        DECEMBER("December");

        private String month;

     /**
     * Constructor
     * @param month
     */
    EnumMonth (String month){
            this.month = month;
            }
    }

    /**
     *  Method get month name from enum by number
     * @param numOfMonth
     * @return String name of month
     */
    public String getMonthNameByNum(int numOfMonth) {
        switch (numOfMonth) {
            case 1: nameOfMonth = EnumMonth.JaANUARY.month;
                break;
            case 2: nameOfMonth = EnumMonth.FEBRUARY.month;
                break;
            case 3: nameOfMonth = EnumMonth.MARCH.month;
                break;
            case 4: nameOfMonth = EnumMonth.APRIL.month;
                break;
            case 5: nameOfMonth = EnumMonth.MAY.month;
                break;
            case 6: nameOfMonth = EnumMonth.JUNE.month;
                break;
            case 7: nameOfMonth = EnumMonth.JULY.month;
                break;
            case 8: nameOfMonth = EnumMonth.AUGUST.month;
                break;
            case 9: nameOfMonth = EnumMonth.SEPTEMPBER.month;
                break;
            case 10: nameOfMonth = EnumMonth.OCTOBER.month;
                break;
            case 11: nameOfMonth = EnumMonth.NOVEMBER.month;
                break;
            case 12: nameOfMonth = EnumMonth.DECEMBER.month;
                break;
        }
        return nameOfMonth;
    }
}
