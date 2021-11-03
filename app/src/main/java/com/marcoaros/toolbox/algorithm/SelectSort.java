package com.marcoaros.toolbox.algorithm;

/**
 * 2）选择排序
 *
 * 　　a、将第一个值看成最小值
 *
 * 　　b、然后和后续的比较找出最小值和下标
 *
 * 　　c、交换本次遍历的起始值和最小值
 *
 * 　　d、说明：每次遍历的时候，将前面找出的最小值，看成一个有序的列表，后面的看成无序的列表，然后每次遍历无序列表找出最小值。
 *
 * 　　e、代码实现
 *
 *     https://img2018.cnblogs.com/blog/1031841/201905/1031841-20190531170205821-1983678643.gif
 */
public class SelectSort {

    public static void main(String[] args) {

        int arr[] = {6, 5, 3, 2, 4};

        //选择
        for (int i = 0; i < arr.length; i++) {
            //默认第一个是最小的。
            int min = arr[i];
            //记录最小的下标
            int index = i;
            //通过与后面的数据进行比较得出，最小值和下标
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    index = j;
                }
            }
            //然后将最小值与本次循环的，开始值交换
            int temp = arr[i];
            arr[i] = min;
            arr[index] = temp;
            //说明：将i前面的数据看成一个排好的队列，i后面的看成一个无序队列。每次只需要找无需的最小值，做替换
        }
    }
}
