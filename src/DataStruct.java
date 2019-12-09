import java.util.*;

public class DataStruct {

    public void dataStructlist(){
        List myList = new ArrayList();

        myList.add(4);
        myList.add(1);
        myList.add(6);
        myList.add(664);
        myList.add(90);

        for (int i = 0; i < myList.size(); i++){
            System.out.println("list item no: " + i + " value: " +  myList.get(i));
        }
        for (Object elem: myList
             ) {
            System.out.println(elem);
        }

        Iterator<Integer> iterator = myList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    public void dataStructSet(){
        Set mySet = new HashSet();


        mySet.add(23);
        mySet.add(1);
        mySet.add(6);
        mySet.add(19);
        mySet.add(3);
        mySet.add(5);
        mySet.add(1);
        mySet.add(0);
        mySet.add(23);

        for (Object elem: mySet
             ) {
            System.out.println(elem);
        }
    }

    public void dataStructMap(){
        Map<Integer, String> myMap = new HashMap<Integer, String>();

        myMap.put(2, "dwa");
        myMap.put(3, "trzy");
        myMap.put(4, "cztery");
        myMap.put(1, "jeden");
        myMap.put(2, "bla bla");




        Set<Integer> keys = myMap.keySet();
        for (Integer key: keys){
            System.out.println("klucz: " + key + ", wartość: " + myMap.get(key));
        }


    }

}
