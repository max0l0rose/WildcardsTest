import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    static List<? extends Pet> func(List<? extends Pet> list) {
        list.add(null); // OK
//        list.add(new Pet()); // ERROR
//        list.add(new Cat()); // ERROR
//        list.add(new Object()); // ERROR

        for (Pet o : list) {
            System.out.println(o.feed());
        }

        return list;
    }

    static List<? super Cat> func2(List<? super Pet> list) {
        list.add(null); // OK
        list.add(new Pet());
        list.add(new Cat());
        //list.add(new Object()); // ERROR
        //list.add(new Animal()); // ERROR

//        for (Pet o : list) {
//            System.out.println(o.feed());
//        }

        return list;
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Animal());

        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet());
        pets.add(new Pet());

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

//        List<? extends Pet> l = func(cats);
//        //l.add(new Pet()); // Error
//
//        func2(pets);


        printList2(animals);
        printList2(pets);

        int a = 1;
    }


    public static void printList(List<Object> list) {
        for (Object elem : list)
            System.out.println(elem + " ");
        System.out.println();
    }


    public static void printList2(List<?> list) // producer
    {
        //list.add(new Object()); // ERROR
        for (Object elem: list)
            System.out.print(elem + " ");
        System.out.println();
    }


}


