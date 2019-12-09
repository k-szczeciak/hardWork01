import java.util.ArrayList;
import java.util.List;

public class main01 {

    public static void main(String[] args) {
        System.out.println("test drive HW 01");

        //powstaje nowy obiekt
/*        String string1 = new String("string 1");
        String string2 = "string 1";
        String string3 = new String("string 1");
        String string4 = "string 1";
        System.out.println("obiejt string 1: " + System.identityHashCode(string1));
        System.out.println("obiejt string 2: " + System.identityHashCode(string2));
        System.out.println("obiejt string 3: " + System.identityHashCode(string3));
        System.out.println("obiejt string 4: " + System.identityHashCode(string4));
        if (string4 == string2){
            System.out.println("equals");
        }else{
            System.out.println("not equals");
        }

        if (string1 == string3){
            System.out.println("equals");
        }else{
            System.out.println("not equals");
        }
        string1 = "string 1";
        System.out.println(System.identityHashCode(string1));*/


        // Arrays, maps, hash maps
        System.out.println("Data Structures:");
        dataStructues();// <- static method
        DataStruct dataStruct1 = new DataStruct();
        System.out.println(dataStruct1.toString());
        dataStruct1.dataStructlist();
        System.out.println();
        System.out.println("Set:");
        dataStruct1.dataStructSet();

        System.out.println("now HashMap:");
        dataStruct1.dataStructMap();

    }

    public static void dataStructues(){

        //Tables:
        int myTable[] = {1,2,3,4,5};
        for (int elem: myTable
             ) {
            System.out.println("table element: " + elem);
        }
        // listy:
        List myList = new ArrayList();
        System.out.println();
    }





}
