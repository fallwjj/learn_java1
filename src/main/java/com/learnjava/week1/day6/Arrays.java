package com.learnjava.week1.day6;

/**
 * 第6天：数组
 * Day 6: Arrays
 */
public class Arrays {
    
    public static void main(String[] args) {
        
        System.out.println("=== Java数组演示 ===");
        System.out.println("=== Java Arrays Demo ===");
        System.out.println();
        
        // 1. 数组的声明和初始化 / Array declaration and initialization
        System.out.println("1. 数组的声明和初始化 / Array Declaration and Initialization:");
        
        // 方法1：声明后初始化
        int[] numbers1 = new int[5];  // 创建大小为5的整数数组
        numbers1[0] = 10;
        numbers1[1] = 20;
        numbers1[2] = 30;
        numbers1[3] = 40;
        numbers1[4] = 50;
        
        // 方法2：声明时直接初始化
        int[] numbers2 = {1, 2, 3, 4, 5};
        
        // 方法3：使用new关键字初始化
        int[] numbers3 = new int[]{100, 200, 300, 400, 500};
        
        System.out.println("数组1的长度: " + numbers1.length);
        System.out.println("数组2的长度: " + numbers2.length);
        System.out.println("数组3的长度: " + numbers3.length);
        System.out.println();
        
        // 2. 数组的遍历 / Array traversal
        System.out.println("2. 数组的遍历 / Array Traversal:");
        
        // 使用传统for循环遍历
        System.out.println("使用for循环遍历数组1:");
        for (int i = 0; i < numbers1.length; i++) {
            System.out.print(numbers1[i] + " ");
        }
        System.out.println();
        
        // 使用增强型for循环（for-each）
        System.out.println("使用增强型for循环遍历数组2:");
        for (int num : numbers2) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();
        
        // 3. 字符串数组 / String array
        System.out.println("3. 字符串数组 / String Array:");
        
        String[] fruits = {"苹果", "香蕉", "橙子", "葡萄", "草莓"};
        System.out.println("水果数组:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println((i + 1) + ". " + fruits[i]);
        }
        System.out.println();
        
        // 4. 数组操作 / Array operations
        System.out.println("4. 数组操作 / Array Operations:");
        
        int[] scores = {85, 92, 78, 96, 88};
        
        // 找最大值
        int max = scores[0];
        for (int score : scores) {
            if (score > max) {
                max = score;
            }
        }
        System.out.println("最高分: " + max);
        
        // 找最小值
        int min = scores[0];
        for (int score : scores) {
            if (score < min) {
                min = score;
            }
        }
        System.out.println("最低分: " + min);
        
        // 计算平均值
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        double average = (double) sum / scores.length;
        System.out.println("平均分: " + average);
        System.out.println();
        
        // 5. 数组排序 / Array sorting
        System.out.println("5. 数组排序 / Array Sorting:");
        
        int[] unsorted = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("排序前:");
        printArray(unsorted);
        
        // 冒泡排序
        bubbleSort(unsorted);
        System.out.println("冒泡排序后:");
        printArray(unsorted);
        
        // 使用Java内置排序
        int[] numbers = {5, 2, 8, 1, 9, 3};
        System.out.println("使用Java内置排序前:");
        printArray(numbers);
        java.util.Arrays.sort(numbers);
        System.out.println("Java内置排序后:");
        printArray(numbers);
        System.out.println();
        
        // 6. 二维数组 / 2D Arrays
        System.out.println("6. 二维数组 / 2D Arrays:");
        
        // 创建3x3的二维数组
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("3x3矩阵:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        
        // 不规则二维数组
        int[][] irregular = {
            {1, 2},
            {3, 4, 5},
            {6, 7, 8, 9}
        };
        
        System.out.println("不规则二维数组:");
        for (int i = 0; i < irregular.length; i++) {
            for (int j = 0; j < irregular[i].length; j++) {
                System.out.print(irregular[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        // 7. 数组搜索 / Array searching
        System.out.println("7. 数组搜索 / Array Searching:");
        
        int[] searchArray = {10, 23, 45, 67, 89, 123, 456};
        int target = 67;
        
        // 线性搜索
        int linearResult = linearSearch(searchArray, target);
        if (linearResult != -1) {
            System.out.println("线性搜索: 在索引 " + linearResult + " 找到 " + target);
        } else {
            System.out.println("线性搜索: 未找到 " + target);
        }
        
        // 二分搜索（数组必须已排序）
        int binaryResult = binarySearch(searchArray, target);
        if (binaryResult != -1) {
            System.out.println("二分搜索: 在索引 " + binaryResult + " 找到 " + target);
        } else {
            System.out.println("二分搜索: 未找到 " + target);
        }
        System.out.println();
        
        // 8. 数组复制 / Array copying
        System.out.println("8. 数组复制 / Array Copying:");
        
        int[] original = {1, 2, 3, 4, 5};
        
        // 方法1：使用循环复制
        int[] copy1 = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copy1[i] = original[i];
        }
        
        // 方法2：使用System.arraycopy
        int[] copy2 = new int[original.length];
        System.arraycopy(original, 0, copy2, 0, original.length);
        
        // 方法3：使用Arrays.copyOf
        int[] copy3 = java.util.Arrays.copyOf(original, original.length);
        
        System.out.println("原数组: ");
        printArray(original);
        System.out.println("复制数组1: ");
        printArray(copy1);
        System.out.println("复制数组2: ");
        printArray(copy2);
        System.out.println("复制数组3: ");
        printArray(copy3);
        System.out.println();
        
        // 9. 数组常见错误 / Common array errors
        System.out.println("9. 数组常见错误提醒 / Common Array Errors:");
        System.out.println("- 数组越界: 访问超出数组长度的索引");
        System.out.println("- 空指针: 使用未初始化的数组引用");
        System.out.println("- 长度混淆: 数组长度是length属性，不是length()方法");
        
        // 演示数组越界错误（注释掉避免程序崩溃）
        // System.out.println(numbers[100]); // 这会抛出ArrayIndexOutOfBoundsException
    }
    
    /**
     * 打印数组
     */
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    
    /**
     * 冒泡排序
     */
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交换元素
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    /**
     * 线性搜索
     */
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
    /**
     * 二分搜索（数组必须已排序）
     */
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                return mid;
            }
            
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1;
    }
}