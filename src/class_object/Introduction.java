package class_object;

class Employee {
    String name;
    int id;
    int salary;

    Employee(String Name, int Id, int Salary) {
        name = Name;
        id = Id;
        salary = Salary;
    }

//    void addEmployee(String Name, int Id, int Salary) {
//        name = Name;
//        id = Id;
//        salary = Salary;
//    }

    void getEmployeeData() {
        System.out.println("Name : " + name);
        System.out.println("id : " + id);
        System.out.println("Salary : " + salary);
    }
}

public class Introduction {
    public static void main(String[] args) {
        Employee A = new Employee("Rwitesh", 111, 10000);//parameterised constructor
//        Employee A=new Employee();//Default or no argument constructor


        A.getEmployeeData();


//        A.addEmployee("Rwitesh", 140, 10000);
//
//        Employee B = new Employee();
//        B.addEmployee("Pramit", 120, 10000);

        // Function
        // Constructor


    }
}
