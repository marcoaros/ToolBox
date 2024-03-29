package com.marcoaros.toolbox.algorithm;

import java.util.Arrays;

/**
 *  　　6）归并排序
 *
 * 　　a、将列表按照对等的方式进行拆分
 *
 * 　　b、拆分小最小快的时候，在将最小块按照原来的拆分，进行合并
 *
 * 　　c、合并的时候，通过左右两块的左边开始比较大小。小的数据放入新的块中
 *
 * 　　d、说明：简单一点就是先对半拆成最小单位，然后将两半数据合并成一个有序的列表。
 *
 * 　　e、代码实现
 *
 *    https://img2018.cnblogs.com/blog/1031841/201905/1031841-20190531183629096-1231847157.gif
 */
public class MergeSort {
    public static void main(String[] args) {

        int arr[] = {7, 5, 3, 2, 4, 1, 6};

        //归并排序
        int start = 0;
        int end = arr.length - 1;
        mergeSort(arr, start, end);
    }

    public static void mergeSort(int[] arr, int start, int end) {
        System.out.println("start from "+start+" to "+end+": "+Arrays.toString(arr));

        //判断拆分的不为最小单位
        if (end - start > 0) {
            //再一次拆分，直到拆成一个一个的数据
            mergeSort(arr, start, (start + end) / 2);
            mergeSort(arr, (start + end) / 2 + 1, end);
            //记录开始/结束位置
            int left = start;
            int right = (start + end) / 2 + 1;
            //记录每个小单位的排序结果
            int index = 0;
            int[] result = new int[end - start + 1];
            //如果查分后的两块数据，都还存在
            System.out.println("1 left "+left+" right "+right+" " + "start from "+start+" to "+end);
            while (left <= (start + end) / 2 && right <= end) {
                System.out.println("2 left "+left+" right "+right+" " + "start from "+start+" to "+end);
                //比较两块数据的大小，然后赋值，并且移动下标
                if (arr[left] <= arr[right]) {
                    result[index] = arr[left];
                    System.out.println("result["+index+"] = "+arr[left]);
                    left++;
                } else {
                    result[index] = arr[right];
                    System.out.println("result["+index+"] = "+arr[right]);
                    right++;
                }
                //移动单位记录的下标
                index++;
            }
            System.out.println("3 left "+left+" right "+right+" " + "start from "+start+" to "+end);
            //当某一块数据不存在了时
            while (left <= (start + end) / 2 || right <= end) {
                System.out.println("4 left "+left+" right "+right+" " + "start from "+start+" to "+end);
                //直接赋值到记录下标
                if (left <= (start + end) / 2) {
                    result[index] = arr[left];
                    System.out.println("result["+index+"] = "+arr[left]);
                    left++;
                } else {
                    result[index] = arr[right];
                    System.out.println("result["+index+"] = "+arr[right]);
                    right++;
                }
                index++;
            }
            System.out.println("5 left "+left+" right "+right+" " + "start from "+start+" to "+end);
            //最后将新的数据赋值给原来的列表，并且是对应分块后的下标。
            for (int i = start; i <= end; i++) {
                arr[i] = result[i - start];
            }
        }
        System.out.println("finish from "+start+" to "+end+": "+Arrays.toString(arr));
    }
}
