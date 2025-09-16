package com.learnjava.week2.day13;

/**
 * 第13天：异常处理
 * Day 13: Exception Handling
 */
public class ExceptionHandling {
    
    public static void main(String[] args) {
        
        System.out.println("=== Java异常处理演示 ===");
        System.out.println("=== Java Exception Handling Demo ===");
        System.out.println();
        
        // 1. 基本异常处理 / Basic exception handling
        System.out.println("1. 基本异常处理 / Basic Exception Handling:");
        
        try {
            int result = divide(10, 0);
            System.out.println("结果: " + result);
        } catch (ArithmeticException e) {
            System.out.println("捕获异常: " + e.getMessage());
        }
        System.out.println();
        
        // 2. 多种异常处理 / Multiple exception handling
        System.out.println("2. 多种异常处理 / Multiple Exception Types:");
        
        processArray();
        System.out.println();
        
        // 3. finally块演示 / finally block demo
        System.out.println("3. finally块演示 / finally Block Demo:");
        
        demoFinally();
        System.out.println();
        
        // 4. 自定义异常 / Custom exceptions
        System.out.println("4. 自定义异常演示 / Custom Exception Demo:");
        
        try {
            validateAge(-5);
        } catch (InvalidAgeException e) {
            System.out.println("自定义异常: " + e.getMessage());
        }
        
        try {
            processScore(105);
        } catch (InvalidScoreException e) {
            System.out.println("自定义异常: " + e.getMessage());
        }
        System.out.println();
        
        // 5. 银行账户异常处理 / Bank account exception handling
        System.out.println("5. 银行账户异常处理 / Bank Account Exception Handling:");
        
        BankAccount account = new BankAccount("123456", 1000.0);
        
        try {
            account.withdraw(500);   // 正常取款
            account.withdraw(600);   // 余额不足异常
        } catch (InsufficientFundsException | InvalidAmountException e) {
            System.out.println("银行异常: " + e.getMessage());
        }
        
        try {
            account.withdraw(-100);  // 无效金额异常
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println("银行异常: " + e.getMessage());
        }
        System.out.println();
        
        // 6. 文件操作异常处理 / File operation exception handling
        System.out.println("6. 文件操作异常处理 / File Operation Exception Handling:");
        
        readFileDemo();
        System.out.println();
        
        // 7. 异常传播 / Exception propagation
        System.out.println("7. 异常传播演示 / Exception Propagation:");
        
        try {
            methodA();
        } catch (Exception e) {
            System.out.println("在main方法中捕获异常: " + e.getMessage());
        }
        System.out.println();
        
        // 8. 异常处理最佳实践 / Exception handling best practices
        System.out.println("8. 异常处理最佳实践 / Exception Handling Best Practices:");
        bestPracticesDemo();
        System.out.println();
        
        // 9. 常见异常类型 / Common exception types
        System.out.println("9. 常见异常类型演示 / Common Exception Types:");
        commonExceptionsDemo();
    }
    
    /**
     * 除法方法，可能抛出异常
     */
    public static int divide(int a, int b) {
        return a / b;  // 可能抛出ArithmeticException
    }
    
