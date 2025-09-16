package com.learnjava.week1.day2;

/**
 * 第2天：变量和数据类型
 * Day 2: Variables and Data Types
 * 
 * Java的8种基本数据类型：
 * Java's 8 primitive data types:
 * 1. byte (字节型) - 8位
 * 2. short (短整型) - 16位  
 * 3. int (整型) - 32位
 * 4. long (长整型) - 64位
 * 5. float (单精度浮点) - 32位
 * 6. double (双精度浮点) - 64位
 * 7. char (字符型) - 16位
 * 8. boolean (布尔型) - 1位
 */
public class DataTypes {
    
    public static void main(String[] args) {
        
        System.out.println("=== Java基本数据类型演示 ===");
        System.out.println("=== Java Primitive Data Types Demo ===");
        System.out.println();
        
        // 1. 整数类型 / Integer types
        byte byteVar = 127;              // -128 到 127
        short shortVar = 32767;          // -32,768 到 32,767  
        int intVar = 2147483647;         // -2^31 到 2^31-1
        long longVar = 9223372036854775807L; // -2^63 到 2^63-1 (注意L后缀)
        
        System.out.println("整数类型 / Integer Types:");
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println();
        
        // 2. 浮点类型 / Floating-point types
        float floatVar = 3.14f;          // 单精度，注意f后缀
        double doubleVar = 3.14159265359; // 双精度，默认类型
        
        System.out.println("浮点类型 / Floating-point Types:");
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println();
        
        // 3. 字符类型 / Character type
        char charVar1 = 'A';             // 单个字符
        char charVar2 = '中';            // 中文字符
        char charVar3 = 65;              // ASCII码值
        
        System.out.println("字符类型 / Character Type:");
        System.out.println("char1: " + charVar1);
        System.out.println("char2: " + charVar2);
        System.out.println("char3: " + charVar3); // 显示为'A'
        System.out.println();
        
        // 4. 布尔类型 / Boolean type
        boolean booleanVar1 = true;
        boolean booleanVar2 = false;
        
        System.out.println("布尔类型 / Boolean Type:");
        System.out.println("boolean1: " + booleanVar1);
        System.out.println("boolean2: " + booleanVar2);
        System.out.println();
        
        // 5. 字符串类型（引用类型）/ String type (reference type)
        String stringVar = "Hello, Java!";
        
        System.out.println("字符串类型 / String Type:");
        System.out.println("String: " + stringVar);
        System.out.println();
        
        // 6. 常量 / Constants
        final int CONSTANT_VALUE = 100;  // 常量命名通常使用大写
        // CONSTANT_VALUE = 200;         // 错误！常量不能重新赋值
        
        System.out.println("常量 / Constant:");
        System.out.println("CONSTANT_VALUE: " + CONSTANT_VALUE);
        System.out.println();
        
        // 7. 变量命名规则演示 / Variable naming rules demo
        int age = 25;                    // 好的命名
        int studentCount = 100;          // 驼峰命名法
        int MAX_SIZE = 1000;            // 常量命名
        
        // int 2age = 25;               // 错误！不能以数字开头
        // int student-count = 100;     // 错误！不能包含连字符
        // int class = 200;             // 错误！不能使用关键字
        
        System.out.println("变量命名示例 / Variable Naming Examples:");
        System.out.println("age: " + age);
        System.out.println("studentCount: " + studentCount);
        System.out.println("MAX_SIZE: " + MAX_SIZE);
    }
}