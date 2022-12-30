package singletonpattern;

public class SingletonEager {

    private static  SingletonEager singletonEagerInstance = new SingletonEager();

    private SingletonEager() {

    }

    public static synchronized SingletonEager getInstance() {
        return singletonEagerInstance;
    }
}
