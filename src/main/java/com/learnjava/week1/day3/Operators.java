package com.learnjava.week1.day3;

/**
 * 第3天：运算符详解
 * Day 3: Operators in Detail
 */
public class Operators {
    
    public static void main(String[] args) {
        
        System.out.println("=== Java运算符演示 ===");
        System.out.println("=== Java Operators Demo ===");
        System.out.println();
        
        // 1. 算术运算符 / Arithmetic Operators
        System.out.println("1. 算术运算符 / Arithmetic Operators:");
        
        int a = 15, b = 4;
        
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + (a + b));    // 加法
        System.out.println("a - b = " + (a - b));    // 减法
        System.out.println("a * b = " + (a * b));    // 乘法
        System.out.println("a / b = " + (a / b));    // 除法（整数除法）
        System.out.println("a % b = " + (a % b));    // 取模（余数）
        System.out.println();
        
        // 浮点数除法
        double da = 15.0, db = 4.0;
        System.out.println("浮点数除法: " + da + " / " + db + " = " + (da / db));
        System.out.println();
        
        // 2. 自增自减运算符 / Increment and Decrement Operators
        System.out.println("2. 自增自减运算符 / Increment and Decrement:");
        
        int x = 5;
        System.out.println("x的初始值: " + x);
        
        System.out.println("++x (前缀): " + (++x));   // 先增加，再使用，x变为6
        System.out.println("x++ (后缀): " + (x++));   // 先使用，再增加，显示6，x变为7
        System.out.println("现在x的值: " + x);        // x现在是7
        
        System.out.println("--x (前缀): " + (--x));   // 先减少，再使用，x变为6
        System.out.println("x-- (后缀): " + (x--));   // 先使用，再减少，显示6，x变为5
        System.out.println("现在x的值: " + x);        // x现在是5
        System.out.println();
        
        // 3. 关系运算符 / Relational Operators
        System.out.println("3. 关系运算符 / Relational Operators:");
        
        int m = 10, n = 20;
        System.out.println("m = " + m + ", n = " + n);
        
        System.out.println("m > n: " + (m > n));      // 大于
        System.out.println("m < n: " + (m < n));      // 小于
        System.out.println("m >= n: " + (m >= n));    // 大于等于
        System.out.println("m <= n: " + (m <= n));    // 小于等于
        System.out.println("m == n: " + (m == n));    // 等于
        System.out.println("m != n: " + (m != n));    // 不等于
        System.out.println();
        
        // 4. 逻辑运算符 / Logical Operators
        System.out.println("4. 逻辑运算符 / Logical Operators:");
        
        boolean p = true, q = false;
        System.out.println("p = " + p + ", q = " + q);
        
        System.out.println("p && q (逻辑与): " + (p && q));    // 逻辑与
        System.out.println("p || q (逻辑或): " + (p || q));    // 逻辑或
        System.out.println("!p (逻辑非): " + (!p));            // 逻辑非
        System.out.println("!q (逻辑非): " + (!q));
        System.out.println();
        
        // 短路运算示例 / Short-circuit evaluation
        System.out.println("短路运算示例 / Short-circuit Evaluation:");
        int val = 0;
        if (false && ++val > 0) {  // 由于false，++val不会执行
            System.out.println("这行不会执行");
        }
        System.out.println("val的值仍然是: " + val);  // val还是0
        System.out.println();
        
        // 5. 赋值运算符 / Assignment Operators
        System.out.println("5. 赋值运算符 / Assignment Operators:");
        
        int num = 10;
        System.out.println("初始值 num = " + num);
        
        num += 5;   // 等价于 num = num + 5
        System.out.println("num += 5: " + num);
        
        num -= 3;   // 等价于 num = num - 3
        System.out.println("num -= 3: " + num);
        
        num *= 2;   // 等价于 num = num * 2
        System.out.println("num *= 2: " + num);
        
        num /= 4;   // 等价于 num = num / 4
        System.out.println("num /= 4: " + num);
        
        num %= 3;   // 等价于 num = num % 3
        System.out.println("num %= 3: " + num);
        System.out.println();
        
        // 6. 三元运算符 / Ternary Operator
        System.out.println("6. 三元运算符 / Ternary Operator:");
        
        int score = 85;
        String result = score >= 60 ? "及格" : "不及格";
        System.out.println("分数: " + score + ", 结果: " + result);
        
        // 嵌套三元运算符
        String grade = score >= 90 ? "优秀" : 
                      score >= 80 ? "良好" : 
                      score >= 70 ? "中等" : 
                      score >= 60 ? "及格" : "不及格";
        System.out.println("等级: " + grade);
        System.out.println();
        
        // 7. 运算符优先级示例 / Operator Precedence Examples
        System.out.println("7. 运算符优先级 / Operator Precedence:");
        
        int result1 = 2 + 3 * 4;              // 乘法优先于加法
        int result2 = (2 + 3) * 4;            // 括号改变优先级
        boolean result3 = 5 > 3 && 2 < 4;     // 关系运算符优先于逻辑运算符
        
        System.out.println("2 + 3 * 4 = " + result1);         // 14
        System.out.println("(2 + 3) * 4 = " + result2);       // 20
        System.out.println("5 > 3 && 2 < 4 = " + result3);    // true
        System.out.println();
        
        System.out.println("运算符优先级（从高到低）:");
        System.out.println("Operator Precedence (High to Low):");
        System.out.println("1. () [] .");
        System.out.println("2. ++ -- ! ~");
        System.out.println("3. * / %");
        System.out.println("4. + -");
        System.out.println("5. < <= > >=");
        System.out.println("6. == !=");
        System.out.println("7. &&");
        System.out.println("8. ||");
        System.out.println("9. ?:");
        System.out.println("10. = += -= *= /= %=");
    }
}