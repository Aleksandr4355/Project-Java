package Lesson16;

public class Test5 {
    public static void main(String[] args) {
       try{
           computer(1);
           computer(20);
       }catch (NewException e){
           System.out.println("Перехваченное исключение. " + e);
       }
    }

    public static void computer(int a) throws NewException{
        System.out.println("Вызываем метод computer(" + a + ")");
        if (a > 10){
            throw  new NewException(a, "Некорректное значение");
        }else {
            System.out.println("Норм значение");
        }
    }
}

class NewException extends Exception {
    private int detail;

    public NewException(int detail, String message) {
        super(message);
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "NewException{" +
                "detail=" + detail +
                ", message= " + getMessage() +
                "}";
    }
}