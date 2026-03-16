class SimpleStudent {
    int id;
    String name;
    static final String COLLEGE = "SJU";

    SimpleStudent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void show() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("College: " + COLLEGE);
    }
}

public class java1 {
    public static void main(String[] args) {
        SimpleStudent s1 = new SimpleStudent(1, "Anthony");
        SimpleStudent s2 = new SimpleStudent(2, "Robin");

        SimpleStudent ref;
        ref = s1;

        ref.show();
        System.out.println();
        s2.show();
    }
}
