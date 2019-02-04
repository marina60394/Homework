package Homework04;

/**
 * Created by Marina on 03.02.2019.
 */
    public class JavaClassExtendsAbstractClass extends AbstractClass {

        private int numOfMonth;

    public JavaClassExtendsAbstractClass(int numOfMonth) {
        super(numOfMonth);
    }

    @Override
    public void printPhrase() {
        System.out.println("Message from JavaClassExtendsAbstactClass");
    }
}
