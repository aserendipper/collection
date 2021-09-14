package com.aserendipper.demo.suanfa;

public class TakeStep {
    static final int s = 3; //自定义的台阶数

    static int compute(int stair){
        if ( stair <= 0){
            return 0;
        }
        if (stair == 1){
            return 1;
        }
        if (stair == 2){
            return 2;
        }
        return compute(stair-1) + compute(stair-2);
    }

    public static void main(String args[]) {
        //System.out.println("共有" + compute(10) + "种走法");
        System.out.println("共有" + count(100) + "种走法");
    }

    public static int count(int stair) {
        int first = 1;
        int second = 1;
        int sum = 1;
        for (int i = 2; i <= stair; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }
        return sum;
    }
}
