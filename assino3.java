//ADM = J77-11352-2024
// NAME - Muigua Waiss Wambugu 
//Topic: Classes and Objects


//Question 1 (Concept: Constructors & Object Creation)

class CoffeOrder {
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



//3.  :You are tasked with designing a Java program that consists of three classes:

import java.util.Scanner;

class Student {
    String name;
    double marks;

    public Student(String inputName, double inputMarks) {
        name = inputName;
        marks = inputMarks;
    }

    public void displayDetails() {
        System.out.println("Student Details ");
        System.out.println("Name :  " + name);
        System.out.println("Marks : " + marks);
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
        System.out.println("Grade : " + grade);

        keyboard.close();
    }
}

/*
Topic: Inheritance in Java
QUESTION 1
A car rental company wants to keep track of different types of vehicles.
Create a parent class Vehicle with attributes brand and year.
Then create a child class Car that inherits from Vehicle and adds an attribute seats.
Write a Java program that:
1. Creates a Car object,
2. Assigns values to all attributes,
3. Prints all the details.*/

class Vehicle {

    String brand;
    int year;
    Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }
}

class Car extends Vehicle {

    int seats;

    Car(String brand, int year, int seats) {
        super(brand, year); 
        this.seats = seats;
    }

    void displayDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Year : " + year);
        System.out.println("Seats : " + seats);
    }
}

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car("Toyota", 2007, 14);

        myCar.displayDetails();
    }
}
/*QUESTION 2
A bank needs a program to manage different types of accounts.
Create a superclass BankAccount with an attribute balance and a method deposit().
Then create a subclass SavingsAccount that inherits from BankAccount and adds a
method addInterest() that increases the balance by 5%.
Write a Java program that:
1. Creates a SavingsAccount object,
2. Deposits an amount entered by the user,
3. Applies interest,
4. Displays the final balance.*/
import java.util.Scanner;

class BankAccount {

    double balance;
    void deposit(double amount) {
        balance = balance + amount;
    }
}

class SavingsAccount extends BankAccount {
    void addInterest() {
        balance = balance + (balance * 0.05);
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        SavingsAccount account = new SavingsAccount();

        System.out.print("Enter amount to deposit: ");
        double amount = input.nextDouble();

        account.deposit(amount);

        account.addInterest();

        System.out.println("Final balance after interest: " + account.balance);

        input.close();
    }
}

/*QUESTION 3
A university system manages employees using inheritance.
Create a superclass Employee with attributes name and salary, and a method
displayInfo().
Create a subclass Lecturer that adds an attribute department and overrides displayInfo()
to include department information.

Write a Java program that:
1. Accepts input from the user for name, salary, and department,
2. Creates a Lecturer object,
3. Displays all information using the overridden method.*/
import java.util.Scanner;

class Employee{
    Employee(){
        System.out.println("I am an employee");
    }
    Employee(String name, double salary){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
class Lecturer extends Employee {
    Lecturer(){
        super("Lecturer", 0);
        System.out.println("I am a lecturer");
    }
    Lecturer(String name, double salary, String department){
        super(name, salary);
        System.out.println("Department: " + department);
    }
}
public class Main {
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = input.nextLine();
        
        System.out.print("Enter salary :");
        double salary = input.nextDouble();
        input.nextLine();
        
        System.out.print("Enter department: ");
        String department = input.nextLine();
        
        Lecturer lecturer1 = new Lecturer(name, salary, department);
        
        input.close();
        
    }
 }
 
 /*Topic: Arrays
Question 1 — 1D Arrays
1.
(a) Declare and initialize a 1D array of integers with the following values:
5, 10, 15, 20, 25
(b) Using a for loop, print all the elements.
(c) Calculate and display the sum of all elements in the array.*/
class Main{
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        int sum = 0;
        
        System.out.println("Arrys elements: ");
        for(int i = 0 ; i < numbers.length; i++){
            System.out.println(numbers[i]);
            sum += numbers[i];
        }
        System.out.println("Sum = " + sum);
    }
}

