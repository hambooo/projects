package com.hambo;

public class HelloGit {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
            //克隆的项目
        }
        test();
    }

    public static void test(){
        System.out.println("Git是分布式版本控制系统~");
        System.out.println("修改1.0");
    }

}
