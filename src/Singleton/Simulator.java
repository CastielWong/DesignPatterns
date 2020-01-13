package Singleton;

public class Simulator {

    public static void main(String[] args) {
        Singleton.classic.Singleton singleton_classic = Singleton.classic.Singleton.getInstance();
        System.out.println(singleton_classic.getNote());

        Singleton.ts.Singleton singleton_thread_safe = Singleton.ts.Singleton.getInstance();
        System.out.println(singleton_thread_safe.getNote());

        Singleton.eagerly.Singleton singleton_eagerly = Singleton.eagerly.Singleton.getInstance();
        System.out.println(singleton_eagerly.getNote());

        Singleton.dcl.Singleton singleton_double_checked_locking = Singleton.dcl.Singleton.getInstance();
        System.out.println(singleton_double_checked_locking.getNote());
    }

}
