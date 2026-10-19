
    
class Vehicle {
    String brand = "Generic";
    void start() {
        System.out.println(brand + " Vehicle is starting...");
    }
}
class Car extends Vehicle {
    String model = "Sedan";
    void display() {
        System.out.println("Car: " + brand + " " + model);
        start();
    }
}

class Person {
    String name = "Person";
    void showPerson() {
        System.out.println("Name: " + name);
    }
}
class Employee extends Person {
    int empId = 101;
    void showEmployee() {
        System.out.println("Employee ID: " + empId + ", Name: " + name);
    }
}
class Manager extends Employee {
    String department = "CSE";
    void showManager() {
        System.out.println("Manager Dept: " + department + ", ID: " + empId + ", Name: " + name);
    }
}


class Shape {
    void area() {
        System.out.println("Calculating area of Shape");
    }
}
class Circle extends Shape {
    double radius = 5;
    @Override
    void area() {
        System.out.println("Circle Area: " + (3.14 * radius * radius));
    }
}
class Rectangle extends Shape {
    int length = 10, breadth = 5;
    @Override
    void area() {
        System.out.println("Rectangle Area: " + (length * breadth));
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("--- 1. SINGLE INHERITANCE (Vehicle -> Car) ---");
        Car c = new Car();
        c.display();

        System.out.println("\n--- 2. MULTILEVEL INHERITANCE (Person -> Employee -> Manager) ---");
        Manager m = new Manager();
        m.name = "Abhishek Kumar Gupta";
        m.showPerson();
        m.showEmployee();
        m.showManager();

        System.out.println("\n--- 3. HIERARCHICAL INHERITANCE (Shape -> Circle, Rectangle) ---");
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        s1.area();
        s2.area();
    }
}

Rectangle Area: 50
Bol, Practical 3 ka bhi bana du same format me?
