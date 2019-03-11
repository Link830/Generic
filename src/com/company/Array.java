package com.company;

public class Array<T> {
    T[] myArray;

    public Array(T[] arr) {
        myArray = (T[]) new Object[arr.length];
        for (int i = 0; i < arr.length; i++) { //заполняем массив
            myArray[i] = arr[i];
        }

        System.out.print("1) Исходный массив: ");
        int n = 0;
        for (T x : myArray){ //выводим массив в том виде, в котором он задан
            System.out.print(n + " = " + x.toString() + "; ");
            n = n + 1;
        }

        System.out.println();
        System.out.print("2) Два элемента поменяны местами: ");
        T tmp = myArray[arr.length-1]; //меняем местами элементы массива
        myArray[arr.length-1] = myArray[0];
        myArray[0] = tmp;
        int m = 0;
        for (T x : myArray){
            System.out.print(x.toString() + "; ");
            m = m + 1;
        }

        System.out.println();
        System.out.print("3) Перевернутый массив: ");
        for (int k = myArray.length - 1; k >= 0; --k) { //выводим массив, в котором элементы поменяны местами, задом наперед
            System.out.print(myArray[k] + "; ");
        }
    }
}