package com.homework.q13;

public class NumberTriangle {

    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(((i+j)%2)+" ");
            }
            System.out.print("\n");
        }

}
    
}
