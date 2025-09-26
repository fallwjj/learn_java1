package com.learnjava.week2.day8;

/**
 * 第8天：类和对象
 * Day 8: Classes and Objects
 */
public class ClassesAndObjects {
    
    public static void main(String[] args) {
        
        System.out.println("=== Java类和对象演示 ===");
        System.out.println("=== Java Classes and Objects Demo ===");
        System.out.println();
        
        // 1. 创建对象 / Creating objects
        System.out.println("1. 创建对象 / Creating Objects:");
        
        Student student1 = new Student();
        student1.name = "张三";
        student1.age = 20;
        student1.studentId = "S001";
        
        Student student2 = new Student();
        student2.name = "李四";
        student2.age = 21;
        student2.studentId = "S002";
        
        System.out.println("学生1信息:");
        student1.displayInfo();
        
        System.out.println("学生2信息:");
        student2.displayInfo();
        System.out.println();
        
        // 2. 调用对象方法 / Calling object methods
        System.out.println("2. 对象方法调用 / Object Method Calls:");
        
        student1.study("Java编程");
        student2.study("数据结构");
        
        student1.celebrateBirthday();
        System.out.println();
        
        // 3. 静态变量和方法 / Static variables and methods
        System.out.println("3. 静态变量和方法 / Static Variables and Methods:");
        
        System.out.println("学生总数: " + Student.getTotalStudents());
        
        Student student3 = new Student();
        student3.name = "王五";
        student3.age = 19;
        student3.studentId = "S003";
        
        System.out.println("创建第3个学生后，总数: " + Student.getTotalStudents());
        System.out.println();
        
        // 4. 汽车类示例 / Car class example
        System.out.println("4. 汽车类示例 / Car Class Example:");
        
        Car car1 = new Car();
        car1.brand = "丰田";
        car1.model = "卡罗拉";
        car1.year = 2022;
        car1.color = "白色";
        
        car1.displayInfo();
        car1.start();
        car1.accelerate();
        car1.brake();
        car1.stop();
        System.out.println();
        
        // 5. 计算器类示例 / Calculator class example
        System.out.println("5. 计算器类示例 / Calculator Class Example:");
        
        Calculator calc = new Calculator();
        calc.brand = "卡西欧";
        
        System.out.println("使用 " + calc.brand + " 计算器:");
        System.out.println("10 + 5 = " + calc.add(10, 5));
        System.out.println("10 - 5 = " + calc.subtract(10, 5));
        System.out.println("10 × 5 = " + calc.multiply(10, 5));
        System.out.println("10 ÷ 5 = " + calc.divide(10, 5));
        System.out.println();
        
        // 6. 银行账户示例 / Bank account example
        System.out.println("6. 银行账户示例 / Bank Account Example:");
        
        BankAccount account = new BankAccount();
        account.accountNumber = "123456789";
        account.accountHolder = "赵六";
        account.balance = 1000.0;
        
        account.displayInfo();
        account.deposit(500.0);
        account.withdraw(200.0);
        account.withdraw(2000.0);  // 余额不足的情况
        System.out.println();
    }
}

/**
 * 学生类
 * Student class
 */
class Student {
    // 实例变量 / Instance variables
    String name;
    int age;
    String studentId;
    
    // 静态变量 / Static variable
    private static int totalStudents = 0;
    
    // 构造方法会在下一天详细讲解，这里使用默认的
    // Constructor will be explained in detail tomorrow
    public Student() {
        totalStudents++;  // 每创建一个学生对象，总数加1
    }
    
    // 实例方法 / Instance methods
    public void displayInfo() {
        System.out.println("姓名: " + name);
        System.out.println("年龄: " + age);
        System.out.println("学号: " + studentId);
        System.out.println("---");
    }
    
    public void study(String subject) {
        System.out.println(name + " 正在学习 " + subject);
    }
    
    public void celebrateBirthday() {
        age++;
        System.out.println(name + " 过生日了！现在 " + age + " 岁了！");
    }
    
    // 静态方法 / Static method
    public static int getTotalStudents() {
        return totalStudents;
    }
}

/**
 * 汽车类
 * Car class
 */
class Car {
    // 实例变量 / Instance variables
    String brand;
    String model;
    int year;
    String color;
    boolean isRunning = false;
    
    // 实例方法 / Instance methods
    public void displayInfo() {
        System.out.println("品牌: " + brand);
        System.out.println("型号: " + model);
        System.out.println("年份: " + year);
        System.out.println("颜色: " + color);
        System.out.println("---");
    }
    
    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println(brand + " " + model + " 启动了！");
        } else {
            System.out.println("汽车已经在运行中！");
        }
    }
    
    public void stop() {
        if (isRunning) {
            isRunning = false;
            System.out.println(brand + " " + model + " 熄火了！");
        } else {
            System.out.println("汽车已经停止了！");
        }
    }
    
    public void accelerate() {
        if (isRunning) {
            System.out.println(brand + " " + model + " 加速中...");
        } else {
            System.out.println("请先启动汽车！");
        }
    }
    
    public void brake() {
        if (isRunning) {
            System.out.println(brand + " " + model + " 刹车中...");
        } else {
            System.out.println("汽车没有运行，无需刹车！");
        }
    }
}

/**
 * 计算器类
 * Calculator class
 */
class Calculator {
    // 实例变量
    String brand;
    
    // 计算方法
    public double add(double a, double b) {
        return a + b;
    }
    
    public double subtract(double a, double b) {
        return a - b;
    }
    
    public double multiply(double a, double b) {
        return a * b;
    }
    
    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("错误：除数不能为0！");
            return 0;
        }
    }
}

/**
 * 银行账户类
 * Bank Account class
 */
class BankAccount {
    // 实例变量
    String accountNumber;
    String accountHolder;
    double balance;
    
    public void displayInfo() {
        System.out.println("账户号码: " + accountNumber);
        System.out.println("账户持有人: " + accountHolder);
        System.out.println("账户余额: ¥" + balance);
        System.out.println("---");
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("存款 ¥" + amount + " 成功！");
            System.out.println("当前余额: ¥" + balance);
        } else {
            System.out.println("存款金额必须大于0！");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("取款 ¥" + amount + " 成功！");
                System.out.println("当前余额: ¥" + balance);
            } else {
                System.out.println("余额不足！当前余额: ¥" + balance);
            }
        } else {
            System.out.println("取款金额必须大于0！");
        }
    }
}