    /**
     * 数组处理方法，演示多种异常
     */
    public static void processArray() {
        int[] numbers = {1, 2, 3, 4, 5};
        
        try {
            // 可能的数组越界异常
            System.out.println("访问索引5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界异常: " + e.getMessage());
        }
        
        try {
            // 可能的空指针异常
            String str = null;
            System.out.println("字符串长度: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("空指针异常: " + e.getMessage());
        }
        
        try {
            // 可能的数字格式异常
            String numberStr = "abc";
            int number = Integer.parseInt(numberStr);
            System.out.println("转换后的数字: " + number);
        } catch (NumberFormatException e) {
            System.out.println("数字格式异常: " + e.getMessage());
        }
    }
    
    /**
     * finally块演示
     */
    public static void demoFinally() {
        try {
            System.out.println("执行try块");
            int result = 10 / 2;
            System.out.println("计算结果: " + result);
        } catch (ArithmeticException e) {
            System.out.println("执行catch块");
        } finally {
            System.out.println("执行finally块 - 无论是否有异常都会执行");
        }
        
        try {
            System.out.println("执行另一个try块");
            int result = 10 / 0;  // 这会引发异常
            System.out.println("这行不会执行");
        } catch (ArithmeticException e) {
            System.out.println("执行catch块: " + e.getMessage());
        } finally {
            System.out.println("执行finally块 - 清理资源");
        }
    }
    
    /**
     * 验证年龄
     */
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("年龄不能为负数: " + age);
        }
        if (age > 150) {
            throw new InvalidAgeException("年龄不能超过150岁: " + age);
        }
        System.out.println("有效年龄: " + age);
    }
    
    /**
     * 处理分数
     */
    public static void processScore(int score) throws InvalidScoreException {
        if (score < 0 || score > 100) {
            throw new InvalidScoreException("分数必须在0-100之间: " + score);
        }
        System.out.println("有效分数: " + score);
    }
    
    /**
     * 文件读取演示（模拟）
     */
    public static void readFileDemo() {
        try {
            // 模拟文件操作
            simulateFileRead("nonexistent.txt");
        } catch (java.io.FileNotFoundException e) {
            System.out.println("文件未找到异常: " + e.getMessage());
        } catch (java.io.IOException e) {
            System.out.println("IO异常: " + e.getMessage());
        }
    }
    
    /**
     * 模拟文件读取
     */
    public static void simulateFileRead(String filename) throws java.io.FileNotFoundException {
        if (filename.equals("nonexistent.txt")) {
            throw new java.io.FileNotFoundException("文件不存在: " + filename);
        }
        System.out.println("成功读取文件: " + filename);
    }
    
    /**
     * 异常传播示例
     */
    public static void methodA() throws Exception {
        methodB();
    }
    
    public static void methodB() throws Exception {
        methodC();
    }
    
    public static void methodC() throws Exception {
        throw new Exception("这是从methodC抛出的异常");
    }
    
    /**
     * 异常处理最佳实践
     */
    public static void bestPracticesDemo() {
        System.out.println("异常处理最佳实践:");
        System.out.println("1. 捕获具体的异常类型，不要捕获Exception");
        System.out.println("2. 不要忽略异常，至少要记录日志");
        System.out.println("3. 使用finally块清理资源");
        System.out.println("4. 不要在catch块中抛出新异常而丢失原始异常");
        System.out.println("5. 自定义异常应该继承适当的异常类");
        System.out.println("6. 异常信息要清晰明确");
    }
    
    /**
     * 常见异常类型演示
     */
    public static void commonExceptionsDemo() {
        System.out.println("Java常见异常类型:");
        System.out.println("- NullPointerException: 空指针异常");
        System.out.println("- ArrayIndexOutOfBoundsException: 数组越界异常");
        System.out.println("- NumberFormatException: 数字格式异常");
        System.out.println("- ArithmeticException: 算术异常");
        System.out.println("- ClassCastException: 类型转换异常");
        System.out.println("- IllegalArgumentException: 非法参数异常");
        System.out.println("- IOException: 输入输出异常");
        System.out.println("- FileNotFoundException: 文件未找到异常");
    }
}

/**
 * 自定义异常：无效年龄异常
 * Custom exception: Invalid Age Exception
 */
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

/**
 * 自定义异常：无效分数异常
 * Custom exception: Invalid Score Exception
 */
class InvalidScoreException extends Exception {
    public InvalidScoreException(String message) {
        super(message);
    }
}

/**
 * 自定义异常：余额不足异常
 * Custom exception: Insufficient Funds Exception
 */
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

/**
 * 自定义异常：无效金额异常
 * Custom exception: Invalid Amount Exception
 */
class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

/**
 * 银行账户类 - 演示异常处理
 * Bank Account class - demonstrating exception handling
 */
class BankAccount {
    private String accountNumber;
    private double balance;
    
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("取款金额必须大于0: " + amount);
        }
        
        if (amount > balance) {
            throw new InsufficientFundsException("余额不足！余额: " + balance + ", 尝试取款: " + amount);
        }
        
        balance -= amount;
        System.out.println("取款成功！取款: " + amount + ", 余额: " + balance);
    }
    
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("存款金额必须大于0: " + amount);
        }
        
        balance += amount;
        System.out.println("存款成功！存款: " + amount + ", 余额: " + balance);
    }
    
    public double getBalance() {
        return balance;
    }
}