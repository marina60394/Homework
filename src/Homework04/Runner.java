package Homework04;

/**
 * Created by Marina on 03.02.2019.
 */
public class Runner{

    public static void main(String[] args) {
        JavaClassImplementsInterface javaClassImplementsInterface = new JavaClassImplementsInterface();
        JavaClassExtendsAbstractClass javaClassExtendsAbstractClass = new JavaClassExtendsAbstractClass(2);

        javaClassImplementsInterface.printPhrase();

        System.out.println("Day name of week by number 1: " + javaClassImplementsInterface.returnDayNameByNum(1));
        System.out.println("Day number by name Sunday: " + javaClassImplementsInterface.returnDayNumByName("Sunday"));
        System.out.println("Month name by number 2: " + javaClassExtendsAbstractClass.getMonthNameByNum(2));
    }
}
