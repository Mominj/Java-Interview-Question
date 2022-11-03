package com.company.singletonpattern;

public class SingletonMain {

    public static void main(String[] args) {
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();


        System.out.println(singletonLazy1.hashCode());
        System.out.println(singletonLazy.hashCode());

        //syncro

        //eager

        SingletonEager singletonEager = SingletonEager.getInstance();
        SingletonEager singletonEager1= SingletonEager.getInstance();

        System.out.println(singletonEager1.hashCode());
        System.out.println(singletonEager.hashCode());

        //double checked locking



    }

}
