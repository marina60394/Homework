package Tasks;

/**
 * Created by Marina on 27.01.2019.
 */
public class Task02Variables {
    public static void main(String[] args) {
        int intVariable=1;
        double doubleVariable;
        String stringVariable;

        stringVariable=Integer.toString(intVariable);
        doubleVariable=Double.parseDouble(stringVariable);
        intVariable=(int)doubleVariable;
        System.out.println("String value: "+stringVariable);
        System.out.println("double value :"+doubleVariable);
        System.out.println("int value "+intVariable);
    }
}
