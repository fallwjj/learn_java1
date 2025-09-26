# 如何运行这些示例 / How to Run These Examples

## 环境要求 / Requirements
- JDK 11 或更高版本 / JDK 11 or higher
- Maven 3.6+ 

## 快速开始 / Quick Start

### 1. 编译项目 / Compile the project
```bash
mvn compile
```

### 2. 运行示例程序 / Run example programs

#### 第一周示例 / Week 1 Examples

**第1天 - Hello World:**
```bash
java -cp target/classes com.learnjava.week1.day1.HelloWorld
java -cp target/classes com.learnjava.week1.day1.JavaStructure
```

**第2天 - 数据类型:**
```bash
java -cp target/classes com.learnjava.week1.day2.DataTypes
java -cp target/classes com.learnjava.week1.day2.TypeConversion
```

**第3天 - 运算符:**
```bash
java -cp target/classes com.learnjava.week1.day3.Operators
```

**第4天 - 条件语句:**
```bash
java -cp target/classes com.learnjava.week1.day4.ConditionalStatements
```

**第5天 - 循环:**
```bash
java -cp target/classes com.learnjava.week1.day5.Loops
```

**第6天 - 数组:**
```bash
java -cp target/classes com.learnjava.week1.day6.Arrays
```

**第7天 - 方法:**
```bash
java -cp target/classes com.learnjava.week1.day7.Methods
```

#### 第二周示例 / Week 2 Examples

**第8天 - 类和对象:**
```bash
java -cp target/classes com.learnjava.week2.day8.ClassesAndObjects
```

**第9天 - 封装和构造方法:**
```bash
java -cp target/classes com.learnjava.week2.day9.EncapsulationAndConstructors
```

**第10天 - 继承:**
```bash
java -cp target/classes com.learnjava.week2.day10.Inheritance
```

**第13天 - 异常处理:**
```bash
java -cp target/classes com.learnjava.week2.day13.ExceptionHandling
```

### 3. 查看练习题 / View exercises
```bash
cat exercises/README.md
```

## 学习建议 / Learning Tips

1. **按顺序学习** - 从第1天开始，每天学习一个主题
2. **运行所有示例** - 确保理解每个程序的输出
3. **修改代码实验** - 改变参数值，观察结果变化
4. **完成练习** - exercises/README.md 中有详细的练习题
5. **做笔记** - 在代码中添加你自己的注释

## 项目结构说明 / Project Structure

```
src/main/java/com/learnjava/
├── week1/          # 第一周：Java基础语法
│   ├── day1/       # Hello World和程序结构
│   ├── day2/       # 变量和数据类型
│   ├── day3/       # 运算符
│   ├── day4/       # 条件语句
│   ├── day5/       # 循环语句
│   ├── day6/       # 数组
│   └── day7/       # 方法
└── week2/          # 第二周：面向对象编程
    ├── day8/       # 类和对象
    ├── day9/       # 封装和构造方法
    ├── day10/      # 继承
    └── day13/      # 异常处理
```

## 故障排除 / Troubleshooting

**编译错误：**
- 确保使用 JDK 11+
- 运行 `mvn clean compile` 重新编译

**运行错误：**
- 检查类路径：`-cp target/classes`
- 确保使用完整的类名（包含包名）

**找不到类：**
- 确保已经运行 `mvn compile`
- 检查类名是否正确

## 下一步学习 / Next Steps

完成这个两周教程后，建议学习：
1. Java集合框架（Collection Framework）
2. 多线程编程
3. I/O流操作
4. 网络编程
5. 数据库连接（JDBC）
6. Spring框架

祝你学习愉快！Good luck with your Java learning journey! 🚀