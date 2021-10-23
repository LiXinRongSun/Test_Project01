package indio.lixinrong.javabasics.test06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 数组的排序方法
 */
public class SortTest {
    public static void main(String[] args) {
        short s=1;
        
        s+=1;
        s+=1;
        System.out.println(s);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("选择排序");
        //Sort01(arr);
        System.out.println("-------------------------------");
        System.out.println("冒泡排序");
        Sort02(arr);
        System.out.println("优化后的冒泡排序");

        System.out.println("--------------------------------");
        System.out.println("插入排序");
        Sort03(arr);
        System.out.println("----------------------------------");
        System.out.println("希尔排序");
        Sort05(arr);
        System.out.println("归并排序while循环");
        Sort06(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
        System.out.println("----------------------------------");
        System.out.println("归并排序for循环");
        Sort07(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

        System.out.println(fib(1, 1, 5));
    }

    public static void Sort01(int[] arr) {

        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            System.out.println(Arrays.toString(arr));
            System.out.println("--------------------");
        }
    }
    /*
    *从第一个开始对i+1个数组进行排序
    *优化前冒泡排序过程中每次都从数组第一个开始对比
    *优化后从数组后面最后一个向前排；
    */

    public static void Sort02(int[] arr) {
       int sum01=0;
       int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag=true;
            for (int j = 0; j < arr.length - 1-i; j++) {
                   sum01++;
                   if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag=false;
                }

            }
            if(flag){
                break;
            }

            System.out.println(Arrays.toString(arr));
        }
        System.out.println(sum01);
        System.out.println("------------------------");
        int temp02;
        int sum=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j>=0;j--){
                sum++;
                if(arr[j+1]>=arr[j]){
                    break;
                }else{
                    temp02 =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp02;

                }
                
            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(sum);
    }

    public static void Sort03(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] >= arr[j - 1]) {
                    break;
                }
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }

                System.out.println(Arrays.toString(arr));
            }
        }
    }

    public static void Sort04(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap = gap / 2) {
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                int temp = arr[i];
                while (j - gap >= 0 && arr[j] < arr[j - gap]) {
                    arr[j] = arr[j - gap];
                    j = j - gap;
                }
                arr[j] = temp;
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void Sort05(int[] arr) {
        int temp;
        for (int i = arr.length / 2; i > 0; i = i / 2) {
            for (int j = i; j < arr.length; j++) {
                int k = j;
                while (k - i >= 0 && arr[k] < arr[k - i]) {
                    temp = arr[k];
                    arr[k] = arr[k - i];
                    arr[k - i] = temp;
                    k = k - i;

                }

                System.out.println(Arrays.toString(arr));
            }
            // System.out.println(Arrays.toString(arr));

        }

    }

    public static void Sort06(int[] arr, int low, int end) {
        if (low >= end)
            return;

        int cen = (low + end) / 2;
        Sort06(arr, low, cen);// 对数组左边递归
        Sort06(arr, cen + 1, end);// 对数组右边递归
        merge(arr, low, cen, end);// 合并数组
    }

    public static void merge(int[] arr, int low, int cen, int end) {
        int[] temp = new int[end - low + 1];
        int i = low;
        int j = cen + 1;
        int k = 0;
        int sum = 0;
        while (i <= cen && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i];
                i++;
            } else {
                temp[k++] = arr[j];
                j++;
            }
            sum = i;
        }
        for (int c = sum; c <= cen; c++) {
            temp[k++] = arr[c];

        }
        for (int h = 0; h < k; h++) {
            arr[low + h] = temp[h];

        }
    }

    public static void Sort07(int[] arr, int low, int end) {
        if (low >= end) {
            return;
        }
        int cen = (low + end) / 2;
        Sort07(arr, low, cen);
        Sort07(arr, cen + 1, end);
        measage(arr, low, cen, end);
    }

    public static void measage(int[] arr, int low, int cen, int end) {
        int[] temp = new int[end - low + 1];
        int cen1 = cen;

        int k = 0;
        int sum = 0;
        outer: for (int i = low; i <= cen; i++) {
            for (int j = cen1 + 1; j <= end; j++) {
                if (arr[i] <= arr[j]) {
                    temp[k++] = arr[i];
                    sum = i + 1;
                    break;
                } else {
                    temp[k++] = arr[j];
                    cen1++;
                    if (cen1 + 1 > end) {
                        sum = i;
                        break outer;
                    }
                }

            }
        }
        for (int c = sum; c <= cen; c++) {
            temp[k++] = arr[c];
        }

        for (int h = 0; h < k; h++) {
            arr[low + h] = temp[h];
        }

    }
    /*
    *优化后得斐波那契数列
    */
    public static int fib(int first, int second, int n) {

        if (n > 0) {
            if (n == 1) {

                return first;
            } else if (n == 2) {
                return second;
            } else if (n == 3) {

                return first + second;

            }
            return fib(second, first + second, n - 1);//递归方法斐波那契数列的从第一项为1，第二项为1的第n项（1,1,n）等于 第一项为n-2第二项为n-1的第三项(n-2,n-1,3)
        }

        return -1;

    }

    /*
     * @description 使用数组存储斐波拉且数列
     * 
     * @param n
     * 
     * @return
     */
    public static int FibArray(int n) {
        if (n > 0) {
            int[] arr = new int[n];
            arr[0] = arr[1] = 1;
            for (int i = 2; i < n; i++) {

                arr[i] = arr[i - 1] + arr[i - 2];

            }
            return arr[n - 1];
        }
        return -1;

    }

}