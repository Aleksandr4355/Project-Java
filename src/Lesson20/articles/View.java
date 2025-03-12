package Lesson20.articles;

import java.util.*;

public class View {
    Scanner scan = new Scanner(System.in);


    public String waitUserAnswer(){
        System.out.println("============ Ввод пользовательских данных ============");
        System.out.println("Действия со статьми: ");
        System.out.println("1 - Создание статьи\n2 - Просмотр статей" + "\n3 - посмотреть определеной статьи "+ "4 - удаление статьи" + "\nq - выход из программы");
        System.out.print("Выбирите вариант действия: ");
        String userAnswer = scan.nextLine();
        System.out.println("======================================================");
        return userAnswer;
    }

    public Map addUserArticle(){
        LinkedHashMap<String, String>dictArticle = new LinkedHashMap<>();
        dictArticle.put("название", "");
        dictArticle.put("автор", "");
        dictArticle.put("кол-во страниц", "");
        dictArticle.put("описание", "");
        System.out.println("============ Создание статьи ============");
        for(var el : dictArticle.entrySet()){
            System.out.print("Введите " + el.getKey() + " статьи: ");
            dictArticle.put(el.getKey(), scan.nextLine());
        }
        System.out.println("======================================================");
        return dictArticle;
    }
    public void showAllArticles(Collection articles){
        System.out.println("============ Список статей ============");
        for(var element : articles){
            System.out.println(element);
        }
        System.out.println("=======================================");
    }

    public String getUserArticle(){
        System.out.println("============ Ввод названия статьи ============");
        System.out.print("-> ");
        String user_article = scan.nextLine();
        System.out.println("=======================================");
        return user_article;
    }

    public void showSingleArticles(Map article){
        System.out.println("============ Просмотр статьи ============");
        for(Object el : article.entrySet()){
            System.out.println(el);
        }
        System.out.println("=======================================");
    }


    public void showIncorreectTitleError(String userTitle) {
        System.out.println("============ Просмотр статьи ============");
        System.out.println("Статьи с название " + userTitle + " статьи не существует");
        System.out.println("=======================================");
    }

    public void removeSingleArticle(Article article){
        System.out.println("============ Удаление статьи ============");
        System.out.println("Статьи с название " + article + " статьи не существует");
        System.out.println("=======================================");
    }
    public void showIncorreectTitleErro(String userTitle) {
        System.out.println("============ ошибка ============");
        System.out.println("Вариант " + userTitle + " статьи не существует");
        System.out.println("=======================================");
    }
}
