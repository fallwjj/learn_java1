package com.learnjava.my_learn;

public class learn2 {
    public static void main(String[] args) {
        System.out.println("Hello from learn2");

        //数组
        int[] arr={1,22,4,5};
        int[] arr2=new int[]{1,2,3,4,5};
        System.out.println(arr2[1]);
        for(int x:arr2){
            System.out.println(x);
        }
        String[] str1={"春","夏","秋","冬"};
        for(String s:str1){
            System.out.println(s);
        }
        //找最大
        int max=arr[0];
        for (int x:arr){
            if(x>max){
                max=x;
            }
        }
        System.out.println(max);
        //平均数
        int aver=0;
        for (int x:arr){
            aver+=x;
        }
        System.out.println(aver/arr.length);

        //不规则数组
        int[][] brr = {
                {1,2,3,4,5,6,7},
                {11,22,33,44,55,66,77},
                {111,222,333,444,555,666,777},
                {1111,2222,3333,4444,5555,6666,7777},
                {11111,22222,33333,44444,55555,66666,77777}
        };
        for (int i=0;i<brr.length;i++){
            for(int j=0;j<brr[i].length;j++){
                System.out.print(brr[i][j]);
            }
            System.out.println("");
        }

    }
}
