package com.learnjava.week1.day7;

/**
 * 第7天：方法
 * Day 7: Methods
 */
public class Methods {
    
    public static void main(String[] args) {
        
        System.out.println("=== Java方法演示 ===");
        System.out.println("=== Java Methods Demo ===");
        System.out.println();
        
        // 1. 调用无参数方法 / Calling parameterless method
        System.out.println("1. 无参数方法调用 / Parameterless Method Call:");
        greetings();
        System.out.println();
        
        // 2. 调用有参数的方法 / Calling method with parameters
        System.out.println("2. 有参数方法调用 / Method with Parameters:");
        greet("张三");
        greet("李四");
        
        greetWithAge("王五", 25);
        System.out.println();
        
        // 3. 调用有返回值的方法 / Calling method with return value
        System.out.println("3. 有返回值的方法 / Method with Return Value:");
        
        int sum = add(10, 20);
        System.out.println("10 + 20 = " + sum);
        
        double result = multiply(3.5, 2.0);
        System.out.println("3.5 × 2.0 = " + result);
        
        boolean isEven = isEvenNumber(8);
        System.out.println("8 是偶数吗? " + isEven);
        System.out.println();
        
        // 4. 方法重载 / Method overloading
        System.out.println("4. 方法重载演示 / Method Overloading Demo:");
        
        System.out.println("两个整数相加: " + add(5, 3));
        System.out.println("三个整数相加: " + add(5, 3, 2));
        System.out.println("两个小数相加: " + add(2.5, 3.7));
        System.out.println();
        
        // 5. 数组作为参数 / Array as parameter
        System.out.println("5. 数组作为参数 / Array as Parameter:");
        
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("数组元素: ");
        printArray(numbers);
        
        int arraySum = calculateSum(numbers);
        System.out.println("数组元素总和: " + arraySum);
        
        double average = calculateAverage(numbers);
        System.out.println("数组平均值: " + average);
        System.out.println();
        
        // 6. 递归方法 / Recursive methods
        System.out.println("6. 递归方法演示 / Recursive Methods Demo:");
        
        int n = 5;
        int factorial = calculateFactorial(n);
        System.out.println(n + "的阶乘: " + factorial);
        
        System.out.println("斐波那契数列前10项:");
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
        System.out.println();
        
        // 7. 可变参数方法 / Variable arguments method
        System.out.println("7. 可变参数方法 / Variable Arguments Method:");
        
        System.out.println("计算多个数的最大值:");
        System.out.println("max(1, 5, 3) = " + findMax(1, 5, 3));
        System.out.println("max(10, 25, 5, 30, 15) = " + findMax(10, 25, 5, 30, 15));
        
        printNumbers(1, 2, 3, 4, 5);
        printNumbers(10, 20);
        System.out.println();
        
        // 8. 实用工具方法 / Utility methods
        System.out.println("8. 实用工具方法 / Utility Methods:");
        
        String text = "Hello World";
        System.out.println("原文本: " + text);
        System.out.println("反转后: " + reverseString(text));
        System.out.println("是回文吗? " + isPalindrome("level"));
        System.out.println("是回文吗? " + isPalindrome("hello"));
        
        System.out.println("17是质数吗? " + isPrime(17));
        System.out.println("18是质数吗? " + isPrime(18));
        System.out.println();
        
        // 9. 方法的作用域和局部变量 / Method scope and local variables
        System.out.println("9. 方法作用域演示 / Method Scope Demo:");
        demonstrateScope();
        System.out.println();
        
        // 10. 方法的最佳实践 / Method best practices
        System.out.println("10. 方法设计的最佳实践 / Method Best Practices:");
        System.out.println("- 方法名应该清楚地描述其功能");
        System.out.println("- 一个方法应该只做一件事");
        System.out.println("- 方法不应该太长（通常不超过20-30行）");
        System.out.println("- 参数不应该太多（通常不超过3-4个）");
        System.out.println("- 使用有意义的参数名");
        System.out.println("- 为复杂方法添加注释");
    }
    
    // ==================== 方法定义区域 ====================
    
    /**
     * 无参数的问候方法
     */
    public static void greetings() {
        System.out.println("Hello! 欢迎学习Java方法！");
    }
    
    /**
     * 带参数的问候方法
     * @param name 姓名
     */
    public static void greet(String name) {
        System.out.println("你好, " + name + "!");
    }
    
    /**
     * 带多个参数的问候方法
     * @param name 姓名
     * @param age 年龄
     */
    public static void greetWithAge(String name, int age) {
        System.out.println("你好, " + name + "! 你今年 " + age + " 岁。");
    }
    
    /**
     * 两个整数相加
     * @param a 第一个数
     * @param b 第二个数
     * @return 两数之和
     */
    public static int add(int a, int b) {
        return a + b;
    }
    
    /**
     * 三个整数相加（方法重载）
     * @param a 第一个数
     * @param b 第二个数  
     * @param c 第三个数
     * @return 三数之和
     */
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    
    /**
     * 两个浮点数相加（方法重载）
     * @param a 第一个数
     * @param b 第二个数
     * @return 两数之和
     */
    public static double add(double a, double b) {
        return a + b;
    }
    
    /**
     * 两个数相乘
     */
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    /**
     * 判断一个数是否为偶数
     */
    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
    
    /**
     * 打印数组
     */
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    
    /**
     * 计算数组元素总和
     */
    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }
    
    /**
     * 计算数组平均值
     */
    public static double calculateAverage(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        return (double) calculateSum(arr) / arr.length;
    }
    
    /**
     * 递归计算阶乘
     */
    public static int calculateFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
    
    /**
     * 递归计算斐波那契数
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    
    /**
     * 可变参数方法 - 找最大值
     */
    public static int findMax(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("至少需要一个参数");
        }
        
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    
    /**
     * 可变参数方法 - 打印数字
     */
    public static void printNumbers(int... numbers) {
        System.out.print("数字列表: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    /**
     * 反转字符串
     */
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
    
    /**
     * 判断是否为回文
     */
    public static boolean isPalindrome(String str) {
        String cleaned = str.toLowerCase();
        return cleaned.equals(reverseString(cleaned));
    }
    
    /**
     * 判断是否为质数
     */
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * 演示方法作用域
     */
    public static void demonstrateScope() {
        int localVar = 10;  // 局部变量
        System.out.println("方法内的局部变量: " + localVar);
        
        {
            int blockVar = 20;  // 块级作用域变量
            System.out.println("块级作用域变量: " + blockVar);
            System.out.println("可以访问外层的局部变量: " + localVar);
        }
        
        // System.out.println(blockVar);  // 错误！块级变量在这里不可见
        System.out.println("块级作用域结束后，只能访问方法级变量: " + localVar);
    }
}