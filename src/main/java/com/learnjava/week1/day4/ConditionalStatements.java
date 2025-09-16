package com.learnjava.week1.day4;

/**
 * 第4天：条件语句
 * Day 4: Conditional Statements
 */
public class ConditionalStatements {
    
    public static void main(String[] args) {
        
        System.out.println("=== Java条件语句演示 ===");
        System.out.println("=== Java Conditional Statements Demo ===");
        System.out.println();
        
        // 1. if语句 / if statement
        System.out.println("1. if语句演示 / if Statement Demo:");
        
        int temperature = 25;
        System.out.println("今天的温度: " + temperature + "°C");
        
        if (temperature > 30) {
            System.out.println("天气很热！");
        }
        
        if (temperature >= 20 && temperature <= 30) {
            System.out.println("天气很舒适！");
        }
        
        if (temperature < 20) {
            System.out.println("天气有点凉！");
        }
        System.out.println();
        
        // 2. if-else语句 / if-else statement
        System.out.println("2. if-else语句演示 / if-else Statement Demo:");
        
        int age = 18;
        System.out.println("年龄: " + age);
        
        if (age >= 18) {
            System.out.println("你已经成年了！");
        } else {
            System.out.println("你还未成年！");
        }
        System.out.println();
        
        // 3. if-else if-else语句 / if-else if-else statement
        System.out.println("3. if-else if-else语句演示 / if-else if-else Demo:");
        
        int score = 85;
        System.out.println("考试成绩: " + score);
        
        if (score >= 90) {
            System.out.println("等级: 优秀 (A)");
        } else if (score >= 80) {
            System.out.println("等级: 良好 (B)");
        } else if (score >= 70) {
            System.out.println("等级: 中等 (C)");
        } else if (score >= 60) {
            System.out.println("等级: 及格 (D)");
        } else {
            System.out.println("等级: 不及格 (F)");
        }
        System.out.println();
        
        // 4. 嵌套if语句 / Nested if statements
        System.out.println("4. 嵌套if语句演示 / Nested if Statement Demo:");
        
        boolean hasLicense = true;
        int driverAge = 20;
        
        System.out.println("有驾照: " + hasLicense + ", 年龄: " + driverAge);
        
        if (hasLicense) {
            if (driverAge >= 18) {
                System.out.println("可以开车！");
            } else {
                System.out.println("有驾照但年龄不够！");
            }
        } else {
            System.out.println("没有驾照，不能开车！");
        }
        System.out.println();
        
        // 5. switch语句 / switch statement
        System.out.println("5. switch语句演示 / switch Statement Demo:");
        
        int dayOfWeek = 3;
        String dayName;
        
        switch (dayOfWeek) {
            case 1:
                dayName = "星期一";
                break;
            case 2:
                dayName = "星期二";
                break;
            case 3:
                dayName = "星期三";
                break;
            case 4:
                dayName = "星期四";
                break;
            case 5:
                dayName = "星期五";
                break;
            case 6:
                dayName = "星期六";
                break;
            case 7:
                dayName = "星期日";
                break;
            default:
                dayName = "无效的星期";
                break;
        }
        
        System.out.println("第" + dayOfWeek + "天是: " + dayName);
        System.out.println();
        
        // 6. switch语句 - 字符处理 / switch with char
        System.out.println("6. switch处理字符 / switch with Character:");
        
        char grade = 'B';
        System.out.println("成绩等级: " + grade);
        
        switch (grade) {
            case 'A':
            case 'a':
                System.out.println("优秀！继续保持！");
                break;
            case 'B':
            case 'b':
                System.out.println("良好！还有提升空间！");
                break;
            case 'C':
            case 'c':
                System.out.println("中等！需要努力！");
                break;
            case 'D':
            case 'd':
                System.out.println("及格！要加油了！");
                break;
            case 'F':
            case 'f':
                System.out.println("不及格！必须重新学习！");
                break;
            default:
                System.out.println("无效的等级！");
                break;
        }
        System.out.println();
        
        // 7. 三元运算符 / Ternary operator
        System.out.println("7. 三元运算符演示 / Ternary Operator Demo:");
        
        int num1 = 15, num2 = 20;
        int max = (num1 > num2) ? num1 : num2;
        int min = (num1 < num2) ? num1 : num2;
        
        System.out.println("数字1: " + num1 + ", 数字2: " + num2);
        System.out.println("最大值: " + max);
        System.out.println("最小值: " + min);
        
        String result = (num1 % 2 == 0) ? "偶数" : "奇数";
        System.out.println(num1 + " 是 " + result);
        System.out.println();
        
        // 8. 实际应用示例 - 登录验证 / Practical example - Login validation
        System.out.println("8. 实际应用 - 登录验证 / Practical Example - Login:");
        
        String username = "admin";
        String password = "123456";
        String inputUser = "admin";
        String inputPass = "123456";
        
        if (username.equals(inputUser) && password.equals(inputPass)) {
            System.out.println("登录成功！欢迎, " + username + "!");
        } else {
            if (!username.equals(inputUser)) {
                System.out.println("用户名错误！");
            }
            if (!password.equals(inputPass)) {
                System.out.println("密码错误！");
            }
        }
        System.out.println();
        
        // 9. 季节判断示例 / Season determination example
        System.out.println("9. 季节判断示例 / Season Determination:");
        
        int month = 8;
        String season;
        
        if (month >= 3 && month <= 5) {
            season = "春季";
        } else if (month >= 6 && month <= 8) {
            season = "夏季";
        } else if (month >= 9 && month <= 11) {
            season = "秋季";
        } else {
            season = "冬季";
        }
        
        System.out.println(month + "月份是: " + season);
    }
}