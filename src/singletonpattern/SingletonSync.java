package singletonpattern;

public class SingletonSync {
    private static  SingletonSync singletonSyncInstance;

    private SingletonSync() {

    }

    public static synchronized SingletonSync getInstance() {
        if(singletonSyncInstance == null) {
            singletonSyncInstance = new SingletonSync();
        }
        return singletonSyncInstance;
    }

}
