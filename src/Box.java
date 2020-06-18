import java.util.ArrayList;

public class Box <T extends Fruit> {

    private float boxWeight;
    Object T;
    ArrayList <T> arrayList = new ArrayList<T>();

    public Box(T fruit){

    }

    public void info(){

        System.out.println("В коробке лежат фрукты: " + arrayList);
    }

    public void putFruit(T fruit) {
        arrayList.add(fruit);
        boxWeight+=fruit.weight;

    }

    public float getWeight(){
        return boxWeight;

    }

    public boolean compare(Box o) {
        if(this.getWeight()-o.getWeight()==0){
            return true;
        } else {
            return false;
        }
    }

    public void putToAnotherBox(Box<T> o) {
        o.arrayList.addAll(this.arrayList);
        this.arrayList.clear();


    }
}