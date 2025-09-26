package com.learnjava.week2.day10;

/**
 * 第10天：继承
 * Day 10: Inheritance
 */
public class Inheritance {
    
    public static void main(String[] args) {
        
        System.out.println("=== Java继承演示 ===");
        System.out.println("=== Java Inheritance Demo ===");
        System.out.println();
        
        // 1. 基本继承演示 / Basic inheritance demo
        System.out.println("1. 基本继承演示 / Basic Inheritance:");
        
        Animal animal = new Animal("动物", 5);
        animal.displayInfo();
        animal.eat();
        animal.sleep();
        System.out.println();
        
        Dog dog = new Dog("旺财", 3, "金毛");
        dog.displayInfo();  // 继承自Animal
        dog.eat();         // 继承自Animal
        dog.sleep();       // 继承自Animal
        dog.bark();        // Dog类特有的方法
        dog.wagTail();     // Dog类特有的方法
        System.out.println();
        
        Cat cat = new Cat("咪咪", 2, "波斯猫");
        cat.displayInfo();
        cat.eat();
        cat.sleep();
        cat.meow();        // Cat类特有的方法
        cat.climb();       // Cat类特有的方法
        System.out.println();
        
        // 2. 方法重写演示 / Method overriding demo
        System.out.println("2. 方法重写演示 / Method Overriding:");
        
        Bird bird = new Bird("小鸟", 1, 2.5);
        bird.displayInfo();  // 重写的方法
        bird.eat();         // 重写的方法
        bird.move();        // Bird类特有的方法
        System.out.println();
        
        // 3. super关键字演示 / super keyword demo
        System.out.println("3. super关键字演示 / super Keyword:");
        
        ElectricCar eCar = new ElectricCar("特斯拉", "Model 3", 2023, 85);
        eCar.displayInfo();  // 使用了super的重写方法
        eCar.start();
        eCar.charge();
        System.out.println();
        
        // 4. 继承层次演示 / Inheritance hierarchy demo
        System.out.println("4. 继承层次演示 / Inheritance Hierarchy:");
        
        Smartphone phone = new Smartphone("iPhone", "14 Pro", 256, "iOS");
        phone.displayInfo();  // 多层继承
        phone.turnOn();      // 从Device继承
        phone.makeCall("123-456-7890");  // 从Phone继承
        phone.sendMessage("Hello!");     // 从Phone继承
        phone.installApp("微信");         // Smartphone特有
        System.out.println();
        
        // 5. 多态性预览（下一天详细讲解）/ Polymorphism preview
        System.out.println("5. 多态性预览 / Polymorphism Preview:");
        
        Animal[] animals = {
            new Dog("小黑", 4, "拉布拉多"),
            new Cat("小白", 2, "布偶猫"),
            new Bird("小黄", 1, 1.8)
        };
        
        System.out.println("所有动物的信息:");
        for (Animal a : animals) {
            a.displayInfo();  // 每个对象调用自己重写的方法
            a.eat();         // 每个对象调用自己重写的方法
            System.out.println("---");
        }
    }
}

/**
 * 基类：动物
 * Base class: Animal
 */
class Animal {
    protected String name;  // protected：子类可以访问
    protected int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("创建动物: " + name);
    }
    
    public void displayInfo() {
        System.out.println("动物名称: " + name + ", 年龄: " + age + " 岁");
    }
    
    public void eat() {
        System.out.println(name + " 正在吃食物");
    }
    
    public void sleep() {
        System.out.println(name + " 正在睡觉");
    }
    
    // Getter方法
    public String getName() { return name; }
    public int getAge() { return age; }
}

/**
 * 派生类：狗
 * Derived class: Dog
 */
class Dog extends Animal {
    private String breed;  // 品种
    
    public Dog(String name, int age, String breed) {
        super(name, age);  // 调用父类构造方法
        this.breed = breed;
        System.out.println("这是一只 " + breed + " 狗");
    }
    
    // 重写父类方法 / Override parent method
    @Override
    public void displayInfo() {
        super.displayInfo();  // 调用父类方法
        System.out.println("品种: " + breed);
    }
    
    @Override
    public void eat() {
        System.out.println(name + " 正在吃狗粮");
    }
    
    // Dog类特有的方法
    public void bark() {
        System.out.println(name + " 汪汪汪！");
    }
    
    public void wagTail() {
        System.out.println(name + " 摇尾巴");
    }
}

/**
 * 派生类：猫
 * Derived class: Cat
 */
class Cat extends Animal {
    private String breed;
    
    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
        System.out.println("这是一只 " + breed + " 猫");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("品种: " + breed);
    }
    
    @Override
    public void eat() {
        System.out.println(name + " 正在吃猫粮");
    }
    
    // Cat类特有的方法
    public void meow() {
        System.out.println(name + " 喵喵喵！");
    }
    
    public void climb() {
        System.out.println(name + " 正在爬树");
    }
}

/**
 * 派生类：鸟
 * Derived class: Bird
 */
class Bird extends Animal {
    private double wingspan;  // 翼展
    
    public Bird(String name, int age, double wingspan) {
        super(name, age);
        this.wingspan = wingspan;
        System.out.println("这是一只翼展 " + wingspan + " 米的鸟");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("翼展: " + wingspan + " 米");
    }
    
    @Override
    public void eat() {
        System.out.println(name + " 正在吃鸟食");
    }
    
    public void move() {
        System.out.println(name + " 正在飞行");
    }
}

/**
 * 基类：汽车
 * Base class: Car
 */
class Car {
    protected String brand;
    protected String model;
    protected int year;
    
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
    public void displayInfo() {
        System.out.println("汽车: " + brand + " " + model + " (" + year + "年)");
    }
    
    public void start() {
        System.out.println(brand + " " + model + " 发动机启动");
    }
}

/**
 * 派生类：电动汽车
 * Derived class: Electric Car
 */
class ElectricCar extends Car {
    private int batteryCapacity;  // 电池容量
    
    public ElectricCar(String brand, String model, int year, int batteryCapacity) {
        super(brand, model, year);
        this.batteryCapacity = batteryCapacity;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("电池容量: " + batteryCapacity + " kWh");
    }
    
    @Override
    public void start() {
        System.out.println(brand + " " + model + " 电动机启动（静音）");
    }
    
    public void charge() {
        System.out.println(brand + " " + model + " 正在充电...");
    }
}

/**
 * 基类：设备
 * Base class: Device
 */
class Device {
    protected String brand;
    protected String model;
    
    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    
    public void displayInfo() {
        System.out.println("设备: " + brand + " " + model);
    }
    
    public void turnOn() {
        System.out.println(brand + " " + model + " 开机");
    }
}

/**
 * 派生类：电话
 * Derived class: Phone
 */
class Phone extends Device {
    public Phone(String brand, String model) {
        super(brand, model);
    }
    
    @Override
    public void displayInfo() {
        System.out.println("电话: " + brand + " " + model);
    }
    
    public void makeCall(String number) {
        System.out.println("拨打电话: " + number);
    }
    
    public void sendMessage(String message) {
        System.out.println("发送短信: " + message);
    }
}

/**
 * 派生类：智能手机（多层继承）
 * Derived class: Smartphone (multi-level inheritance)
 */
class Smartphone extends Phone {
    private int storage;
    private String os;
    
    public Smartphone(String brand, String model, int storage, String os) {
        super(brand, model);
        this.storage = storage;
        this.os = os;
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("存储: " + storage + "GB, 操作系统: " + os);
    }
    
    public void installApp(String appName) {
        System.out.println("安装应用: " + appName);
    }
}