package Singleton.dcl;

public class Singleton {

    private volatile static Singleton uniqueInstance;
    private String note;

    private Singleton() {
        this.note = "This is the double-checked locking Singleton.";
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    public String getNote() {
        return this.note;
    }

}
