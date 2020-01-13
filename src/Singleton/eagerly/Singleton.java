package Singleton.eagerly;

public class Singleton {

    private static Singleton uniqueInstance = new Singleton();
    private String note;

    private Singleton() {
        this.note = "This is the eagerly Singleton.";
    }

    public static Singleton getInstance() {
        return uniqueInstance;
    }

    public String getNote() {
        return this.note;
    }
}
