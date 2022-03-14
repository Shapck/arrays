package ru.skypro;

public class Main {

    public static void main(String[] args) {
    task1();
    }


    public static void task1(){
        int [] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        System.out.println(" ");

        for (int i = 2; i >= 0; i--) {
            System.out.println(array1[i]);
        }

        System.out.println(" ");

        for (int i = 0; i < array1.length; i++) {
            if(array1[i] % 2 != 0){
                array1[i] += 1;
            }
            System.out.println(array1[i]);
        }

        System.out.println(" ");

        float [] array2 = {1.57f, 7.654f, 9.986f};
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        System.out.println(" ");

        for (int i = 2; i >= 0; i--) {
            System.out.println(array2[i]);
        }

        System.out.println(" ");

        int [] array3 = new int[10];
        for(int i = 0; i < array3.length; i++){
            array3[i] += i;
            System.out.println(array3[i]);
        }

        System.out.println(" ");

        for(int i = 9; i >= 0; i--){
            System.out.println(array3[i]);
        }

    }



}
