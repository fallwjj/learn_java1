package com.learnjava.week1.day1;

/**
 * 第1天：Java入门 - Hello World程序
 * Day 1: Java Basics - Hello World Program
 * 
 * 这是你的第一个Java程序！
 * This is your first Java program!
 * 
 * 学习要点 / Learning Points:
 * 1. Java程序的基本结构 / Basic structure of Java program
 * 2. 类的概念 / Class concept
 * 3. main方法 / main method
 * 4. 输出语句 / Output statement
 */
public class HelloWorld {
    
    /**
     * main方法是Java程序的入口点
     * The main method is the entry point of Java programs
     */
    public static void main(String[] args) {
        // 这是注释 - 输出 "Hello, World!"
        // This is a comment - print "Hello, World!"
        System.out.println("Hello, World!");
        System.out.println("你好，Java世界！");
        
        // 多行输出示例
        // Multi-line output example
        System.out.println("欢迎开始Java学习之旅！");
        System.out.println("Welcome to your Java learning journey!");
        
        // 使用print vs println的区别
        // Difference between print and println
        System.out.print("这行不换行 ");
        System.out.print("This line doesn't break ");
        System.out.println("这行会换行");
        System.out.println("This line breaks");
    }
}