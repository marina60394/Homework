package com.homework04;

/**
 * Created by Marina on 03.02.2019.
 */
public class Runner{

    public static void main(String[] args) {

        //  Create object of class javaclassimplementinterface
        JavaClassImplementsInterface javaClassImplementsInterface = new JavaClassImplementsInterface();

        //  Create object of class javaclassextendsabstract class
        JavaClassExtendsAbstractClass javaClassExtendsAbstractClass = new JavaClassExtendsAbstractClass(2);

        //  Call method
        javaClassImplementsInterface.printPhrase();

        //  Get day name of week by number
        System.out.println("Day name of week by number 1: " + javaClassImplementsInterface.returnDayNameByNum(1));

        //  Get day number by name
        System.out.println("Day number by name Sunday: " + javaClassImplementsInterface.returnDayNumByName("Sunday"));

        //  Get month name by number
        System.out.println("Month name by number 2: " + javaClassExtendsAbstractClass.getMonthNameByNum(2));
    }
}
