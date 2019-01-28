package Tasks;

/**
 * Created by Marina on 28.01.2019.
 */
public class Task03TypeConversion {
    public static void main(String[] args) {
        byte byteVariable = 1;
        short shortVariable = 2;
        char charVariable = '7';
        int intVariable = 3;
        long longVariable = 4l;
        float floatVariable = 5f;
        double doubleVariable = 6.0;
        boolean booleanVariable = true;

//        byte conversion
        shortVariable = byteVariable;
        charVariable = (char)byteVariable;
        intVariable = byteVariable;
        longVariable = byteVariable;
        floatVariable = byteVariable;
        doubleVariable = byteVariable;

//        short conversion
        byteVariable = (byte)shortVariable;
        charVariable = (char)shortVariable;
        intVariable = shortVariable;
        longVariable = shortVariable;
        floatVariable = shortVariable;
        doubleVariable = shortVariable;

//        char conversion
        byteVariable = (byte)charVariable;
        shortVariable = (short) charVariable;
        intVariable = charVariable;
        longVariable = charVariable;
        floatVariable = charVariable;
        doubleVariable = charVariable;

//        int conversion
        byteVariable = (byte)intVariable;
        shortVariable = (short)intVariable;
        charVariable = (char)intVariable;
        longVariable = intVariable;
        floatVariable = intVariable;
        doubleVariable = intVariable;

//        long conversion
        byteVariable = (byte)longVariable;
        shortVariable = (short)longVariable;
        charVariable = (char)longVariable;
        intVariable = (int)longVariable;
        floatVariable = longVariable;
        doubleVariable = longVariable;

//        float conversion
        byteVariable = (byte) floatVariable;
        shortVariable = (short) floatVariable;
        charVariable = (char) floatVariable;
        intVariable = (int) floatVariable;
        longVariable = (long) floatVariable;
        doubleVariable = longVariable;

//        double conversion
        byteVariable = (byte) doubleVariable;
        shortVariable = (short) doubleVariable;
        charVariable = (char) doubleVariable;
        intVariable = (int) doubleVariable;
        longVariable = (long) doubleVariable;
        floatVariable = (float) doubleVariable;

    }
}
