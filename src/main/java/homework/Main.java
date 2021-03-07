package homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//А нужно все это тестировать в мейне или нет?
        tester();
    }

    public static <T> void changer (T arr[], int firstEl, int secondEl){
        System.out.println(arr);
        T changeEl;
        changeEl = arr[firstEl];
        arr[firstEl] = arr[secondEl];
        arr[secondEl] = changeEl;
        System.out.println(arr);
    }

    public static <T> ArrayList refactorer(T arr[]){
        ArrayList<T> ArList =new ArrayList<>(Arrays.asList(arr));
        return ArList;
    }
    public static void tester(){
        //Первое задание
        Integer[] arr = new Integer[]{523,6632,43434,666,2};
        changer(arr, 2,4);

        //Второе задание
        refactorer(arr);
    }
}
