import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
      

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