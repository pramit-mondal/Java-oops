package class_object;

import data.Student;

class Calculator {
    int a, b, c;
    int sum;

    Calculator() {
        sum = 0;
    }

    Calculator(int x, int y) {
        sum = x + y;
    }

    Calculator(int x, int y, int z) {
        sum = x + y + z;
    }

    int result() {
        return sum;
    }
}

public class Demo {
    public static void main(String[] args) {
        // Consturctor Overloading
        Calculator b = new Calculator();
        Calculator c = new Calculator(1,2);
        Calculator d = new Calculator(1,2,3);

//        System.out.println(b.result());
//        System.out.println(c.result());
//        System.out.println(d.result());

        Student.getName();
    }
}
