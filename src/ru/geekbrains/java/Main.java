package ru.geekbrains.java;

import java.util.Arrays;

public class Main {

    public static void maxAndMinArray() {
        int[] arr = {5, 10, 15, 20, 18, 3};
        int min = arr[0];
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
            System.out.println("Миниимальное число = " + min);
            System.out.println("Максимальное число = " + max);
    }
    public static boolean checkBalance() {
        int[] arrB = { 6, 10, 15, 20, 11};
        int sum = 0;
        for (int i = 0; i < arrB.length; i++) {
        sum += arrB[i];
        } System.out.println("Sum = " + sum);
        if (sum % 2 != 0) {
            return false;
        }
        int sumLeft = 0;
        int i = 0;
        while (sumLeft < sum / 2) {
            sumLeft += arrB[i];
            i++;
        }
        return true;
    }

    public static int[] shiftArr(int[] intArr, int n){
            int k = n % intArr.length + intArr.length; //взял из объяснения на сл. уроке. У меня только для положительного было.
            for (int i=0; i < k; i++) {
                int temp = intArr[intArr.length - 1];
                for (int count = intArr.length -1; count > 0; count--) {
                   intArr[count] = intArr[count - 1];

                }
                intArr[0] = temp;
            }
            return intArr;
        }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }System.out.println(Arrays.toString(arr));

        int[] arrOdd = new int[8];
        for (int i = 0; i < arrOdd.length; i++) {
            arrOdd[i] = i * 3;
        }System.out.println(Arrays.toString(arrOdd));

        int[] arrM = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arrM.length; i++) {
            if (arrM[i] < 6) {
                arrM[i] *= 2;
            }
        }System.out.println(Arrays.toString(arrM));

       int n = 9;
            int[][] dArr = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(i==j || i+j == n-1){
                        dArr [i][j] = 1;
                    }System.out.print(dArr[i][j] + " ");
                }System.out.println();
        }

        maxAndMinArray();
        System.out.println(checkBalance());

        int [] testArr = shiftArr(new int[]{1, 2, 3, 5, 4}, 1);
        for(int i=0; i< testArr.length; i++ )
        {
            System.out.print(testArr[i] + " ");
        }
    }
}
