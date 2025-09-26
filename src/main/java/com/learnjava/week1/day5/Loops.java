package com.learnjava.week1.day5;

/**
 * 第5天：循环语句
 * Day 5: Loop Statements
 */
public class Loops {
    
    public static void main(String[] args) {
        
        System.out.println("=== Java循环语句演示 ===");
        System.out.println("=== Java Loop Statements Demo ===");
        System.out.println();
        
        // 1. for循环 / for loop
        System.out.println("1. for循环演示 / for Loop Demo:");
        
        System.out.println("数字1到5:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        System.out.println("偶数2到10:");
        for (int i = 2; i <= 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        System.out.println("倒数计数10到1:");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        
        // 2. while循环 / while loop
        System.out.println("2. while循环演示 / while Loop Demo:");
        
        int count = 1;
        System.out.println("使用while打印1到5:");
        while (count <= 5) {
            System.out.print(count + " ");
            count++;
        }
        System.out.println();
        
        // 求和示例
        int sum = 0;
        int num = 1;
        while (num <= 100) {
            sum += num;
            num++;
        }
        System.out.println("1到100的和是: " + sum);
        System.out.println();
        
        // 3. do-while循环 / do-while loop
        System.out.println("3. do-while循环演示 / do-while Loop Demo:");
        
        int x = 1;
        System.out.println("do-while打印1到5:");
        do {
            System.out.print(x + " ");
            x++;
        } while (x <= 5);
        System.out.println();
        
        // do-while至少执行一次的特点
        int y = 10;
        System.out.println("即使条件不满足，do-while也会执行一次:");
        do {
            System.out.println("y的值: " + y);
            y++;
        } while (y < 10);
        System.out.println();
        
        // 4. 嵌套循环 / Nested loops
        System.out.println("4. 嵌套循环演示 / Nested Loops Demo:");
        
        System.out.println("乘法表的一部分:");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i + "×" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
        System.out.println();
        
        // 打印星号图案
        System.out.println("打印三角形星号图案:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        
        // 5. break语句 / break statement
        System.out.println("5. break语句演示 / break Statement Demo:");
        
        System.out.println("找到第一个大于50的平方数:");
        for (int i = 1; i <= 10; i++) {
            int square = i * i;
            if (square > 50) {
                System.out.println("找到了: " + i + "的平方是 " + square);
                break; // 跳出循环
            }
            System.out.println(i + "的平方是 " + square);
        }
        System.out.println();
        
        // 6. continue语句 / continue statement
        System.out.println("6. continue语句演示 / continue Statement Demo:");
        
        System.out.println("打印1到10中的奇数:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue; // 跳过本次循环，继续下一次
            }
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        
        // 7. 标签和break/continue / Labels with break/continue
        System.out.println("7. 带标签的break/continue / Labeled break/continue:");
        
        outer: // 外层循环标签
        for (int i = 1; i <= 3; i++) {
            System.out.println("外层循环 i = " + i);
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("  跳出外层循环");
                    break outer; // 跳出标签指定的循环
                }
                System.out.println("  内层循环 j = " + j);
            }
        }
        System.out.println();
        
        // 8. 实际应用示例 / Practical examples
        System.out.println("8. 实际应用示例 / Practical Examples:");
        
        // 阶乘计算
        int n = 5;
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(n + "的阶乘是: " + factorial);
        
        // 斐波那契数列
        System.out.println("斐波那契数列前10项:");
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < 10; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
        
        // 判断质数
        int numberToCheck = 17;
        boolean isPrime = true;
        if (numberToCheck <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numberToCheck); i++) {
                if (numberToCheck % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(numberToCheck + (isPrime ? " 是质数" : " 不是质数"));
        System.out.println();
        
        // 9. 循环性能对比 / Loop performance comparison
        System.out.println("9. 循环使用建议 / Loop Usage Tips:");
        System.out.println("- for循环：适用于已知循环次数的情况");
        System.out.println("- while循环：适用于循环次数不确定的情况");
        System.out.println("- do-while循环：适用于至少需要执行一次的情况");
        System.out.println("- 嵌套循环要注意时间复杂度");
        System.out.println("- 合理使用break和continue优化程序逻辑");
    }
}