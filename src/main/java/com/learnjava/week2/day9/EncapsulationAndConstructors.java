package com.learnjava.week2.day9;

/**
 * 第9天：封装和构造方法
 * Day 9: Encapsulation and Constructors
 */
public class EncapsulationAndConstructors {
    
    public static void main(String[] args) {
        
        System.out.println("=== Java封装和构造方法演示 ===");
        System.out.println("=== Java Encapsulation and Constructors Demo ===");
        System.out.println();
        
        // 1. 使用构造方法创建对象 / Creating objects with constructors
        System.out.println("1. 构造方法演示 / Constructor Demo:");
        
        Person person1 = new Person("张三", 25);
        Person person2 = new Person("李四", 30, "工程师");
        Person person3 = new Person();  // 默认构造方法
        
        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();
        System.out.println();
        
        // 2. 封装演示 - 使用getter和setter / Encapsulation with getters and setters
        System.out.println("2. 封装演示 / Encapsulation Demo:");
        
        BankAccount account = new BankAccount("123456789", "王五", 1000.0);
        System.out.println("账户信息:");
        account.displayAccountInfo();
        
        // 使用setter方法设置值
        account.setAccountHolder("王小五");
        
        // 尝试设置无效余额（会被验证）
        account.setBalance(-100);  // 无效操作
        account.setBalance(1500);  // 有效操作
        
        System.out.println("更新后的账户信息:");
        account.displayAccountInfo();
        System.out.println();
        
        // 3. 产品类示例 / Product class example
        System.out.println("3. 产品类示例 / Product Class Example:");
        
        Product product1 = new Product("iPhone 14", 5999.0, "Apple");
        Product product2 = new Product("Samsung Galaxy S23", 4999.0);
        
        product1.displayInfo();
        product2.displayInfo();
        
        // 应用折扣
        product1.applyDiscount(10);  // 10%折扣
        product2.applyDiscount(15);  // 15%折扣
        
        System.out.println("应用折扣后:");
        product1.displayInfo();
        product2.displayInfo();
        System.out.println();
        
        // 4. 学生类进阶版 / Advanced Student class
        System.out.println("4. 学生类进阶版 / Advanced Student Class:");
        
        Student student1 = new Student("赵六", 20, "S001", "计算机科学");
        Student student2 = new Student("孙七", 21, "S002");
        
        student1.displayInfo();
        student2.displayInfo();
        
        // 添加课程和成绩
        student1.addGrade("Java编程", 95);
        student1.addGrade("数据结构", 88);
        student2.addGrade("高等数学", 92);
        
        System.out.println(student1.getName() + " 的平均分: " + student1.getAverageGrade());
        System.out.println(student2.getName() + " 的平均分: " + student2.getAverageGrade());
        System.out.println();
        
        // 5. 汽车类进阶版 / Advanced Car class
        System.out.println("5. 汽车类进阶版 / Advanced Car Class:");
        
        Car car1 = new Car("丰田", "卡罗拉", 2022, 150000);
        Car car2 = new Car("本田", "雅阁", 2023);
        
        car1.displayInfo();
        car2.displayInfo();
        
        car1.drive(100);  // 行驶100公里
        car2.drive(50);   // 行驶50公里
        
        System.out.println("行驶后的里程:");
        System.out.println(car1.getBrand() + " " + car1.getModel() + " 总里程: " + car1.getMileage() + " 公里");
        System.out.println(car2.getBrand() + " " + car2.getModel() + " 总里程: " + car2.getMileage() + " 公里");
        System.out.println();
        
        // 6. 封装的好处演示 / Benefits of encapsulation
        System.out.println("6. 封装的好处 / Benefits of Encapsulation:");
        System.out.println("- 数据隐藏：私有变量不能被外部直接访问");
        System.out.println("- 数据验证：通过setter方法验证输入数据");
        System.out.println("- 灵活性：可以改变内部实现而不影响外部代码");
        System.out.println("- 维护性：代码更容易维护和调试");
    }
}

/**
 * 人员类 - 演示构造方法
 * Person class - demonstrating constructors
 */
class Person {
    private String name;
    private int age;
    private String occupation;
    
    // 默认构造方法 / Default constructor
    public Person() {
        this.name = "未知";
        this.age = 0;
        this.occupation = "无";
        System.out.println("使用默认构造方法创建Person对象");
    }
    
