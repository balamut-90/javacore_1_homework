package ru.eliseev.first;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = Calculator.instance.get();

        int a = calculator.plus.apply(1, 2);
        int b = calculator.minus.apply(1,1);


        // Деление на ноль, поэтому вылетает java.lang.ArithmeticException.
        // Можно поймать ошибку и обработать её.
        // Либо обработать это условие в сосмо калькуляторе и выдавать определенное значение, как пример 0

        try {
            int c = calculator.devide.apply(a,b);
            calculator.println.accept(c);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Делить на ноль в этой программе запрещено");
        }

    }
}
