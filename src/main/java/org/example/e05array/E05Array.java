package org.example.e05array;

import java.util.Arrays;

public class E05Array {
    public static void main(String[] args) {
        int[] arr = new int[3]; // 길이 3의 int 배열을 생성 및 초기화
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        int[] arr2 = {1, 2, 3};
        System.out.println(Arrays.toString(arr));

        // 배열의 복사
        int[] originArr = {1, 5, 9};
        int[] copyArr = originArr;
        copyArr[0] = 999;

        // System.arraycopy() 이용해서 깊은 복사
        int[] originArrSystem = {1, 2, 3};
        int[] copyArrSystem = new int[originArrSystem.length * 2];
        System.arraycopy(
                originArrSystem,
                0,
                copyArrSystem,
                0,
                originArrSystem.length
        );

        copyArrSystem[0] = 999;

        // Arrays.copyof() 이용해서 깊은 복사
        int[] originArrArrays = {1, 2, 3};
        int[] copyArrArrays = Arrays.copyOf(originArrArrays, originArrArrays.length);
        copyArrArrays[0] = 999;

        // 직접 구현
        int[] originFor = {1, 2, 3};
        int[] copyFor = new int[originFor.length * 2];

        int idx = 0;
        for (int val : originFor) {
            copyFor[idx] = val;
            idx++;
        }

        // 다차원 배열
        int[][] multiArr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        System.out.println(multiArr[1][1]);

        // 배열의 API
        int[] arr3 = {1, 2, 3};
        int[] arr4 = {1, 2, 3};

        // 배열의 길이
        System.out.println(arr3.length);

        // 배열이 같은지 비교
        System.out.println(Arrays.equals(arr3, arr4));

        // Arrays.deepEquals(arr1, arr2): 다차원 배열의 비교
        int[][] deepArr1 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] deepArr2 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println(Arrays.deepEquals(deepArr1, deepArr2));

        // Arrays.sort(arr): 배열의 정렬
        int[] sortArr = {2, 342, 425, 25, 26};
        Arrays.sort(sortArr);
        System.out.println(Arrays.toString(sortArr));
    }
}
