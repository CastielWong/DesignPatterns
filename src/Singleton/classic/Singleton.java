package Singleton.classic;

public class Singleton {

    private static Singleton uniqueInstance;
    private String note;

    private Singleton() {
        this.note = "This is the classic Singleton.";
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public String getNote() {
        return this.note;
    }

}
