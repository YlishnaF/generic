import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();

        Box<Apple> box = new Box<>(apple);
        Box<Orange> box1=new Box<>(orange);
        Box<Apple> box2 = new Box<>(apple);

        box.putFruit(apple);
        box.putFruit(apple);
        box1.putFruit(orange);
        box1.putFruit(orange);
        box2.putFruit(apple);
        box.putFruit(apple);


        System.out.println(box2.getWeight());
        System.out.println(box1.compare(box));
        box.putToAnotherBox(box2);
        box1.info();


// Второе звадание
        Integer [] arr = {2,5,7,9};
        arrayToArrayList(arr);
        String [] str = {"dsg", "dfgd", "ad"};
        arrayToArrayList(str);


//Первое задание
        ArrayList<Integer> arrInt = new ArrayList<>(Arrays.asList(1,4,3,2,8));
        System.out.println(changeElementsPossition(arrInt, 1,4));
        ArrayList<String> arrStr = new ArrayList<>(Arrays.asList("go", "sit", "sleep", "learn", "play"));
        System.out.println(changeElementsPossition(arrStr, 3,1));


    }

    // 1.Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
    public static <T> ArrayList<T> changeElementsPossition(ArrayList<T> arr, int fistEl, int secondEl){
        T obj = arr.get(fistEl);
        arr.set(fistEl, arr.get(secondEl));
        arr.set(secondEl, obj);
        return arr;

    }
    // Написать метод, который преобразует массив в ArrayList;
    public static <T> ArrayList<T> arrayToArrayList (T[] arr){
        ArrayList<T> arrayList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            arrayList.add(arr[i]);
        }
        System.out.println(arrayList);
        return arrayList;
    }


}