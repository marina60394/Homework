package com.homework04;

/**
 * Created by Marina on 03.02.2019.
 */
    public class JavaClassExtendsAbstractClass extends AbstractClass {

    /**
     * Constructor that matching super constructor in class ancestor
     * @param numOfMonth
     */
    public JavaClassExtendsAbstractClass(int numOfMonth) {
        super(numOfMonth);
    }

    /**
     * Method from abstract class that we must override
     */
    @Override
    public void printPhrase() {
        System.out.println("Message from JavaClassExtendsAbstactClass");
    }
}
