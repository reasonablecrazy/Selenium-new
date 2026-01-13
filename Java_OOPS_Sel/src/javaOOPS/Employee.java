package javaOOPS;

class Employee {

    String name;
    int id;

    Employee() {
        name = "NA";
        id = 0;
    }

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void display() {
        System.out.println(name + " - " + id);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Alex", 101);

        e1.display();
        e2.display();
    }
}