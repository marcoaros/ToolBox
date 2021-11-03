package com.marcoaros.toolbox.algorithm;

/**
 * 　　　　1）冒泡排序
 *
 * 　　a、冒泡排序，是通过每一次遍历获取最大/最小值
 *
 * 　　b、将最大值/最小值放在尾部/头部
 *
 * 　　c、然后除开最大值/最小值，剩下的数据在进行遍历获取最大/最小值
 *
 * 　　d、代码实现
 *
 *    https://img2018.cnblogs.com/blog/1031841/201905/1031841-20190531163708186-1703601448.gif
 */
public class BubbleSort {

    public static void main(String[] args) {

        int arr[] = {8, 5, 3, 2, 4};

        //冒泡
        for (int i = 0; i < arr.length; i++) {
            //外层循环，遍历次数
            for (int j = 0; j < arr.length - i - 1; j++) {
                //内层循环，升序（如果前一个值比后一个值大，则交换）
                //内层循环一次，获取一个最大值
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
