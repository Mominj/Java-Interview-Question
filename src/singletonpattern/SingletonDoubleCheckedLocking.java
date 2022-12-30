package singletonpattern;

public class SingletonDoubleCheckedLocking {

    private static  SingletonDoubleCheckedLocking singletonDoubleCheckedLockingInstance = null;

    private SingletonDoubleCheckedLocking() {

    }

    public static  SingletonDoubleCheckedLocking getInstance() {
        if(singletonDoubleCheckedLockingInstance == null) {
            synchronized (SingletonDoubleCheckedLocking.class) {
                singletonDoubleCheckedLockingInstance  = new SingletonDoubleCheckedLocking();
            }
        }
        return singletonDoubleCheckedLockingInstance;
    }
}