    // 带参数的构造方法 / Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.occupation = "未设置";
        System.out.println("使用双参数构造方法创建Person对象: " + name);
    }
    
    // 带三个参数的构造方法（构造方法重载）/ Constructor overloading
    public Person(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
        System.out.println("使用三参数构造方法创建Person对象: " + name);
    }
    
    public void displayInfo() {
        System.out.println("姓名: " + name + ", 年龄: " + age + ", 职业: " + occupation);
    }
    
    // Getter和Setter方法
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { 
        if (age >= 0 && age <= 150) {
            this.age = age;
        }
    }
    public String getOccupation() { return occupation; }
    public void setOccupation(String occupation) { this.occupation = occupation; }
}

/**
 * 银行账户类 - 演示封装
 * BankAccount class - demonstrating encapsulation
 */
class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        setBalance(initialBalance);  // 使用setter确保验证
    }
    
    // Getter方法
    public String getAccountNumber() { 
        return "****" + accountNumber.substring(4);  // 隐藏部分账号
    }
    
    public String getAccountHolder() { 
        return accountHolder; 
    }
    
    public double getBalance() { 
        return balance; 
    }
    
    // Setter方法（带验证）
    public void setAccountHolder(String accountHolder) {
        if (accountHolder != null && !accountHolder.trim().isEmpty()) {
            this.accountHolder = accountHolder;
            System.out.println("账户持有人已更新为: " + accountHolder);
        } else {
            System.out.println("无效的账户持有人姓名！");
        }
    }
    
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
            System.out.println("余额已设置为: ¥" + balance);
        } else {
            System.out.println("余额不能为负数！");
        }
    }
    
    public void displayAccountInfo() {
        System.out.println("账户: " + getAccountNumber() + ", 持有人: " + accountHolder + ", 余额: ¥" + balance);
    }
}

/**
 * 产品类 - 演示构造方法重载和封装
 * Product class - demonstrating constructor overloading and encapsulation
 */
class Product {
    private String name;
    private double price;
    private String brand;
    private double originalPrice;
    
    public Product(String name, double price, String brand) {
        this.name = name;
        this.originalPrice = price;
        this.price = price;
        this.brand = brand;
    }
    
    public Product(String name, double price) {
        this(name, price, "未知品牌");  // 调用另一个构造方法
    }
    
    // Getter方法
    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getBrand() { return brand; }
    
    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 50) {  // 最大50%折扣
            this.price = originalPrice * (1 - percentage / 100);
            System.out.println(name + " 应用了 " + percentage + "% 折扣");
        } else {
            System.out.println("无效的折扣比例！");
        }
    }
    
    public void displayInfo() {
        System.out.println("产品: " + name + ", 品牌: " + brand + ", 价格: ¥" + String.format("%.2f", price));
    }
}

/**
 * 学生类进阶版 - 演示复杂的封装
 * Advanced Student class - demonstrating complex encapsulation
 */
class Student {
    private String name;
    private int age;
    private String studentId;
    private String major;
    private java.util.List<Double> grades;
    
    public Student(String name, int age, String studentId, String major) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.major = major;
        this.grades = new java.util.ArrayList<>();
    }
    
    public Student(String name, int age, String studentId) {
        this(name, age, studentId, "未定专业");
    }
    
    public void addGrade(String subject, double grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
            System.out.println(name + " 的 " + subject + " 成绩 " + grade + " 分已添加");
        } else {
            System.out.println("无效的成绩分数！");
        }
    }
    
    public double getAverageGrade() {
        if (grades.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
    
    public void displayInfo() {
        System.out.println("学生: " + name + ", 年龄: " + age + ", 学号: " + studentId + ", 专业: " + major);
    }
    
    // Getter方法
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getStudentId() { return studentId; }
    public String getMajor() { return major; }
}

/**
 * 汽车类进阶版 - 演示封装的实际应用
 * Advanced Car class - demonstrating practical encapsulation
 */
class Car {
    private String brand;
    private String model;
    private int year;
    private double mileage;
    
    public Car(String brand, String model, int year, double initialMileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = initialMileage;
    }
    
    public Car(String brand, String model, int year) {
        this(brand, model, year, 0);  // 新车，里程为0
    }
    
    public void drive(double distance) {
        if (distance > 0) {
            mileage += distance;
            System.out.println(brand + " " + model + " 行驶了 " + distance + " 公里");
        } else {
            System.out.println("行驶距离必须大于0！");
        }
    }
    
    public void displayInfo() {
        System.out.println("汽车: " + brand + " " + model + " (" + year + "年), 里程: " + mileage + " 公里");
    }
    
    // Getter方法
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public double getMileage() { return mileage; }
}