package Lesson15.enum_primer;

public class Test {
    enum Length{
        KM("Километр",1000),
        M("Метр", 1),
        DM("Децеметры", 0.1),
        CM("Сантиметры",0.01),
        MM("Милиметры", 0.001);

        String name;
        double d;

        Length(String name, double d) {
            this.name = name;
            this.d = d;
        }

        @Override
        public String toString() {
            return name;
        }
        double coefficient (Length inp){
            return d / inp.d;
        }

    }

    public static void main(String[] args) {
       for(Length l1 : Length.values()){
           for(Length  l2 : Length.values()){
               if (l1 != l2)
               System.out.println("1 " + l1 + " = " + l1.coefficient(l2) + " " + l2);
           }
           System.out.println();
       }

    }
}