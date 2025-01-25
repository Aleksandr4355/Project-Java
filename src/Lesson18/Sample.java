package Lesson18;
interface Converter <F, T>{
    T convert(F from);
}
public class Sample {
    public static void main(String[] args) {
//        Converter<String, Integer> converter = (from) -> Integer.valueOf(from); //parseInt(String s)
        Converter<String, Integer> converter =  Integer::valueOf; //
        Integer converted = converter.convert("123");
        System.out.println(converted);
    }
}