/*
2.
(1D Array – Shopping Cart)
A supermarket app stores the prices of 6 items in a 1D array:
{120, 80, 150, 60, 200, 90}
Write a Java program to:
1. Print all the item prices
2. Calculate and display the total amount the customer must pay*/
class Main{
    public static void main(String[] args){
        
        int [] prices = { 120, 80, 150, 60, 200, 90};
        
        int total = 0;
        
        System.out.println("Item price: ");
        for(int i = 0; i < prices.length; i++){
            System.out.println(prices[i]);
            total += prices[i];
            
        }
        
        System.out.println("Total amount = " + total);
    }
}

/*Question 2 — 2D Arrays
1.
Write a Java program that:

(a) Declares and initializes a 2D array containing student marks:
{
{80, 70, 90},
{60, 85, 75},
{88, 92, 79}
}
(b) Uses nested loops to print all the marks in matrix form.
(c) Calculates and prints the average mark of the first row.*/

class MultidimensionalArray {
    public static void main (String[] args) {
    int [] [] marks = {
        {80, 70, 90 },
        {60, 85, 75 },
        {88, 92, 79 }
    };
    int sum = 0;
    
    for(int i = 0; i < marks.length; ++i){
        for (int j = 0; j< marks[i].length; ++j){
            System.out.print(marks[i][j] + " ");
        }
        System.out.println();
    }
    for(int j = 0; j < marks[0].length; ++j){
        sum += marks[0][j];
    }
    double average = (double) sum / marks[0].length;
    System.out.println("Average of first row = " + average);
    }  
}

/*(2D Array – Student Marks Table)
A teacher records marks for 3 students across 3 subjects using a 2D array:
{
{75, 80, 90}, // Student 1
{65, 70, 85}, // Student 2
{88, 92, 81} // Student 3
}
Write a Java program to:
1. Print the marks in table (matrix) form
2. Calculate and print the average marks of Student 3*/

class multidimensionalArray {
    public static void main(String[] args) {
        int [][] marks = {
            {75, 80, 90},
            {65, 70, 85},
            {88, 92, 81}
        } ;
        int sum = 0;
        for(int[] student : marks){
            for(int mark : student){
                System.out.print(mark + " ");
            }
            System.out.println();
        }
        for(int mark : marks[2]){
            sum += mark;
        }
        double average = (double) sum / marks[2].length;
        System.out.println("Average marks of Student 3 = " + average);
    }
}

/*3. Question 3 — 3D Arrays
1.

A shop stores sales data for 2 branches, 2 months, and 3 products using a 3D array.
(a) Declare and initialize the following 3D array:

{
{ {10, 20, 30}, {15, 25, 35} },
{ {5, 10, 15}, {8, 16, 24} }
}
(b) Write a program that prints all elements using 3 nested loops.
(c) Calculate and display the total sales for branch 1 (the first outer array).*/

class ThreeArray {
    public static void main (String[] args) {
        int [][][] sales = {
            {{10, 20, 30  }, {15, 25, 35 }},
            {{5, 10, 15 }, {8, 16, 24 }}
        };
        int totalBranch1 = 0;
        
        for(int [][] branch : sales){
            for(int [] month : branch) {
                for(int item : month) {
                    System.out.println(item);
                }
            }
    }
    
    for (int[] month : sales[0]){
        for(int item : month){
            totalBranch1 += item;
        }
}
System.out.println("Total sales for Branch 1 = " + totalBranch1);
}
}

/*2.

(3D Array – Warehouse Stock Tracking)
A company stores inventory for 2 warehouses, each with 2 sections, each section storing
3 products. Data is stored in a 3D array:
{
{ {50, 30, 20}, {40, 25, 15} }, // Warehouse 1
{ {60, 35, 25}, {55, 28, 18} } // Warehouse 2
}
Write a Java program to:
1. Print all stock values using 3 nested loops
2. Calculate and display the total stock in Warehouse 2*/

class ThreeArray {
    public static void main (String[] args) {
        int [][][] stock = {
            {{50, 30, 30}, {40, 25 , 15}},
            {{60, 35, 25}, {55, 28, 18}}
        };
        int totalWarehouse2 = 0;
        
        for(int[][] warehouse : stock){
            for(int[] section : warehouse){
                for(int item : section){
                    System.out.println(item);
                }
            }
        }
        for (int[] section: stock[1]){
            for(int item : section){
                totalWarehouse2 += item;
            }
        }
        System.out.println("Total stock in Warehouse 2 = " + totalWarehouse2);
}
}
