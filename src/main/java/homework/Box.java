package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> arrayList;
    public Box(){
        this.arrayList = new ArrayList<>();
    }
    public Box(T... fruits){
        this.arrayList = new ArrayList<>(Arrays.asList(fruits));
    }
    public float getWeigth(){
        float sumWeight = 0.0f;
        for (T fruit : arrayList) {
            sumWeight+= fruit.getWeigth();
        }
        return sumWeight;
    }
    public boolean weigher(Box<?> anotherBox){
        return Math.abs(this.getWeigth()- anotherBox.getWeigth())<0.000001;
    }
    public void transfer(Box<? super T> anotherBox){
        if(anotherBox == this){
            return;
        }
        anotherBox.arrayList.addAll(this.arrayList);
        this.arrayList.clear();
    }
    public void add(T fruit){
        arrayList.add(fruit);
    }
}
