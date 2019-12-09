import java.util.*;

public class DataStruct {

    public void dataStructlist(){
        List<Integer> myList = new ArrayList<Integer>();

        myList.add(4);
        myList.add(1);
        myList.add(6);
        myList.add(664);
        myList.add(90);

        for (int i = 0; i < myList.size(); i++){
            System.out.println("list item no: " + i + " value: " +  myList.get(i));
        }
        for (Integer elem: myList
             ) {
            System.out.println(elem);
/*            if (elem.equals(6)){
                System.out.println(myList.indexOf(elem));
                myList.remove(myList.indexOf(elem));
            }
*/
        }

        Iterator<Integer> iterator = myList.iterator();
        while(iterator.hasNext()){
            Integer elem = iterator.next();
            System.out.println(elem);
            if (elem.equals(6)){
                iterator.remove();
            }
        }

        System.out.println("after removal:");

        for (Integer elem: myList
        ) {
            System.out.println(elem);
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

        Iterator<Object> iterator = mySet.iterator();
        System.out.println();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();
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
