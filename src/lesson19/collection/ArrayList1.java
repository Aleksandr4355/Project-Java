package lesson19.collection;

import java.util.*;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("Валера");
        arrayList.add("Ирина");
        arrayList.add("Игорь");
        System.out.println(arrayList);

        ArrayList<String> arrayList2 = new ArrayList(20);
        arrayList2.add("Валера");
        arrayList2.add("Ирина");
        System.out.println(arrayList2);

        List<String> arrayList3 = new ArrayList(20);
        arrayList2.add("Валера");
        arrayList2.add("Ирина");
        System.out.println(arrayList3);

        List<String> arrayList4 = new ArrayList(arrayList);
        System.out.println(arrayList4);

        ArrayList arrayList5 = new ArrayList(20);
        arrayList5.add("Dfkthf");
        arrayList5.add(5);
        arrayList5.add(true);
        System.out.println(arrayList5);

        ArrayList<String> arrayList6 = new ArrayList<>();
        arrayList6.add("!!!");
        arrayList6.add("???");
        arrayList6.addAll(1, arrayList);
        System.out.println(arrayList6);
//        arrayList6.removeAll(arrayList);
//        arrayList6.retainAll(arrayList6);
//        System.out.println(arrayList6);
        List<String> maList = arrayList6.subList(0,3);
        System.out.println(maList);
        maList.add("Борис");
        System.out.println(maList);
        System.out.println(arrayList6);

//        String[] array = arrayList6.toArray(new String[6]);
//        for(String s : array){
//            System.out.println(s + " ");
//        }
//        System.out.println("\n" + array.length);

        Collections.sort(arrayList6);
        System.out.println(arrayList6);

//        Collections.shuffle(arrayList6);
//        System.out.println(arrayList6);

//        Collections.reverse(arrayList6);
//        System.out.println(arrayList6);

        Collections.swap(arrayList6, 0, 2);
        System.out.println(arrayList6);

        // Итератор

        Iterator<String> iterator = arrayList6.iterator();

        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
            iterator.next();
            iterator.remove();
        }
        System.out.println(arrayList6);
    }
}
