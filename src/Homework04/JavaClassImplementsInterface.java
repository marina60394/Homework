package Homework04;

/**
 * Created by Marina on 03.02.2019.
 */
public class JavaClassImplementsInterface implements InterfaceWithMethods {
    private String nameOfWeek;
    private int numOfWeek;

    @Override
    public void printPhrase() {
        System.out.println("Message from JavaClassImplementsInterface");
    }

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
