package com.ohgiraffers.section01.array;

public class Test {

    public static void main(String[] args) {

        int[] rom ;     //stack상에 주소를 넣을 공간을 만든것

        rom = new int[4]; // heap 상에 4칸짜리 박스의 주소를 할당

        rom[0]=11;   //상자 첫번째 칸에 11 초기화
        rom[1]=12;
        rom[2]=13;
        rom[3]=14;
//        rom[4]=15;

        System.out.println(rom[3]);
    }
}
