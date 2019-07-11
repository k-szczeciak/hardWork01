public class main01 {

    public static void main(String[] args) {
        System.out.println("test drive HW 01");


        String string1 = new String("string 1");
        String string2 = "string 1";
        String string3 = new String("string 1");
        String string4 = "string 1";
        System.out.println(System.identityHashCode(string1));
        System.out.println(System.identityHashCode(string2));
        System.out.println(System.identityHashCode(string3));
        System.out.println(System.identityHashCode(string4));
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
        System.out.println(System.identityHashCode(string1));



    }
}
