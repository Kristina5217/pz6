package com.metanit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double r;
        Circle circle = new Circle(3.1, 4.1, 5.1, "\u201c");
        System.out.println("Длина окружности = " + circle.getLength() + "см");
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите радиус");
        r = scanner.nextDouble();
        circle.set_r(r);
        System.out.println("Длина окружности = " + circle.getLength() + "см");

        Person client = new Client("Кристина", "Microsoft");
        client.displayInfo();
        Client second = (Client) client;
        second.display();
    }
}

class Person{

    String name;
    int age;

    {
        name = "Undefined";
        age = 20;
    }

    Person(){

    }

    Person(String name){
        this.name = name;
    }

    Person(String name, int age){

        this(name);
        this.age = age;
    }

    void displayInfo(){
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }

    public String getName() {
        return name;
    }
}

class Employee extends Person{

    private String bank;

    public Employee(String name, String company) {
        super(name);
        this.bank = company;
    }

    public void display(){

        System.out.printf("Employee Name: %s \t Bank: %s \n", super.getName(), bank);
    }
}

class Client extends Person
{
    private String bank;

    public Client(String name, String company) {

        super(name);
        this.bank = company;
    }

    public void display(){

        System.out.printf("Client Name: %s \t Bank: %s \n", super.getName(), bank);
    }
}

class Circle
{
    private double _x;
    private double _y;
    private double _r;
    private String _color;

    public double get_x() {
        return _x;
    }

    public void set_x(double _x) {
        this._x = _x;
    }

    public double get_y() {
        return _y;
    }

    public void set_y(double _y) {
        this._y = _y;
    }

    public double get_r() {
        return _r;
    }

    public void set_r(double _r) {
        this._r = _r;
    }

    public String get_color() {
        return _color;
    }

    public void set_color(String _color) {
        this._color = _color;
    }

    public Circle(double x, double y, double r, String color)
    {
        this._x = x;
        this._y = y;
        this._r = r;
        this._color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "_x=" + _x +
                ", _y=" + _y +
                ", _r=" + _r +
                ", _color='" + _color + '\'' +
                '}';
    }

    public double getLength()
    {
        return 2 * Math.PI * _r;
    }
}