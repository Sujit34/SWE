package com.cs425;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 3 },
                { 0 },
                { 4, 5, 9 }
        };

        var arrayFlattener = new ArrayFlattener();
        var array = arrayFlattener.flattenArray(arr);

        for (int j : array) System.out.println(j);

    }
}