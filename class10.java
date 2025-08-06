public class class10 {
    public static void main(String[] args) {
        // String variable
        String name = "John";
        System.out.println(name);

        // int variable
        int myNum = 15;
        System.out.println(myNum);

        // declare then assign
        int anotherNum;
        anotherNum = 15;
        System.out.println(anotherNum);

        // overwrite value
        int changeNum = 15;
        changeNum = 20; // changeNum is now 20
        System.out.println(changeNum);

        // final variable
        final int finalNum = 15;
        System.out.println(finalNum);
        // finalNum = 20; // Uncommenting this line will cause an error

        // other types
        int num = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";

        System.out.println(num);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);
    }
}