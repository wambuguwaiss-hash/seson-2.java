//ADM = J77-11352-2024
// NAME - Muigua Waiss Wambugu 
//Topic: Classes and Objects
//Question 1 (Concept: Constructors & Object Creation)


public class CoffeeOrder{
    String size;
    double price;
    
    public CoffeeOrder(String inputSize, double inputPrice){
        size = inputSize;
        price = inputPrice;
    }
    
    public static void main(String[] args) {
        
        CoffeeOrder order1 = new CoffeeOrder("Small", 2.50);
        
        CoffeeOrder order2 = new CoffeeOrder("Large",5.75 );
        
        System.out.println("Detais for order 1");
        System.out.println("Size: " + order1.size);
        System.out.println("Price: $" + order1.price);
        
        System.out.println("Detais for order 2");
        System.out.println("Size: " + order2.size);
        System.out.println("Price: $" + order2.price);

    }
}


//Question 2 (Concept: Methods, Encapsulation, and Object Interaction)

import java.util.Scanner;

public class Main {

    private String name;
    private double price;

    public Main(String inputName, double inputPrice) {
        name = inputName;
        price = inputPrice;
    }

    public void applyDiscount(double percentage) {
        double discountAmount = (price * percentage) / 100;
        price = price - discountAmount;
    }

    public double getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Main item = new Main("Gaming Laptop", 1000.00);

        System.out.println("Original Price: $" + item.getPrice());
        System.out.print("Enter discount percentage : ");

        double userDiscount = keyboard.nextDouble();

        item.applyDiscount(userDiscount);

        System.out.println("Success! The new price is: $" + item.getPrice());

        keyboard.close();
    }
}



//3. MainApp Class:

import java.util.Scanner;

class Student {
    String name;
    double marks;

    public Student(String inputName, double inputMarks) {
        name = inputName;
        marks = inputMarks;
    }

    public void displayDetails() {
        System.out.println("--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

class GradeCalculator {

    public String calculateGrade(double marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "D";
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = keyboard.nextLine();

        System.out.print("Enter Student Marks: ");
        double marks = keyboard.nextDouble();

        Student myStudent = new Student(name, marks);

        GradeCalculator teacher = new GradeCalculator();

        String grade = teacher.calculateGrade(myStudent.marks);

        myStudent.displayDetails();
        System.out.println("Grade: " + grade);

        keyboard.close();
    }
}
