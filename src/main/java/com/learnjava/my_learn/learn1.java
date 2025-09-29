package com.learnjava.my_learn;

import java.util.Scanner;

public class learn1 {
    public static void main(String[] args) {
        /* 
        System.out.println("hello world");
        char a=65;
        System.out.println(a);
        System.out.println((char)a); 
        int b=10;
        String stra=String.valueOf(b);
        System.out.println(stra);
        int x1=0;
        int x2=10;
        System.out.println("这个是后缀的自增运算x1="+(x1++));
        System.out.println("这个是前缀的自增运算x2="+ (++x2));
        System.out.println(x1);
        for(;x2<15;x2++){
          System.out.println("x2的值是"+x2);
        }   
        System.out.println("前缀和后最的自增区别？");
        for(;x1<5;++x1){
          System.out.println("x1的值是"+x1);
      }
      System.out.println("对于循环结构体来说，前缀和后缀没有区别");
      System.out.println("x1="+x1+" x2="+x2);
      int x11=x1++;
      int x22=++x2;
        System.out.println("x11="+x11+" x22="+x22);
        System.out.println("x1="+x1+" x2="+x2);
        */
        //与或非，&&，||,!
        
       
       //学习使用if else语句
       /* 
       int data;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入月份");
        data=sc.nextInt();
        if (data<0 || data>12) {
            System.out.println("数据不合法");
        }
        else if (data>2 && data<5) {
            System.out.println("春天");
        }
        else if (data<9) {
            System.out.println("夏天");
        }
        else if(data>8 && data<12) {
            System.out.println("秋天");
        }
        else {
            System.out.println("冬天");
        }
        */
        //学习使用switch语句
        /* 
        char ch='B';
        switch (ch) {
            case 'A':
                System.out.println("匹配到A");
                break;
            case 'B':
                System.out.println("匹配到B");
                break;
            case 'C':
                System.out.println("匹配到C");  
                break;
        
            default:
                break;
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入月份");
       int data=sc.nextInt();
       switch (data) {
           case 1:
           case 2:
           case 3:
               System.out.println("春天");
               break;
           case 4:
           case 5:
           case 6:
               System.out.println("夏天");
               break;
           case 7:
           case 8:
           case 9:
               System.out.println("秋天");
               break;
           case 10:
           case 11:
           case 12:
               System.out.println("冬天");
               break;
           default:
               System.out.println("输入错误");
               break;
       }
*/

    }
}   