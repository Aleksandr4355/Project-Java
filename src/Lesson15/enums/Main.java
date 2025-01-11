package Lesson15.enums;

enum Seasons {
    WINTER ("Зима"), SUMMER("Лето"), SPRING, AUTUMN;

    private String title;

    Seasons() {
    }

    Seasons(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Seasons{" +
                "title='" + title + '\'' + '}';
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Seasons.WINTER);
        System.out.println(Seasons.values());
        System.out.println(Seasons.values().length); // возрщает количество созданых элементов в Seasons
        for(Seasons s : Seasons.values()){
            System.out.println(s);
            System.out.println(s.name()); // возращает название переменных
        }
        int ind = Seasons.SUMMER.ordinal();
        int ind1 = Seasons.AUTUMN.ordinal();
        System.out.println(ind);
        System.out.println(ind1);

        Seasons arg = Seasons.SPRING;

        switch (arg){
            case WINTER -> System.out.println("Зима");
            case SUMMER -> System.out.println("Лето");
            case SPRING -> System.out.println("Весна");
            case AUTUMN -> System.out.println("Осень");
        }
    }
}
