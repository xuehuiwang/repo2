package com.wang.InterviewTest;
/*

 */
public class Demo05 {
    static int s;
    int i;
    int j;
    {
        int i = 1;
        i++;
        j++;
        s++;
    }
    public void test(int j){
        j++;
        i++;
        s++;
    }

    public static void main(String[] args) {
        Demo05 obj1 = new Demo05();
        Demo05 obj2 = new Demo05();
        obj1.test(10);
        obj1.test(20);
        obj2.test(30);
        System.out.println(obj1.i+","+obj1.j+","+obj1.s);
        System.out.println(obj2.i+","+obj2.j+","+obj2.s);
    }
}
