import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {


DynamicArray dynamicarray =  new DynamicArray(5);
//System.out.println(dynamicarray.capacity);
        dynamicarray.add("A");
        dynamicarray.add("B");
        dynamicarray.add("C");
        dynamicarray.add("D");
        dynamicarray.add("E");
        dynamicarray.add("F");


       dynamicarray.insert(0, "X");
       dynamicarray.delete("A");
        dynamicarray.delete("D");
        dynamicarray.delete("C");
        dynamicarray.delete("F");


        System.out.println("At index: "+dynamicarray.search("A"));

        System.out.println(dynamicarray);
        System.out.println("Size: "+dynamicarray.size);
        System.out.println("Capacity: "+dynamicarray.capacity);
        System.out.println("Empty: "+dynamicarray.isEmpty());
        }

}