# Learn Java in 2 Weeks / 两周学完Java语法

这个项目是专门设计来帮助你在两周内掌握Java语法基础的学习项目。

## 项目结构 / Project Structure

```
learn-java/
├── src/main/java/com/learnjava/
│   ├── week1/          # 第一周：Java基础语法
│   │   ├── day1/       # 第1天：Java入门和基本语法
│   │   ├── day2/       # 第2天：变量和数据类型
│   │   ├── day3/       # 第3天：运算符和表达式
│   │   ├── day4/       # 第4天：流程控制 - 条件语句
│   │   ├── day5/       # 第5天：流程控制 - 循环语句
│   │   ├── day6/       # 第6天：数组
│   │   └── day7/       # 第7天：方法/函数
│   └── week2/          # 第二周：面向对象编程
│       ├── day8/       # 第8天：类和对象
│       ├── day9/       # 第9天：封装和构造方法
│       ├── day10/      # 第10天：继承
│       ├── day11/      # 第11天：多态
│       ├── day12/      # 第12天：抽象类和接口
│       ├── day13/      # 第13天：异常处理
│       └── day14/      # 第14天：集合和泛型
├── src/test/java/      # 单元测试
└── exercises/          # 练习题和答案
```

## 两周学习计划 / 2-Week Learning Schedule

### 第一周：Java基础语法 / Week 1: Java Fundamentals

#### 第1天：Java入门 / Day 1: Java Basics
- Java简介和发展历史
- JDK安装和环境配置
- 第一个Java程序 "Hello World"
- Java程序结构和执行过程
- **练习**：编写并运行你的第一个Java程序

#### 第2天：变量和数据类型 / Day 2: Variables and Data Types
- 基本数据类型（byte, short, int, long, float, double, char, boolean）
- 变量声明和初始化
- 常量（final关键字）
- 类型转换（自动转换和强制转换）
- **练习**：变量操作和类型转换练习

#### 第3天：运算符 / Day 3: Operators
- 算术运算符
- 关系运算符
- 逻辑运算符
- 位运算符
- 赋值运算符
- 运算符优先级
- **练习**：复杂表达式计算

#### 第4天：条件语句 / Day 4: Conditional Statements
- if-else语句
- 嵌套if语句
- switch-case语句
- 三元运算符
- **练习**：条件判断程序

#### 第5天：循环语句 / Day 5: Loops
- for循环
- while循环
- do-while循环
- 嵌套循环
- break和continue语句
- **练习**：循环练习和图案打印

#### 第6天：数组 / Day 6: Arrays
- 一维数组的声明和初始化
- 数组的遍历
- 多维数组
- 数组常用操作
- **练习**：数组排序和搜索

#### 第7天：方法 / Day 7: Methods
- 方法的定义和调用
- 参数传递
- 返回值
- 方法重载
- 递归
- **练习**：编写各种工具方法

### 第二周：面向对象编程 / Week 2: Object-Oriented Programming

#### 第8天：类和对象 / Day 8: Classes and Objects
- 类的定义
- 对象的创建和使用
- 实例变量和类变量
- 实例方法和类方法
- **练习**：设计简单的类

#### 第9天：封装和构造方法 / Day 9: Encapsulation and Constructors
- 访问修饰符（private, protected, public）
- getter和setter方法
- 构造方法
- this关键字
- **练习**：设计完整的类

#### 第10天：继承 / Day 10: Inheritance
- 继承的概念
- extends关键字
- super关键字
- 方法重写
- **练习**：继承层次设计

#### 第11天：多态 / Day 11: Polymorphism
- 多态的概念
- 动态绑定
- instanceof运算符
- 对象类型转换
- **练习**：多态应用

#### 第12天：抽象类和接口 / Day 12: Abstract Classes and Interfaces
- 抽象类和抽象方法
- 接口的定义和实现
- 接口vs抽象类
- 多接口实现
- **练习**：接口设计

#### 第13天：异常处理 / Day 13: Exception Handling
- 异常的概念
- try-catch-finally语句
- 异常类型
- 抛出异常（throw, throws）
- **练习**：异常处理实践

#### 第14天：集合和泛型 / Day 14: Collections and Generics
- 集合框架概述
- List, Set, Map接口
- ArrayList, HashMap基本使用
- 泛型基础
- **练习**：集合操作练习

## 如何使用这个项目 / How to Use This Project

### 环境要求 / Requirements
- JDK 11 或更高版本
- Maven 3.6 或更高版本

### 运行代码 / Running the Code
```bash
# 编译项目
mvn compile

# 运行测试
mvn test

# 运行特定的Java类
mvn exec:java -Dexec.mainClass="com.learnjava.week1.day1.HelloWorld"
```

### 学习建议 / Learning Tips
1. **每天学习2-3小时**：保持稳定的学习节奏
2. **理论结合实践**：看完概念立即编写代码练习
3. **完成所有练习**：练习是掌握语法的关键
4. **记录学习笔记**：在代码中添加注释，记录重点
5. **复习前一天内容**：每天开始前快速复习昨天的内容

### 学习进度跟踪 / Progress Tracking
在每天的学习目录中，你会找到：
- 📖 **概念讲解**：理论知识和语法说明
- 💻 **代码示例**：可运行的示例代码
- 🎯 **练习题**：巩固知识的练习
- ✅ **检查点**：验证学习效果

## 贡献 / Contributing
如果你发现任何问题或有改进建议，欢迎提交Issue或Pull Request。

## 许可 / License
MIT License - 自由学习，自由分享