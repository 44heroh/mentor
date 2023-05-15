package com.company.leetcode.problems.rotateImage;

import java.util.Arrays;

public class Solution {

    /**
     * 48. Rotate Image https://leetcode.com/problems/rotate-image/
     * @param matrix
     */
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++){
            for (int j = i; j < matrix[i].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length / 2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - j - 1];
                matrix[i][matrix.length - j - 1] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
    public void rotate2(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.println("i = " + i);
                System.out.println("j = " + i);
                System.out.println("matrix[" + i +"][" + j + "] = " + matrix[i][j]);
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }

        System.out.println();
        System.out.println("_________________________________");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length / 2; j++){
                System.out.println("i = " + i);
                System.out.println("j = " + i);
                System.out.println("matrix[" + i +"][" + j + "] = " + matrix[i][j]);
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - j - 1];
                matrix[i][matrix.length - j - 1] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public void rotate90Right(int[][] matrix) {

        int[][] result = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                result[j][matrix.length - i - 1] = matrix[i][j];
            }
        }
        System.out.println();
        for (int i = 0; i < result.length; i++){
            System.out.println(Arrays.toString(result[i]));
        }
    }

    public void rotate180X(int[][] matrix) {

        int[][] result = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                result[matrix.length - i - 1][j] = matrix[i][j];
            }
        }
        System.out.println();
        for (int i = 0; i < result.length; i++){
            System.out.println(Arrays.toString(result[i]));
        }
    }

    public void rotate180Y(int[][] matrix) {

        int[][] result = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                result[i][matrix.length - j - 1] = matrix[i][j];
            }
        }

        System.out.println();
        for (int i = 0; i < result.length; i++){
            System.out.println(Arrays.toString(result[i]));
        }
    }

    public void rotate90Left(int[][] matrix) {

        int[][] result = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                result[matrix.length - j - 1][i] = matrix[i][j];
            }
        }

        System.out.println();
        for (int i = 0; i < result.length; i++){
            System.out.println(Arrays.toString(result[i]));
        }
    }

    public void rotate1(int[][] matrix) {

        int[][] result = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                result[j][matrix.length - i - 1] = matrix[i][j];
            }
        }

        for (int i = 0; i < result.length; i++){
            System.out.println(Arrays.toString(result[i]));
        }
    }
}
