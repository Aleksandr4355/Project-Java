package Lesson10;

public class Sample {
    public static void main(String[] args) {
        Outer out = new Outer("внешний");
        System.out.println(out.name);
        System.out.println(out.inner.innerName);
        System.out.println(Outer.Inner.age);
        Outer.Inner.info(); // обращение к статическому методу класса
        out.inner.func(); // обращаемся к не статическому методу класса

    }
}

class Outer {
    String name;
    Inner inner; // обявили перемменую

    public Outer(String name) {
        this.name = name;
        inner = new Inner("внутрений"); // создали экземпляр класса
    }

    class Inner {
        static int age;
        String innerName;

        static {
            age = 18;
        }

        public Inner(String innerName) {
            this.innerName = innerName;
        }

        public static void info() {
            System.out.println("Статический метод");
        }

        public void func() {
            System.out.println("Метод во вложенном классе");
        }
    }
}
