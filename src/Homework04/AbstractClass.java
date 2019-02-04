package Homework04;

import org.omg.IOP.ENCODING_CDR_ENCAPS;

/**
 * Created by Marina on 03.02.2019.
 */
public abstract class AbstractClass {

    private int numOfMonth;
    private String nameOfMonth;

    public AbstractClass(int numOfMonth){
        this.numOfMonth = numOfMonth;
        this.printPhrase();
    }

    public abstract void printPhrase();

    public enum EnumMonth {
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

        EnumMonth (String month){
        this.month = month;
        }
    }

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
