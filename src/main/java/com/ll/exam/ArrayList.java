package com.ll.exam;


import java.util.Arrays;

public class ArrayList {
    private int size;
    private int [] datas;
    public ArrayList() {
        size =0;
        datas = new int[2];
    }

    public int size() {
        return size;
    }

    void add(int data) {
        if(isFull())
            datas = Arrays.copyOf(datas, datas.length *2);
        size++;
        datas[size-1] = data;
    }

    private boolean isFull() {
        return size == datas.length;
    }

    public int get(int index) {
        return datas[index];
    }

    public void removeAt(int i) {
        for(int n = i;i<size-1;i++){
            datas[n] = datas[n+1];
        }
        size--;
    }

    public int getArrayLength() {
        return datas.length;
    }

    public void showAllValues() {
        System.out.println("== 전체 데이터 출력 ==");

        for ( int i = 0; i < size; i++ ) {
            System.out.printf("%d : %d\n", i, datas[i]);
        }
    }
}
