package Algorithm;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(12);

        // Создание HashMap с начальным размером 4
        HashMap<String, String> hashMap = new HashMap<>(4);

        // Добавление пар ключ-значение в HashMap
        String addResult = hashMap.put("+7900111223300", "AAAAAAA");
        addResult = hashMap.put("+7900111223301", "BBBBBBB");
        addResult = hashMap.put("+7900111223300", "DDDDDDD");
        addResult = hashMap.put("+7900111223302", "EEEEEEE1");
        addResult = hashMap.put("+7900111223303", "EEEEEEE2");
        addResult = hashMap.put("+7900111223304", "EEEEEEE3");
        addResult = hashMap.put("+7900111223305", "EEEEEEE4");
        addResult = hashMap.put("+7900111223306", "EEEEEEE5");
        addResult = hashMap.put("+7900111223307", "EEEEEEE6");
        addResult = hashMap.put("+7900111223308", "EEEEEEE7");
        addResult = hashMap.put("+7900111223309", "EEEEEEE8");

        // Поиск значения по ключу в HashMap
        String searchResult = hashMap.get("+7900111223307");


        // Использование метода toString для вывода содержимого HashMap
        System.out.println("toString(): " + hashMap);

        // Использование цикла foreach для перебора элементов HashMap
        System.out.println("foreach:");
        for (HashMap.Entity entity : hashMap) {
            System.out.printf("%s - %s\n", entity.key, entity.value);
        }

    }

}
