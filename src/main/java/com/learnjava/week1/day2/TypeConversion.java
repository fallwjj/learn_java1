package com.learnjava.week1.day2;

/**
 * 类型转换详解
 * Type Conversion Details
 */
public class TypeConversion {
    
    public static void main(String[] args) {
        
        System.out.println("=== Java类型转换演示 ===");
        System.out.println("=== Java Type Conversion Demo ===");
        System.out.println();
        
        // 1. 自动类型转换（隐式转换）/ Automatic Type Conversion (Implicit)
        System.out.println("1. 自动类型转换 / Automatic Type Conversion:");
        
        byte byteVal = 10;
        short shortVal = byteVal;        // byte -> short (自动)
        int intVal = shortVal;           // short -> int (自动)
        long longVal = intVal;           // int -> long (自动)
        float floatVal = longVal;        // long -> float (自动)
        double doubleVal = floatVal;     // float -> double (自动)
        
        System.out.println("byte -> short -> int -> long -> float -> double");
        System.out.println("原始值: " + byteVal);
        System.out.println("转换后: " + doubleVal);
        System.out.println();
        
        // 2. 强制类型转换（显式转换）/ Forced Type Conversion (Explicit)
        System.out.println("2. 强制类型转换 / Forced Type Conversion:");
        
        double d = 3.14159;
        float f = (float) d;             // 需要强制转换
        long l = (long) f;               // 需要强制转换
        int i = (int) l;                 // 需要强制转换
        
        System.out.println("double: " + d);
        System.out.println("转为float: " + f);
        System.out.println("转为long: " + l);
        System.out.println("转为int: " + i);
        System.out.println();
        
        // 3. 数据丢失示例 / Data Loss Examples
        System.out.println("3. 数据丢失示例 / Data Loss Examples:");
        
        int bigInt = 130;
        byte smallByte = (byte) bigInt;   // 数据溢出
        
        System.out.println("原始int值: " + bigInt);
        System.out.println("转为byte后: " + smallByte); // 结果为-126 (溢出)
        System.out.println();
        
        double preciseDouble = 3.99999;
        int truncatedInt = (int) preciseDouble;
        
        System.out.println("原始double值: " + preciseDouble);
        System.out.println("转为int后: " + truncatedInt); // 小数部分丢失
        System.out.println();
        
        // 4. 字符和数字的转换 / Character and Number Conversion
        System.out.println("4. 字符和数字转换 / Character and Number Conversion:");
        
        char ch = 'A';
        int asciiValue = ch;             // char -> int (自动)
        
        int number = 66;
        char character = (char) number;   // int -> char (强制)
        
        System.out.println("字符 '" + ch + "' 的ASCII值: " + asciiValue);
        System.out.println("ASCII值 " + number + " 对应的字符: '" + character + "'");
        System.out.println();
        
        // 5. 字符串转数字 / String to Number Conversion
        System.out.println("5. 字符串转数字 / String to Number Conversion:");
        
        String numStr1 = "123";
        String numStr2 = "3.14";
        String numStr3 = "true";
        
        int intFromString = Integer.parseInt(numStr1);
        double doubleFromString = Double.parseDouble(numStr2);
        boolean boolFromString = Boolean.parseBoolean(numStr3);
        
        System.out.println("字符串 \"" + numStr1 + "\" -> int: " + intFromString);
        System.out.println("字符串 \"" + numStr2 + "\" -> double: " + doubleFromString);
        System.out.println("字符串 \"" + numStr3 + "\" -> boolean: " + boolFromString);
        System.out.println();
        
        // 6. 数字转字符串 / Number to String Conversion
        System.out.println("6. 数字转字符串 / Number to String Conversion:");
        
        int num = 456;
        double dec = 7.89;
        boolean bool = true;
        
        String strFromInt = String.valueOf(num);
        String strFromDouble = String.valueOf(dec);
        String strFromBoolean = String.valueOf(bool);
        
        System.out.println("int " + num + " -> 字符串: \"" + strFromInt + "\"");
        System.out.println("double " + dec + " -> 字符串: \"" + strFromDouble + "\"");
        System.out.println("boolean " + bool + " -> 字符串: \"" + strFromBoolean + "\"");
    }
}