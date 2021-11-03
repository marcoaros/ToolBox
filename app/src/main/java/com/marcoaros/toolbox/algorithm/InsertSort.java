package com.marcoaros.toolbox.algorithm;

/**
 * 　　3）插入排序
 *
 * 　　a、默认从第二个数据开始比较。
 *
 * 　　b、如果第二个数据比第一个小，则交换。然后在用第三个数据比较，如果比前面小，则插入（狡猾）。否则，退出循环
 *
 * 　　c、说明：默认将第一数据看成有序列表，后面无序的列表循环每一个数据，如果比前面的数据小则插入（交换）。否则退出。
 *
 * 　　d、代码实现
 *
 *     https://img2018.cnblogs.com/blog/1031841/201905/1031841-20190531170953283-1806153331.gif
 */
public class InsertSort {

    public static void main(String[] args) {

        int arr[] = {7, 5, 3, 2, 4};

        //插入排序
        for (int i = 1; i < arr.length; i++) {
            //外层循环，从第二个开始比较
            for (int j = i; j > 0; j--) {
                //内存循环，与前面排好序的数据比较，如果后面的数据小于前面的则交换
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                } else {
                    //如果不小于，说明插入完毕，退出内层循环
                    break;
                }
            }
        }
    }
}
