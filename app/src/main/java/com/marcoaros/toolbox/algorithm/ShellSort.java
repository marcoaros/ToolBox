package com.marcoaros.toolbox.algorithm;

import com.marcoaros.toolbox.R;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 　4）希尔排序（插入排序变种版）
 *
 * 　　a、基本上和插入排序一样的道理
 *
 * 　　b、不一样的地方在于，每次循环的步长，通过减半的方式来实现
 *
 * 　　c、说明：基本原理和插入排序类似，不一样的地方在于。通过间隔多个数据来进行插入排序。
 *
 * 　　d、代码实现
 *
 *    https://img2018.cnblogs.com/blog/1031841/201905/1031841-20190531173525064-1872058533.gif
 */
public class ShellSort {

    public static void main(String[] args) {

//        int res = R.drawable.shellsort;

        int arr[] = {9, 8, 7, 5, 6, 4, 3, 1, 2, 0};

        //希尔排序（插入排序变种版）
        for (int step = arr.length / 2; step > 0; step /= 2) {
            System.out.println("\nstep="+step+"");
            //i层循环控制步长
            for (int j = step; j < arr.length; j++) {
                System.out.println("  j="+j+"");
                //j控制无序端的起始位置
                for (int k = j; k > 0  && k - step >= 0; k -= step) {
                    System.out.println("    k="+k+"");
                    if (arr[k] < arr[k - step]) {
                        int temp = arr[k - step];
                        arr[k - step] = arr[k];
                        arr[k] = temp;                    
                        System.out.println("step="+step+" " + "j="+j+" " + "k="+k+" " + Arrays.toString(arr));
                    } else {
                        System.out.println("break step="+step+" " + "j="+j+" " + "k="+k+" " + Arrays.toString(arr));
                        break;
                    }
                }
//                System.out.println(Arrays.toString(arr));
            }
            //j,k为插入排序，不过步长为i
        }

//        System.out.println(Arrays.toString(arr)+"\n");
    }

}
